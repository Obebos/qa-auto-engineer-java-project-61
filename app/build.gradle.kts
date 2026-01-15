plugins {
    application
    id("org.sonarqube") version "7.2.2.6593"
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application { mainClass.set("hexlet.code.App") }

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "Obebos_qa-auto-engineer-java-project-61")
        property("sonar.organization", "obebos")
    }
}

checkstyle {
    toolVersion = "10.12.5"
    configFile = file("config/checkstyle/checkstyle.xml")
}


tasks.register("checkstyle") {
    dependsOn(tasks.named("checkstyleMain"))
    dependsOn(tasks.named("checkstyleTest"))
    group = "verification"
    description = "Runs Checkstyle on all source sets"
}

tasks.named("check") {
    dependsOn("checkstyle")
}
