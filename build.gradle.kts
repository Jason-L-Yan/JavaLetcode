plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
    id("org.jetbrains.intellij.platform") version "2.7.1"
}

group = "com.lichee.infinite"
version = "1.3-Release"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
        // 添加备用仓库
        jetbrainsRuntime()
    }
}

// Configure IntelliJ Platform Gradle Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html
dependencies {
    dependencies {
        implementation("com.squareup.okhttp3:okhttp:4.10.0") // HTTP客户端
        implementation("org.json:json:20231013") // JSON处理
        // 其他依赖...
    }

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
//        testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)

        // Add necessary plugin dependencies for compilation here, example:
        // bundledPlugin("com.intellij.java")
    }
}

intellijPlatform {
    pluginConfiguration {
        // 添加基础插件信息
        name = "Magic Plugin"
        description =
                "专心一件事。设置大模型的系统提示词，回答问题，没有连续对话的功能。Focus on one thing. System prompt for large model, answering " +
                        "questions, no continuous dialogue function."

        ideaVersion {
            sinceBuild = "193"
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
