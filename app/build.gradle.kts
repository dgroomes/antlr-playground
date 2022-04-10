plugins {
    application
    id("dgroomes.antlr")
}

repositories {
    mavenCentral()
}

val antlrVersion = "4.9.3"

dependencies {
    implementation("org.antlr:antlr4-runtime:$antlrVersion")
}

application {
    mainClass.set("dgroomes.App")
}

/**
 * Configure the compiler task, start script creation task, and the run task to enable Java language "Preview
 * Features"
 */
tasks {
    compileJava {
        options.compilerArgs.addAll(arrayOf("--enable-preview"))
    }

    startScripts {
        defaultJvmOpts = listOf("--enable-preview")
    }

    named<JavaExec>("run") {
        jvmArgs = listOf("--enable-preview")
    }
}
