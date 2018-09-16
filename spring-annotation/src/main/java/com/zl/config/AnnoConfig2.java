package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.zl.bean.Person;

@Configuration
@ComponentScans({ @ComponentScan(value = "com.zl", includeFilters = {
		/*@Filter(type = FilterType.ANNOTATION, value = { Controller.class, Service.class }),
		@Filter(type = FilterType.ASSIGNABLE_TYPE, value = { AnnoConfig.class}),*/
		@Filter(type = FilterType.CUSTOM, value=MyTypeFilter.class)
		}, useDefaultFilters=false) 
})
public class AnnoConfig2 {

	@Bean("person")
	public Person person01() {
		return new Person("wanglima", 22);
	}
}
