plugins {
    id("java")
}

group = "ru.english"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.projectlombok:lombok:0.11.0")
}

tasks.test {
    useJUnitPlatform()
}