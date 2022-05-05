plugins {
    id("groovy")
    id("com.vanniktech.maven.publish")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(gradleApi())
    implementation(localGroovy())
    implementation("com.squareup:javapoet:1.13.0")
    implementation("com.android.tools.build:gradle:3.0.0")
}