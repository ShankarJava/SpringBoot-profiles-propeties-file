package org.sfw.boot.profile.javaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
//@Profile("!production")
public class ProductionConfiguration {

}
