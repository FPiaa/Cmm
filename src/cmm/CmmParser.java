// Generated from /home/fidler/Estudos/UTFPR/compiladores/trabalho2/grammar/Cmm.g4 by ANTLR 4.12.0
package cmm;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
            T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
            T__31 = 32, WS = 33, Comment = 34, ArgPointer = 35, Id = 36, Intcon = 37, Charcon = 38,
            Stringcon = 39;
    public static final int
            RULE_prog = 0, RULE_declaration = 1, RULE_extern = 2, RULE_function_def = 3,
            RULE_var = 4, RULE_var_param = 5, RULE_var_decl = 6, RULE_type = 7, RULE_param_types = 8,
            RULE_function = 9, RULE_function_body = 10, RULE_stmt = 11, RULE_assign = 12,
            RULE_indexing = 13, RULE_expr = 14;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0001\'\u010c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000" +
                    "\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u00013\t\u0001" +
                    "\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001\u0003\u0001" +
                    "A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0003\u0004N\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005R\b\u0005\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006X\b\u0006\n\u0006" +
                    "\f\u0006[\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0005\bf\b\b\n\b\f\bi\t\b\u0003\bk\b\b\u0001" +
                    "\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
                    "\t\u0001\t\u0001\t\u0003\ty\b\t\u0001\n\u0001\n\u0001\n\u0005\n~\b\n\n" +
                    "\n\f\n\u0081\t\n\u0001\n\u0005\n\u0084\b\n\n\n\f\n\u0087\t\n\u0001\u000b" +
                    "\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
                    "\u0003\u000b\u0090\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b" +
                    "\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b" +
                    "\u009b\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009f\b\u000b\u0001" +
                    "\u000b\u0001\u000b\u0003\u000b\u00a3\b\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0003\u000b\u00a9\b\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0005\u000b\u00b4\b\u000b\n\u000b\f\u000b\u00b7\t\u000b\u0003\u000b" +
                    "\u00b9\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b" +
                    "\u00bf\b\u000b\n\u000b\f\u000b\u00c2\t\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003" +
                    "\u000b\u00cc\b\u000b\u0001\f\u0001\f\u0003\f\u00d0\b\f\u0001\f\u0001\f" +
                    "\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005" +
                    "\u000e\u00e1\b\u000e\n\u000e\f\u000e\u00e4\t\u000e\u0003\u000e\u00e6\b" +
                    "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003" +
                    "\u000e\u00f3\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001" +
                    "\u000e\u0001\u000e\u0005\u000e\u0107\b\u000e\n\u000e\f\u000e\u010a\t\u000e" +
                    "\u0001\u000e\u0000\u0001\u001c\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e" +
                    "\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0006\u0001\u0000\t\n" +
                    "\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0017\u0002\u0000\u0015\u0015" +
                    "\u0018\u0018\u0001\u0000\u0019\u001c\u0001\u0000\u001d\u001e\u012c\u0000" +
                    "$\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004B\u0001" +
                    "\u0000\u0000\u0000\u0006D\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000" +
                    "\u0000\nO\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e\\\u0001" +
                    "\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012x\u0001\u0000\u0000" +
                    "\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u00cb\u0001\u0000\u0000" +
                    "\u0000\u0018\u00cd\u0001\u0000\u0000\u0000\u001a\u00d4\u0001\u0000\u0000" +
                    "\u0000\u001c\u00f2\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001" +
                    "\u0000\u001f \u0005\u0001\u0000\u0000 #\u0001\u0000\u0000\u0000!#\u0003" +
                    "\u0012\t\u0000\"\u001e\u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000" +
                    "#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000" +
                    "\u0000%\u0001\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'A\u0003" +
                    "\f\u0006\u0000(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000)*\u0001" +
                    "\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0003\u000e\u0007\u0000" +
                    ",1\u0003\u0006\u0003\u0000-.\u0005\u0002\u0000\u0000.0\u0003\u0006\u0003" +
                    "\u0000/-\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000" +
                    "\u0000\u000012\u0001\u0000\u0000\u00002A\u0001\u0000\u0000\u000031\u0001" +
                    "\u0000\u0000\u000046\u0003\u0004\u0002\u000054\u0001\u0000\u0000\u0000" +
                    "56\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005\u0003\u0000" +
                    "\u00008=\u0003\u0006\u0003\u00009:\u0005\u0002\u0000\u0000:<\u0003\u0006" +
                    "\u0003\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001" +
                    "\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000" +
                    "?=\u0001\u0000\u0000\u0000@\'\u0001\u0000\u0000\u0000@)\u0001\u0000\u0000" +
                    "\u0000@5\u0001\u0000\u0000\u0000A\u0003\u0001\u0000\u0000\u0000BC\u0005" +
                    "\u0004\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005$\u0000\u0000" +
                    "EF\u0005\u0005\u0000\u0000FG\u0003\u0010\b\u0000GH\u0005\u0006\u0000\u0000" +
                    "H\u0007\u0001\u0000\u0000\u0000IM\u0005$\u0000\u0000JK\u0005\u0007\u0000" +
                    "\u0000KL\u0005%\u0000\u0000LN\u0005\b\u0000\u0000MJ\u0001\u0000\u0000" +
                    "\u0000MN\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OQ\u0005$\u0000" +
                    "\u0000PR\u0005#\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000" +
                    "\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0003\u000e\u0007\u0000TY\u0003" +
                    "\b\u0004\u0000UV\u0005\u0002\u0000\u0000VX\u0003\b\u0004\u0000WU\u0001" +
                    "\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000" +
                    "YZ\u0001\u0000\u0000\u0000Z\r\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000" +
                    "\u0000\\]\u0007\u0000\u0000\u0000]\u000f\u0001\u0000\u0000\u0000^k\u0005" +
                    "\u0003\u0000\u0000_`\u0003\u000e\u0007\u0000`g\u0003\n\u0005\u0000ab\u0005" +
                    "\u0002\u0000\u0000bc\u0003\u000e\u0007\u0000cd\u0003\n\u0005\u0000df\u0001" +
                    "\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000" +
                    "ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000" +
                    "\u0000ig\u0001\u0000\u0000\u0000j^\u0001\u0000\u0000\u0000j_\u0001\u0000" +
                    "\u0000\u0000k\u0011\u0001\u0000\u0000\u0000lm\u0003\u000e\u0007\u0000" +
                    "mn\u0003\u0006\u0003\u0000no\u0005\u000b\u0000\u0000op\u0003\u0014\n\u0000" +
                    "pq\u0005\f\u0000\u0000qy\u0001\u0000\u0000\u0000rs\u0005\u0003\u0000\u0000" +
                    "st\u0003\u0006\u0003\u0000tu\u0005\u000b\u0000\u0000uv\u0003\u0014\n\u0000" +
                    "vw\u0005\f\u0000\u0000wy\u0001\u0000\u0000\u0000xl\u0001\u0000\u0000\u0000" +
                    "xr\u0001\u0000\u0000\u0000y\u0013\u0001\u0000\u0000\u0000z{\u0003\f\u0006" +
                    "\u0000{|\u0005\u0001\u0000\u0000|~\u0001\u0000\u0000\u0000}z\u0001\u0000" +
                    "\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000" +
                    "\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0085\u0001\u0000\u0000\u0000" +
                    "\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0016\u000b\u0000" +
                    "\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000" +
                    "\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000" +
                    "\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000" +
                    "\u0088\u0089\u0005\r\u0000\u0000\u0089\u008a\u0005\u0005\u0000\u0000\u008a" +
                    "\u008b\u0003\u001c\u000e\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c" +
                    "\u008f\u0003\u0016\u000b\u0000\u008d\u008e\u0005\u000e\u0000\u0000\u008e" +
                    "\u0090\u0003\u0016\u000b\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f" +
                    "\u0090\u0001\u0000\u0000\u0000\u0090\u00cc\u0001\u0000\u0000\u0000\u0091" +
                    "\u0092\u0005\u000f\u0000\u0000\u0092\u0093\u0005\u0005\u0000\u0000\u0093" +
                    "\u0094\u0003\u001c\u000e\u0000\u0094\u0095\u0005\u0006\u0000\u0000\u0095" +
                    "\u0096\u0003\u0016\u000b\u0000\u0096\u00cc\u0001\u0000\u0000\u0000\u0097" +
                    "\u0098\u0005\u0010\u0000\u0000\u0098\u009a\u0005\u0005\u0000\u0000\u0099" +
                    "\u009b\u0003\u0018\f\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b" +
                    "\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009e" +
                    "\u0005\u0001\u0000\u0000\u009d\u009f\u0003\u001c\u000e\u0000\u009e\u009d" +
                    "\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0" +
                    "\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u0001\u0000\u0000\u00a1\u00a3" +
                    "\u0003\u0018\f\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001" +
                    "\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005" +
                    "\u0006\u0000\u0000\u00a5\u00cc\u0003\u0016\u000b\u0000\u00a6\u00a8\u0005" +
                    "\u0011\u0000\u0000\u00a7\u00a9\u0003\u001c\u000e\u0000\u00a8\u00a7\u0001" +
                    "\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001" +
                    "\u0000\u0000\u0000\u00aa\u00cc\u0005\u0001\u0000\u0000\u00ab\u00ac\u0003" +
                    "\u0018\f\u0000\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u00cc\u0001\u0000" +
                    "\u0000\u0000\u00ae\u00af\u0005$\u0000\u0000\u00af\u00b8\u0005\u0005\u0000" +
                    "\u0000\u00b0\u00b5\u0003\u001c\u000e\u0000\u00b1\u00b2\u0005\u0002\u0000" +
                    "\u0000\u00b2\u00b4\u0003\u001c\u000e\u0000\u00b3\u00b1\u0001\u0000\u0000" +
                    "\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000" +
                    "\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000" +
                    "\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000\u0000" +
                    "\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000" +
                    "\u0000\u00ba\u00bb\u0005\u0006\u0000\u0000\u00bb\u00cc\u0005\u0001\u0000" +
                    "\u0000\u00bc\u00c0\u0005\u000b\u0000\u0000\u00bd\u00bf\u0003\u0016\u000b" +
                    "\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000" +
                    "\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000" +
                    "\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000" +
                    "\u0000\u00c3\u00cc\u0005\f\u0000\u0000\u00c4\u00c5\u0005\u0012\u0000\u0000" +
                    "\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6\u00c7\u0003\u001c\u000e\u0000" +
                    "\u00c7\u00c8\u0005\u0006\u0000\u0000\u00c8\u00c9\u0005\u0001\u0000\u0000" +
                    "\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\u0001\u0000\u0000" +
                    "\u00cb\u0088\u0001\u0000\u0000\u0000\u00cb\u0091\u0001\u0000\u0000\u0000" +
                    "\u00cb\u0097\u0001\u0000\u0000\u0000\u00cb\u00a6\u0001\u0000\u0000\u0000" +
                    "\u00cb\u00ab\u0001\u0000\u0000\u0000\u00cb\u00ae\u0001\u0000\u0000\u0000" +
                    "\u00cb\u00bc\u0001\u0000\u0000\u0000\u00cb\u00c4\u0001\u0000\u0000\u0000" +
                    "\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc\u0017\u0001\u0000\u0000\u0000" +
                    "\u00cd\u00cf\u0005$\u0000\u0000\u00ce\u00d0\u0003\u001a\r\u0000\u00cf" +
                    "\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0" +
                    "\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0013\u0000\u0000\u00d2" +
                    "\u00d3\u0003\u001c\u000e\u0000\u00d3\u0019\u0001\u0000\u0000\u0000\u00d4" +
                    "\u00d5\u0005\u0007\u0000\u0000\u00d5\u00d6\u0003\u001c\u000e\u0000\u00d6" +
                    "\u00d7\u0005\b\u0000\u0000\u00d7\u001b\u0001\u0000\u0000\u0000\u00d8\u00d9" +
                    "\u0006\u000e\uffff\uffff\u0000\u00d9\u00da\u0007\u0001\u0000\u0000\u00da" +
                    "\u00f3\u0003\u001c\u000e\u000e\u00db\u00dc\u0005$\u0000\u0000\u00dc\u00e5" +
                    "\u0005\u0005\u0000\u0000\u00dd\u00e2\u0003\u001c\u000e\u0000\u00de\u00df" +
                    "\u0005\u0002\u0000\u0000\u00df\u00e1\u0003\u001c\u000e\u0000\u00e0\u00de" +
                    "\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0" +
                    "\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e6" +
                    "\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00dd" +
                    "\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7" +
                    "\u0001\u0000\u0000\u0000\u00e7\u00f3\u0005\u0006\u0000\u0000\u00e8\u00e9" +
                    "\u0005$\u0000\u0000\u00e9\u00f3\u0003\u001a\r\u0000\u00ea\u00f3\u0005" +
                    "$\u0000\u0000\u00eb\u00ec\u0005\u0005\u0000\u0000\u00ec\u00ed\u0003\u001c" +
                    "\u000e\u0000\u00ed\u00ee\u0005\u0006\u0000\u0000\u00ee\u00f3\u0001\u0000" +
                    "\u0000\u0000\u00ef\u00f3\u0005%\u0000\u0000\u00f0\u00f3\u0005&\u0000\u0000" +
                    "\u00f1\u00f3\u0005\'\u0000\u0000\u00f2\u00d8\u0001\u0000\u0000\u0000\u00f2" +
                    "\u00db\u0001\u0000\u0000\u0000\u00f2\u00e8\u0001\u0000\u0000\u0000\u00f2" +
                    "\u00ea\u0001\u0000\u0000\u0000\u00f2\u00eb\u0001\u0000\u0000\u0000\u00f2" +
                    "\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2" +
                    "\u00f1\u0001\u0000\u0000\u0000\u00f3\u0108\u0001\u0000\u0000\u0000\u00f4" +
                    "\u00f5\n\r\u0000\u0000\u00f5\u00f6\u0007\u0002\u0000\u0000\u00f6\u0107" +
                    "\u0003\u001c\u000e\u000e\u00f7\u00f8\n\f\u0000\u0000\u00f8\u00f9\u0007" +
                    "\u0003\u0000\u0000\u00f9\u0107\u0003\u001c\u000e\r\u00fa\u00fb\n\u000b" +
                    "\u0000\u0000\u00fb\u00fc\u0007\u0004\u0000\u0000\u00fc\u0107\u0003\u001c" +
                    "\u000e\f\u00fd\u00fe\n\n\u0000\u0000\u00fe\u00ff\u0007\u0005\u0000\u0000" +
                    "\u00ff\u0107\u0003\u001c\u000e\u000b\u0100\u0101\n\t\u0000\u0000\u0101" +
                    "\u0102\u0005\u001f\u0000\u0000\u0102\u0107\u0003\u001c\u000e\n\u0103\u0104" +
                    "\n\b\u0000\u0000\u0104\u0105\u0005 \u0000\u0000\u0105\u0107\u0003\u001c" +
                    "\u000e\t\u0106\u00f4\u0001\u0000\u0000\u0000\u0106\u00f7\u0001\u0000\u0000" +
                    "\u0000\u0106\u00fa\u0001\u0000\u0000\u0000\u0106\u00fd\u0001\u0000\u0000" +
                    "\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0103\u0001\u0000\u0000" +
                    "\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000" +
                    "\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u001d\u0001\u0000\u0000" +
                    "\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u001e\"$)15=@MQYgjx\u007f\u0085" +
                    "\u008f\u009a\u009e\u00a2\u00a8\u00b5\u00b8\u00c0\u00cb\u00cf\u00e2\u00e5" +
                    "\u00f2\u0106\u0108";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public CmmParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "prog", "declaration", "extern", "function_def", "var", "var_param",
                "var_decl", "type", "param_types", "function", "function_body", "stmt",
                "assign", "indexing", "expr"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "';'", "','", "'void'", "'extern'", "'('", "')'", "'['", "']'",
                "'char'", "'int'", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'",
                "'return'", "'print'", "'='", "'!'", "'-'", "'*'", "'/'", "'+'", "'<'",
                "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, "WS", "Comment",
                "ArgPointer", "Id", "Intcon", "Charcon", "Stringcon"
        };
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
    public String getGrammarFileName() {
        return "Cmm.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(36);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1560L) != 0)) {
                    {
                        setState(34);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(30);
                                declaration();
                                setState(31);
                                match(T__0);
                            }
                            break;
                            case 2: {
                                setState(33);
                                function();
                            }
                            break;
                        }
                    }
                    setState(38);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_declaration);
        int _la;
        try {
            setState(64);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    _localctx = new Global_variablesContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(39);
                    var_decl();
                }
                break;
                case 2:
                    _localctx = new Typed_prototypeContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(41);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__3) {
                        {
                            setState(40);
                            extern();
                        }
                    }

                    setState(43);
                    type();
                    setState(44);
                    function_def();
                    setState(49);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__1) {
                        {
                            {
                                setState(45);
                                match(T__1);
                                setState(46);
                                function_def();
                            }
                        }
                        setState(51);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 3:
                    _localctx = new Void_prototypeContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(53);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__3) {
                        {
                            setState(52);
                            extern();
                        }
                    }

                    setState(55);
                    match(T__2);
                    setState(56);
                    function_def();
                    setState(61);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__1) {
                        {
                            {
                                setState(57);
                                match(T__1);
                                setState(58);
                                function_def();
                            }
                        }
                        setState(63);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExternContext extern() throws RecognitionException {
        ExternContext _localctx = new ExternContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_extern);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                match(T__3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Function_defContext function_def() throws RecognitionException {
        Function_defContext _localctx = new Function_defContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_function_def);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                match(Id);
                setState(69);
                match(T__4);
                setState(70);
                param_types();
                setState(71);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final VarContext var() throws RecognitionException {
        VarContext _localctx = new VarContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_var);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(73);
                match(Id);
                setState(77);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__6) {
                    {
                        setState(74);
                        match(T__6);
                        setState(75);
                        match(Intcon);
                        setState(76);
                        match(T__7);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Var_paramContext var_param() throws RecognitionException {
        Var_paramContext _localctx = new Var_paramContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_var_param);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                match(Id);
                setState(81);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ArgPointer) {
                    {
                        setState(80);
                        match(ArgPointer);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Var_declContext var_decl() throws RecognitionException {
        Var_declContext _localctx = new Var_declContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_var_decl);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(83);
                type();
                setState(84);
                var();
                setState(89);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__1) {
                    {
                        {
                            setState(85);
                            match(T__1);
                            setState(86);
                            var();
                        }
                    }
                    setState(91);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_type);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                _la = _input.LA(1);
                if (!(_la == T__8 || _la == T__9)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Param_typesContext param_types() throws RecognitionException {
        Param_typesContext _localctx = new Param_typesContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_param_types);
        int _la;
        try {
            setState(106);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__2:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(94);
                    match(T__2);
                }
                break;
                case T__8:
                case T__9:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(95);
                    type();
                    setState(96);
                    var_param();
                    setState(103);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == T__1) {
                        {
                            {
                                setState(97);
                                match(T__1);
                                setState(98);
                                type();
                                setState(99);
                                var_param();
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
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunctionContext function() throws RecognitionException {
        FunctionContext _localctx = new FunctionContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_function);
        try {
            setState(120);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__8:
                case T__9:
                    _localctx = new Typed_functionContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(108);
                    type();
                    setState(109);
                    function_def();
                    setState(110);
                    match(T__10);
                    setState(111);
                    function_body();
                    setState(112);
                    match(T__11);
                }
                break;
                case T__2:
                    _localctx = new Void_functionContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(114);
                    match(T__2);
                    setState(115);
                    function_def();
                    setState(116);
                    match(T__10);
                    setState(117);
                    function_body();
                    setState(118);
                    match(T__11);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Function_bodyContext function_body() throws RecognitionException {
        Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_function_body);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__8 || _la == T__9) {
                    {
                        {
                            setState(122);
                            var_decl();
                            setState(123);
                            match(T__0);
                        }
                    }
                    setState(129);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(133);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719978498L) != 0)) {
                    {
                        {
                            setState(130);
                            stmt();
                        }
                    }
                    setState(135);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StmtContext stmt() throws RecognitionException {
        StmtContext _localctx = new StmtContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_stmt);
        int _la;
        try {
            setState(203);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                case 1:
                    _localctx = new If_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(136);
                    match(T__12);
                    setState(137);
                    match(T__4);
                    setState(138);
                    expr(0);
                    setState(139);
                    match(T__5);
                    setState(140);
                    stmt();
                    setState(143);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                        case 1: {
                            setState(141);
                            match(T__13);
                            setState(142);
                            stmt();
                        }
                        break;
                    }
                }
                break;
                case 2:
                    _localctx = new While_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(145);
                    match(T__14);
                    setState(146);
                    match(T__4);
                    setState(147);
                    expr(0);
                    setState(148);
                    match(T__5);
                    setState(149);
                    stmt();
                }
                break;
                case 3:
                    _localctx = new For_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(151);
                    match(T__15);
                    setState(152);
                    match(T__4);
                    setState(154);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Id) {
                        {
                            setState(153);
                            ((For_stmtContext) _localctx).def = assign();
                        }
                    }

                    setState(156);
                    match(T__0);
                    setState(158);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030795296800L) != 0)) {
                        {
                            setState(157);
                            expr(0);
                        }
                    }

                    setState(160);
                    match(T__0);
                    setState(162);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Id) {
                        {
                            setState(161);
                            ((For_stmtContext) _localctx).up = assign();
                        }
                    }

                    setState(164);
                    match(T__5);
                    setState(165);
                    stmt();
                }
                break;
                case 4:
                    _localctx = new Return_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(166);
                    match(T__16);
                    setState(168);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030795296800L) != 0)) {
                        {
                            setState(167);
                            expr(0);
                        }
                    }

                    setState(170);
                    match(T__0);
                }
                break;
                case 5:
                    _localctx = new Assign_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(171);
                    assign();
                    setState(172);
                    match(T__0);
                }
                break;
                case 6:
                    _localctx = new Function_call_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(174);
                    match(Id);
                    setState(175);
                    match(T__4);
                    setState(184);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030795296800L) != 0)) {
                        {
                            setState(176);
                            expr(0);
                            setState(181);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == T__1) {
                                {
                                    {
                                        setState(177);
                                        match(T__1);
                                        setState(178);
                                        expr(0);
                                    }
                                }
                                setState(183);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(186);
                    match(T__5);
                    setState(187);
                    match(T__0);
                }
                break;
                case 7:
                    _localctx = new Block_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(188);
                    match(T__10);
                    setState(192);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719978498L) != 0)) {
                        {
                            {
                                setState(189);
                                stmt();
                            }
                        }
                        setState(194);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(195);
                    match(T__11);
                }
                break;
                case 8:
                    _localctx = new Print_stmtContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(196);
                    match(T__17);
                    setState(197);
                    match(T__4);
                    setState(198);
                    expr(0);
                    setState(199);
                    match(T__5);
                    setState(200);
                    match(T__0);
                }
                break;
                case 9:
                    _localctx = new SemicolonContext(_localctx);
                    enterOuterAlt(_localctx, 9);
                {
                    setState(202);
                    match(T__0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AssignContext assign() throws RecognitionException {
        AssignContext _localctx = new AssignContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_assign);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(205);
                match(Id);
                setState(207);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__6) {
                    {
                        setState(206);
                        indexing();
                    }
                }

                setState(209);
                match(T__18);
                setState(210);
                expr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IndexingContext indexing() throws RecognitionException {
        IndexingContext _localctx = new IndexingContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_indexing);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(212);
                match(T__6);
                setState(213);
                expr(0);
                setState(214);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 28;
        enterRecursionRule(_localctx, 28, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(242);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                    case 1: {
                        _localctx = new Unary_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(217);
                        ((Unary_exprContext) _localctx).op = _input.LT(1);
                        _la = _input.LA(1);
                        if (!(_la == T__19 || _la == T__20)) {
                            ((Unary_exprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(218);
                        expr(14);
                    }
                    break;
                    case 2: {
                        _localctx = new Function_call_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(219);
                        match(Id);
                        setState(220);
                        match(T__4);
                        setState(229);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030795296800L) != 0)) {
                            {
                                setState(221);
                                expr(0);
                                setState(226);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == T__1) {
                                    {
                                        {
                                            setState(222);
                                            match(T__1);
                                            setState(223);
                                            expr(0);
                                        }
                                    }
                                    setState(228);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(231);
                        match(T__5);
                    }
                    break;
                    case 3: {
                        _localctx = new Indexing_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(232);
                        match(Id);
                        setState(233);
                        indexing();
                    }
                    break;
                    case 4: {
                        _localctx = new Id_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(234);
                        match(Id);
                    }
                    break;
                    case 5: {
                        _localctx = new Paren_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(235);
                        match(T__4);
                        setState(236);
                        expr(0);
                        setState(237);
                        match(T__5);
                    }
                    break;
                    case 6: {
                        _localctx = new Int_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(239);
                        match(Intcon);
                    }
                    break;
                    case 7: {
                        _localctx = new Char_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(240);
                        match(Charcon);
                    }
                    break;
                    case 8: {
                        _localctx = new String_exprContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(241);
                        match(Stringcon);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(264);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(262);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                                case 1: {
                                    _localctx = new Mult_exprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(244);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(245);
                                    ((Mult_exprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == T__21 || _la == T__22)) {
                                        ((Mult_exprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(246);
                                    expr(14);
                                }
                                break;
                                case 2: {
                                    _localctx = new Add_exprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(247);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(248);
                                    ((Add_exprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == T__20 || _la == T__23)) {
                                        ((Add_exprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(249);
                                    expr(13);
                                }
                                break;
                                case 3: {
                                    _localctx = new Cmp_exprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(250);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(251);
                                    ((Cmp_exprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0))) {
                                        ((Cmp_exprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(252);
                                    expr(12);
                                }
                                break;
                                case 4: {
                                    _localctx = new Eq_exprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(253);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(254);
                                    ((Eq_exprContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == T__28 || _la == T__29)) {
                                        ((Eq_exprContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    } else {
                                        if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(255);
                                    expr(11);
                                }
                                break;
                                case 5: {
                                    _localctx = new And_exprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(256);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(257);
                                    ((And_exprContext) _localctx).op = match(T__30);
                                    setState(258);
                                    expr(10);
                                }
                                break;
                                case 6: {
                                    _localctx = new Or_exprContext(new ExprContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(259);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(260);
                                    ((Or_exprContext) _localctx).op = match(T__31);
                                    setState(261);
                                    expr(9);
                                }
                                break;
                            }
                        }
                    }
                    setState(266);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 14:
                return expr_sempred((ExprContext) _localctx, predIndex);
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

    @SuppressWarnings("CheckReturnValue")
    public static class ProgContext extends ParserRuleContext {
        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<DeclarationContext> declaration() {
            return getRuleContexts(DeclarationContext.class);
        }

        public DeclarationContext declaration(int i) {
            return getRuleContext(DeclarationContext.class, i);
        }

        public List<FunctionContext> function() {
            return getRuleContexts(FunctionContext.class);
        }

        public FunctionContext function(int i) {
            return getRuleContext(FunctionContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitProg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitProg(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DeclarationContext extends ParserRuleContext {
        public DeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public DeclarationContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration;
        }

        public void copyFrom(DeclarationContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Typed_prototypeContext extends DeclarationContext {
        public Typed_prototypeContext(DeclarationContext ctx) {
            copyFrom(ctx);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<Function_defContext> function_def() {
            return getRuleContexts(Function_defContext.class);
        }

        public Function_defContext function_def(int i) {
            return getRuleContext(Function_defContext.class, i);
        }

        public ExternContext extern() {
            return getRuleContext(ExternContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterTyped_prototype(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitTyped_prototype(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitTyped_prototype(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Void_prototypeContext extends DeclarationContext {
        public Void_prototypeContext(DeclarationContext ctx) {
            copyFrom(ctx);
        }

        public List<Function_defContext> function_def() {
            return getRuleContexts(Function_defContext.class);
        }

        public Function_defContext function_def(int i) {
            return getRuleContext(Function_defContext.class, i);
        }

        public ExternContext extern() {
            return getRuleContext(ExternContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterVoid_prototype(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitVoid_prototype(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitVoid_prototype(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Global_variablesContext extends DeclarationContext {
        public Global_variablesContext(DeclarationContext ctx) {
            copyFrom(ctx);
        }

        public Var_declContext var_decl() {
            return getRuleContext(Var_declContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterGlobal_variables(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitGlobal_variables(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitGlobal_variables(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExternContext extends ParserRuleContext {
        public ExternContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_extern;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterExtern(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitExtern(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitExtern(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Function_defContext extends ParserRuleContext {
        public Function_defContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        public Param_typesContext param_types() {
            return getRuleContext(Param_typesContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_def;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterFunction_def(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitFunction_def(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitFunction_def(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class VarContext extends ParserRuleContext {
        public VarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        public TerminalNode Intcon() {
            return getToken(CmmParser.Intcon, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitVar(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Var_paramContext extends ParserRuleContext {
        public Var_paramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        public TerminalNode ArgPointer() {
            return getToken(CmmParser.ArgPointer, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var_param;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterVar_param(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitVar_param(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitVar_param(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Var_declContext extends ParserRuleContext {
        public Var_declContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<VarContext> var() {
            return getRuleContexts(VarContext.class);
        }

        public VarContext var(int i) {
            return getRuleContext(VarContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var_decl;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterVar_decl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitVar_decl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitVar_decl(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TypeContext extends ParserRuleContext {
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterType(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitType(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitType(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Param_typesContext extends ParserRuleContext {
        public Param_typesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TypeContext> type() {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i) {
            return getRuleContext(TypeContext.class, i);
        }

        public List<Var_paramContext> var_param() {
            return getRuleContexts(Var_paramContext.class);
        }

        public Var_paramContext var_param(int i) {
            return getRuleContext(Var_paramContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_param_types;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterParam_types(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitParam_types(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitParam_types(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionContext extends ParserRuleContext {
        public FunctionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FunctionContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_function;
        }

        public void copyFrom(FunctionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Typed_functionContext extends FunctionContext {
        public Typed_functionContext(FunctionContext ctx) {
            copyFrom(ctx);
        }

        public TypeContext type() {
            return getRuleContext(TypeContext.class, 0);
        }

        public Function_defContext function_def() {
            return getRuleContext(Function_defContext.class, 0);
        }

        public Function_bodyContext function_body() {
            return getRuleContext(Function_bodyContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterTyped_function(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitTyped_function(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitTyped_function(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Void_functionContext extends FunctionContext {
        public Void_functionContext(FunctionContext ctx) {
            copyFrom(ctx);
        }

        public Function_defContext function_def() {
            return getRuleContext(Function_defContext.class, 0);
        }

        public Function_bodyContext function_body() {
            return getRuleContext(Function_bodyContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterVoid_function(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitVoid_function(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitVoid_function(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Function_bodyContext extends ParserRuleContext {
        public Function_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<Var_declContext> var_decl() {
            return getRuleContexts(Var_declContext.class);
        }

        public Var_declContext var_decl(int i) {
            return getRuleContext(Var_declContext.class, i);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_function_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterFunction_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitFunction_body(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitFunction_body(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StmtContext extends ParserRuleContext {
        public StmtContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StmtContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_stmt;
        }

        public void copyFrom(StmtContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class While_stmtContext extends StmtContext {
        public While_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterWhile_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitWhile_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitWhile_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Block_stmtContext extends StmtContext {
        public Block_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterBlock_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitBlock_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitBlock_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class If_stmtContext extends StmtContext {
        public If_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<StmtContext> stmt() {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i) {
            return getRuleContext(StmtContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterIf_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitIf_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitIf_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class For_stmtContext extends StmtContext {
        public AssignContext def;
        public AssignContext up;

        public For_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public StmtContext stmt() {
            return getRuleContext(StmtContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<AssignContext> assign() {
            return getRuleContexts(AssignContext.class);
        }

        public AssignContext assign(int i) {
            return getRuleContext(AssignContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterFor_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitFor_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitFor_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Function_call_stmtContext extends StmtContext {
        public Function_call_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterFunction_call_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitFunction_call_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitFunction_call_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Print_stmtContext extends StmtContext {
        public Print_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterPrint_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitPrint_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitPrint_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Return_stmtContext extends StmtContext {
        public Return_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterReturn_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitReturn_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitReturn_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Assign_stmtContext extends StmtContext {
        public Assign_stmtContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        public AssignContext assign() {
            return getRuleContext(AssignContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterAssign_stmt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitAssign_stmt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitAssign_stmt(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SemicolonContext extends StmtContext {
        public SemicolonContext(StmtContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterSemicolon(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitSemicolon(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitSemicolon(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AssignContext extends ParserRuleContext {
        public AssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public IndexingContext indexing() {
            return getRuleContext(IndexingContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitAssign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitAssign(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IndexingContext extends ParserRuleContext {
        public IndexingContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_indexing;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterIndexing(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitIndexing(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitIndexing(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Paren_exprContext extends ExprContext {
        public Paren_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterParen_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitParen_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitParen_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Int_exprContext extends ExprContext {
        public Int_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Intcon() {
            return getToken(CmmParser.Intcon, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterInt_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitInt_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitInt_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Add_exprContext extends ExprContext {
        public Token op;

        public Add_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterAdd_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitAdd_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitAdd_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Id_exprContext extends ExprContext {
        public Id_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterId_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitId_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitId_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Indexing_exprContext extends ExprContext {
        public Indexing_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        public IndexingContext indexing() {
            return getRuleContext(IndexingContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterIndexing_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitIndexing_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitIndexing_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Cmp_exprContext extends ExprContext {
        public Token op;

        public Cmp_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterCmp_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitCmp_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitCmp_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Mult_exprContext extends ExprContext {
        public Token op;

        public Mult_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterMult_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitMult_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitMult_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Unary_exprContext extends ExprContext {
        public Token op;

        public Unary_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterUnary_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitUnary_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitUnary_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class String_exprContext extends ExprContext {
        public String_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Stringcon() {
            return getToken(CmmParser.Stringcon, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterString_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitString_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitString_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class And_exprContext extends ExprContext {
        public Token op;

        public And_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterAnd_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitAnd_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitAnd_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Or_exprContext extends ExprContext {
        public Token op;

        public Or_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterOr_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitOr_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitOr_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Eq_exprContext extends ExprContext {
        public Token op;

        public Eq_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterEq_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitEq_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitEq_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Function_call_exprContext extends ExprContext {
        public Function_call_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Id() {
            return getToken(CmmParser.Id, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterFunction_call_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitFunction_call_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitFunction_call_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Char_exprContext extends ExprContext {
        public Char_exprContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode Charcon() {
            return getToken(CmmParser.Charcon, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).enterChar_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CmmListener) ((CmmListener) listener).exitChar_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CmmVisitor) return ((CmmVisitor<? extends T>) visitor).visitChar_expr(this);
            else return visitor.visitChildren(this);
        }
    }
}