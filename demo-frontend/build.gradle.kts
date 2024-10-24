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

	// JavaFX dependencies
	implementation("org.openjfx:javafx-controls:17.0.2") // Cambia la versión según sea necesario
	implementation("org.openjfx:javafx-fxml:17.0.2") // Para usar FXML
	implementation("org.openjfx:javafx-base:17.0.2") // Base de JavaFX

	// ControlsFX dependency
	implementation("org.controlsfx:controlsfx:11.1.0") // Cambia la versión según sea necesario

	// Gluon dependency (si es necesario)
	implementation("com.gluonhq:charm:6.0.0") // Cambia la versión según sea necesario
}

tasks.withType<Test> {
	useJUnitPlatform()
}
