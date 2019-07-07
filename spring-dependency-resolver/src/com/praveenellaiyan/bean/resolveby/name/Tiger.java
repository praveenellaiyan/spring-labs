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
public class Tiger implements Animal {

	@Autowired
	private Food namedTigerFood;

	@Override
	public String getAnimalInfo() {
		return "Animal Name is - Tiger";
	}

	@Override
	public String getAnimalFood() {
		return namedTigerFood.getFoodDetails();
	}

}
