// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.github.qq549631030:android-junk-code:1.1.3")
        classpath("com.vanniktech:gradle-maven-publish-plugin:0.18.0")
        classpath("com.getkeepsafe.dexcount:dexcount-gradle-plugin:3.0.1")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register<Delete> ("clean") {
    delete(rootProject.buildDir)
}