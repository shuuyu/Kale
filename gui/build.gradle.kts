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
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.67.0+1.19.2")
    modImplementation("net.fabricmc:fabric-loader:0.14.10")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.8.6+kotlin.1.7.21")
    modImplementation(include("gg.essential:elementa-1.18.1-fabric:559+pull-97")!!)
    modImplementation(include("gg.essential:universalcraft-1.18.1-fabric:242")!!)
}

tasks.shadowJar {
    archiveClassifier.set("Kale")
    relocate("gg.essential.elementa", "live.shuuyu.elementa")
    relocate("gg.essential.universalcraft", "live.shuuyu.universalcraft")
}
