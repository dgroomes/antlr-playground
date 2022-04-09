plugins {
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("antlr") {
            id = "dgroomes.antlr"
            implementationClass = "dgroomes.AntlrPlugin"
        }
    }
}

repositories {
    mavenCentral()
}

val antlrVersion = "4.9.3"

dependencies {
    implementation("org.antlr:antlr4:$antlrVersion")
}
