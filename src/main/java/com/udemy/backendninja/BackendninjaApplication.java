package com.udemy.backendninja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// TODO: Auto-generated Javadoc
/**
 * Se elimina @EnableWebMvc porque thymeleaf no encuentra los recursos css ni js
 * con esa anotación puesta.
 *
 * @author A655645
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
