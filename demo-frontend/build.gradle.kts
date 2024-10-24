plugins {
	java
	id("org.springframework.boot") version "3.3.5"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "info.project"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(23)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.openjfx:javafx-controls:23.0.1")
	implementation("org.openjfx:javafx-fxml:23.0.1")
	implementation("org.openjfx:javafx-base:23.0.1")
	implementation("org.controlsfx:controlsfx:11.2.1")
	implementation("com.gluonhq:charm-down-core:3.8.6")
	implementation("com.gluonhq:charm-down-plugin-storage:3.8.6")
	implementation("com.gluonhq:charm-down-plugin-display:3.8.6")
	runtimeOnly("com.gluonhq.attach:util:4.0.21")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
