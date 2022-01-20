plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.compileJava {
    targetCompatibility = JavaVersion.VERSION_11.toString()
    sourceCompatibility = targetCompatibility
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}