grammar Cmm;
import Lexer;

prog: (declaration ';' | function)*;

declaration: var_decl
    | 'extern'? type Id '(' param_types ')' (',' Id '(' param_types ')')*
    | 'extern'? 'void' Id '(' param_types ')' (',' Id '(' param_types ')')*;

var: Id ('['  Intcon ']')?;
var_decl: type var (',' var)*;
type: 'char' | 'int';
param_types: 'void'
    | type Id ArgPointer? (',' type Id ArgPointer?)*;
function: type Id '(' param_types ')' '{' (var_decl ';')* stmt* '}'
    | 'void' Id '(' param_types ')' '{' (var_decl ';')* stmt* '}' ;
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