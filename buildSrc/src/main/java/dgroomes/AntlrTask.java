package dgroomes;

import org.antlr.v4.Tool;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Run ANTLR over the grammar files to generate a parser implemented in Java code. In other words, run ANTLR's code
 * generation step.
 */
public class AntlrTask extends DefaultTask {

  @TaskAction
  public void runAntlr() {
    var helloGrammar = getProject().getProjectDir().toPath().resolve("src/main/antlr/Hello.g4").toString();
    var outputDirectory = getProject().getProjectDir().toPath().resolve("src/main/java/dgroomes/antlr").toString();
    Tool tool = new Tool(new String[]{helloGrammar, "-o", outputDirectory});
    tool.processGrammarsOnCommandLine();
  }
}
