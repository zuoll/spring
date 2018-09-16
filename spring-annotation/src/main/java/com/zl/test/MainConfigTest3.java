package com.zl.test;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.bean.Person;
import com.zl.config.MainConfig3;

public class MainConfigTest3 {
	
	@Test
	public void test1() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig3.class);
		
		this.print(applicationContext);
		
		Object bean = applicationContext.getBean("colorFactoryBean");
		System.out.println("bean的类型===》"+bean.getClass());
		
		Object bean2 = applicationContext.getBean("colorFactoryBean");
		System.out.println(bean == bean2);
		
		
		
		
		Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
		System.out.println("beansOfType===>"+beansOfType);
	}
	
	
	public void print(ApplicationContext applicationContext) {
		
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: definitionNames) {
			System.out.println("当前容器中的bean的名字======>"+str);
		}
	}

}
