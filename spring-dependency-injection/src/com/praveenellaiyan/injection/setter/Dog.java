/**
 * 
 */
package com.praveenellaiyan.injection.setter;

/**
 * @author Praveen Ellaiyan
 *
 */
public class Dog implements Animal {

	private Food food;

	// Setter Dependency Injection
	public void setFood(Food food) {
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
