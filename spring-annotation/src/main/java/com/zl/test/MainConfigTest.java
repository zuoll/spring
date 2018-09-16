package com.zl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.bean.Person;
import com.zl.config.MainConfig;

public class MainConfigTest {
	
	@Test
	public void test1() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		
//		print(applicationContext);
		
		
		System.out.println("容器创建完成。。。。。");
//		
		System.out.println("开始获取一个person");
		Person p1 = applicationContext.getBean(Person.class);
		System.out.println(p1.hashCode());
		Person p2  = (Person) applicationContext.getBean("person");
		System.out.println(p2.hashCode());
		System.out.println(p1 == p2);
	}
	
	
	public void print(ApplicationContext applicationContext) {
		
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: definitionNames) {
			System.out.println(str);
		}
	}

}
