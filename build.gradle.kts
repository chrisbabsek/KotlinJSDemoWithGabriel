plugins {
    kotlin("multiplatform") version "1.9.23"
}

group = "de.syna.hoechstdigital.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation("io.arrow-kt:arrow-core:1.2.1")
            }
        }
    }

    js {
        binaries.executable()
        generateTypeScriptDefinitions()
    }
}
