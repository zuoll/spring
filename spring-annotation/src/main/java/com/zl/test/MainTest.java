package com.zl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.zl.bean.Person;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Person p = (Person) applicationContext.getBean("person");
		
		System.out.println(p);
		
//		String applicationName = applicationContext.getApplicationName();
//		System.out.println(applicationName);
//		int count = applicationContext.getBeanDefinitionCount();
//		System.out.println(count);
//		ClassLoader classLoader = applicationContext.getClassLoader();
//		System.out.println(classLoader);
//		
//		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for(int i=0; i<beanDefinitionNames.length; i++) {
//			System.out.println(beanDefinitionNames[i]);
//		}
//		
//		String displayName = applicationContext.getDisplayName();
//		System.out.println(displayName);
//		
//		Environment environment = applicationContext.getEnvironment();
//		System.out.println(environment);
		
	}
}
