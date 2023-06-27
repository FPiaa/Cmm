grammar Cmm;
import Lexer;

prog: (declaration ';' | function)*;

declaration: var_decl # global_variables
    | extern? type function_def (',' function_def)* # typed_prototype
    | extern? 'void' function_def (',' function_def)* # void_prototype;
extern: 'extern';
function_def: Id '(' param_types ')';
var: Id ('['  Intcon ']')?;
var_param: Id ArgPointer?;
var_decl: type var (',' var)*;
type: 'char' | 'int';
param_types: 'void'
    | type var_param (',' type var_param)*;

function: type function_def '{' function_body '}' # typed_function
    | 'void' function_def '{' function_body '}' # void_function;
function_body: (var_decl ';')* stmt*;
stmt: 'if' '(' expr ')' stmt ('else' stmt)? # if_stmt
    | 'while' '(' expr ')' stmt # while_stmt
    | 'for' '(' def=assign? ';' expr? ';' up=assign?')' stmt # for_stmt
    | 'return' expr? ';' # return_stmt
    | assign ';' # assign_stmt
    | Id '(' (expr (',' expr)* )? ')'';' # function_call_stmt
    | '{' stmt* '}' # block_stmt
    | 'print' '(' expr ')' # print_stmt
    | ';' # semicolon
    ;
assign: Id indexing? '=' expr;
indexing: '[' expr ']';
expr: <assoc=right> op=('!' | '-') expr # unary_expr
    | expr op=('*' | '/' ) expr # mult_expr
    | expr op=('+' | '-') expr # add_expr
    | expr op=('<' | '<=' | '>' | '>=') expr # cmp_expr
    | expr op=('==' | '!=' ) expr # eq_expr
    | expr op='&&' expr # and_expr
    | expr op='||' expr # or_expr
    | Id '(' (expr (',' expr)*)? ')' #function_call_expr
    | Id indexing # indexing_expr
    | Id # id_expr
    | '(' expr ')' # paren_expr
    | Intcon # int_expr
    | Charcon # char_expr
    | Stringcon # string_expr;