// Generated from Iql.g4 by ANTLR 4.13.2
package org.example.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class IqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FN_SUM=3, FN_COUNT=4, FN_STARTOFWEEK=5, DATETIME=6, NUMBER=7, 
		WHITESPACE=8, SCOL=9, DOT=10, OPEN_PAR=11, CLOSE_PAR=12, COMMA=13, EQ=14, 
		STAR=15, CONTAINS=16, NOT_CONTAINS=17, LT=18, LT_EQ=19, GT=20, GT_EQ=21, 
		NOT_EQ=22, K_AFTER=23, K_AND=24, K_ASC=25, K_BEFORE=26, K_BY=27, K_CHANGED=28, 
		K_DESC=29, K_EMPTY=30, K_IN=31, K_IS=32, K_NOT=33, K_NULL=34, K_ON=35, 
		K_OR=36, K_ORDER=37, K_TO=38, K_WAS=39, F_AFFECTED_VERSION=40, F_APPROVALS=41, 
		F_ASSIGNEE=42, F_ATTACHMENTS=43, F_CATEGORY=44, F_COMMENT=45, F_COMPONENT=46, 
		F_CREATED=47, F_CREATED_DATE=48, F_CREATOR=49, F_CUSTOM_FIELD=50, F_CUSTOMER_REQUEST_TYPE=51, 
		F_DATE=52, F_DESCRIPTION=53, F_DUE=54, F_DURATION=55, F_ENVIRONMENT=56, 
		F_EPIC_LINK=57, F_FILTER=58, F_FIX_VERSION=59, F_ISSUE=60, F_ISSUE_KEY=61, 
		F_ISSUE_TYPE=62, F_KEY=63, F_LABEL=64, F_LABELS=65, F_LAST_VIEWED=66, 
		F_LEVEL=67, F_NUMBER=68, F_ORGANIZATION=69, F_ORIGINAL_ESTIMATE=70, F_PARENT=71, 
		F_PRIORITY=72, F_PROJECT=73, F_RANK=74, F_REMAINING_ESTIMATE=75, F_REPORTER=76, 
		F_REQUEST_CHANNEL_TYPE=77, F_REQUEST_LAST_ACTIVITY_TIME=78, F_RESOLUTION=79, 
		F_RESOLUTION_DATE=80, F_RESOLVED=81, F_SLA=82, F_SPRINT=83, F_STATUS=84, 
		F_SUMMARY=85, F_TEXT=86, F_TIME_SPENT=87, F_TYPE=88, F_UPDATED=89, F_USER=90, 
		F_VERSION=91, F_VOTER=92, F_VOTES=93, F_WATCHER=94, F_WATCHERS=95, F_WORK_RATIO=96, 
		IDENTIFIER=97, STRING_LITERAL=98, COMMENT=99, LINE_COMMENT=100, SPACES=101;
	public static final int
		RULE_query = 0, RULE_iql_stmt = 1, RULE_expr = 2, RULE_ordering_term = 3, 
		RULE_operator = 4, RULE_literal_value = 5, RULE_function = 6, RULE_function_name = 7, 
		RULE_function_param = 8, RULE_literal_list = 9, RULE_keyword = 10, RULE_state_name = 11, 
		RULE_field = 12, RULE_compare_dates = 13, RULE_dates = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "iql_stmt", "expr", "ordering_term", "operator", "literal_value", 
			"function", "function_name", "function_param", "literal_list", "keyword", 
			"state_name", "field", "compare_dates", "dates"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", null, null, null, null, null, "' '", "';'", "'.'", 
			"'('", "')'", "','", "'='", "'*'", "'~'", "'!~'", "'<'", "'<='", "'>'", 
			"'>='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FN_SUM", "FN_COUNT", "FN_STARTOFWEEK", "DATETIME", 
			"NUMBER", "WHITESPACE", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", 
			"EQ", "STAR", "CONTAINS", "NOT_CONTAINS", "LT", "LT_EQ", "GT", "GT_EQ", 
			"NOT_EQ", "K_AFTER", "K_AND", "K_ASC", "K_BEFORE", "K_BY", "K_CHANGED", 
			"K_DESC", "K_EMPTY", "K_IN", "K_IS", "K_NOT", "K_NULL", "K_ON", "K_OR", 
			"K_ORDER", "K_TO", "K_WAS", "F_AFFECTED_VERSION", "F_APPROVALS", "F_ASSIGNEE", 
			"F_ATTACHMENTS", "F_CATEGORY", "F_COMMENT", "F_COMPONENT", "F_CREATED", 
			"F_CREATED_DATE", "F_CREATOR", "F_CUSTOM_FIELD", "F_CUSTOMER_REQUEST_TYPE", 
			"F_DATE", "F_DESCRIPTION", "F_DUE", "F_DURATION", "F_ENVIRONMENT", "F_EPIC_LINK", 
			"F_FILTER", "F_FIX_VERSION", "F_ISSUE", "F_ISSUE_KEY", "F_ISSUE_TYPE", 
			"F_KEY", "F_LABEL", "F_LABELS", "F_LAST_VIEWED", "F_LEVEL", "F_NUMBER", 
			"F_ORGANIZATION", "F_ORIGINAL_ESTIMATE", "F_PARENT", "F_PRIORITY", "F_PROJECT", 
			"F_RANK", "F_REMAINING_ESTIMATE", "F_REPORTER", "F_REQUEST_CHANNEL_TYPE", 
			"F_REQUEST_LAST_ACTIVITY_TIME", "F_RESOLUTION", "F_RESOLUTION_DATE", 
			"F_RESOLVED", "F_SLA", "F_SPRINT", "F_STATUS", "F_SUMMARY", "F_TEXT", 
			"F_TIME_SPENT", "F_TYPE", "F_UPDATED", "F_USER", "F_VERSION", "F_VOTER", 
			"F_VOTES", "F_WATCHER", "F_WATCHERS", "F_WORK_RATIO", "IDENTIFIER", "STRING_LITERAL", 
			"COMMENT", "LINE_COMMENT", "SPACES"
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
	public String getGrammarFileName() { return "Iql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IqlParser.EOF, 0); }
		public Iql_stmtContext iql_stmt() {
			return getRuleContext(Iql_stmtContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1090921691136L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 25769803775L) != 0)) {
				{
				setState(30);
				iql_stmt();
				}
			}

			setState(33);
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
	public static class Iql_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ordering_termContext ordering_term() {
			return getRuleContext(Ordering_termContext.class,0);
		}
		public Iql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterIql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitIql_stmt(this);
		}
	}

	public final Iql_stmtContext iql_stmt() throws RecognitionException {
		Iql_stmtContext _localctx = new Iql_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			expr(0);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(36);
				ordering_term();
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(IqlParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(IqlParser.CLOSE_PAR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(IqlParser.STRING_LITERAL, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Literal_listContext literal_list() {
			return getRuleContext(Literal_listContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<TerminalNode> K_NOT() { return getTokens(IqlParser.K_NOT); }
		public TerminalNode K_NOT(int i) {
			return getToken(IqlParser.K_NOT, i);
		}
		public Ordering_termContext ordering_term() {
			return getRuleContext(Ordering_termContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(IqlParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(IqlParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(40);
				match(OPEN_PAR);
				setState(41);
				expr(0);
				setState(42);
				match(CLOSE_PAR);
				}
				break;
			case K_NOT:
			case F_AFFECTED_VERSION:
			case F_APPROVALS:
			case F_ASSIGNEE:
			case F_ATTACHMENTS:
			case F_CATEGORY:
			case F_COMMENT:
			case F_COMPONENT:
			case F_CREATED:
			case F_CREATED_DATE:
			case F_CREATOR:
			case F_CUSTOM_FIELD:
			case F_CUSTOMER_REQUEST_TYPE:
			case F_DATE:
			case F_DESCRIPTION:
			case F_DUE:
			case F_DURATION:
			case F_ENVIRONMENT:
			case F_EPIC_LINK:
			case F_FILTER:
			case F_FIX_VERSION:
			case F_ISSUE:
			case F_ISSUE_KEY:
			case F_ISSUE_TYPE:
			case F_KEY:
			case F_LABEL:
			case F_LABELS:
			case F_LAST_VIEWED:
			case F_LEVEL:
			case F_NUMBER:
			case F_ORGANIZATION:
			case F_ORIGINAL_ESTIMATE:
			case F_PARENT:
			case F_PRIORITY:
			case F_PROJECT:
			case F_RANK:
			case F_REMAINING_ESTIMATE:
			case F_REPORTER:
			case F_REQUEST_CHANNEL_TYPE:
			case F_REQUEST_LAST_ACTIVITY_TIME:
			case F_RESOLUTION:
			case F_RESOLUTION_DATE:
			case F_RESOLVED:
			case F_SLA:
			case F_SPRINT:
			case F_STATUS:
			case F_SUMMARY:
			case F_TEXT:
			case F_TIME_SPENT:
			case F_TYPE:
			case F_UPDATED:
			case F_USER:
			case F_VERSION:
			case F_VOTER:
			case F_VOTES:
			case F_WATCHER:
			case F_WATCHERS:
			case F_WORK_RATIO:
			case STRING_LITERAL:
				{
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_NOT) {
					{
					{
					setState(44);
					match(K_NOT);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case F_AFFECTED_VERSION:
				case F_APPROVALS:
				case F_ASSIGNEE:
				case F_ATTACHMENTS:
				case F_CATEGORY:
				case F_COMMENT:
				case F_COMPONENT:
				case F_CREATED:
				case F_CREATED_DATE:
				case F_CREATOR:
				case F_CUSTOM_FIELD:
				case F_CUSTOMER_REQUEST_TYPE:
				case F_DATE:
				case F_DESCRIPTION:
				case F_DUE:
				case F_DURATION:
				case F_ENVIRONMENT:
				case F_EPIC_LINK:
				case F_FILTER:
				case F_FIX_VERSION:
				case F_ISSUE:
				case F_ISSUE_KEY:
				case F_ISSUE_TYPE:
				case F_KEY:
				case F_LABEL:
				case F_LABELS:
				case F_LAST_VIEWED:
				case F_LEVEL:
				case F_NUMBER:
				case F_ORGANIZATION:
				case F_ORIGINAL_ESTIMATE:
				case F_PARENT:
				case F_PRIORITY:
				case F_PROJECT:
				case F_RANK:
				case F_REMAINING_ESTIMATE:
				case F_REPORTER:
				case F_REQUEST_CHANNEL_TYPE:
				case F_REQUEST_LAST_ACTIVITY_TIME:
				case F_RESOLUTION:
				case F_RESOLUTION_DATE:
				case F_RESOLVED:
				case F_SLA:
				case F_SPRINT:
				case F_STATUS:
				case F_SUMMARY:
				case F_TEXT:
				case F_TIME_SPENT:
				case F_TYPE:
				case F_UPDATED:
				case F_USER:
				case F_VERSION:
				case F_VOTER:
				case F_VOTES:
				case F_WATCHER:
				case F_WATCHERS:
				case F_WORK_RATIO:
					{
					setState(50);
					field();
					}
					break;
				case STRING_LITERAL:
					{
					setState(51);
					match(STRING_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54);
				operator();
				setState(58);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATETIME:
				case NUMBER:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(55);
					literal_value();
					}
					break;
				case T__0:
				case OPEN_PAR:
					{
					setState(56);
					literal_list();
					}
					break;
				case FN_SUM:
				case FN_STARTOFWEEK:
					{
					setState(57);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(60);
					ordering_term();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						match(K_AND);
						setState(67);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						match(K_OR);
						setState(70);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ordering_termContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(IqlParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(IqlParser.K_BY, 0); }
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IqlParser.COMMA, i);
		}
		public List<TerminalNode> K_ASC() { return getTokens(IqlParser.K_ASC); }
		public TerminalNode K_ASC(int i) {
			return getToken(IqlParser.K_ASC, i);
		}
		public List<TerminalNode> K_DESC() { return getTokens(IqlParser.K_DESC); }
		public TerminalNode K_DESC(int i) {
			return getToken(IqlParser.K_DESC, i);
		}
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitOrdering_term(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ordering_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(K_ORDER);
			setState(77);
			match(K_BY);
			setState(78);
			literal_value();
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(COMMA);
					setState(83);
					literal_value();
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(84);
						_la = _input.LA(1);
						if ( !(_la==K_ASC || _la==K_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(IqlParser.EQ, 0); }
		public TerminalNode NOT_EQ() { return getToken(IqlParser.NOT_EQ, 0); }
		public TerminalNode CONTAINS() { return getToken(IqlParser.CONTAINS, 0); }
		public TerminalNode NOT_CONTAINS() { return getToken(IqlParser.NOT_CONTAINS, 0); }
		public TerminalNode LT_EQ() { return getToken(IqlParser.LT_EQ, 0); }
		public TerminalNode LT() { return getToken(IqlParser.LT, 0); }
		public TerminalNode GT() { return getToken(IqlParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(IqlParser.GT_EQ, 0); }
		public TerminalNode K_IN() { return getToken(IqlParser.K_IN, 0); }
		public TerminalNode K_NOT() { return getToken(IqlParser.K_NOT, 0); }
		public TerminalNode K_IS() { return getToken(IqlParser.K_IS, 0); }
		public TerminalNode K_WAS() { return getToken(IqlParser.K_WAS, 0); }
		public TerminalNode K_CHANGED() { return getToken(IqlParser.K_CHANGED, 0); }
		public TerminalNode K_TO() { return getToken(IqlParser.K_TO, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(EQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(NOT_EQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(CONTAINS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(NOT_CONTAINS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(LT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				match(GT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				match(GT_EQ);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				match(K_IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				match(K_NOT);
				setState(102);
				match(K_IN);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(103);
				match(K_IS);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				match(K_WAS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(105);
				match(K_IS);
				setState(106);
				match(K_NOT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(107);
				match(K_WAS);
				setState(108);
				match(K_NOT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(109);
				match(K_CHANGED);
				setState(110);
				match(K_TO);
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
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(IqlParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IqlParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(IqlParser.NUMBER, 0); }
		public DatesContext dates() {
			return getRuleContext(DatesContext.class,0);
		}
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal_value);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(STRING_LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(NUMBER);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				dates();
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
	public static class FunctionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(IqlParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(IqlParser.CLOSE_PAR, 0); }
		public List<Function_paramContext> function_param() {
			return getRuleContexts(Function_paramContext.class);
		}
		public Function_paramContext function_param(int i) {
			return getRuleContext(Function_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IqlParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			function_name();
			setState(120);
			match(OPEN_PAR);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0) || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(121);
				function_param();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					function_param();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(131);
			match(CLOSE_PAR);
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
	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode FN_SUM() { return getToken(IqlParser.FN_SUM, 0); }
		public TerminalNode FN_STARTOFWEEK() { return getToken(IqlParser.FN_STARTOFWEEK, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==FN_SUM || _la==FN_STARTOFWEEK) ) {
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
	public static class Function_paramContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitFunction_param(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_param);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATETIME:
			case NUMBER:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				literal_value();
				}
				break;
			case FN_SUM:
			case FN_STARTOFWEEK:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				function();
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
	public static class Literal_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(IqlParser.OPEN_PAR, 0); }
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(IqlParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IqlParser.COMMA, i);
		}
		public Literal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterLiteral_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitLiteral_list(this);
		}
	}

	public final Literal_listContext literal_list() throws RecognitionException {
		Literal_listContext _localctx = new Literal_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal_list);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(OPEN_PAR);
				setState(140);
				literal_value();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(141);
					match(COMMA);
					setState(142);
					literal_value();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(CLOSE_PAR);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__0);
				setState(151);
				literal_value();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					literal_value();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__1);
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
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_AFTER() { return getToken(IqlParser.K_AFTER, 0); }
		public TerminalNode K_AND() { return getToken(IqlParser.K_AND, 0); }
		public TerminalNode K_ASC() { return getToken(IqlParser.K_ASC, 0); }
		public TerminalNode K_BEFORE() { return getToken(IqlParser.K_BEFORE, 0); }
		public TerminalNode K_BY() { return getToken(IqlParser.K_BY, 0); }
		public TerminalNode K_CHANGED() { return getToken(IqlParser.K_CHANGED, 0); }
		public TerminalNode K_DESC() { return getToken(IqlParser.K_DESC, 0); }
		public TerminalNode K_IN() { return getToken(IqlParser.K_IN, 0); }
		public TerminalNode K_IS() { return getToken(IqlParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(IqlParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(IqlParser.K_NULL, 0); }
		public TerminalNode K_ON() { return getToken(IqlParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(IqlParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(IqlParser.K_ORDER, 0); }
		public TerminalNode K_TO() { return getToken(IqlParser.K_TO, 0); }
		public TerminalNode K_WAS() { return getToken(IqlParser.K_WAS, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1098429497344L) != 0)) ) {
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
	public static class State_nameContext extends ParserRuleContext {
		public TerminalNode K_EMPTY() { return getToken(IqlParser.K_EMPTY, 0); }
		public State_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterState_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitState_name(this);
		}
	}

	public final State_nameContext state_name() throws RecognitionException {
		State_nameContext _localctx = new State_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_state_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(K_EMPTY);
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode F_AFFECTED_VERSION() { return getToken(IqlParser.F_AFFECTED_VERSION, 0); }
		public TerminalNode F_APPROVALS() { return getToken(IqlParser.F_APPROVALS, 0); }
		public TerminalNode F_ASSIGNEE() { return getToken(IqlParser.F_ASSIGNEE, 0); }
		public TerminalNode F_ATTACHMENTS() { return getToken(IqlParser.F_ATTACHMENTS, 0); }
		public TerminalNode F_CATEGORY() { return getToken(IqlParser.F_CATEGORY, 0); }
		public TerminalNode F_COMMENT() { return getToken(IqlParser.F_COMMENT, 0); }
		public TerminalNode F_COMPONENT() { return getToken(IqlParser.F_COMPONENT, 0); }
		public TerminalNode F_CREATED() { return getToken(IqlParser.F_CREATED, 0); }
		public TerminalNode F_CREATED_DATE() { return getToken(IqlParser.F_CREATED_DATE, 0); }
		public TerminalNode F_CREATOR() { return getToken(IqlParser.F_CREATOR, 0); }
		public TerminalNode F_CUSTOM_FIELD() { return getToken(IqlParser.F_CUSTOM_FIELD, 0); }
		public TerminalNode F_CUSTOMER_REQUEST_TYPE() { return getToken(IqlParser.F_CUSTOMER_REQUEST_TYPE, 0); }
		public TerminalNode F_DATE() { return getToken(IqlParser.F_DATE, 0); }
		public TerminalNode F_DESCRIPTION() { return getToken(IqlParser.F_DESCRIPTION, 0); }
		public TerminalNode F_DUE() { return getToken(IqlParser.F_DUE, 0); }
		public TerminalNode F_DURATION() { return getToken(IqlParser.F_DURATION, 0); }
		public TerminalNode F_ENVIRONMENT() { return getToken(IqlParser.F_ENVIRONMENT, 0); }
		public TerminalNode F_EPIC_LINK() { return getToken(IqlParser.F_EPIC_LINK, 0); }
		public TerminalNode F_FILTER() { return getToken(IqlParser.F_FILTER, 0); }
		public TerminalNode F_FIX_VERSION() { return getToken(IqlParser.F_FIX_VERSION, 0); }
		public TerminalNode F_ISSUE() { return getToken(IqlParser.F_ISSUE, 0); }
		public TerminalNode F_ISSUE_KEY() { return getToken(IqlParser.F_ISSUE_KEY, 0); }
		public TerminalNode F_ISSUE_TYPE() { return getToken(IqlParser.F_ISSUE_TYPE, 0); }
		public TerminalNode F_KEY() { return getToken(IqlParser.F_KEY, 0); }
		public TerminalNode F_LABEL() { return getToken(IqlParser.F_LABEL, 0); }
		public TerminalNode F_LABELS() { return getToken(IqlParser.F_LABELS, 0); }
		public TerminalNode F_LAST_VIEWED() { return getToken(IqlParser.F_LAST_VIEWED, 0); }
		public TerminalNode F_LEVEL() { return getToken(IqlParser.F_LEVEL, 0); }
		public TerminalNode F_NUMBER() { return getToken(IqlParser.F_NUMBER, 0); }
		public TerminalNode F_ORGANIZATION() { return getToken(IqlParser.F_ORGANIZATION, 0); }
		public TerminalNode F_ORIGINAL_ESTIMATE() { return getToken(IqlParser.F_ORIGINAL_ESTIMATE, 0); }
		public TerminalNode F_PARENT() { return getToken(IqlParser.F_PARENT, 0); }
		public TerminalNode F_PRIORITY() { return getToken(IqlParser.F_PRIORITY, 0); }
		public TerminalNode F_PROJECT() { return getToken(IqlParser.F_PROJECT, 0); }
		public TerminalNode F_RANK() { return getToken(IqlParser.F_RANK, 0); }
		public TerminalNode F_REMAINING_ESTIMATE() { return getToken(IqlParser.F_REMAINING_ESTIMATE, 0); }
		public TerminalNode F_REPORTER() { return getToken(IqlParser.F_REPORTER, 0); }
		public TerminalNode F_REQUEST_CHANNEL_TYPE() { return getToken(IqlParser.F_REQUEST_CHANNEL_TYPE, 0); }
		public TerminalNode F_REQUEST_LAST_ACTIVITY_TIME() { return getToken(IqlParser.F_REQUEST_LAST_ACTIVITY_TIME, 0); }
		public TerminalNode F_RESOLUTION() { return getToken(IqlParser.F_RESOLUTION, 0); }
		public TerminalNode F_RESOLUTION_DATE() { return getToken(IqlParser.F_RESOLUTION_DATE, 0); }
		public TerminalNode F_RESOLVED() { return getToken(IqlParser.F_RESOLVED, 0); }
		public TerminalNode F_SLA() { return getToken(IqlParser.F_SLA, 0); }
		public TerminalNode F_SPRINT() { return getToken(IqlParser.F_SPRINT, 0); }
		public TerminalNode F_STATUS() { return getToken(IqlParser.F_STATUS, 0); }
		public TerminalNode F_SUMMARY() { return getToken(IqlParser.F_SUMMARY, 0); }
		public TerminalNode F_TEXT() { return getToken(IqlParser.F_TEXT, 0); }
		public TerminalNode F_TIME_SPENT() { return getToken(IqlParser.F_TIME_SPENT, 0); }
		public TerminalNode F_TYPE() { return getToken(IqlParser.F_TYPE, 0); }
		public TerminalNode F_UPDATED() { return getToken(IqlParser.F_UPDATED, 0); }
		public TerminalNode F_USER() { return getToken(IqlParser.F_USER, 0); }
		public TerminalNode F_VERSION() { return getToken(IqlParser.F_VERSION, 0); }
		public TerminalNode F_VOTER() { return getToken(IqlParser.F_VOTER, 0); }
		public TerminalNode F_VOTES() { return getToken(IqlParser.F_VOTES, 0); }
		public TerminalNode F_WATCHER() { return getToken(IqlParser.F_WATCHER, 0); }
		public TerminalNode F_WATCHERS() { return getToken(IqlParser.F_WATCHERS, 0); }
		public TerminalNode F_WORK_RATIO() { return getToken(IqlParser.F_WORK_RATIO, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 144115188075855871L) != 0)) ) {
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
	public static class Compare_datesContext extends ParserRuleContext {
		public DatesContext dates() {
			return getRuleContext(DatesContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(IqlParser.K_ON, 0); }
		public TerminalNode K_AFTER() { return getToken(IqlParser.K_AFTER, 0); }
		public TerminalNode K_BEFORE() { return getToken(IqlParser.K_BEFORE, 0); }
		public Compare_datesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_dates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterCompare_dates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitCompare_dates(this);
		}
	}

	public final Compare_datesContext compare_dates() throws RecognitionException {
		Compare_datesContext _localctx = new Compare_datesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compare_dates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34435235840L) != 0)) {
				{
				setState(169);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34435235840L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(172);
			dates();
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
	public static class DatesContext extends ParserRuleContext {
		public TerminalNode DATETIME() { return getToken(IqlParser.DATETIME, 0); }
		public DatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).enterDates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IqlListener ) ((IqlListener)listener).exitDates(this);
		}
	}

	public final DatesContext dates() throws RecognitionException {
		DatesContext _localctx = new DatesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(DATETIME);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001e\u00b1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0003\u0000"+
		" \b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"&\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0003"+
		"\u0002@\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0005\u0003X\b\u0003"+
		"\n\u0003\f\u0003[\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006}\b\u0006"+
		"\n\u0006\f\u0006\u0080\t\u0006\u0003\u0006\u0082\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u008a\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0090\b\t\n\t\f\t\u0093\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009b\b\t\n\t\f\t\u009e"+
		"\t\t\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0003\r\u00ab\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0000\u0001\u0004\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0005"+
		"\u0002\u0000\u0019\u0019\u001d\u001d\u0002\u0000\u0003\u0003\u0005\u0005"+
		"\u0002\u0000\u0017\u001d\u001f\'\u0001\u0000(`\u0003\u0000\u0017\u0017"+
		"\u001a\u001a##\u00c6\u0000\u001f\u0001\u0000\u0000\u0000\u0002#\u0001"+
		"\u0000\u0000\u0000\u0004?\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000"+
		"\u0000\bo\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000\u0000\fw\u0001"+
		"\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000\u0000\u0010\u0089\u0001"+
		"\u0000\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00a3\u0001"+
		"\u0000\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018\u00a7\u0001"+
		"\u0000\u0000\u0000\u001a\u00aa\u0001\u0000\u0000\u0000\u001c\u00ae\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0003\u0004"+
		"\u0002\u0000$&\u0003\u0006\u0003\u0000%$\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u0006\u0002\uffff"+
		"\uffff\u0000()\u0005\u000b\u0000\u0000)*\u0003\u0004\u0002\u0000*+\u0005"+
		"\f\u0000\u0000+@\u0001\u0000\u0000\u0000,.\u0005!\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000004\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000025\u0003\u0018\f\u000035\u0005b\u0000\u000042\u0001\u0000\u0000"+
		"\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006:\u0003\b\u0004"+
		"\u00007;\u0003\n\u0005\u00008;\u0003\u0012\t\u00009;\u0003\f\u0006\u0000"+
		":7\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;=\u0001\u0000\u0000\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?\'\u0001"+
		"\u0000\u0000\u0000?/\u0001\u0000\u0000\u0000@I\u0001\u0000\u0000\u0000"+
		"AB\n\u0004\u0000\u0000BC\u0005\u0018\u0000\u0000CH\u0003\u0004\u0002\u0005"+
		"DE\n\u0003\u0000\u0000EF\u0005$\u0000\u0000FH\u0003\u0004\u0002\u0004"+
		"GA\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005%\u0000\u0000MN\u0005"+
		"\u001b\u0000\u0000NP\u0003\n\u0005\u0000OQ\u0007\u0000\u0000\u0000PO\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QY\u0001\u0000\u0000\u0000"+
		"RS\u0005\r\u0000\u0000SU\u0003\n\u0005\u0000TV\u0007\u0000\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000"+
		"\u0000WR\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000"+
		"[Y\u0001\u0000\u0000\u0000\\p\u0005\u000e\u0000\u0000]p\u0005\u0016\u0000"+
		"\u0000^p\u0005\u0010\u0000\u0000_p\u0005\u0011\u0000\u0000`p\u0005\u0013"+
		"\u0000\u0000ap\u0005\u0012\u0000\u0000bp\u0005\u0014\u0000\u0000cp\u0005"+
		"\u0015\u0000\u0000dp\u0005\u001f\u0000\u0000ef\u0005!\u0000\u0000fp\u0005"+
		"\u001f\u0000\u0000gp\u0005 \u0000\u0000hp\u0005\'\u0000\u0000ij\u0005"+
		" \u0000\u0000jp\u0005!\u0000\u0000kl\u0005\'\u0000\u0000lp\u0005!\u0000"+
		"\u0000mn\u0005\u001c\u0000\u0000np\u0005&\u0000\u0000o\\\u0001\u0000\u0000"+
		"\u0000o]\u0001\u0000\u0000\u0000o^\u0001\u0000\u0000\u0000o_\u0001\u0000"+
		"\u0000\u0000o`\u0001\u0000\u0000\u0000oa\u0001\u0000\u0000\u0000ob\u0001"+
		"\u0000\u0000\u0000oc\u0001\u0000\u0000\u0000od\u0001\u0000\u0000\u0000"+
		"oe\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000"+
		"\u0000oi\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000p\t\u0001\u0000\u0000\u0000qv\u0005b\u0000\u0000rv\u0005a"+
		"\u0000\u0000sv\u0005\u0007\u0000\u0000tv\u0003\u001c\u000e\u0000uq\u0001"+
		"\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000v\u000b\u0001\u0000\u0000\u0000wx\u0003\u000e"+
		"\u0007\u0000x\u0081\u0005\u000b\u0000\u0000y~\u0003\u0010\b\u0000z{\u0005"+
		"\r\u0000\u0000{}\u0003\u0010\b\u0000|z\u0001\u0000\u0000\u0000}\u0080"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0081y\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0005\f\u0000\u0000\u0084"+
		"\r\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0001\u0000\u0000\u0086\u000f"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0003\n\u0005\u0000\u0088\u008a\u0003"+
		"\f\u0006\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u0011\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u000b"+
		"\u0000\u0000\u008c\u0091\u0003\n\u0005\u0000\u008d\u008e\u0005\r\u0000"+
		"\u0000\u008e\u0090\u0003\n\u0005\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095"+
		"\u00a2\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097"+
		"\u009c\u0003\n\u0005\u0000\u0098\u0099\u0005\r\u0000\u0000\u0099\u009b"+
		"\u0003\n\u0005\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u008b\u0001\u0000\u0000\u0000\u00a1\u0096\u0001"+
		"\u0000\u0000\u0000\u00a2\u0013\u0001\u0000\u0000\u0000\u00a3\u00a4\u0007"+
		"\u0002\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\u001e\u0000\u0000\u00a6\u0017\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007"+
		"\u0003\u0000\u0000\u00a8\u0019\u0001\u0000\u0000\u0000\u00a9\u00ab\u0007"+
		"\u0004\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003"+
		"\u001c\u000e\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u0006\u0000\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u0015\u001f%/4"+
		":=?GIPUYou~\u0081\u0089\u0091\u009c\u00a1\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}