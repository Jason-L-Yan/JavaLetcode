import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("org.jetbrains.intellij.platform") version "2.7.1"
}

group = "com.lichee.infinite"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

// Configure IntelliJ Platform Gradle Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    intellijPlatform {
        // 使用本地安装的IDE而不是下载
        // 请确保路径正确指向你的IntelliJ IDEA安装目录
        // 优化：添加备选方案，如果本地路径不存在则使用IDE版本
        val ideaPath = file("/Volumes/Samsung/Applications/IntelliJ IDEA CE.app/Contents")
        if (ideaPath.exists()) {
            local(ideaPath)
        } else {
            create("2024.2.1", "2024.2.1")
        }
        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)

        // Add necessary plugin dependencies for compilation here, example:
        // bundledPlugin("com.intellij.java")
    }
}

intellijPlatform {
    pluginConfiguration {
        // 添加基础插件信息
        name = "Magic Plugin"
        description = "A magic plugin for IntelliJ Platform"
        
        ideaVersion {
            sinceBuild = "193"
            untilBuild = "252.*"
        }

        changeNotes = """
            Initial version
        """.trimIndent()
    }
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "21"
        targetCompatibility = "21"
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}
