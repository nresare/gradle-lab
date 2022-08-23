
plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.swagger.codegen.v3:swagger-codegen:3.0.35")
    implementation("io.swagger.codegen.v3:swagger-codegen-generators:1.0.35")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

application {
    mainClass.set("com.resare.lab.Hello")
}

tasks.test {
    useJUnitPlatform()
}

