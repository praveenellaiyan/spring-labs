/**
 * 
 */
package com.praveenellaiyan.bean.resolveby.name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
@Component
public class Lion implements Animal {

	@Autowired
	private Food namedLionFood;

	@Override
	public String getAnimalInfo() {
		return "Name is - Lion";
	}

	@Override
	public String getAnimalFood() {
		return namedLionFood.getFoodDetails();
	}

}
