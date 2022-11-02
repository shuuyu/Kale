pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
        maven("https://maven.fabricmc.net")
        maven("https://maven.architectury.dev/")
        maven("https://maven.minecraftforge.net/")
        maven("https://maven.quiltmc.org/repository/release")
        maven("https://repo.essential.gg/repository/maven-public")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }

    plugins {
        kotlin("jvm") version "1.7.20" apply false
        kotlin("plugin.serialization") version "1.7.20" apply false
        id("dev.architectury.loom") version "1.0-SNAPSHOT" apply false
        id("io.github.juuxel.loom-quiltflower") version "1.7.4" apply false
        id("com.github.johnrengelman.shadow") version "7.1.2" apply false
        id("com.modrinth.minotaur") version "2.3.1" apply false
    }
}

rootProject.name = "kale"

include(":gui")
include(":mod")