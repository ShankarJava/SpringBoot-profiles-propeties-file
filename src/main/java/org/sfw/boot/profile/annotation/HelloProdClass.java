package org.sfw.boot.profile.annotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class HelloProdClass implements HelloInterface {

	@Override
	public String getGreetings() {
		return "GREETINGS FROM PROD CLASS";
	}

}
