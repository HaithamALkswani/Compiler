// Generated from d:/Projects/compiler/Analyzer/Analyzer/HTML.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, DOCTYPE=2, TAG_CLOSE_START=3, TAG_SLASH_CLOSE=4, TAG_OPEN=5, 
		GE=6, TAG_CLOSE=7, VAR_START=8, SEL_START=9, LINK_START=10, INLINE_START=11, 
		INLINE_END=12, TH_PREFIX=13, VOID_TAG=14, COLON=15, EQUALS=16, QUOTE=17, 
		SINGLE_QUOTE=18, DOT=19, COMMA=20, SLASH=21, PLUS=22, QUESTION=23, PIPE=24, 
		LPAREN=25, RPAREN=26, LBRACE=27, RBRACE=28, HASH=29, AT=30, DOLLAR=31, 
		STAR=32, NUMBER=33, IDENTIFIER=34, TEXT=35, WS=36;
	public static final int
		RULE_program = 0, RULE_node = 1, RULE_doctype = 2, RULE_element = 3, RULE_closingTag = 4, 
		RULE_attribute = 5, RULE_attrName = 6, RULE_thValue = 7, RULE_eachExpression = 8, 
		RULE_expression = 9, RULE_relationalExpr = 10, RULE_additiveExpr = 11, 
		RULE_postfixExpr = 12, RULE_primary = 13, RULE_arguments = 14, RULE_variableExpr = 15, 
		RULE_selectionExpr = 16, RULE_linkExpr = 17, RULE_linkPart = 18, RULE_linkParams = 19, 
		RULE_stringLiteral = 20, RULE_literalSubstitution = 21, RULE_inlineExpression = 22, 
		RULE_text = 23, RULE_textToken = 24, RULE_attrValueToken = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "node", "doctype", "element", "closingTag", "attribute", "attrName", 
			"thValue", "eachExpression", "expression", "relationalExpr", "additiveExpr", 
			"postfixExpr", "primary", "arguments", "variableExpr", "selectionExpr", 
			"linkExpr", "linkPart", "linkParams", "stringLiteral", "literalSubstitution", 
			"inlineExpression", "text", "textToken", "attrValueToken"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'</'", "'/>'", "'<'", "'>='", "'>'", "'${'", "'*{'", 
			"'@{'", "'[['", "']]'", "'th:'", null, "':'", "'='", "'\"'", "'''", "'.'", 
			"','", "'/'", "'+'", "'?'", "'|'", "'('", "')'", "'{'", "'}'", "'#'", 
			"'@'", "'$'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "DOCTYPE", "TAG_CLOSE_START", "TAG_SLASH_CLOSE", "TAG_OPEN", 
			"GE", "TAG_CLOSE", "VAR_START", "SEL_START", "LINK_START", "INLINE_START", 
			"INLINE_END", "TH_PREFIX", "VOID_TAG", "COLON", "EQUALS", "QUOTE", "SINGLE_QUOTE", 
			"DOT", "COMMA", "SLASH", "PLUS", "QUESTION", "PIPE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "HASH", "AT", "DOLLAR", "STAR", "NUMBER", "IDENTIFIER", 
			"TEXT", "WS"
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
	public String getGrammarFileName() { return "HTML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HTMLParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953462L) != 0)) {
				{
				{
				setState(52);
				node();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class NodeContext extends ParserRuleContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public InlineExpressionContext inlineExpression() {
			return getRuleContext(InlineExpressionContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				doctype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				inlineExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				text();
				}
				break;
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
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(HTMLParser.DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(DOCTYPE);
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
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingElementContext extends ElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode VOID_TAG() { return getToken(HTMLParser.VOID_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public SelfClosingElementContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalElementContext extends ElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public NormalElementContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidElementContext extends ElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public TerminalNode VOID_TAG() { return getToken(HTMLParser.VOID_TAG, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public VoidElementContext(ElementContext ctx) { copyFrom(ctx); }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(TAG_OPEN);
				setState(69);
				match(IDENTIFIER);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TH_PREFIX || _la==IDENTIFIER) {
					{
					{
					setState(70);
					attribute();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(TAG_CLOSE);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953462L) != 0)) {
					{
					{
					setState(77);
					node();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				closingTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(TAG_OPEN);
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==VOID_TAG || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TH_PREFIX || _la==IDENTIFIER) {
					{
					{
					setState(86);
					attribute();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(TAG_SLASH_CLOSE);
				}
				break;
			case 3:
				_localctx = new VoidElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(TAG_OPEN);
				setState(94);
				match(VOID_TAG);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TH_PREFIX || _la==IDENTIFIER) {
					{
					{
					setState(95);
					attribute();
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(TAG_CLOSE);
				}
				break;
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
	public static class ClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_CLOSE_START() { return getToken(HTMLParser.TAG_CLOSE_START, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_closingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(TAG_CLOSE_START);
			setState(105);
			match(IDENTIFIER);
			setState(106);
			match(TAG_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	 
		public AttributeContext() { }
		public void copyFrom(AttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAttributeContext extends AttributeContext {
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public BooleanAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThymeleafAttributeContext extends AttributeContext {
		public TerminalNode TH_PREFIX() { return getToken(HTMLParser.TH_PREFIX, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(HTMLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(HTMLParser.QUOTE, i);
		}
		public ThValueContext thValue() {
			return getRuleContext(ThValueContext.class,0);
		}
		public ThymeleafAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends AttributeContext {
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(HTMLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(HTMLParser.QUOTE, i);
		}
		public List<AttrValueTokenContext> attrValueToken() {
			return getRuleContexts(AttrValueTokenContext.class);
		}
		public AttrValueTokenContext attrValueToken(int i) {
			return getRuleContext(AttrValueTokenContext.class,i);
		}
		public HtmlAttributeContext(AttributeContext ctx) { copyFrom(ctx); }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ThymeleafAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(TH_PREFIX);
				setState(109);
				match(IDENTIFIER);
				setState(110);
				match(EQUALS);
				setState(111);
				match(QUOTE);
				setState(112);
				thValue();
				setState(113);
				match(QUOTE);
				}
				break;
			case 2:
				_localctx = new HtmlAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				attrName();
				setState(116);
				match(EQUALS);
				setState(117);
				match(QUOTE);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438822398L) != 0)) {
					{
					{
					setState(118);
					attrValueToken();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(QUOTE);
				}
				break;
			case 3:
				_localctx = new BooleanAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				attrName();
				}
				break;
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
	public static class AttrNameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public AttrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrName; }
	}

	public final AttrNameContext attrName() throws RecognitionException {
		AttrNameContext _localctx = new AttrNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attrName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IDENTIFIER);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(130);
				match(COLON);
				setState(131);
				match(IDENTIFIER);
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
	public static class ThValueContext extends ParserRuleContext {
		public EachExpressionContext eachExpression() {
			return getRuleContext(EachExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thValue; }
	}

	public final ThValueContext thValue() throws RecognitionException {
		ThValueContext _localctx = new ThValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_thValue);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				eachExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				expression();
				}
				break;
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
	public static class EachExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HTMLParser.COMMA, 0); }
		public EachExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachExpression; }
	}

	public final EachExpressionContext eachExpression() throws RecognitionException {
		EachExpressionContext _localctx = new EachExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eachExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IDENTIFIER);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(139);
				match(COMMA);
				setState(140);
				match(IDENTIFIER);
				}
			}

			setState(143);
			match(COLON);
			setState(144);
			expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public RelationalExprContext relationalExpr() {
			return getRuleContext(RelationalExprContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(HTMLParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(HTMLParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			relationalExpr();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(147);
				match(QUESTION);
				setState(148);
				expression();
				setState(149);
				match(COLON);
				setState(150);
				expression();
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
	public static class RelationalExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public TerminalNode TAG_CLOSE() { return getToken(HTMLParser.TAG_CLOSE, 0); }
		public TerminalNode GE() { return getToken(HTMLParser.GE, 0); }
		public RelationalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpr; }
	}

	public final RelationalExprContext relationalExpr() throws RecognitionException {
		RelationalExprContext _localctx = new RelationalExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			additiveExpr();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GE || _la==TAG_CLOSE) {
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==GE || _la==TAG_CLOSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				additiveExpr();
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
	public static class AdditiveExprContext extends ParserRuleContext {
		public List<PostfixExprContext> postfixExpr() {
			return getRuleContexts(PostfixExprContext.class);
		}
		public PostfixExprContext postfixExpr(int i) {
			return getRuleContext(PostfixExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(HTMLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(HTMLParser.PLUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			postfixExpr();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(160);
				match(PLUS);
				setState(161);
				postfixExpr();
				}
				}
				setState(166);
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
	public static class PostfixExprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(HTMLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HTMLParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(HTMLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(HTMLParser.IDENTIFIER, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_postfixExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			primary();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(168);
				match(DOT);
				setState(169);
				match(IDENTIFIER);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(170);
					arguments();
					}
				}

				}
				}
				setState(177);
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
	public static class PrimaryContext extends ParserRuleContext {
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
		}
		public SelectionExprContext selectionExpr() {
			return getRuleContext(SelectionExprContext.class,0);
		}
		public LinkExprContext linkExpr() {
			return getRuleContext(LinkExprContext.class,0);
		}
		public LiteralSubstitutionContext literalSubstitution() {
			return getRuleContext(LiteralSubstitutionContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(HTMLParser.NUMBER, 0); }
		public TerminalNode HASH() { return getToken(HTMLParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				variableExpr();
				}
				break;
			case SEL_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				selectionExpr();
				}
				break;
			case LINK_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				linkExpr();
				}
				break;
			case PIPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				literalSubstitution();
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				stringLiteral();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(NUMBER);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(HASH);
				setState(185);
				match(IDENTIFIER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(IDENTIFIER);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HTMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HTMLParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26323715840L) != 0)) {
				{
				setState(190);
				expression();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(192);
					expression();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(200);
			match(RPAREN);
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
	public static class VariableExprContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(HTMLParser.VAR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public VariableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpr; }
	}

	public final VariableExprContext variableExpr() throws RecognitionException {
		VariableExprContext _localctx = new VariableExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(VAR_START);
			setState(203);
			expression();
			setState(204);
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
	public static class SelectionExprContext extends ParserRuleContext {
		public TerminalNode SEL_START() { return getToken(HTMLParser.SEL_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public SelectionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionExpr; }
	}

	public final SelectionExprContext selectionExpr() throws RecognitionException {
		SelectionExprContext _localctx = new SelectionExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selectionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(SEL_START);
			setState(207);
			expression();
			setState(208);
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
	public static class LinkExprContext extends ParserRuleContext {
		public TerminalNode LINK_START() { return getToken(HTMLParser.LINK_START, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public List<LinkPartContext> linkPart() {
			return getRuleContexts(LinkPartContext.class);
		}
		public LinkPartContext linkPart(int i) {
			return getRuleContext(LinkPartContext.class,i);
		}
		public LinkParamsContext linkParams() {
			return getRuleContext(LinkParamsContext.class,0);
		}
		public LinkExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkExpr; }
	}

	public final LinkExprContext linkExpr() throws RecognitionException {
		LinkExprContext _localctx = new LinkExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_linkExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LINK_START);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				linkPart();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17316708608L) != 0) );
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(216);
				linkParams();
				}
			}

			setState(219);
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
	public static class LinkPartContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(HTMLParser.SLASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public TerminalNode LBRACE() { return getToken(HTMLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HTMLParser.RBRACE, 0); }
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
		}
		public LinkPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkPart; }
	}

	public final LinkPartContext linkPart() throws RecognitionException {
		LinkPartContext _localctx = new LinkPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_linkPart);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SLASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(SLASH);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(IDENTIFIER);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(DOT);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(LBRACE);
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(RBRACE);
				}
				break;
			case VAR_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				variableExpr();
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
	public static class LinkParamsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HTMLParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(HTMLParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HTMLParser.RPAREN, 0); }
		public LinkParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkParams; }
	}

	public final LinkParamsContext linkParams() throws RecognitionException {
		LinkParamsContext _localctx = new LinkParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_linkParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LPAREN);
			setState(231);
			match(IDENTIFIER);
			setState(232);
			match(EQUALS);
			setState(233);
			expression();
			setState(234);
			match(RPAREN);
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
	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(HTMLParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(HTMLParser.SINGLE_QUOTE, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(HTMLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(HTMLParser.QUOTE, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(SINGLE_QUOTE);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438560254L) != 0)) {
				{
				{
				setState(237);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==QUOTE || _la==SINGLE_QUOTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(SINGLE_QUOTE);
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
	public static class LiteralSubstitutionContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(HTMLParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(HTMLParser.PIPE, i);
		}
		public List<VariableExprContext> variableExpr() {
			return getRuleContexts(VariableExprContext.class);
		}
		public VariableExprContext variableExpr(int i) {
			return getRuleContext(VariableExprContext.class,i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(HTMLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(HTMLParser.QUOTE, i);
		}
		public List<TerminalNode> VAR_START() { return getTokens(HTMLParser.VAR_START); }
		public TerminalNode VAR_START(int i) {
			return getToken(HTMLParser.VAR_START, i);
		}
		public LiteralSubstitutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalSubstitution; }
	}

	public final LiteralSubstitutionContext literalSubstitution() throws RecognitionException {
		LiteralSubstitutionContext _localctx = new LiteralSubstitutionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literalSubstitution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(PIPE);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137422045182L) != 0)) {
				{
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_START:
					{
					setState(246);
					variableExpr();
					}
					break;
				case COMMENT:
				case DOCTYPE:
				case TAG_CLOSE_START:
				case TAG_SLASH_CLOSE:
				case TAG_OPEN:
				case GE:
				case TAG_CLOSE:
				case SEL_START:
				case LINK_START:
				case INLINE_START:
				case INLINE_END:
				case TH_PREFIX:
				case VOID_TAG:
				case COLON:
				case EQUALS:
				case SINGLE_QUOTE:
				case DOT:
				case COMMA:
				case SLASH:
				case PLUS:
				case QUESTION:
				case LPAREN:
				case RPAREN:
				case LBRACE:
				case RBRACE:
				case HASH:
				case AT:
				case DOLLAR:
				case STAR:
				case NUMBER:
				case IDENTIFIER:
				case TEXT:
				case WS:
					{
					setState(247);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16908544L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(PIPE);
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
	public static class InlineExpressionContext extends ParserRuleContext {
		public TerminalNode INLINE_START() { return getToken(HTMLParser.INLINE_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INLINE_END() { return getToken(HTMLParser.INLINE_END, 0); }
		public InlineExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineExpression; }
	}

	public final InlineExpressionContext inlineExpression() throws RecognitionException {
		InlineExpressionContext _localctx = new InlineExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inlineExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(INLINE_START);
			setState(256);
			expression();
			setState(257);
			match(INLINE_END);
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
	public static class TextContext extends ParserRuleContext {
		public List<TextTokenContext> textToken() {
			return getRuleContexts(TextTokenContext.class);
		}
		public TextTokenContext textToken(int i) {
			return getRuleContext(TextTokenContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(259);
					textToken();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(262); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class TextTokenContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLParser.TAG_OPEN, 0); }
		public TerminalNode TAG_CLOSE_START() { return getToken(HTMLParser.TAG_CLOSE_START, 0); }
		public TerminalNode INLINE_START() { return getToken(HTMLParser.INLINE_START, 0); }
		public TextTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textToken; }
	}

	public final TextTokenContext textToken() throws RecognitionException {
		TextTokenContext _localctx = new TextTokenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_textToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2088L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AttrValueTokenContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(HTMLParser.QUOTE, 0); }
		public AttrValueTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrValueToken; }
	}

	public final AttrValueTokenContext attrValueToken() throws RecognitionException {
		AttrValueTokenContext _localctx = new AttrValueTokenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attrValueToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==QUOTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001$\u010d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003X\b\u0003"+
		"\n\u0003\f\u0003[\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001\u0003\u0003\u0003"+
		"g\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005x\b\u0005"+
		"\n\u0005\f\u0005{\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0080\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0085\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008e\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0099\b\t\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u009e\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00a3\b\u000b"+
		"\n\u000b\f\u000b\u00a6\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00ac\b\f\u0005\f\u00ae\b\f\n\f\f\f\u00b1\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bc\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c2\b\u000e\n"+
		"\u000e\f\u000e\u00c5\t\u000e\u0003\u000e\u00c7\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0004\u0011\u00d5"+
		"\b\u0011\u000b\u0011\f\u0011\u00d6\u0001\u0011\u0003\u0011\u00da\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e5\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u00ef\b\u0014\n\u0014\f\u0014\u00f2\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00f9"+
		"\b\u0015\n\u0015\f\u0015\u00fc\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u0105\b\u0017"+
		"\u000b\u0017\f\u0017\u0106\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0006\u0002"+
		"\u0000\u000e\u000e\"\"\u0001\u0000\u0006\u0007\u0001\u0000\u0011\u0012"+
		"\u0003\u0000\b\b\u0011\u0011\u0018\u0018\u0003\u0000\u0003\u0003\u0005"+
		"\u0005\u000b\u000b\u0001\u0000\u0011\u0011\u011a\u00007\u0001\u0000\u0000"+
		"\u0000\u0002@\u0001\u0000\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006"+
		"f\u0001\u0000\u0000\u0000\bh\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000"+
		"\u0000\u0000\f\u0081\u0001\u0000\u0000\u0000\u000e\u0088\u0001\u0000\u0000"+
		"\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u0092\u0001\u0000\u0000"+
		"\u0000\u0014\u009a\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000"+
		"\u0000\u0018\u00a7\u0001\u0000\u0000\u0000\u001a\u00bb\u0001\u0000\u0000"+
		"\u0000\u001c\u00bd\u0001\u0000\u0000\u0000\u001e\u00ca\u0001\u0000\u0000"+
		"\u0000 \u00ce\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000\u0000\u0000"+
		"$\u00e4\u0001\u0000\u0000\u0000&\u00e6\u0001\u0000\u0000\u0000(\u00ec"+
		"\u0001\u0000\u0000\u0000*\u00f5\u0001\u0000\u0000\u0000,\u00ff\u0001\u0000"+
		"\u0000\u0000.\u0104\u0001\u0000\u0000\u00000\u0108\u0001\u0000\u0000\u0000"+
		"2\u010a\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000"+
		"\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":;\u0005\u0000\u0000\u0001;\u0001\u0001\u0000\u0000\u0000<A\u0003\u0004"+
		"\u0002\u0000=A\u0003\u0006\u0003\u0000>A\u0003,\u0016\u0000?A\u0003.\u0017"+
		"\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000A\u0003\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0002\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0005"+
		"\u0000\u0000EI\u0005\"\u0000\u0000FH\u0003\n\u0005\u0000GF\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LP\u0005\u0007\u0000\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000Sg\u0003"+
		"\b\u0004\u0000TU\u0005\u0005\u0000\u0000UY\u0007\u0000\u0000\u0000VX\u0003"+
		"\n\u0005\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001"+
		"\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000\\g\u0005\u0004\u0000\u0000]^\u0005\u0005\u0000"+
		"\u0000^b\u0005\u000e\u0000\u0000_a\u0003\n\u0005\u0000`_\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0005"+
		"\u0007\u0000\u0000fD\u0001\u0000\u0000\u0000fT\u0001\u0000\u0000\u0000"+
		"f]\u0001\u0000\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0005\u0003"+
		"\u0000\u0000ij\u0005\"\u0000\u0000jk\u0005\u0007\u0000\u0000k\t\u0001"+
		"\u0000\u0000\u0000lm\u0005\r\u0000\u0000mn\u0005\"\u0000\u0000no\u0005"+
		"\u0010\u0000\u0000op\u0005\u0011\u0000\u0000pq\u0003\u000e\u0007\u0000"+
		"qr\u0005\u0011\u0000\u0000r\u0080\u0001\u0000\u0000\u0000st\u0003\f\u0006"+
		"\u0000tu\u0005\u0010\u0000\u0000uy\u0005\u0011\u0000\u0000vx\u00032\u0019"+
		"\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0011\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~\u0080\u0003\f\u0006\u0000\u007fl\u0001\u0000\u0000\u0000\u007f"+
		"s\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000b\u0001"+
		"\u0000\u0000\u0000\u0081\u0084\u0005\"\u0000\u0000\u0082\u0083\u0005\u000f"+
		"\u0000\u0000\u0083\u0085\u0005\"\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000"+
		"\u0086\u0089\u0003\u0010\b\u0000\u0087\u0089\u0003\u0012\t\u0000\u0088"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u000f\u0001\u0000\u0000\u0000\u008a\u008d\u0005\"\u0000\u0000\u008b\u008c"+
		"\u0005\u0014\u0000\u0000\u008c\u008e\u0005\"\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005\u000f\u0000\u0000\u0090\u0091\u0003"+
		"\u0012\t\u0000\u0091\u0011\u0001\u0000\u0000\u0000\u0092\u0098\u0003\u0014"+
		"\n\u0000\u0093\u0094\u0005\u0017\u0000\u0000\u0094\u0095\u0003\u0012\t"+
		"\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0003\u0012\t\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0093\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0013\u0001\u0000\u0000\u0000"+
		"\u009a\u009d\u0003\u0016\u000b\u0000\u009b\u009c\u0007\u0001\u0000\u0000"+
		"\u009c\u009e\u0003\u0016\u000b\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0015\u0001\u0000\u0000\u0000"+
		"\u009f\u00a4\u0003\u0018\f\u0000\u00a0\u00a1\u0005\u0016\u0000\u0000\u00a1"+
		"\u00a3\u0003\u0018\f\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00af\u0003\u001a\r\u0000\u00a8\u00a9\u0005"+
		"\u0013\u0000\u0000\u00a9\u00ab\u0005\"\u0000\u0000\u00aa\u00ac\u0003\u001c"+
		"\u000e\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u0019\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00bc\u0003\u001e"+
		"\u000f\u0000\u00b3\u00bc\u0003 \u0010\u0000\u00b4\u00bc\u0003\"\u0011"+
		"\u0000\u00b5\u00bc\u0003*\u0015\u0000\u00b6\u00bc\u0003(\u0014\u0000\u00b7"+
		"\u00bc\u0005!\u0000\u0000\u00b8\u00b9\u0005\u001d\u0000\u0000\u00b9\u00bc"+
		"\u0005\"\u0000\u0000\u00ba\u00bc\u0005\"\u0000\u0000\u00bb\u00b2\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bb\u00b4\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bb\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u001b\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c6\u0005\u0019\u0000\u0000\u00be\u00c3\u0003"+
		"\u0012\t\u0000\u00bf\u00c0\u0005\u0014\u0000\u0000\u00c0\u00c2\u0003\u0012"+
		"\t\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u001a\u0000"+
		"\u0000\u00c9\u001d\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\b\u0000\u0000"+
		"\u00cb\u00cc\u0003\u0012\t\u0000\u00cc\u00cd\u0005\u001c\u0000\u0000\u00cd"+
		"\u001f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\t\u0000\u0000\u00cf\u00d0"+
		"\u0003\u0012\t\u0000\u00d0\u00d1\u0005\u001c\u0000\u0000\u00d1!\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0005\n\u0000\u0000\u00d3\u00d5\u0003$"+
		"\u0012\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00da\u0003&\u0013"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001c\u0000"+
		"\u0000\u00dc#\u0001\u0000\u0000\u0000\u00dd\u00e5\u0005\u0015\u0000\u0000"+
		"\u00de\u00e5\u0005\"\u0000\u0000\u00df\u00e5\u0005\u0013\u0000\u0000\u00e0"+
		"\u00e1\u0005\u001b\u0000\u0000\u00e1\u00e2\u0005\"\u0000\u0000\u00e2\u00e5"+
		"\u0005\u001c\u0000\u0000\u00e3\u00e5\u0003\u001e\u000f\u0000\u00e4\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00df"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5%\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0019\u0000\u0000\u00e7\u00e8\u0005\"\u0000\u0000\u00e8\u00e9\u0005\u0010"+
		"\u0000\u0000\u00e9\u00ea\u0003\u0012\t\u0000\u00ea\u00eb\u0005\u001a\u0000"+
		"\u0000\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00f0\u0005\u0012\u0000\u0000"+
		"\u00ed\u00ef\b\u0002\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0012\u0000\u0000\u00f4"+
		")\u0001\u0000\u0000\u0000\u00f5\u00fa\u0005\u0018\u0000\u0000\u00f6\u00f9"+
		"\u0003\u001e\u000f\u0000\u00f7\u00f9\b\u0003\u0000\u0000\u00f8\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0005\u0018\u0000\u0000\u00fe+\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\u000b\u0000\u0000\u0100\u0101\u0003\u0012"+
		"\t\u0000\u0101\u0102\u0005\f\u0000\u0000\u0102-\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u00030\u0018\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107/\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\b\u0004\u0000\u0000\u01091\u0001\u0000\u0000\u0000\u010a\u010b\b\u0005"+
		"\u0000\u0000\u010b3\u0001\u0000\u0000\u0000\u001b7@IPYbfy\u007f\u0084"+
		"\u0088\u008d\u0098\u009d\u00a4\u00ab\u00af\u00bb\u00c3\u00c6\u00d6\u00d9"+
		"\u00e4\u00f0\u00f8\u00fa\u0106";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}