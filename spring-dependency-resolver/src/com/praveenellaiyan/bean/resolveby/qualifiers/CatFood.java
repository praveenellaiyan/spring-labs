/**
 * 
 */
package com.praveenellaiyan.bean.resolveby.qualifiers;

import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
@Component
public class CatFood implements Food {

	@Override
	public String getFoodDetails() {

		return "It eats Fish!";

	}

}
