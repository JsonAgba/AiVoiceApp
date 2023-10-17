plugins {
    if(ModuleConfig.isApp){
        id("com.android.application")
    }else {
        id("com.android.library")
    }
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.vlab.moudule_constellation"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        if(ModuleConfig.isApp) {
            testApplicationId = ModuleConfig.MODULE_CONSTELLATION
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    //动态替换资源
    sourceSets {
        getByName("main") {
            if (ModuleConfig.isApp) {
                manifest.srcFile("src/main/manifest/AndroidManifest.xml")
            } else {
                manifest.srcFile("src/main/AndroidManifest.xml")
            }
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
    implementation(project(":lib_base"))
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