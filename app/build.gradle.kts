
plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.demolibhisabirsyadulmurid"
    compileSdk = 33
    
    defaultConfig {
        applicationId = "com.example.demolibhisabirsyadulmurid"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

dependencies {


    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    
    implementation("com.github.andihasan97:lib-hisab-irsyadulmurid:5.0.1")
    implementation("com.github.andihasan97:lib-konversi:3.1.0")
}
