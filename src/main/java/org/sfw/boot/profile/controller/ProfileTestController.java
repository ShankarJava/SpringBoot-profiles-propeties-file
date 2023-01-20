/*WELCOME TO SPRING BOOT PROFILES
 * 
 * @handleProfileRequest IS IMPLEMENTED USING ENVIRONMENT PROPERTIES 
 * @Author T Shankar
 * spring.profiles.active= prod,dev
 * 
 * @sayHello IS IMPLEMENTED USING ANNOTATIONS
 * @Profile(value={"dev","prod"})
 * 
 *
 * 
*/
package org.sfw.boot.profile.controller;

import org.sfw.boot.profile.annotation.HelloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileTestController {

	@Value("${envMessage}")
	String environment;

	@GetMapping("/controller")
	public String handleProfileRequest() {
		String start = "<center><font size = \"7\" color=\"red\">";
		String end = "</font></center>";
		return start + "WELCOME TO " + environment + " ENVIRONMENT" + end;
	}

//	@Autowired
//	HelloInterface helloClass;
//
//	@RequestMapping("/")
//	public String sayHello() {
//		String message = helloClass.getGreetings();
//		return message;
//	}

}
