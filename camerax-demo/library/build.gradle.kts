plugins {
    id("com.android.library")
    kotlin("android")
//    kotlin("kapt")
    id("androidx.navigation.safeargs")
}

android {
    compileSdk = 34
    namespace = "com.robertlevonyan.demo.camerax"

    defaultConfig {
        minSdk = 21
        targetSdk = 34
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    api(kotlin("stdlib"))
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")

    api("com.google.android.material:material:1.12.0")

    api("androidx.appcompat:appcompat:1.7.0")
    api("androidx.core:core-ktx:1.13.1")
    api("androidx.constraintlayout:constraintlayout:2.1.4")
    api("androidx.camera:camera-core:1.4.0-beta02")
    api("androidx.camera:camera-camera2:1.4.0-beta02")
    api("androidx.camera:camera-lifecycle:1.4.0-beta02")
    api("androidx.camera:camera-extensions:1.4.0-beta02")
    api("androidx.camera:camera-view:1.4.0-beta02")
    api("androidx.fragment:fragment:1.8.1")
    api("androidx.fragment:fragment-ktx:1.8.1")
    api("androidx.navigation:navigation-fragment-ktx:2.7.7")
    api("androidx.navigation:navigation-ui-ktx:2.7.7")
    api("androidx.lifecycle:lifecycle-runtime-ktx:2.8.3")
    api("androidx.viewpager2:viewpager2:1.1.0")

    api("io.coil-kt:coil:2.6.0")
    api("io.coil-kt:coil-video:2.4.0")
}
