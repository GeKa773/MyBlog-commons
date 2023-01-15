import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktor_version: String by project


plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "geka.radchenko.myblog.commons.com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}