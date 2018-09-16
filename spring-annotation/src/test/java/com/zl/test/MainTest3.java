package com.zl.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.bean.Person;
import com.zl.config.AnnoConfig2;

public class MainTest3 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnoConfig2.class);
		
//		String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
//		for(String str : beanNamesForType) {
//			System.out.println(str);
//		}
//		
//		System.out.println(applicationContext.getBean(Person.class));
//		
		
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: beanDefinitionNames) {
			System.out.println(str);
		}
	}
}
