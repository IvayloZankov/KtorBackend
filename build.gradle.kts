val kotlinCssVersion: String by project
val ktorVersion: String by project
val kotlinVersion: String by project
val logbackVersion: String by project
val koinVersion: String by project

plugins {
    application
    kotlin("jvm") version "2.1.20"
    kotlin("plugin.serialization") version "2.1.20"
}

group = "com.fosents"
version = "1.61"

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

tasks.create("stage") {
    dependsOn("installDist")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-server-html-builder:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-css:$kotlinCssVersion")
    implementation("io.ktor:ktor-server-status-pages-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktorVersion")

    testImplementation("io.ktor:ktor-server-tests:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$kotlinVersion")
}

tasks.create("fatJar", Jar::class) {
    group = "build"
    description = "Creates a self-contained fat JAR of the application that can be run."
    manifest.attributes["Main-Class"] = "io.ktor.server.netty.EngineMain"
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    val dependencies = configurations
        .runtimeClasspath
        .get()
        .map(::zipTree)
    from(dependencies)
    with(tasks.jar.get())
}
