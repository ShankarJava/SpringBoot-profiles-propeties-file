package org.sfw.boot.profile.annotation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class HelloDevCLass implements HelloInterface {

	@Override
	public String getGreetings() {

		return "GREETINGS FROM DEV CLASS";
	}

}
