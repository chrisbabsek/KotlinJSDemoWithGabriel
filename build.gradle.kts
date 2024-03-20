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
    js {
        binaries.executable()
    }
}
