plugins {
    kotlin("jvm") version "1.9.20"
    application
}

group = "cf.vbnm.bot.qq.qdroid"
version = "0.0.1-SNAPSHOT"

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
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.9")
    // https://mvnrepository.com/artifact/jakarta.annotation/jakarta.annotation-api
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")
//    // https://mvnrepository.com/artifact/io.quarkus/quarkus-websockets-client
//    implementation("io.quarkus:quarkus-websockets-client:3.5.0")
    // https://mvnrepository.com/artifact/io.quarkus.http/quarkus-http-websocket-core
    implementation("io.quarkus.http:quarkus-http-websocket-core:5.0.3.Final")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlin:kotlin-scripting-common")
    implementation("org.jetbrains.kotlin:kotlin-scripting-jvm")
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