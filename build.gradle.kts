import kr.entree.spigradle.kotlin.spigot

plugins {
    kotlin("jvm") version "1.5.31"
    java
    id("kr.entree.spigradle") version "2.2.4"
}

group = "org.asheskaiser"
version = "0.1-alpha"

repositories {
    maven("https://maven.heartpattern.kr/repository/maven-public/")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31") // kotlin stdlib

    compileOnly(spigot("1.16.5")) // spigot api
}

spigot { // plugin.yml 설정
    authors = listOf("asheskaiser")
}

val shade = configurations.create("shade")
shade.extendsFrom(configurations.implementation.get())

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    jar {
        from(
            shade.map {
                if (it.isDirectory)
                    it
                else
                    zipTree(it)
            }
        )
    }
}