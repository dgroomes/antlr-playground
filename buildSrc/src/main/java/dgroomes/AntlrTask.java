package dgroomes;

import org.antlr.v4.Tool;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.nio.file.Path;

/**
 * Run ANTLR over the grammar files to generate a parser implemented in Java code. In other words, run ANTLR's code
 * generation step.
 */
public class AntlrTask extends DefaultTask {

  @TaskAction
  public void runAntlr() {
    Path sourceDir = getProject().getProjectDir().toPath().resolve("src/main/java/dgroomes/antlr");
    Path helloGrammar = sourceDir.resolve("Hello.g4");

    Tool tool = new Tool(new String[]{helloGrammar.toString(), "-o", sourceDir.toString()});

    tool.processGrammarsOnCommandLine();
  }
}
