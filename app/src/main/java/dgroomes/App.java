package dgroomes;

import org.antlr.v4.gui.TestRig;

import java.io.File;

/**
 * This is a simple Java program that parses a file in the 'Hello' syntax. The powerful ANTLR toolchain was used to
 * generate a parser and it is used at runtime in this program to parse the given '.hello' file.
 */
public class App {

  public static void main(String[] args) throws Exception {
    var helloFile = switch (parseArgs(args)) {
      case Ok<File, String> ok -> ok.value();
      case Err<File, String> err -> {
        System.err.println(err.value());
        System.exit(1);
        throw new IllegalStateException("This will never be reached");
      }
    };

    TestRig.main(new String[]{"dgroomes.antlr.Hello", "greeting", "-tree", helloFile.getAbsolutePath()});
  }

  /**
   * Parse the program input arguments. There should be exactly one argument. It is the '.hello' file.
   */
  private static Result<File, String> parseArgs(String[] args) {
    File helloFile;

    if (args.length == 1) {
      helloFile = new File(args[0]);
    } else if (args.length == 0) {
      return Err.err("Expected exactly one argument but found none. Exiting.");
    } else {
      return Err.err("Expected exactly one argument but found %d. Exiting.".formatted(args.length));
    }

    if (!helloFile.exists()) {
      return Err.err("The given file '%s' does not exist. Exiting.".formatted(helloFile));
    }

    if (!helloFile.getName().endsWith(".hello")) {
      return Err.err("The given file '%s' must be a '.hello' file but is not. Exiting.".formatted(helloFile));
    }

    return Ok.ok(helloFile);
  }
}
