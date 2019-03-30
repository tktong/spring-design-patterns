plugins {
    java
    id("org.springframework.boot") version Versions.SPRING_BOOT
    id("io.spring.dependency-management") version Versions.SPRING_DEPENDENCY_MANAGEMENT
}

apply(from = "$rootDir/gradle/repositories.gradle.kts")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}