plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    id("dev.architectury.loom")
    id("io.github.juuxel.loom-quiltflower")
    id("com.github.johnrengelman.shadow")
}

dependencies {
    minecraft("com.mojang:minecraft:1.19.2")
    mappings("net.fabricmc:yarn:1.19.2+build.28:v2")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.64.0+1.19.2")
    modImplementation("net.fabricmc:fabric-loader:0.14.10")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.8.4+kotlin.1.7.20")
}