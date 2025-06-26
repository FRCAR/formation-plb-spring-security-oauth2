package fr.formation.formation.sprgsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurationCorrection {

	@Bean
	SecurityFilterChain securityFilterChainJwt(HttpSecurity http) throws Exception {
		return http
				.oauth2Login(Customizer.withDefaults())
				.authorizeHttpRequests(requests -> requests.requestMatchers("/").permitAll()
						.anyRequest().authenticated())
				.build();
	}
}
