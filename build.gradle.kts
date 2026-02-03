plugins {
    application
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
}

group = "com.fosents"
version = "1.61"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

kotlin {
    jvmToolchain(17)
}

tasks.register("stage") {
    dependsOn(tasks.named("installDist"))
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.server.netty)
    implementation(libs.ktor.server.html.builder)
    implementation(libs.logback.classic)
    implementation(libs.kotlin.css)
    implementation(libs.ktor.server.status.pages)
    implementation(libs.ktor.server.content.negotiation)

    testImplementation(libs.ktor.server.tests)
    testImplementation(libs.kotlin.test)
}

val mainClassName = "io.ktor.server.netty.EngineMain"

tasks.register<Jar>("fatJar") {
    group = "build"
    description = "Creates a self-contained fat JAR of the application that can be run."
    manifest {
        attributes["Main-Class"] = mainClassName
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    val runtimeClasspathTrees = configurations.runtimeClasspath
        .map { it.map(::zipTree) }

    from(runtimeClasspathTrees)

    with(tasks.jar.get())
}
