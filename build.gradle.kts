plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "cf.vbnm.bot.qq.qdroid"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/org.springframework/spring-context
    implementation("org.springframework:spring-context:6.0.12")
    // https://mvnrepository.com/artifact/org.springframework/spring-websocket
    implementation("org.springframework:spring-websocket:6.0.12")
    // https://mvnrepository.com/artifact/jakarta.websocket/jakarta.websocket-client-api
    implementation("jakarta.websocket:jakarta.websocket-client-api:2.1.1")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}