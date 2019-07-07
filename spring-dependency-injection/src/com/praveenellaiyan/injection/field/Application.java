/**
 * 
 */
package com.praveenellaiyan.injection.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Praveen Ellaiyan
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instantiate Spring Container
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		// Retrieve Bean of type Animal from Container
		Animal animal = ctx.getBean("dog", Animal.class);

		System.out.println(animal.getAnimalInfo());
		System.out.println(animal.getAnimalFood());

	}

}
