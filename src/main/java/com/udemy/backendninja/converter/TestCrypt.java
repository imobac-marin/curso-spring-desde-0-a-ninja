package com.udemy.backendninja.converter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * The Class TestCrypt.
 */
public class TestCrypt {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		System.out.println(pe.encode("user"));
	}

}
