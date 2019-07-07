/**
 * 
 */
package com.praveenellaiyan.bean.scope.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
/*
 * Monkey component overrides the default scope of bean from singleton to prototype
 */
@Component
@Scope(value = "prototype")
public class Monkey implements Animal {

	@Autowired
	@Qualifier("monkeyFood")
	private Food food;

	@Override
	public String getAnimalInfo() {
		return "Name is - Monkey";
	}

	@Override
	public String getAnimalFood() {
		return food.getFoodDetails();
	}

}
