/**
 * 
 */
package com.praveenellaiyan.springsecurityinmemoryauthenticationconfiguration.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author praveenellaiyan
 *
 */
@RestController
public class WelcomeController {

	@RequestMapping(method = RequestMethod.GET, path = "/home")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok("Welcome!");
	}
}
