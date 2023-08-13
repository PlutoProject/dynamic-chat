pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "dynamic-chat"
include("dynamic-chat-api")
include("dynamic-chat-proxy")
include("dynamic-chat-worker")
