// Generated from /home/recoaro/Codes/UFSCAR/2023/Compiladores/construcao-compiladores-t4/t4-semantico/src/main/antlr4/br/ufscar/dc/compiladores/LA.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class t4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMENTARIO=1, ALGORITMO=2, FIM_ALGORITMO=3, DECLARE=4, CONSTANTE=5, LITERAL=6, 
		INTEIRO=7, REAL=8, LOGICO=9, TRUE=10, FALSE=11, AND=12, OR=13, NOT=14, 
		IF=15, THEN=16, ELSE=17, ENDIF=18, CASO=19, SEJA=20, FIM_CASO=21, PARA=22, 
		ATE=23, FACA=24, FIM_PARA=25, WHILE=26, ENDWHILE=27, TIPO=28, REGISTRO=29, 
		FIM_REGISTRO=30, PROCEDIMENTO=31, VAR=32, FIM_PROCEDIMENTO=33, FUNCAO=34, 
		RETORNE=35, FIM_FUNCAO=36, LEIA=37, ESCREVA=38, INTERVALO=39, MENOR=40, 
		MENORIGUAL=41, MAIOR=42, MAIORIGUAL=43, IGUAL=44, DIFERENTE=45, DELIM=46, 
		ABREPAR=47, FECHAPAR=48, ABRECHAVE=49, FECHACHAVE=50, VIRGULA=51, ASPAS=52, 
		DIVISAO=53, MOD=54, SOMA=55, SUBTRACAO=56, MULTIPLICACAO=57, ATRIBUICAO=58, 
		PONTEIRO=59, ENDERECO=60, PONTO=61, NUM_INT=62, NUM_REAL=63, IDENT=64, 
		CADEIA=65, CADEIA_N_FECHADA=66, WS=67, COMENT_N_FECHADO=68, ERRO=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMENTARIO", "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "LITERAL", 
			"INTEIRO", "REAL", "LOGICO", "TRUE", "FALSE", "AND", "OR", "NOT", "IF", 
			"THEN", "ELSE", "ENDIF", "CASO", "SEJA", "FIM_CASO", "PARA", "ATE", "FACA", 
			"FIM_PARA", "WHILE", "ENDWHILE", "TIPO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "VAR", "FIM_PROCEDIMENTO", "FUNCAO", "RETORNE", "FIM_FUNCAO", 
			"LEIA", "ESCREVA", "INTERVALO", "MENOR", "MENORIGUAL", "MAIOR", "MAIORIGUAL", 
			"IGUAL", "DIFERENTE", "DELIM", "ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", 
			"VIRGULA", "ASPAS", "DIVISAO", "MOD", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"ATRIBUICAO", "PONTEIRO", "ENDERECO", "PONTO", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_N_FECHADA", "WS", "COMENT_N_FECHADO", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", 
			"'literal'", "'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", 
			"'e'", "'ou'", "'nao'", "'se'", "'entao'", "'senao'", "'fim_se'", "'caso'", 
			"'seja'", "'fim_caso'", "'para'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", 
			"'fim_enquanto'", "'tipo'", "'registro'", "'fim_registro'", "'procedimento'", 
			"'var'", "'fim_procedimento'", "'funcao'", "'retorne'", "'fim_funcao'", 
			"'leia'", "'escreva'", "'..'", "'<'", "'<='", "'>'", "'>='", "'='", "'<>'", 
			"':'", "'('", "')'", "'['", "']'", "','", "'\"'", "'/'", "'%'", "'+'", 
			"'-'", "'*'", "'<-'", "'^'", "'&'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMENTARIO", "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", 
			"LITERAL", "INTEIRO", "REAL", "LOGICO", "TRUE", "FALSE", "AND", "OR", 
			"NOT", "IF", "THEN", "ELSE", "ENDIF", "CASO", "SEJA", "FIM_CASO", "PARA", 
			"ATE", "FACA", "FIM_PARA", "WHILE", "ENDWHILE", "TIPO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "VAR", "FIM_PROCEDIMENTO", "FUNCAO", "RETORNE", "FIM_FUNCAO", 
			"LEIA", "ESCREVA", "INTERVALO", "MENOR", "MENORIGUAL", "MAIOR", "MAIORIGUAL", 
			"IGUAL", "DIFERENTE", "DELIM", "ABREPAR", "FECHAPAR", "ABRECHAVE", "FECHACHAVE", 
			"VIRGULA", "ASPAS", "DIVISAO", "MOD", "SOMA", "SUBTRACAO", "MULTIPLICACAO", 
			"ATRIBUICAO", "PONTEIRO", "ENDERECO", "PONTO", "NUM_INT", "NUM_REAL", 
			"IDENT", "CADEIA", "CADEIA_N_FECHADA", "WS", "COMENT_N_FECHADO", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public t4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u021d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\7\2\u0090"+
		"\n\2\f\2\16\2\u0093\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\6?\u01e6\n?\r?\16?\u01e7\3@\6@\u01eb"+
		"\n@\r@\16@\u01ec\3@\3@\6@\u01f1\n@\r@\16@\u01f2\5@\u01f5\n@\3A\3A\7A\u01f9"+
		"\nA\fA\16A\u01fc\13A\3B\3B\7B\u0200\nB\fB\16B\u0203\13B\3B\3B\3C\3C\7"+
		"C\u0209\nC\fC\16C\u020c\13C\3C\3C\3D\3D\3D\3E\3E\7E\u0215\nE\fE\16E\u0218"+
		"\13E\3E\3E\3F\3F\6\u0091\u0201\u020a\u0216\2G\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\3\2\b\3\2\f\f\4\2C\\c|\6\2\62;C\\"+
		"aac|\4\2\f\f$$\5\2\13\f\17\17\"\"\4\2\f\f\177\177\2\u0225\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u0097"+
		"\3\2\2\2\7\u00a1\3\2\2\2\t\u00af\3\2\2\2\13\u00b7\3\2\2\2\r\u00c1\3\2"+
		"\2\2\17\u00c9\3\2\2\2\21\u00d1\3\2\2\2\23\u00d6\3\2\2\2\25\u00dd\3\2\2"+
		"\2\27\u00e8\3\2\2\2\31\u00ee\3\2\2\2\33\u00f0\3\2\2\2\35\u00f3\3\2\2\2"+
		"\37\u00f7\3\2\2\2!\u00fa\3\2\2\2#\u0100\3\2\2\2%\u0106\3\2\2\2\'\u010d"+
		"\3\2\2\2)\u0112\3\2\2\2+\u0117\3\2\2\2-\u0120\3\2\2\2/\u0125\3\2\2\2\61"+
		"\u0129\3\2\2\2\63\u012e\3\2\2\2\65\u0137\3\2\2\2\67\u0140\3\2\2\29\u014d"+
		"\3\2\2\2;\u0152\3\2\2\2=\u015b\3\2\2\2?\u0168\3\2\2\2A\u0175\3\2\2\2C"+
		"\u0179\3\2\2\2E\u018a\3\2\2\2G\u0191\3\2\2\2I\u0199\3\2\2\2K\u01a4\3\2"+
		"\2\2M\u01a9\3\2\2\2O\u01b1\3\2\2\2Q\u01b4\3\2\2\2S\u01b6\3\2\2\2U\u01b9"+
		"\3\2\2\2W\u01bb\3\2\2\2Y\u01be\3\2\2\2[\u01c0\3\2\2\2]\u01c3\3\2\2\2_"+
		"\u01c5\3\2\2\2a\u01c7\3\2\2\2c\u01c9\3\2\2\2e\u01cb\3\2\2\2g\u01cd\3\2"+
		"\2\2i\u01cf\3\2\2\2k\u01d1\3\2\2\2m\u01d3\3\2\2\2o\u01d5\3\2\2\2q\u01d7"+
		"\3\2\2\2s\u01d9\3\2\2\2u\u01db\3\2\2\2w\u01de\3\2\2\2y\u01e0\3\2\2\2{"+
		"\u01e2\3\2\2\2}\u01e5\3\2\2\2\177\u01ea\3\2\2\2\u0081\u01f6\3\2\2\2\u0083"+
		"\u01fd\3\2\2\2\u0085\u0206\3\2\2\2\u0087\u020f\3\2\2\2\u0089\u0212\3\2"+
		"\2\2\u008b\u021b\3\2\2\2\u008d\u0091\7}\2\2\u008e\u0090\n\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\177\2\2\u0095"+
		"\u0096\b\2\2\2\u0096\4\3\2\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7i\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7v\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7q\2\2\u00a0\6\3\2"+
		"\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5"+
		"\7a\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7i\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7v\2\2"+
		"\u00ac\u00ad\7o\2\2\u00ad\u00ae\7q\2\2\u00ae\b\3\2\2\2\u00af\u00b0\7f"+
		"\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7c\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\n\3\2\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7v\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\f\3\2\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7k"+
		"\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\16\3\2\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb"+
		"\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7q\2\2\u00d0\20\3\2\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\22\3\2\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7i\2\2\u00d9\u00da\7k\2\2"+
		"\u00da\u00db\7e\2\2\u00db\u00dc\7q\2\2\u00dc\24\3\2\2\2\u00dd\u00de\7"+
		"x\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2"+
		"\7c\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7k\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7q\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9"+
		"\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7q\2\2"+
		"\u00ed\30\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\32\3\2\2\2\u00f0\u00f1\7q\2"+
		"\2\u00f1\u00f2\7w\2\2\u00f2\34\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5"+
		"\7c\2\2\u00f5\u00f6\7q\2\2\u00f6\36\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9 \3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd"+
		"\7v\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7q\2\2\u00ff\"\3\2\2\2\u0100\u0101"+
		"\7u\2\2\u0101\u0102\7g\2\2\u0102\u0103\7p\2\2\u0103\u0104\7c\2\2\u0104"+
		"\u0105\7q\2\2\u0105$\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108\7k\2\2\u0108"+
		"\u0109\7o\2\2\u0109\u010a\7a\2\2\u010a\u010b\7u\2\2\u010b\u010c\7g\2\2"+
		"\u010c&\3\2\2\2\u010d\u010e\7e\2\2\u010e\u010f\7c\2\2\u010f\u0110\7u\2"+
		"\2\u0110\u0111\7q\2\2\u0111(\3\2\2\2\u0112\u0113\7u\2\2\u0113\u0114\7"+
		"g\2\2\u0114\u0115\7l\2\2\u0115\u0116\7c\2\2\u0116*\3\2\2\2\u0117\u0118"+
		"\7h\2\2\u0118\u0119\7k\2\2\u0119\u011a\7o\2\2\u011a\u011b\7a\2\2\u011b"+
		"\u011c\7e\2\2\u011c\u011d\7c\2\2\u011d\u011e\7u\2\2\u011e\u011f\7q\2\2"+
		"\u011f,\3\2\2\2\u0120\u0121\7r\2\2\u0121\u0122\7c\2\2\u0122\u0123\7t\2"+
		"\2\u0123\u0124\7c\2\2\u0124.\3\2\2\2\u0125\u0126\7c\2\2\u0126\u0127\7"+
		"v\2\2\u0127\u0128\7g\2\2\u0128\60\3\2\2\2\u0129\u012a\7h\2\2\u012a\u012b"+
		"\7c\2\2\u012b\u012c\7e\2\2\u012c\u012d\7c\2\2\u012d\62\3\2\2\2\u012e\u012f"+
		"\7h\2\2\u012f\u0130\7k\2\2\u0130\u0131\7o\2\2\u0131\u0132\7a\2\2\u0132"+
		"\u0133\7r\2\2\u0133\u0134\7c\2\2\u0134\u0135\7t\2\2\u0135\u0136\7c\2\2"+
		"\u0136\64\3\2\2\2\u0137\u0138\7g\2\2\u0138\u0139\7p\2\2\u0139\u013a\7"+
		"s\2\2\u013a\u013b\7w\2\2\u013b\u013c\7c\2\2\u013c\u013d\7p\2\2\u013d\u013e"+
		"\7v\2\2\u013e\u013f\7q\2\2\u013f\66\3\2\2\2\u0140\u0141\7h\2\2\u0141\u0142"+
		"\7k\2\2\u0142\u0143\7o\2\2\u0143\u0144\7a\2\2\u0144\u0145\7g\2\2\u0145"+
		"\u0146\7p\2\2\u0146\u0147\7s\2\2\u0147\u0148\7w\2\2\u0148\u0149\7c\2\2"+
		"\u0149\u014a\7p\2\2\u014a\u014b\7v\2\2\u014b\u014c\7q\2\2\u014c8\3\2\2"+
		"\2\u014d\u014e\7v\2\2\u014e\u014f\7k\2\2\u014f\u0150\7r\2\2\u0150\u0151"+
		"\7q\2\2\u0151:\3\2\2\2\u0152\u0153\7t\2\2\u0153\u0154\7g\2\2\u0154\u0155"+
		"\7i\2\2\u0155\u0156\7k\2\2\u0156\u0157\7u\2\2\u0157\u0158\7v\2\2\u0158"+
		"\u0159\7t\2\2\u0159\u015a\7q\2\2\u015a<\3\2\2\2\u015b\u015c\7h\2\2\u015c"+
		"\u015d\7k\2\2\u015d\u015e\7o\2\2\u015e\u015f\7a\2\2\u015f\u0160\7t\2\2"+
		"\u0160\u0161\7g\2\2\u0161\u0162\7i\2\2\u0162\u0163\7k\2\2\u0163\u0164"+
		"\7u\2\2\u0164\u0165\7v\2\2\u0165\u0166\7t\2\2\u0166\u0167\7q\2\2\u0167"+
		">\3\2\2\2\u0168\u0169\7r\2\2\u0169\u016a\7t\2\2\u016a\u016b\7q\2\2\u016b"+
		"\u016c\7e\2\2\u016c\u016d\7g\2\2\u016d\u016e\7f\2\2\u016e\u016f\7k\2\2"+
		"\u016f\u0170\7o\2\2\u0170\u0171\7g\2\2\u0171\u0172\7p\2\2\u0172\u0173"+
		"\7v\2\2\u0173\u0174\7q\2\2\u0174@\3\2\2\2\u0175\u0176\7x\2\2\u0176\u0177"+
		"\7c\2\2\u0177\u0178\7t\2\2\u0178B\3\2\2\2\u0179\u017a\7h\2\2\u017a\u017b"+
		"\7k\2\2\u017b\u017c\7o\2\2\u017c\u017d\7a\2\2\u017d\u017e\7r\2\2\u017e"+
		"\u017f\7t\2\2\u017f\u0180\7q\2\2\u0180\u0181\7e\2\2\u0181\u0182\7g\2\2"+
		"\u0182\u0183\7f\2\2\u0183\u0184\7k\2\2\u0184\u0185\7o\2\2\u0185\u0186"+
		"\7g\2\2\u0186\u0187\7p\2\2\u0187\u0188\7v\2\2\u0188\u0189\7q\2\2\u0189"+
		"D\3\2\2\2\u018a\u018b\7h\2\2\u018b\u018c\7w\2\2\u018c\u018d\7p\2\2\u018d"+
		"\u018e\7e\2\2\u018e\u018f\7c\2\2\u018f\u0190\7q\2\2\u0190F\3\2\2\2\u0191"+
		"\u0192\7t\2\2\u0192\u0193\7g\2\2\u0193\u0194\7v\2\2\u0194\u0195\7q\2\2"+
		"\u0195\u0196\7t\2\2\u0196\u0197\7p\2\2\u0197\u0198\7g\2\2\u0198H\3\2\2"+
		"\2\u0199\u019a\7h\2\2\u019a\u019b\7k\2\2\u019b\u019c\7o\2\2\u019c\u019d"+
		"\7a\2\2\u019d\u019e\7h\2\2\u019e\u019f\7w\2\2\u019f\u01a0\7p\2\2\u01a0"+
		"\u01a1\7e\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7q\2\2\u01a3J\3\2\2\2\u01a4"+
		"\u01a5\7n\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7c\2\2"+
		"\u01a8L\3\2\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7u\2\2\u01ab\u01ac\7e\2"+
		"\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af\7x\2\2\u01af\u01b0"+
		"\7c\2\2\u01b0N\3\2\2\2\u01b1\u01b2\7\60\2\2\u01b2\u01b3\7\60\2\2\u01b3"+
		"P\3\2\2\2\u01b4\u01b5\7>\2\2\u01b5R\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7\u01b8"+
		"\7?\2\2\u01b8T\3\2\2\2\u01b9\u01ba\7@\2\2\u01baV\3\2\2\2\u01bb\u01bc\7"+
		"@\2\2\u01bc\u01bd\7?\2\2\u01bdX\3\2\2\2\u01be\u01bf\7?\2\2\u01bfZ\3\2"+
		"\2\2\u01c0\u01c1\7>\2\2\u01c1\u01c2\7@\2\2\u01c2\\\3\2\2\2\u01c3\u01c4"+
		"\7<\2\2\u01c4^\3\2\2\2\u01c5\u01c6\7*\2\2\u01c6`\3\2\2\2\u01c7\u01c8\7"+
		"+\2\2\u01c8b\3\2\2\2\u01c9\u01ca\7]\2\2\u01cad\3\2\2\2\u01cb\u01cc\7_"+
		"\2\2\u01ccf\3\2\2\2\u01cd\u01ce\7.\2\2\u01ceh\3\2\2\2\u01cf\u01d0\7$\2"+
		"\2\u01d0j\3\2\2\2\u01d1\u01d2\7\61\2\2\u01d2l\3\2\2\2\u01d3\u01d4\7\'"+
		"\2\2\u01d4n\3\2\2\2\u01d5\u01d6\7-\2\2\u01d6p\3\2\2\2\u01d7\u01d8\7/\2"+
		"\2\u01d8r\3\2\2\2\u01d9\u01da\7,\2\2\u01dat\3\2\2\2\u01db\u01dc\7>\2\2"+
		"\u01dc\u01dd\7/\2\2\u01ddv\3\2\2\2\u01de\u01df\7`\2\2\u01dfx\3\2\2\2\u01e0"+
		"\u01e1\7(\2\2\u01e1z\3\2\2\2\u01e2\u01e3\7\60\2\2\u01e3|\3\2\2\2\u01e4"+
		"\u01e6\4\62;\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8~\3\2\2\2\u01e9\u01eb\4\62;\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01f4\3\2\2\2\u01ee\u01f0\7\60\2\2\u01ef\u01f1\4\62;\2\u01f0\u01ef\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0080\3\2"+
		"\2\2\u01f6\u01fa\t\3\2\2\u01f7\u01f9\t\4\2\2\u01f8\u01f7\3\2\2\2\u01f9"+
		"\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0082\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0201\7$\2\2\u01fe\u0200\n\2\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u0202\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7$\2\2\u0205"+
		"\u0084\3\2\2\2\u0206\u020a\7$\2\2\u0207\u0209\n\5\2\2\u0208\u0207\3\2"+
		"\2\2\u0209\u020c\3\2\2\2\u020a\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b"+
		"\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7\f\2\2\u020e\u0086\3\2"+
		"\2\2\u020f\u0210\t\6\2\2\u0210\u0211\bD\3\2\u0211\u0088\3\2\2\2\u0212"+
		"\u0216\7}\2\2\u0213\u0215\n\7\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0219\u021a\7\f\2\2\u021a\u008a\3\2\2\2\u021b\u021c\13"+
		"\2\2\2\u021c\u008c\3\2\2\2\f\2\u0091\u01e7\u01ec\u01f2\u01f4\u01fa\u0201"+
		"\u020a\u0216\4\3\2\2\3D\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}