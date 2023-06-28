lexer grammar Lexer;

WS: [ \t\r\n]+ -> skip;
Comment: '/*' .*? '*/' -> skip;
ArgPointer: '[' ']';
Id: Letter(Letter | Digit | '_')*;
Intcon: Digit+;
Charcon: '\'' (~[\\]*| ESC) '\'' | '\n';
Stringcon: '"' (~["\\]| ESC)* '"';
fragment ESC: '\\' (["\\/bnfrt0]);
fragment Digit: [0-9];
fragment Letter: [a-zA-Z];

