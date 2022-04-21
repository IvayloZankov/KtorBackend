plugins {
    application
    kotlin("jvm") version "1.6.20"
}

group = "com.fosents"
version = "0.0.1"

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
    implementation("io.ktor:ktor-server-core:2.0.0")
    implementation("io.ktor:ktor-server-netty:2.0.0")
    implementation("io.ktor:ktor-server-html-builder:2.0.0")
    implementation("ch.qos.logback:logback-classic:1.2.11")
}