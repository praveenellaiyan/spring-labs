/**
 * 
 */
package com.praveenellaiyan.bean.resolveby.name;

import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
@Component(value = "namedTigerFood")
public class TigerFood implements Food {

	@Override
	public String getFoodDetails() {

		return "It eats Deer!";

	}

}
