plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.viewmodellivedatademoenrichi"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.example.viewmodellivedatademoenrichi"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.activity.ktx)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(libs.ext.junit)
    //noinspection UseTomlInstead
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.10.0")
    //noinspection UseTomlInstead
    implementation("androidx.lifecycle:lifecycle-livedata:2.10.0")
}