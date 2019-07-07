/**
 * 
 */
package main.java.com.praveenellaiyan.bean.lifecycle;

import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
@Component
public class MonkeyFood implements Food {

	@Override
	public String getFoodDetails() {

		return "It eats Banana!";

	}

}
