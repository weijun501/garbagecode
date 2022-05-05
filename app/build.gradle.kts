plugins {
    id("com.android.application")
    id("kotlin-android")
    id("android-junk-code")
    id("kotlin-kapt")
    id("com.getkeepsafe.dexcount")
}

android {
    compileSdkVersion(31)

    defaultConfig {
        applicationId = "cn.hx.plugin.junkcode.demo"
        minSdkVersion(16)
        targetSdkVersion(31)
        versionCode(1)
        versionName("1.0")
        multiDexEnabled = true
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
    buildTypes {
        val release by getting {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    lintOptions {
        isCheckReleaseBuilds = false
        isAbortOnError = false
    }
}

androidJunkCode {
    variantConfig {
        create("debug") {
            packageBase = "cn.hx.plugin.ui"
            packageCount = 30
            activityCountPerPackage = 3
            excludeActivityJavaFile = false
            otherCountPerPackage = 50
            methodCountPerClass = 20
            resPrefix = "junk_"
            drawableCount = 300
            stringCount = 300
        }
        create("release") {
            packageBase = "cn.hx.plugin.ui"
            packageCount = 30
            activityCountPerPackage = 3
            excludeActivityJavaFile = false
            otherCountPerPackage = 50
            methodCountPerClass = 20
            resPrefix = "junk_"
            drawableCount = 300
            stringCount = 300
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    implementation("androidx.multidex:multidex:2.0.1")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}