plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation ("org.junit.jupiter:junit-jupiter:5.9.0")
    // Другие зависимости моего проекта
    implementation("org.apache.commons:commons-lang3:3.0")
}

tasks.test {
    useJUnitPlatform()
}