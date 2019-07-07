/**
 * 
 */
package com.praveenellaiyan.bean.resolveby.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
@Component
public class Dog implements Animal {

	@Autowired
	@Qualifier("dogFood")
	private Food food;

	@Override
	public String getAnimalInfo() {

		return "Pet Name is - Pomeranian";

	}

	@Override
	public String getAnimalFood() {

		return food.getFoodDetails();

	}

}
