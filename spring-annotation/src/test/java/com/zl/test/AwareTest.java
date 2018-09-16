package com.zl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.bean.Red;
import com.zl.config.AwareIntfMainConfig3;

public class AwareTest {
	
	@Test
	public void test01() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareIntfMainConfig3.class);
		this.print(applicationContext);
		System.out.println("===================容器创建完成======================");
		
		System.out.println(applicationContext.hashCode());
		Red bean = applicationContext.getBean(Red.class);
		System.out.println(bean);
		
	}
	
	public void print(ApplicationContext applicationContext) {
		
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: definitionNames) {
			System.out.println("当前容器中的bean的名字======>"+str);
		}
	}
}
