plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.recyclerview"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.recyclerview"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat) // ใช้ไลบรารี AppCompat สำหรับการรองรับ backward compatibility
    implementation(libs.material) // ใช้ไลบรารี Material Design
    implementation(libs.activity) // ไลบรารีสำหรับ Activity
    implementation(libs.constraintlayout) // ไลบรารี ConstraintLayout สำหรับจัดวาง UI
    implementation("com.github.bumptech.glide:glide:4.15.1") // ใช้ Glide สำหรับการโหลดและแสดงภาพ
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1") // ตัวประมวลผล annotation ของ Glide
    testImplementation(libs.junit) // ไลบรารี JUnit สำหรับทดสอบ unit test
    androidTestImplementation(libs.ext.junit) // ไลบรารี JUnit extension สำหรับทดสอบ Android
    androidTestImplementation(libs.espresso.core) // ไลบรารี Espresso สำหรับทดสอบ UI ของ Android
}