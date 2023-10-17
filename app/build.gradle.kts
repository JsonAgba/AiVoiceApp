plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.vlab.aivoiceapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.vlab.aivoiceapp"
        minSdk = 21
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    if(!ModuleConfig.isApp) {
        implementation(project(":lib_base"))
        implementation(project(":module_app_manager"))
        implementation(project(":moudule_constellation"))
        implementation(project(":moudule_developer"))
        implementation(project(":moudule_joke"))
        implementation(project(":moudule_map"))
        implementation(project(":moudule_joke"))
        implementation(project(":moudule_setting"))
        implementation(project(":moudule_voice_setting"))
        implementation(project(":moudule_weather"))
    }
    implementation("androidx.activity:activity:1.8.0") // 更新为符合要求的版本
    implementation("androidx.core:core-ktx:1.12.0") // 更新为符合要求的版本
    implementation ("androidx.core:core:1.12.0") // 更新为符合要求的版本
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}