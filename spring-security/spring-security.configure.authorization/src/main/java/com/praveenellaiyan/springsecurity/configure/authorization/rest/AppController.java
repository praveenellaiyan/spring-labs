/**
 * 
 */
package com.praveenellaiyan.springsecurity.configure.authorization.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author praveenellaiyan
 *
 */
@RestController
public class AppController {

	@RequestMapping(method = RequestMethod.GET, path = "/user")
	public ResponseEntity<String> welcomeUser(HttpServletRequest httpRequest) {
		return ResponseEntity.ok("Welcome " + httpRequest.getUserPrincipal().getName());
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/admin")
	public ResponseEntity<String> welcomeAdmin(HttpServletRequest httpRequest) {
		return ResponseEntity.ok("Welcome " + httpRequest.getUserPrincipal().getName());
	}
}
