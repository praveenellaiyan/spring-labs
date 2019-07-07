/**
 * 
 */
package com.praveenellaiyan.injection.constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Praveen Ellaiyan
 *
 */
@Configuration
public class ApplicationConfig {

	/*
	 * Define list of bean here which needs to be registered in spring container
	 */
	@Bean
	public Food food() {
		return new DogFood();
	}

	@Bean
	public Dog dog(Food food) {
		return new Dog(food);
	}

}
