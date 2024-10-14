plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.commons.io)
    implementation(libs.slf4j.simple)

    // Maven embedder related
    implementation(libs.maven.embedder)
    implementation(libs.maven.compat)
    implementation(libs.maven.resolver.connector.basic)
    implementation(libs.maven.resolver.transport.http)

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "dev.sbsz.MavenLauncher"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
