package com.prince.cdac.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prince.cdac.model.Login;

@Configuration
@ComponentScan("com.prince.cdac.model")
public class UserConfig {
	
	@Bean
	Login login() {
	return new Login();
	}
	
}
