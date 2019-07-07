/**
 * 
 */
package main.java.com.praveenellaiyan.bean.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Praveen Ellaiyan
 *
 */
/*
 * Monkey component overrides the default scope of bean from singleton to prototype
 */
@Component
public class Monkey implements Animal {

	@Autowired
	@Qualifier("monkeyFood")
	private Food food;

	@PostConstruct
	public void init() {
		System.out.println("Do start up work here!");
	}
	
	@Override
	public String getAnimalInfo() {
		return "Name is - Monkey";
	}

	@Override
	public String getAnimalFood() {
		return food.getFoodDetails();
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Do Clean up work here!");
	}

}
