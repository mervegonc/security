package learning.process.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	// The main method, serving as the entry point of the application
	public static void main(String[] args) {
		// Run the Spring Boot application, passing the SecurityApplication class and
		// command-line arguments
		SpringApplication.run(SecurityApplication.class, args);
	}
}
