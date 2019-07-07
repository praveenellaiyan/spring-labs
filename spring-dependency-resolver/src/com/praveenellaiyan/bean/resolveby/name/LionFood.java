/**
 * 
 */
package com.praveenellaiyan.bean.resolveby.name;

import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
@Component(value = "namedLionFood")
public class LionFood implements Food {

	@Override
	public String getFoodDetails() {

		return "It eats Zeebra!";

	}

}
