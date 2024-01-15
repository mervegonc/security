package learning.process.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

// Declare the class as a REST controller and enable logging with SLF4J
@RestController
@Slf4j
public class LoginController {

	// Define a mapping for HTTP GET requests to the "/get" endpoint
	@GetMapping("/get")
	// Define a method that handles GET requests to the "/get" endpoint
	// The @RequestParam annotation is used to extract a query parameter from the
	// URL
	public String get(@RequestParam String user) {
		// Log information about the user received in the request
		log.info("user: " + user);
		// Return the user value as the response
		return user;
	}
}
