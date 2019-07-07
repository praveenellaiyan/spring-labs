/**
 * 
 */
package com.praveenellaiyan.injection.constructor;

/**
 * @author Praveen Ellaiyan
 *
 */
public class Dog implements Animal {

	private Food food;

	// Contructor Dependency Injection
	public Dog(Food food) {
		this.food = food;
	}

	@Override
	public String getAnimalInfo() {

		return "Pet Name is - Pomeranian";

	}

	@Override
	public String getAnimalFood() {

		return food.getFoodDetails();

	}

}
