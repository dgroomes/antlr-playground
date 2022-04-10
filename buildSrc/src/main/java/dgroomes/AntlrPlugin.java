package dgroomes;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * A custom Gradle plugin to run ANTLR over grammar files (*.g4) and write the generated code to 'src/'.
 * <p>
 * The plugin creates an 'antlr' Gradle task.
 * <p>
 * NOTE: learn Gradle's own antlr plugin and task.
 */
public class AntlrPlugin implements Plugin<Project> {

  @Override
  public void apply(Project project) {
    project.getTasks().register("antlr", AntlrTask.class);
  }
}
