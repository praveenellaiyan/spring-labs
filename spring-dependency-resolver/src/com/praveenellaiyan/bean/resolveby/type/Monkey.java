/**
 * 
 */
package com.praveenellaiyan.bean.resolveby.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Praveen Ellaiyan
 *
 */
@Component
public class Monkey implements Animal {

	@Autowired
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
