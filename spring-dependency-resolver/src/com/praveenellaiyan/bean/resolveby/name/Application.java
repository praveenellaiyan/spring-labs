/**
 * 
 */
package com.praveenellaiyan.bean.resolveby.name;

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
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		// Retrieve Bean of type Animal from Container
		Animal animal = ctx.getBean("lion", Animal.class);

		System.out.println(animal.getAnimalInfo());
		System.out.println(animal.getAnimalFood());
		
		animal = ctx.getBean("tiger", Animal.class);

		System.out.println(animal.getAnimalInfo());
		System.out.println(animal.getAnimalFood());

		ctx.close();
	}

}
