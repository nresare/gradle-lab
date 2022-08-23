
plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

application {
    mainClass.set("com.resare.lab.Hello")
}

tasks.test {
    useJUnitPlatform()
}

