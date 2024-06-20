package br.dc.compiladores.alguma.semantico;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import br.dc.compiladores.alguma.semantico.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        // int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static boolean ehTipoBasico(String tipoVar) {
        if (tipoVar.equals("literal") ||
                tipoVar.equals("inteiro") ||
                tipoVar.equals("real") ||
                tipoVar.equals("logico")) {
            return true;
        }
        return false;
    }

    public static boolean ehTipoNumeral(TipoAlguma ret, TipoAlguma aux) {
        if (ret.equals(TipoAlguma.INTEIRO) && aux.equals(TipoAlguma.REAL)) {
            return true;
        } else if (aux.equals(TipoAlguma.INTEIRO) && ret.equals(TipoAlguma.REAL)) {
            return true;
        }
        return false;
    }

    public static boolean ehTipoInteiroEmReal(TipoAlguma ret, TipoAlguma aux) {
        if (aux.equals(TipoAlguma.INTEIRO) && ret.equals(TipoAlguma.REAL)) {
            return true;
        }
        return false;
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (var tl : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhaDeTabelas, tl);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (var fl : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhaDeTabelas, fl);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.Fator_logicoContext ctx) {
        return verificarTipo(pilhaDeTabelas, ctx.parcela_logica());
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDetabelas, AlgumaParser.Parcela_logicaContext ctx) {
        if (ctx.pl1 != null) {
            return TipoAlguma.LOGICO;
        } else {
            return verificarTipo(pilhaDetabelas, ctx.pl2);
        }
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.Exp_relacionalContext ctx) {
        if (ctx.op_relacional() != null) {
            return TipoAlguma.LOGICO;
        } else {
            return verificarTipo(pilhaDeTabelas, ctx.exp_aritmetica(0));
        }
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopos pilhaDeTabelas,
            AlgumaParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (var ta : ctx.termo()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhaDeTabelas, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                if (ehTipoNumeral(ret, aux)) {
                    continue;
                }
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (var fa : ctx.fator()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhaDeTabelas, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                if (ehTipoNumeral(ret, aux)) {
                    continue;
                }
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (var pa : ctx.parcela()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhaDeTabelas, pa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                if (ehTipoNumeral(ret, aux)) {
                    continue;
                }
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null) {
            return verificarTipo(pilhaDeTabelas, ctx.parcela_unario());
        } else {
            return verificarTipo(pilhaDeTabelas, ctx.parcela_nao_unario());
        }
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.Parcela_nao_unarioContext ctx) {
        if (ctx.pn1 != null) {
            String strVar = ctx.getText();
            boolean ehEndereco = strVar.startsWith("&");
            if (ehEndereco) {
                return TipoAlguma.ENDERECO;
            }
            return verificarTipo(pilhaDeTabelas.obterEscopoAtual(), ctx.pn1.getText());
        } else {
            return TipoAlguma.LITERAL;
        }
    }

    public static TipoAlguma verificarTipo(Escopos pilhaDeTabelas, AlgumaParser.Parcela_unarioContext ctx) {
        if (ctx.p1 != null) {
            String nomeId = ctx.p1.getText();
            for (var t : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (t.existe(nomeId)) {
                    return verificarTipo(t, nomeId);
                }
            }
            return TipoAlguma.INVALIDO;
        }
        if (ctx.p2 != null) {
            String nomeId = ctx.p2.getText();
            for (var t : pilhaDeTabelas.percorrerEscoposAninhados()) {
                if (t.existe(nomeId)) {
                    return verificarTipo(t, nomeId);
                }
            }
            return TipoAlguma.INVALIDO;
        }
        if (ctx.p3 != null) {
            return TabelaDeSimbolos.TipoAlguma.INTEIRO;
        }
        if (ctx.p4 != null) {
            return TabelaDeSimbolos.TipoAlguma.REAL;
        }
        return verificarTipo(pilhaDeTabelas, ctx.p5);
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}