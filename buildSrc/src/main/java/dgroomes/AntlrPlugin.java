package dgroomes;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskProvider;

/**
 * A custom Gradle plugin to run ANTLR over grammar files (*.g4) and write the generated code to 'src/'.
 * <p>
 * This creates an 'antlr' Gradle task and makes it a dependency of the 'compileJava' task. This has the effect that when
 * you run a task like `./gradlew run` or `./gradlew build`, the ANTLR code generation will happen automatically.
 * <p>
 * NOTE: learn Gradle's own antlr plugin and task.
 */
public class AntlrPlugin implements Plugin<Project> {

  @Override
  public void apply(Project project) {
    TaskProvider<AntlrTask> antlrTask = project.getTasks().register("antlr", AntlrTask.class);
    project.getTasks().getByPath("compileJava").dependsOn(antlrTask);
  }
}
