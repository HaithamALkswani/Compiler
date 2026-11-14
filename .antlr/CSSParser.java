// Generated from d:/Projects/compiler/Analyzer/Analyzer/CSS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, WS=2, IMPORTANT=3, AT_KEYWORD=4, HASH=5, STRING=6, DIMENSION=7, 
		PERCENTAGE=8, NUMBER=9, FUNCTION=10, IDENT=11, LBRACE=12, RBRACE=13, LPAREN=14, 
		RPAREN=15, LBRACK=16, RBRACK=17, SEMI=18, COLON=19, COMMA=20, DOT=21, 
		GT=22, STAR=23, EQUALS=24, MINUS=25;
	public static final int
		RULE_stylesheet = 0, RULE_ruleSet = 1, RULE_selectorGroup = 2, RULE_selector = 3, 
		RULE_compoundSelector = 4, RULE_simpleSelector = 5, RULE_declarationList = 6, 
		RULE_declaration = 7, RULE_value = 8, RULE_term = 9, RULE_mediaRule = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "ruleSet", "selectorGroup", "selector", "compoundSelector", 
			"simpleSelector", "declarationList", "declaration", "value", "term", 
			"mediaRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'!important'", null, null, null, null, null, null, 
			null, null, "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "','", 
			"'.'", "'>'", "'*'", "'='", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "WS", "IMPORTANT", "AT_KEYWORD", "HASH", "STRING", "DIMENSION", 
			"PERCENTAGE", "NUMBER", "FUNCTION", "IDENT", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "LBRACK", "RBRACK", "SEMI", "COLON", "COMMA", "DOT", "GT", 
			"STAR", "EQUALS", "MINUS"
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

	@Override
	public String getGrammarFileName() { return "CSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSSParser.EOF, 0); }
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public List<MediaRuleContext> mediaRule() {
			return getRuleContexts(MediaRuleContext.class);
		}
		public MediaRuleContext mediaRule(int i) {
			return getRuleContext(MediaRuleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11077648L) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
				case LBRACK:
				case COLON:
				case DOT:
				case STAR:
					{
					setState(22);
					ruleSet();
					}
					break;
				case AT_KEYWORD:
					{
					setState(23);
					mediaRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetContext extends ParserRuleContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(CSSParser.LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CSSParser.RBRACE, 0); }
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			selectorGroup();
			setState(32);
			match(LBRACE);
			setState(33);
			declarationList();
			setState(34);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			selector();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(37);
				match(COMMA);
				setState(38);
				selector();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<CompoundSelectorContext> compoundSelector() {
			return getRuleContexts(CompoundSelectorContext.class);
		}
		public CompoundSelectorContext compoundSelector(int i) {
			return getRuleContext(CompoundSelectorContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(CSSParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSSParser.GT, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			compoundSelector();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15271936L) != 0)) {
				{
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GT) {
					{
					setState(45);
					match(GT);
					}
				}

				setState(48);
				compoundSelector();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundSelectorContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode STAR() { return getToken(CSSParser.STAR, 0); }
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public CompoundSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundSelector; }
	}

	public final CompoundSelectorContext compoundSelector() throws RecognitionException {
		CompoundSelectorContext _localctx = new CompoundSelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundSelector);
		int _la;
		try {
			int _alt;
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55);
						simpleSelector();
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case LBRACK:
			case COLON:
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(61);
						simpleSelector();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(64); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CSSParser.DOT, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public TerminalNode LBRACK() { return getToken(CSSParser.LBRACK, 0); }
		public TerminalNode EQUALS() { return getToken(CSSParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode RBRACK() { return getToken(CSSParser.RBRACK, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleSelector);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(DOT);
				setState(69);
				match(IDENT);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(COLON);
				setState(71);
				match(IDENT);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(LBRACK);
				setState(73);
				match(IDENT);
				setState(74);
				match(EQUALS);
				setState(75);
				match(STRING);
				setState(76);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CSSParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CSSParser.SEMI, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			declaration();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(80);
				match(SEMI);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENT) {
					{
					setState(81);
					declaration();
					}
				}

				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(CSSParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IMPORTANT() { return getToken(CSSParser.IMPORTANT, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IDENT);
			setState(90);
			match(COLON);
			setState(91);
			value();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(92);
				match(IMPORTANT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSSParser.COMMA, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CSSParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CSSParser.MINUS, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			term();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34607072L) != 0)) {
				{
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==MINUS) {
					{
					setState(96);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(99);
				term();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CSSParser.NUMBER, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CSSParser.PERCENTAGE, 0); }
		public TerminalNode DIMENSION() { return getToken(CSSParser.DIMENSION, 0); }
		public TerminalNode STRING() { return getToken(CSSParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(CSSParser.IDENT, 0); }
		public TerminalNode HASH() { return getToken(CSSParser.HASH, 0); }
		public TerminalNode FUNCTION() { return getToken(CSSParser.FUNCTION, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSSParser.RPAREN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(NUMBER);
				}
				break;
			case PERCENTAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(PERCENTAGE);
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(DIMENSION);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(STRING);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(IDENT);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(HASH);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(FUNCTION);
				setState(112);
				value();
				setState(113);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaRuleContext extends ParserRuleContext {
		public TerminalNode AT_KEYWORD() { return getToken(CSSParser.AT_KEYWORD, 0); }
		public TerminalNode LBRACE() { return getToken(CSSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CSSParser.RBRACE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(CSSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(CSSParser.LPAREN, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(CSSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(CSSParser.RPAREN, i);
		}
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public MediaRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaRule; }
	}

	public final MediaRuleContext mediaRule() throws RecognitionException {
		MediaRuleContext _localctx = new MediaRuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(AT_KEYWORD);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(118);
				match(LPAREN);
				setState(119);
				declaration();
				setState(120);
				match(RPAREN);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(LBRACE);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11077632L) != 0)) {
				{
				{
				setState(128);
				ruleSet();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u0089\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002\f\u0002+\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0003\u0005"+
		"\u00032\b\u0003\n\u0003\f\u00035\t\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0004\u0004\u0004?\b\u0004"+
		"\u000b\u0004\f\u0004@\u0003\u0004C\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005N\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006S\b\u0006\u0005\u0006U\b\u0006\n\u0006\f\u0006X\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007^\b\u0007\u0001\b\u0001"+
		"\b\u0003\bb\b\b\u0001\b\u0005\be\b\b\n\b\f\bh\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tt\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n{\b\n\n\n\f\n~\t\n\u0001"+
		"\n\u0001\n\u0005\n\u0082\b\n\n\n\f\n\u0085\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0002\u0002\u0000\u000b\u000b\u0017\u0017\u0002\u0000\u0014\u0014"+
		"\u0019\u0019\u0094\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001f\u0001"+
		"\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000"+
		"\u0000\bB\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fO\u0001"+
		"\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010_\u0001\u0000\u0000"+
		"\u0000\u0012s\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0003\u0002\u0001\u0000\u0017\u0019\u0003\u0014\n\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e\u0001"+
		"\u0001\u0000\u0000\u0000\u001f \u0003\u0004\u0002\u0000 !\u0005\f\u0000"+
		"\u0000!\"\u0003\f\u0006\u0000\"#\u0005\r\u0000\u0000#\u0003\u0001\u0000"+
		"\u0000\u0000$)\u0003\u0006\u0003\u0000%&\u0005\u0014\u0000\u0000&(\u0003"+
		"\u0006\u0003\u0000\'%\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0005\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,3\u0003\b\u0004\u0000-/\u0005\u0016"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000002\u0003\b\u0004\u00001.\u0001\u0000\u0000\u000025\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"4\u0007\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u00006:\u0007\u0000"+
		"\u0000\u000079\u0003\n\u0005\u000087\u0001\u0000\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;C\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=?\u0003\n\u0005\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B6\u0001\u0000\u0000"+
		"\u0000B>\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000DE\u0005\u0015"+
		"\u0000\u0000EN\u0005\u000b\u0000\u0000FG\u0005\u0013\u0000\u0000GN\u0005"+
		"\u000b\u0000\u0000HI\u0005\u0010\u0000\u0000IJ\u0005\u000b\u0000\u0000"+
		"JK\u0005\u0018\u0000\u0000KL\u0005\u0006\u0000\u0000LN\u0005\u0011\u0000"+
		"\u0000MD\u0001\u0000\u0000\u0000MF\u0001\u0000\u0000\u0000MH\u0001\u0000"+
		"\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OV\u0003\u000e\u0007\u0000"+
		"PR\u0005\u0012\u0000\u0000QS\u0003\u000e\u0007\u0000RQ\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TP\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"YZ\u0005\u000b\u0000\u0000Z[\u0005\u0013\u0000\u0000[]\u0003\u0010\b\u0000"+
		"\\^\u0005\u0003\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\u000f\u0001\u0000\u0000\u0000_f\u0003\u0012\t\u0000`b\u0007\u0001"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0003\u0012\t\u0000da\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\u0011\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000it\u0005\t\u0000"+
		"\u0000jt\u0005\b\u0000\u0000kt\u0005\u0007\u0000\u0000lt\u0005\u0006\u0000"+
		"\u0000mt\u0005\u000b\u0000\u0000nt\u0005\u0005\u0000\u0000op\u0005\n\u0000"+
		"\u0000pq\u0003\u0010\b\u0000qr\u0005\u000f\u0000\u0000rt\u0001\u0000\u0000"+
		"\u0000si\u0001\u0000\u0000\u0000sj\u0001\u0000\u0000\u0000sk\u0001\u0000"+
		"\u0000\u0000sl\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000\u0000sn\u0001"+
		"\u0000\u0000\u0000so\u0001\u0000\u0000\u0000t\u0013\u0001\u0000\u0000"+
		"\u0000u|\u0005\u0004\u0000\u0000vw\u0005\u000e\u0000\u0000wx\u0003\u000e"+
		"\u0007\u0000xy\u0005\u000f\u0000\u0000y{\u0001\u0000\u0000\u0000zv\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0083\u0005\f\u0000\u0000\u0080\u0082\u0003\u0002\u0001"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\r\u0000\u0000\u0087\u0015\u0001\u0000\u0000\u0000"+
		"\u0011\u0018\u001a).3:@BMRV]afs|\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}