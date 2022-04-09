// Define a grammar called Hello
// This is taken from the ANTL "Getting Started" guide: https://github.com/antlr/antlr4/blob/master/doc/getting-started.md
grammar Hello;

@header {
package dgroomes.antlr;
}

greeting  : 'hello' ID ;         // match keyword hello followed by an identifier
ID : [a-zA-Z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
