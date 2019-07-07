/**
 * 
 */
package com.praveenellaiyan.bean.scope.prototype;

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
		Animal catObj1 = ctx.getBean("monkey", Animal.class);
		Animal catObj2 = ctx.getBean("monkey", Animal.class);
		System.out.println("Monkey component has bean scope of prototype? "+ !catObj1.equals(catObj2));

		ctx.close();
	}

}
