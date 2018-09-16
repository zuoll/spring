package com.zl.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.config.MainConfigLifeCycle;

public class IOCLifeCycleTest {

	
	@Test
	public void test1() {
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
		
		System.out.println("==========容器创建完成=================");
		Object bean = applicationContext.getBean("car");
		System.out.println(bean.getClass());
		Object bean2 = applicationContext.getBean("cat");
		System.out.println(bean2.getClass());

		applicationContext.close();
	}
}
