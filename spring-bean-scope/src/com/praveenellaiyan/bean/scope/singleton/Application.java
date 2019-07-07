/**
 * 
 */
package com.praveenellaiyan.bean.scope.singleton;

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
		Animal catObj1 = ctx.getBean("cat", Animal.class);
		Animal catObj2 = ctx.getBean("cat", Animal.class);
		System.out.println("Cat component has bean scope of singleton? "+ catObj1.equals(catObj2));

		ctx.close();
	}

}
