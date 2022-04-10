// Generated from /Users/davidgroomes/repos/personal/antlr-playground/app/src/main/java/dgroomes/antlr/Hello.g4 by ANTLR 4.9.3

package dgroomes.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void enterGreeting(HelloParser.GreetingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#greeting}.
	 * @param ctx the parse tree
	 */
	void exitGreeting(HelloParser.GreetingContext ctx);
}