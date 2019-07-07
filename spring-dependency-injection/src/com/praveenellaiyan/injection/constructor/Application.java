/**
 * 
 */
package com.praveenellaiyan.injection.constructor;

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

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		Animal animal = ctx.getBean("dog", Animal.class);

		System.out.println(animal.getAnimalInfo());
		System.out.println(animal.getAnimalFood());
		

	}

}
