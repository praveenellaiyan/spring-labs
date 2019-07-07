/**
 * 
 */
package com.praveenellaiyan.injection.field;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Praveen Ellaiyan
 *
 */
public class Dog implements Animal {

	// Field Injection
	@Autowired
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
