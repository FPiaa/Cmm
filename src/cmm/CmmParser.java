// Generated from /home/fidler/Estudos/UTFPR/compiladores/trabalho2/grammar/Cmm.g4 by ANTLR 4.12.0
package cmm;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		WS=32, Comment=33, ArgPointer=34, Id=35, Intcon=36, Charcon=37, Stringcon=38, 
		Ch=39, Digit=40, Letter=41;
	public static final int
		RULE_prog = 0, RULE_declaration = 1, RULE_var = 2, RULE_var_decl = 3, 
		RULE_type = 4, RULE_param_types = 5, RULE_function = 6, RULE_stmt = 7, 
		RULE_assign = 8, RULE_indexing = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "var", "var_decl", "type", "param_types", "function", 
			"stmt", "assign", "indexing", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'extern'", "'('", "')'", "','", "'void'", "'['", "']'", 
			"'char'", "'int'", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", 
			"'return'", "'='", "'!'", "'-'", "'*'", "'/'", "'+'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "Comment", "ArgPointer", 
			"Id", "Intcon", "Charcon", "Stringcon", "Ch", "Digit", "Letter"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1604L) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					declaration();
					setState(23);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(25);
					function();
					}
					break;
				}
				}
				setState(30);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Typed_prototypeContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(CmmParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(CmmParser.Id, i);
		}
		public List<Param_typesContext> param_types() {
			return getRuleContexts(Param_typesContext.class);
		}
		public Param_typesContext param_types(int i) {
			return getRuleContext(Param_typesContext.class,i);
		}
		public Typed_prototypeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterTyped_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitTyped_prototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitTyped_prototype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Void_prototypeContext extends DeclarationContext {
		public List<TerminalNode> Id() { return getTokens(CmmParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(CmmParser.Id, i);
		}
		public List<Param_typesContext> param_types() {
			return getRuleContexts(Param_typesContext.class);
		}
		public Param_typesContext param_types(int i) {
			return getRuleContext(Param_typesContext.class,i);
		}
		public Void_prototypeContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVoid_prototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVoid_prototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVoid_prototype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Global_variablesContext extends DeclarationContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Global_variablesContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGlobal_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGlobal_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGlobal_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Global_variablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				var_decl();
				}
				break;
			case 2:
				_localctx = new Typed_prototypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(32);
					match(T__1);
					}
				}

				setState(35);
				type();
				setState(36);
				match(Id);
				setState(37);
				match(T__2);
				setState(38);
				param_types();
				setState(39);
				match(T__3);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(40);
					match(T__4);
					setState(41);
					match(Id);
					setState(42);
					match(T__2);
					setState(43);
					param_types();
					setState(44);
					match(T__3);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new Void_prototypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(51);
					match(T__1);
					}
				}

				setState(54);
				match(T__5);
				setState(55);
				match(Id);
				setState(56);
				match(T__2);
				setState(57);
				param_types();
				setState(58);
				match(T__3);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(59);
					match(T__4);
					setState(60);
					match(Id);
					setState(61);
					match(T__2);
					setState(62);
					param_types();
					setState(63);
					match(T__3);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(CmmParser.Id, 0); }
		public TerminalNode Intcon() { return getToken(CmmParser.Intcon, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(Id);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(73);
				match(T__6);
				setState(74);
				match(Intcon);
				setState(75);
				match(T__7);
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
	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			type();
			setState(79);
			var();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(80);
				match(T__4);
				setState(81);
				var();
				}
				}
				setState(86);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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
	public static class Param_typesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(CmmParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(CmmParser.Id, i);
		}
		public List<TerminalNode> ArgPointer() { return getTokens(CmmParser.ArgPointer); }
		public TerminalNode ArgPointer(int i) {
			return getToken(CmmParser.ArgPointer, i);
		}
		public Param_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterParam_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitParam_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitParam_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_typesContext param_types() throws RecognitionException {
		Param_typesContext _localctx = new Param_typesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param_types);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__5);
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				type();
				setState(91);
				match(Id);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArgPointer) {
					{
					setState(92);
					match(ArgPointer);
					}
				}

				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(95);
					match(T__4);
					setState(96);
					type();
					setState(97);
					match(Id);
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArgPointer) {
						{
						setState(98);
						match(ArgPointer);
						}
					}

					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Id() { return getToken(CmmParser.Id, 0); }
		public Param_typesContext param_types() {
			return getRuleContext(Param_typesContext.class,0);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				type();
				setState(109);
				match(Id);
				setState(110);
				match(T__2);
				setState(111);
				param_types();
				setState(112);
				match(T__3);
				setState(113);
				match(T__10);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8 || _la==T__9) {
					{
					{
					setState(114);
					var_decl();
					setState(115);
					match(T__0);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359977986L) != 0)) {
					{
					{
					setState(122);
					stmt();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__11);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__5);
				setState(131);
				match(Id);
				setState(132);
				match(T__2);
				setState(133);
				param_types();
				setState(134);
				match(T__3);
				setState(135);
				match(T__10);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8 || _la==T__9) {
					{
					{
					setState(136);
					var_decl();
					setState(137);
					match(T__0);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359977986L) != 0)) {
					{
					{
					setState(144);
					stmt();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(T__11);
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
	public static class StmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TerminalNode Id() { return getToken(CmmParser.Id, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(T__12);
				setState(155);
				match(T__2);
				setState(156);
				expr(0);
				setState(157);
				match(T__3);
				setState(158);
				stmt();
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(159);
					match(T__13);
					setState(160);
					stmt();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__14);
				setState(164);
				match(T__2);
				setState(165);
				expr(0);
				setState(166);
				match(T__3);
				setState(167);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(T__15);
				setState(170);
				match(T__2);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(171);
					assign();
					}
				}

				setState(174);
				match(T__0);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648392L) != 0)) {
					{
					setState(175);
					expr(0);
					}
				}

				setState(178);
				match(T__0);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(179);
					assign();
					}
				}

				setState(182);
				match(T__3);
				setState(183);
				stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(T__16);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648392L) != 0)) {
					{
					setState(185);
					expr(0);
					}
				}

				setState(188);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				assign();
				setState(190);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				match(Id);
				setState(193);
				match(T__2);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648392L) != 0)) {
					{
					setState(194);
					expr(0);
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(195);
						match(T__4);
						setState(196);
						expr(0);
						}
						}
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(204);
				match(T__3);
				setState(205);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(T__10);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359977986L) != 0)) {
					{
					{
					setState(207);
					stmt();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(T__11);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				match(T__0);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(CmmParser.Id, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexingContext indexing() {
			return getRuleContext(IndexingContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(Id);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(218);
				indexing();
				}
			}

			setState(221);
			match(T__17);
			setState(222);
			expr(0);
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
	public static class IndexingContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndexingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIndexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexingContext indexing() throws RecognitionException {
		IndexingContext _localctx = new IndexingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_indexing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__6);
			setState(225);
			expr(0);
			setState(226);
			match(T__7);
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
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Id() { return getToken(CmmParser.Id, 0); }
		public TerminalNode Intcon() { return getToken(CmmParser.Intcon, 0); }
		public TerminalNode Charcon() { return getToken(CmmParser.Charcon, 0); }
		public TerminalNode Stringcon() { return getToken(CmmParser.Stringcon, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(229);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				expr(14);
				}
				break;
			case 2:
				{
				setState(231);
				match(Id);
				setState(232);
				match(T__2);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648392L) != 0)) {
					{
					setState(233);
					expr(0);
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(234);
						match(T__4);
						setState(235);
						expr(0);
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(243);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(244);
				match(Id);
				setState(245);
				match(T__6);
				setState(246);
				expr(0);
				setState(247);
				match(T__7);
				}
				break;
			case 4:
				{
				setState(249);
				match(Id);
				}
				break;
			case 5:
				{
				setState(250);
				match(T__2);
				setState(251);
				expr(0);
				setState(252);
				match(T__3);
				}
				break;
			case 6:
				{
				setState(254);
				match(Intcon);
				}
				break;
			case 7:
				{
				setState(255);
				match(Charcon);
				}
				break;
			case 8:
				{
				setState(256);
				match(Stringcon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(260);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(261);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(263);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__22) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(266);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(269);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(272);
						((ExprContext)_localctx).op = match(T__29);
						setState(273);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(275);
						((ExprContext)_localctx).op = match(T__30);
						setState(276);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u011b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u0001"+
		"2\t\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001B\b\u0001\n\u0001\f\u0001E\t"+
		"\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002M\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003S\b\u0003\n\u0003\f\u0003V\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005^\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b"+
		"\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0003\u0005k\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006v\b\u0006\n\u0006\f\u0006"+
		"y\t\u0006\u0001\u0006\u0005\u0006|\b\u0006\n\u0006\f\u0006\u007f\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001\u0006\u0005\u0006\u0092"+
		"\b\u0006\n\u0006\f\u0006\u0095\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0099\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00a2\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00ad\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00b1\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b5\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00bb\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c6\b\u0007\n\u0007\f\u0007"+
		"\u00c9\t\u0007\u0003\u0007\u00cb\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00d1\b\u0007\n\u0007\f\u0007\u00d4\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00d8\b\u0007\u0001\b\u0001\b\u0003"+
		"\b\u00dc\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ed"+
		"\b\n\n\n\f\n\u00f0\t\n\u0003\n\u00f2\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0102\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0116\b\n\n\n\f\n\u0119\t\n\u0001\n"+
		"\u0000\u0001\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0000\u0006\u0001\u0000\t\n\u0001\u0000\u0013\u0014\u0001\u0000"+
		"\u0015\u0016\u0002\u0000\u0014\u0014\u0017\u0017\u0001\u0000\u0018\u001b"+
		"\u0001\u0000\u001c\u001d\u0141\u0000\u001c\u0001\u0000\u0000\u0000\u0002"+
		"F\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006N\u0001"+
		"\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\nj\u0001\u0000\u0000\u0000"+
		"\f\u0098\u0001\u0000\u0000\u0000\u000e\u00d7\u0001\u0000\u0000\u0000\u0010"+
		"\u00d9\u0001\u0000\u0000\u0000\u0012\u00e0\u0001\u0000\u0000\u0000\u0014"+
		"\u0101\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017"+
		"\u0018\u0005\u0001\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u001b\u0003\f\u0006\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u0001"+
		"\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001fG\u0003"+
		"\u0006\u0003\u0000 \"\u0005\u0002\u0000\u0000! \u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0003\b\u0004"+
		"\u0000$%\u0005#\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0003\n\u0005"+
		"\u0000\'0\u0005\u0004\u0000\u0000()\u0005\u0005\u0000\u0000)*\u0005#\u0000"+
		"\u0000*+\u0005\u0003\u0000\u0000+,\u0003\n\u0005\u0000,-\u0005\u0004\u0000"+
		"\u0000-/\u0001\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000/2\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u00001G\u0001"+
		"\u0000\u0000\u000020\u0001\u0000\u0000\u000035\u0005\u0002\u0000\u0000"+
		"43\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0005\u0006\u0000\u000078\u0005#\u0000\u000089\u0005\u0003\u0000"+
		"\u00009:\u0003\n\u0005\u0000:C\u0005\u0004\u0000\u0000;<\u0005\u0005\u0000"+
		"\u0000<=\u0005#\u0000\u0000=>\u0005\u0003\u0000\u0000>?\u0003\n\u0005"+
		"\u0000?@\u0005\u0004\u0000\u0000@B\u0001\u0000\u0000\u0000A;\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"F\u001f\u0001\u0000\u0000\u0000F!\u0001\u0000\u0000\u0000F4\u0001\u0000"+
		"\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HL\u0005#\u0000\u0000IJ\u0005"+
		"\u0007\u0000\u0000JK\u0005$\u0000\u0000KM\u0005\b\u0000\u0000LI\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0005\u0001\u0000\u0000"+
		"\u0000NO\u0003\b\u0004\u0000OT\u0003\u0004\u0002\u0000PQ\u0005\u0005\u0000"+
		"\u0000QS\u0003\u0004\u0002\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0007"+
		"\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0007\u0000\u0000"+
		"\u0000X\t\u0001\u0000\u0000\u0000Yk\u0005\u0006\u0000\u0000Z[\u0003\b"+
		"\u0004\u0000[]\u0005#\u0000\u0000\\^\u0005\"\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^g\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0005\u0000\u0000`a\u0003\b\u0004\u0000ac\u0005#\u0000\u0000bd\u0005"+
		"\"\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000jY\u0001\u0000\u0000\u0000jZ\u0001\u0000"+
		"\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lm\u0003\b\u0004\u0000mn\u0005"+
		"#\u0000\u0000no\u0005\u0003\u0000\u0000op\u0003\n\u0005\u0000pq\u0005"+
		"\u0004\u0000\u0000qw\u0005\u000b\u0000\u0000rs\u0003\u0006\u0003\u0000"+
		"st\u0005\u0001\u0000\u0000tv\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x}\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0003"+
		"\u000e\u0007\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\f"+
		"\u0000\u0000\u0081\u0099\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0006"+
		"\u0000\u0000\u0083\u0084\u0005#\u0000\u0000\u0084\u0085\u0005\u0003\u0000"+
		"\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0005\u0004\u0000\u0000"+
		"\u0087\u008d\u0005\u000b\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0000"+
		"\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000"+
		"\u008b\u0088\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0093\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0003\u000e\u0007\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097"+
		"\u0099\u0001\u0000\u0000\u0000\u0098l\u0001\u0000\u0000\u0000\u0098\u0082"+
		"\u0001\u0000\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\r\u0000\u0000\u009b\u009c\u0005\u0003\u0000\u0000\u009c\u009d\u0003\u0014"+
		"\n\u0000\u009d\u009e\u0005\u0004\u0000\u0000\u009e\u00a1\u0003\u000e\u0007"+
		"\u0000\u009f\u00a0\u0005\u000e\u0000\u0000\u00a0\u00a2\u0003\u000e\u0007"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00d8\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000f\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0003\u0000\u0000\u00a5\u00a6\u0003\u0014\n\u0000"+
		"\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000"+
		"\u00a8\u00d8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0010\u0000\u0000"+
		"\u00aa\u00ac\u0005\u0003\u0000\u0000\u00ab\u00ad\u0003\u0010\b\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u0001\u0000\u0000\u00af"+
		"\u00b1\u0003\u0014\n\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0005\u0001\u0000\u0000\u00b3\u00b5\u0003\u0010\b\u0000\u00b4\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0004\u0000\u0000\u00b7\u00d8\u0003"+
		"\u000e\u0007\u0000\u00b8\u00ba\u0005\u0011\u0000\u0000\u00b9\u00bb\u0003"+
		"\u0014\n\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00d8\u0005\u0001"+
		"\u0000\u0000\u00bd\u00be\u0003\u0010\b\u0000\u00be\u00bf\u0005\u0001\u0000"+
		"\u0000\u00bf\u00d8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005#\u0000\u0000"+
		"\u00c1\u00ca\u0005\u0003\u0000\u0000\u00c2\u00c7\u0003\u0014\n\u0000\u00c3"+
		"\u00c4\u0005\u0005\u0000\u0000\u00c4\u00c6\u0003\u0014\n\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00c2"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0004\u0000\u0000\u00cd\u00d8"+
		"\u0005\u0001\u0000\u0000\u00ce\u00d2\u0005\u000b\u0000\u0000\u00cf\u00d1"+
		"\u0003\u000e\u0007\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d8\u0005\f\u0000\u0000\u00d6\u00d8\u0005"+
		"\u0001\u0000\u0000\u00d7\u009a\u0001\u0000\u0000\u0000\u00d7\u00a3\u0001"+
		"\u0000\u0000\u0000\u00d7\u00a9\u0001\u0000\u0000\u0000\u00d7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00d7\u00bd\u0001\u0000\u0000\u0000\u00d7\u00c0\u0001"+
		"\u0000\u0000\u0000\u00d7\u00ce\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u000f\u0001\u0000\u0000\u0000\u00d9\u00db\u0005"+
		"#\u0000\u0000\u00da\u00dc\u0003\u0012\t\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u0012\u0000\u0000\u00de\u00df\u0003\u0014"+
		"\n\u0000\u00df\u0011\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0007\u0000"+
		"\u0000\u00e1\u00e2\u0003\u0014\n\u0000\u00e2\u00e3\u0005\b\u0000\u0000"+
		"\u00e3\u0013\u0001\u0000\u0000\u0000\u00e4\u00e5\u0006\n\uffff\uffff\u0000"+
		"\u00e5\u00e6\u0007\u0001\u0000\u0000\u00e6\u0102\u0003\u0014\n\u000e\u00e7"+
		"\u00e8\u0005#\u0000\u0000\u00e8\u00f1\u0005\u0003\u0000\u0000\u00e9\u00ee"+
		"\u0003\u0014\n\u0000\u00ea\u00eb\u0005\u0005\u0000\u0000\u00eb\u00ed\u0003"+
		"\u0014\n\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u0102\u0005\u0004"+
		"\u0000\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5\u00f6\u0005\u0007\u0000"+
		"\u0000\u00f6\u00f7\u0003\u0014\n\u0000\u00f7\u00f8\u0005\b\u0000\u0000"+
		"\u00f8\u0102\u0001\u0000\u0000\u0000\u00f9\u0102\u0005#\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0003\u0000\u0000\u00fb\u00fc\u0003\u0014\n\u0000\u00fc\u00fd"+
		"\u0005\u0004\u0000\u0000\u00fd\u0102\u0001\u0000\u0000\u0000\u00fe\u0102"+
		"\u0005$\u0000\u0000\u00ff\u0102\u0005%\u0000\u0000\u0100\u0102\u0005&"+
		"\u0000\u0000\u0101\u00e4\u0001\u0000\u0000\u0000\u0101\u00e7\u0001\u0000"+
		"\u0000\u0000\u0101\u00f4\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000"+
		"\u0000\u0000\u0101\u00fa\u0001\u0000\u0000\u0000\u0101\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0117\u0001\u0000\u0000\u0000\u0103\u0104\n\r\u0000"+
		"\u0000\u0104\u0105\u0007\u0002\u0000\u0000\u0105\u0116\u0003\u0014\n\u000e"+
		"\u0106\u0107\n\f\u0000\u0000\u0107\u0108\u0007\u0003\u0000\u0000\u0108"+
		"\u0116\u0003\u0014\n\r\u0109\u010a\n\u000b\u0000\u0000\u010a\u010b\u0007"+
		"\u0004\u0000\u0000\u010b\u0116\u0003\u0014\n\f\u010c\u010d\n\n\u0000\u0000"+
		"\u010d\u010e\u0007\u0005\u0000\u0000\u010e\u0116\u0003\u0014\n\u000b\u010f"+
		"\u0110\n\t\u0000\u0000\u0110\u0111\u0005\u001e\u0000\u0000\u0111\u0116"+
		"\u0003\u0014\n\n\u0112\u0113\n\b\u0000\u0000\u0113\u0114\u0005\u001f\u0000"+
		"\u0000\u0114\u0116\u0003\u0014\n\t\u0115\u0103\u0001\u0000\u0000\u0000"+
		"\u0115\u0106\u0001\u0000\u0000\u0000\u0115\u0109\u0001\u0000\u0000\u0000"+
		"\u0115\u010c\u0001\u0000\u0000\u0000\u0115\u010f\u0001\u0000\u0000\u0000"+
		"\u0115\u0112\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0015\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"!\u001a\u001c!04CFLT]cgjw}\u008d\u0093\u0098\u00a1\u00ac\u00b0\u00b4\u00ba"+
		"\u00c7\u00ca\u00d2\u00d7\u00db\u00ee\u00f1\u0101\u0115\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}