plugins {
    id("com.android.application")
    kotlin("android")
//    kotlin("kapt")
    id("androidx.navigation.safeargs")
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "com.robertlevonyan.demo.camerax"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
    namespace = "com.robertlevonyan.demo.camerax"
}

dependencies {
    implementation(project(":library"))
    implementation(kotlin("stdlib"))

    implementation("io.coil-kt:coil:2.6.0")
    implementation("io.coil-kt:coil-video:2.4.0")
}
