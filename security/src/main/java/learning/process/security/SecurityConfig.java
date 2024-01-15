package learning.process.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

// Declare the class as a configuration class
@Configuration
public class SecurityConfig {

	// Define a SecurityFilterChain bean that configures security settings
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		// Configure HTTP Basic authentication with default settings
		http.httpBasic(Customizer.withDefaults());

		// Configure authorization for all endpoints: All requests must be authenticated
		// Tüm endpointler için doğrulamaya gerek yok: No authentication is required for
		// all endpoints
		http.authorizeHttpRequests(c -> c.anyRequest().authenticated());

		// Build and return the configured SecurityFilterChain
		return http.build();
	}
}
