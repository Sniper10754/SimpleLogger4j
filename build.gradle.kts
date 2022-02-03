plugins {
    java
    `maven-publish`
}

group = "me.sniper10754"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
}

tasks.compileJava {
    targetCompatibility = JavaVersion.VERSION_1_8.toString()
    sourceCompatibility = targetCompatibility
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["java"])
        }
    }
}

tasks.test {
    useJUnitPlatform()
}