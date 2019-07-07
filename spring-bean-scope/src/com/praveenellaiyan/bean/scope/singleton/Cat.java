/**
 * 
 */
package com.praveenellaiyan.bean.scope.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
/*
 * Default scope of the bean `Singleton` applicable for Cat component 
 */
@Component
public class Cat implements Animal {

	@Autowired
	@Qualifier("catFood")
	private Food food;

	@Override
	public String getAnimalInfo() {
		return "Pet Name is - Smokey";
	}

	@Override
	public String getAnimalFood() {
		return food.getFoodDetails();
	}

}
