import com.github.gradle.node.npm.task.NpmTask

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.31"
    id("org.springframework.boot") version "2.5.5"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("com.github.node-gradle.node") version "3.1.1"
}

group "com.lffblk"
version "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("junit:junit:4.12")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

node {
    nodeProjectDir.set(file("${project.projectDir}/src/main/vue"))
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.register<NpmTask>("npmBuild") {
    dependsOn(tasks.npmInstall)
    npmCommand.set(listOf("run", "build"))
}

tasks.register<Copy>("copyFrontendContent") {
    from(layout.buildDirectory.dir("${project.projectDir}/src/main/vue/dist"))
    into(layout.buildDirectory.dir("${project.projectDir}/src/main/resources/public"))
}