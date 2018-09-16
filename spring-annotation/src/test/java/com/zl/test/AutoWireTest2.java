package com.zl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.bean.Boss;
import com.zl.bean.Car;
import com.zl.bean.Color;
import com.zl.config.AutowireMainConfig2;

public class AutoWireTest2 {
	
	@Test
	public void test01() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowireMainConfig2.class);
		
		this.print(applicationContext);
		
		System.out.println("===================容器创建完成======================");
		
		Boss bean = applicationContext.getBean(Boss.class);
		System.out.println("===>"+bean);
		
//		Color bean1 = applicationContext.getBean(Color.class);
//		System.out.println(bean1);
		
		Car car = applicationContext.getBean(Car.class);
		System.out.println("====>"+car);
	}
	
	public void print(ApplicationContext applicationContext) {
		
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: definitionNames) {
			System.out.println("当前容器中的bean的名字======>"+str);
		}
	}
}
