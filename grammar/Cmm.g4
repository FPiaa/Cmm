grammar Cmm;
import Lexer;

prog: (declaration ';' | function)*;

declaration: var_decl # global_variables
    | extern? type function_def (',' function_def)* # typed_prototype
    | extern? 'void' function_def (',' function_def)* # void_prototype;
extern: 'extern';
function_def: Id '(' param_types ')';
var: Id ('['  Intcon ']')?;
var_decl: type var (',' var)*;
type: 'char' | 'int';
param_types: 'void'
    | type Id ArgPointer? (',' type Id ArgPointer?)*;
function: type function_def '{' function_body '}' # typed_function
    | 'void' function_def '{' function_body '}' # void_function;
function_body: (var_decl ';')* stmt*;
stmt: 'if' '(' expr ')' stmt ('else' stmt)?
    | 'while' '(' expr ')' stmt
    | 'for' '(' assign? ';' expr? ';' assign?')' stmt
    | 'return' expr? ';'
    | assign ';'
    | Id '(' (expr (',' expr)* )? ')'';'
    | '{' stmt* '}'
    | ';';
assign: Id indexing? '=' expr;
indexing: '[' expr ']';
expr: <assoc=right> op=('!' | '-') expr
    | expr op=('*' | '/' ) expr
    | expr op=('+' | '-') expr
    | expr op=('<' | '<=' | '>' | '>=') expr
    | expr op=('==' | '!=' ) expr
    | expr op='&&' expr
    | expr op='||' expr
    | Id '(' (expr (',' expr)*)? ')'
    | Id '[' expr ']'
    | Id
    | '(' expr ')'
    | Intcon
    | Charcon
    | Stringcon;