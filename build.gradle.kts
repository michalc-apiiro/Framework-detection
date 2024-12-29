plugins {
    kotlin("jvm") version "1.9.10"
    application
}

repositories {
    mavenCentral()
}


dependencies {
    implementation("org.:slf4j-api:2.0.9")
    implementation("org.slf4j:slf4j-simple:2.0.9") // Simple backend for demonstration
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("MainKt")
}