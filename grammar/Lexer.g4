lexer grammar Lexer;

WS: [ \t\r\n]+ -> skip;
Comment: '/*' .*? '*/' -> skip;
ArgPointer: '[' WS* ']';
Id: Letter(Letter | Digit | '_')*;
Intcon: Digit+;
Charcon: '\'' Ch '\'' | '\n';
Stringcon: '"' Ch* '"';
Ch: [ -~];
Digit: [0-9];
Letter: [a-zA-Z];
