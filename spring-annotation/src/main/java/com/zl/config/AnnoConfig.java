package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zl.bean.Person;

@Configuration
public class AnnoConfig {

	
	@Bean("person")
	public Person person01() {
		return new Person("wanglima", 22);
	}
}
