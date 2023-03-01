plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
}

android {
  namespace = "com.test.sample"
  compileSdk = 23
  defaultConfig {
    applicationId = "com.test.sample"
    minSdk = 23
    targetSdk = 23
    versionCode = 1
    versionName = "1.0"
  }
}