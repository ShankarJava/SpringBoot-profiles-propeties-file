/*WELCOME TO PROFILES IN SPRING BOOT
 * THE DEFAULT PROFILE IS ALWAYS ACTIVE
 * you can create different property files for different environments
 * application.properties is used as default profile
 * PROFILE - ENVIRONMENT SPECIFIC CONFIGURATION
 * 
 * java -jar ProfileAppSNAPSHOT.jar --spring.profile.active=dev
 * 
 * 
 *
 * 
 * */
package org.sfw.boot.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication

public class SpringBootProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesApplication.class, args);
	}

}
