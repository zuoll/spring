package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zl.bean.Person;

//导入外部的一个配置文件，该属性也可以从环境变量中获取
@PropertySource({"classpath:/person.properties"})
@Configuration
public class PropertyValueConfig {
	
	@Bean
	public Person person() {
		return new Person();
	}
}
