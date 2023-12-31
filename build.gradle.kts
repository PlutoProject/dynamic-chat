plugins {
    kotlin("jvm") version "1.9.0"
}

allprojects {
    group = "net.deechael"
    version = properties["dynamic-chat-version"]!!

    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    repositories {
        mavenCentral()
        maven {
            url = uri("https://repo.papermc.io/repository/maven-public/")
        }
        maven {
            url = uri("https://nexus.nostaldaisuki.cc/repository/maven-public/")
        }
    }

    dependencies {
        compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
        compileOnly("club.plutomc.plutoproject.framework:messaging:3.0.0-SNAPSHOT")

        implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.0")
    }

    kotlin {
        jvmToolchain(17)
    }

    tasks.withType<ProcessResources>().configureEach {
        inputs.property("version", version)
        filesMatching(listOf("plugin.yml", "paper-plugin.yml", "velocity-plugin.json")) {
            expand(
                mapOf(
                    Pair("version", version)
                )
            )
        }
    }
}