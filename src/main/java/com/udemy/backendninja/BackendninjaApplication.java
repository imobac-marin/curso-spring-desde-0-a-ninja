package com.udemy.backendninja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Se elimina @EnableWebMvc porque thymeleaf no encuentra los recursos css ni js
 * con esa anotación puesta.
 *
 */
@SpringBootApplication
@EnableScheduling
public class BackendninjaApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(BackendninjaApplication.class, args);
	}
}
