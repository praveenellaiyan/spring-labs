/**
 * 
 */
package main.java.com.praveenellaiyan.bean.lifecycle;

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
		
		System.out.println(catObj1.getAnimalInfo());
		
		ctx.close();
	}

}
