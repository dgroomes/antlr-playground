# antlr-playground

📚 Learning and exploring ANTLR (ANother Tool for Language Recognition).

> ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for reading, processing, executing, or
> translating structured text or binary files.
> 
> --<cite>https://www.antlr.org/</antlr>

## Description

This playground repository adapts from the example in ANTLR's [Getting Started](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)
guide. It implements the ANTLR code-gen via a Gradle plugin and task. 

## Instructions

Follow these instructions to code-gen the parser, build the sample program and run it:

1. Use Java 17
2. Generate the ANTLR parser:
   * `./gradlew antlr`
   * This task runs ANTLR and generates Java source code files into `src/main/java/dgroomes/antlr` based on the `Hello.g4`
     grammar file in the same directory.
   * The generated code is version-controlled. You are encouraged to read it and learn it. If you want to regenerate
     the parser code from scratch, first delete the generated code by hand, then run the Gradle task.
3. Build the program distribution:
   * `./gradlew install`
4. Create an alias to run the program:
   * `alias app="./app/build/install/app/bin/app"`
5. Run the program over an example `*.hello` file
   * `app greet-friends.hello`
   * It should output something like:
     ```text
     $ app greet-friends.hello
     (greeting hello Demetrius)
     (greeting hello Abigail)
     (greeting hello Evelyn)
     (greeting hello Krobus)
     ```

## Wish list

General clean ups, TODOs and things I wish to implement for this project:

* Learn about [Gradle's built-in `antlr` task](https://docs.gradle.org/current/userguide/antlr_plugin.html). It's not
  brilliantly documented so I had an easier time to just writing the Gradle code by-hand. But it would be more idiomatic
  to use Gradle's own plugin and tasks.
* DONE Support multiple greetings. Right now, only `(greeting hello Demetrius)` shows up in the output but I want `(greeting hello Abigail)`
  etc.
* Better detection for EOF than the `children != null` trick.

## Reference

* [ANTLR docs](https://www.antlr.org/)
