package com.zl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.config.PropertyValueConfig;

public class PropertyValueTest {
	
	@Test
	public void test1() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyValueConfig.class);
		this.print(applicationContext);
		
		Object bean = applicationContext.getBean("person");
		System.out.println(bean);
		
		
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		Object bean = applicationContext.getBean("person");
//		System.out.println(bean);
	}
	
	
	public void print(ApplicationContext applicationContext) {
		
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: definitionNames) {
			System.out.println("当前容器中的bean的名字======>"+str);
		}
	}

}
