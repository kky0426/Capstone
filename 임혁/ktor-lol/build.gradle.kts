plugins {
    kotlin("jvm") version "1.4.31"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    // ktor-client-core is a core dependency that provides the main client functionality,
    implementation("io.ktor:ktor-client-core:1.5.2")
    // ktor-client-cio is a dependency for an engine processing network requests.
    implementation("io.ktor:ktor-client-cio:1.5.2")

    implementation("io.ktor:ktor-client-gson:1.5.2")
    implementation("io.ktor:ktor-client-jackson:1.5.2")
}
