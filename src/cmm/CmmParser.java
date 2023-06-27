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
		RULE_prog = 0, RULE_declaration = 1, RULE_extern = 2, RULE_function_def = 3, 
		RULE_var = 4, RULE_var_decl = 5, RULE_type = 6, RULE_param_types = 7, 
		RULE_function = 8, RULE_function_body = 9, RULE_stmt = 10, RULE_assign = 11, 
		RULE_indexing = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declaration", "extern", "function_def", "var", "var_decl", "type", 
			"param_types", "function", "function_body", "stmt", "assign", "indexing", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'void'", "'extern'", "'('", "')'", "'['", "']'", 
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1560L) != 0)) {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28);
					declaration();
					setState(29);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(31);
					function();
					}
					break;
				}
				}
				setState(36);
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
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
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
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Global_variablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				var_decl();
				}
				break;
			case 2:
				_localctx = new Typed_prototypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(38);
					extern();
					}
				}

				setState(41);
				type();
				setState(42);
				function_def();
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(43);
					match(T__1);
					setState(44);
					function_def();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new Void_prototypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(50);
					extern();
					}
				}

				setState(53);
				match(T__2);
				setState(54);
				function_def();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(55);
					match(T__1);
					setState(56);
					function_def();
					}
					}
					setState(61);
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
	public static class ExternContext extends ParserRuleContext {
		public ExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExtern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExtern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternContext extern() throws RecognitionException {
		ExternContext _localctx = new ExternContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_extern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
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
	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(CmmParser.Id, 0); }
		public Param_typesContext param_types() {
			return getRuleContext(Param_typesContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(Id);
			setState(67);
			match(T__4);
			setState(68);
			param_types();
			setState(69);
			match(T__5);
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
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Id);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(72);
				match(T__6);
				setState(73);
				match(Intcon);
				setState(74);
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
		enterRule(_localctx, 10, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			type();
			setState(78);
			var();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(79);
				match(T__1);
				setState(80);
				var();
				}
				}
				setState(85);
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
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 14, RULE_param_types);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__2);
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				type();
				setState(90);
				match(Id);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ArgPointer) {
					{
					setState(91);
					match(ArgPointer);
					}
				}

				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(94);
					match(T__1);
					setState(95);
					type();
					setState(96);
					match(Id);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ArgPointer) {
						{
						setState(97);
						match(ArgPointer);
						}
					}

					}
					}
					setState(104);
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
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Typed_functionContext extends FunctionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Typed_functionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterTyped_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitTyped_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitTyped_function(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Void_functionContext extends FunctionContext {
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Void_functionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVoid_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVoid_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVoid_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
				_localctx = new Typed_functionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				type();
				setState(108);
				function_def();
				setState(109);
				match(T__10);
				setState(110);
				function_body();
				setState(111);
				match(T__11);
				}
				break;
			case T__2:
				_localctx = new Void_functionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(T__2);
				setState(114);
				function_def();
				setState(115);
				match(T__10);
				setState(116);
				function_body();
				setState(117);
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
	public static class Function_bodyContext extends ParserRuleContext {
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
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(121);
				var_decl();
				setState(122);
				match(T__0);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359977986L) != 0)) {
				{
				{
				setState(129);
				stmt();
				}
				}
				setState(134);
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
		enterRule(_localctx, 20, RULE_stmt);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__12);
				setState(136);
				match(T__4);
				setState(137);
				expr(0);
				setState(138);
				match(T__5);
				setState(139);
				stmt();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(140);
					match(T__13);
					setState(141);
					stmt();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__14);
				setState(145);
				match(T__4);
				setState(146);
				expr(0);
				setState(147);
				match(T__5);
				setState(148);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__15);
				setState(151);
				match(T__4);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(152);
					assign();
					}
				}

				setState(155);
				match(T__0);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648416L) != 0)) {
					{
					setState(156);
					expr(0);
					}
				}

				setState(159);
				match(T__0);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(160);
					assign();
					}
				}

				setState(163);
				match(T__5);
				setState(164);
				stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(T__16);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648416L) != 0)) {
					{
					setState(166);
					expr(0);
					}
				}

				setState(169);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				assign();
				setState(171);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				match(Id);
				setState(174);
				match(T__4);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648416L) != 0)) {
					{
					setState(175);
					expr(0);
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(176);
						match(T__1);
						setState(177);
						expr(0);
						}
						}
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(185);
				match(T__5);
				setState(186);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(T__10);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34359977986L) != 0)) {
					{
					{
					setState(188);
					stmt();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
				match(T__11);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
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
		enterRule(_localctx, 22, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Id);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(199);
				indexing();
				}
			}

			setState(202);
			match(T__17);
			setState(203);
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
		enterRule(_localctx, 24, RULE_indexing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__6);
			setState(206);
			expr(0);
			setState(207);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(210);
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
				setState(211);
				expr(14);
				}
				break;
			case 2:
				{
				setState(212);
				match(Id);
				setState(213);
				match(T__4);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 515397648416L) != 0)) {
					{
					setState(214);
					expr(0);
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(215);
						match(T__1);
						setState(216);
						expr(0);
						}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(224);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(225);
				match(Id);
				setState(226);
				match(T__6);
				setState(227);
				expr(0);
				setState(228);
				match(T__7);
				}
				break;
			case 4:
				{
				setState(230);
				match(Id);
				}
				break;
			case 5:
				{
				setState(231);
				match(T__4);
				setState(232);
				expr(0);
				setState(233);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(235);
				match(Intcon);
				}
				break;
			case 7:
				{
				setState(236);
				match(Charcon);
				}
				break;
			case 8:
				{
				setState(237);
				match(Stringcon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(241);
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
						setState(242);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(244);
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
						setState(245);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(247);
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
						setState(248);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(250);
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
						setState(251);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(253);
						((ExprContext)_localctx).op = match(T__29);
						setState(254);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(256);
						((ExprContext)_localctx).op = match(T__30);
						setState(257);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		case 13:
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
		"\u0004\u0001)\u0108\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001\u0003\u0001"+
		"4\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		":\b\u0001\n\u0001\f\u0001=\t\u0001\u0003\u0001?\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004L\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005R\b\u0005\n\u0005"+
		"\f\u0005U\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007]\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007c\b\u0007\u0005\u0007e\b\u0007\n\u0007\f"+
		"\u0007h\t\u0007\u0003\u0007j\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bx\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t}\b\t\n\t\f\t\u0080\t\t\u0001\t\u0005"+
		"\t\u0083\b\t\n\t\f\t\u0086\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u008f\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001\n\u0001\n\u0003"+
		"\n\u009e\b\n\u0001\n\u0001\n\u0003\n\u00a2\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u00a8\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b3\b\n\n\n\f\n\u00b6\t\n\u0003\n"+
		"\u00b8\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00be\b\n\n\n\f\n\u00c1"+
		"\t\n\u0001\n\u0001\n\u0003\n\u00c5\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00c9\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00da\b\r\n\r\f\r\u00dd\t\r\u0003\r\u00df\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ef\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0103\b\r\n\r\f\r\u0106"+
		"\t\r\u0001\r\u0000\u0001\u001a\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0006\u0001\u0000\t\n\u0001"+
		"\u0000\u0013\u0014\u0001\u0000\u0015\u0016\u0002\u0000\u0014\u0014\u0017"+
		"\u0017\u0001\u0000\u0018\u001b\u0001\u0000\u001c\u001d\u0129\u0000\"\u0001"+
		"\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001\u0000\u0000"+
		"\u0000\u0006B\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nM\u0001"+
		"\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000"+
		"\u0000\u0010w\u0001\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014"+
		"\u00c4\u0001\u0000\u0000\u0000\u0016\u00c6\u0001\u0000\u0000\u0000\u0018"+
		"\u00cd\u0001\u0000\u0000\u0000\u001a\u00ee\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e"+
		"!\u0001\u0000\u0000\u0000\u001f!\u0003\u0010\b\u0000 \u001c\u0001\u0000"+
		"\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0001\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%?\u0003\n\u0005\u0000&(\u0003"+
		"\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)*\u0003\f\u0006\u0000*/\u0003\u0006\u0003\u0000"+
		"+,\u0005\u0002\u0000\u0000,.\u0003\u0006\u0003\u0000-+\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000?\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000024\u0003"+
		"\u0004\u0002\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0005\u0003\u0000\u00006;\u0003\u0006\u0003"+
		"\u000078\u0005\u0002\u0000\u00008:\u0003\u0006\u0003\u000097\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">%\u0001\u0000\u0000\u0000>\'\u0001\u0000\u0000\u0000>3\u0001\u0000\u0000"+
		"\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000A\u0005"+
		"\u0001\u0000\u0000\u0000BC\u0005#\u0000\u0000CD\u0005\u0005\u0000\u0000"+
		"DE\u0003\u000e\u0007\u0000EF\u0005\u0006\u0000\u0000F\u0007\u0001\u0000"+
		"\u0000\u0000GK\u0005#\u0000\u0000HI\u0005\u0007\u0000\u0000IJ\u0005$\u0000"+
		"\u0000JL\u0005\b\u0000\u0000KH\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000L\t\u0001\u0000\u0000\u0000MN\u0003\f\u0006\u0000NS\u0003\b\u0004"+
		"\u0000OP\u0005\u0002\u0000\u0000PR\u0003\b\u0004\u0000QO\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000T\u000b\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"VW\u0007\u0000\u0000\u0000W\r\u0001\u0000\u0000\u0000Xj\u0005\u0003\u0000"+
		"\u0000YZ\u0003\f\u0006\u0000Z\\\u0005#\u0000\u0000[]\u0005\"\u0000\u0000"+
		"\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]f\u0001\u0000\u0000"+
		"\u0000^_\u0005\u0002\u0000\u0000_`\u0003\f\u0006\u0000`b\u0005#\u0000"+
		"\u0000ac\u0005\"\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ce\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000iX\u0001\u0000\u0000\u0000"+
		"iY\u0001\u0000\u0000\u0000j\u000f\u0001\u0000\u0000\u0000kl\u0003\f\u0006"+
		"\u0000lm\u0003\u0006\u0003\u0000mn\u0005\u000b\u0000\u0000no\u0003\u0012"+
		"\t\u0000op\u0005\f\u0000\u0000px\u0001\u0000\u0000\u0000qr\u0005\u0003"+
		"\u0000\u0000rs\u0003\u0006\u0003\u0000st\u0005\u000b\u0000\u0000tu\u0003"+
		"\u0012\t\u0000uv\u0005\f\u0000\u0000vx\u0001\u0000\u0000\u0000wk\u0001"+
		"\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000x\u0011\u0001\u0000\u0000"+
		"\u0000yz\u0003\n\u0005\u0000z{\u0005\u0001\u0000\u0000{}\u0001\u0000\u0000"+
		"\u0000|y\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0084\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0014\n"+
		"\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0013\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0005\r\u0000\u0000\u0088\u0089\u0005\u0005\u0000\u0000"+
		"\u0089\u008a\u0003\u001a\r\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b"+
		"\u008e\u0003\u0014\n\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d\u008f"+
		"\u0003\u0014\n\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u00c5\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\u000f\u0000\u0000\u0091\u0092\u0005\u0005\u0000\u0000\u0092\u0093\u0003"+
		"\u001a\r\u0000\u0093\u0094\u0005\u0006\u0000\u0000\u0094\u0095\u0003\u0014"+
		"\n\u0000\u0095\u00c5\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0010\u0000"+
		"\u0000\u0097\u0099\u0005\u0005\u0000\u0000\u0098\u009a\u0003\u0016\u000b"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0005\u0001\u0000"+
		"\u0000\u009c\u009e\u0003\u001a\r\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a1\u0005\u0001\u0000\u0000\u00a0\u00a2\u0003\u0016\u000b\u0000"+
		"\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000"+
		"\u00a4\u00c5\u0003\u0014\n\u0000\u00a5\u00a7\u0005\u0011\u0000\u0000\u00a6"+
		"\u00a8\u0003\u001a\r\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00c5"+
		"\u0005\u0001\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ac"+
		"\u0005\u0001\u0000\u0000\u00ac\u00c5\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005#\u0000\u0000\u00ae\u00b7\u0005\u0005\u0000\u0000\u00af\u00b4\u0003"+
		"\u001a\r\u0000\u00b0\u00b1\u0005\u0002\u0000\u0000\u00b1\u00b3\u0003\u001a"+
		"\r\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0006\u0000"+
		"\u0000\u00ba\u00c5\u0005\u0001\u0000\u0000\u00bb\u00bf\u0005\u000b\u0000"+
		"\u0000\u00bc\u00be\u0003\u0014\n\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5\u0005\f\u0000\u0000\u00c3"+
		"\u00c5\u0005\u0001\u0000\u0000\u00c4\u0087\u0001\u0000\u0000\u0000\u00c4"+
		"\u0090\u0001\u0000\u0000\u0000\u00c4\u0096\u0001\u0000\u0000\u0000\u00c4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00c4\u00aa\u0001\u0000\u0000\u0000\u00c4"+
		"\u00ad\u0001\u0000\u0000\u0000\u00c4\u00bb\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u0015\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0005#\u0000\u0000\u00c7\u00c9\u0003\u0018\f\u0000\u00c8\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0012\u0000\u0000\u00cb\u00cc"+
		"\u0003\u001a\r\u0000\u00cc\u0017\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0007\u0000\u0000\u00ce\u00cf\u0003\u001a\r\u0000\u00cf\u00d0\u0005\b"+
		"\u0000\u0000\u00d0\u0019\u0001\u0000\u0000\u0000\u00d1\u00d2\u0006\r\uffff"+
		"\uffff\u0000\u00d2\u00d3\u0007\u0001\u0000\u0000\u00d3\u00ef\u0003\u001a"+
		"\r\u000e\u00d4\u00d5\u0005#\u0000\u0000\u00d5\u00de\u0005\u0005\u0000"+
		"\u0000\u00d6\u00db\u0003\u001a\r\u0000\u00d7\u00d8\u0005\u0002\u0000\u0000"+
		"\u00d8\u00da\u0003\u001a\r\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00de\u00d6\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00ef\u0005\u0006\u0000\u0000\u00e1\u00e2\u0005#\u0000\u0000\u00e2\u00e3"+
		"\u0005\u0007\u0000\u0000\u00e3\u00e4\u0003\u001a\r\u0000\u00e4\u00e5\u0005"+
		"\b\u0000\u0000\u00e5\u00ef\u0001\u0000\u0000\u0000\u00e6\u00ef\u0005#"+
		"\u0000\u0000\u00e7\u00e8\u0005\u0005\u0000\u0000\u00e8\u00e9\u0003\u001a"+
		"\r\u0000\u00e9\u00ea\u0005\u0006\u0000\u0000\u00ea\u00ef\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ef\u0005$\u0000\u0000\u00ec\u00ef\u0005%\u0000\u0000\u00ed"+
		"\u00ef\u0005&\u0000\u0000\u00ee\u00d1\u0001\u0000\u0000\u0000\u00ee\u00d4"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e1\u0001\u0000\u0000\u0000\u00ee\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000\u0000\u00ee\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u0104\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\n\r\u0000\u0000\u00f1\u00f2\u0007\u0002\u0000\u0000\u00f2\u0103\u0003"+
		"\u001a\r\u000e\u00f3\u00f4\n\f\u0000\u0000\u00f4\u00f5\u0007\u0003\u0000"+
		"\u0000\u00f5\u0103\u0003\u001a\r\r\u00f6\u00f7\n\u000b\u0000\u0000\u00f7"+
		"\u00f8\u0007\u0004\u0000\u0000\u00f8\u0103\u0003\u001a\r\f\u00f9\u00fa"+
		"\n\n\u0000\u0000\u00fa\u00fb\u0007\u0005\u0000\u0000\u00fb\u0103\u0003"+
		"\u001a\r\u000b\u00fc\u00fd\n\t\u0000\u0000\u00fd\u00fe\u0005\u001e\u0000"+
		"\u0000\u00fe\u0103\u0003\u001a\r\n\u00ff\u0100\n\b\u0000\u0000\u0100\u0101"+
		"\u0005\u001f\u0000\u0000\u0101\u0103\u0003\u001a\r\t\u0102\u00f0\u0001"+
		"\u0000\u0000\u0000\u0102\u00f3\u0001\u0000\u0000\u0000\u0102\u00f6\u0001"+
		"\u0000\u0000\u0000\u0102\u00f9\u0001\u0000\u0000\u0000\u0102\u00fc\u0001"+
		"\u0000\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0103\u0106\u0001"+
		"\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001"+
		"\u0000\u0000\u0000\u0105\u001b\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u001f \"\'/3;>KS\\bfiw~\u0084\u008e\u0099\u009d\u00a1"+
		"\u00a7\u00b4\u00b7\u00bf\u00c4\u00c8\u00db\u00de\u00ee\u0102\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}