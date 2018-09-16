package com.zl.test;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.bean.Person;
import com.zl.config.MainConfig2;

public class MainConfigTest2 {
	
	@Test
	public void test1() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
		
		this.print(applicationContext);
		
		Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
		System.out.println("beansOfType===>"+beansOfType);
	}
	
	
	public void print(ApplicationContext applicationContext) {
		
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: definitionNames) {
			System.err.println("当前容器中的bean======>"+str);
		}
	}

}
