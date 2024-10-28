// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")  // Android Gradle 플러그인
        classpath("com.google.gms:google-services:4.3.14")  // Google 서비스 플러그인
    }
}

allprojects {
    repositories {
        google()  // 모든 프로젝트에 Google의 Maven 저장소 사용
        mavenCentral()  // Maven 중앙 저장소 사용
    }
}