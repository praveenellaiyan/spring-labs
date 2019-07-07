/**
 * 
 */
package com.praveenellaiyan.bean.scope.prototype;

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
