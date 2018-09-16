package com.zl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zl.config.AutowireMainConfig;
import com.zl.dao.BookDao;
import com.zl.service.BookService;

public class AutoWireTest {
	
	@Test
	public void test01() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowireMainConfig.class);
//		BookDao bean = applicationContext.getBean(BookDao.class);
//		System.out.println(bean);
		BookService bean2 = applicationContext.getBean(BookService.class);
		bean2.print();
		
//		Object bean3 = applicationContext.getBean("bookDao");
//		System.out.println(bean3);
		
		
		this.print(applicationContext);
	}
	
	public void print(ApplicationContext applicationContext) {
		
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for(String str: definitionNames) {
			System.out.println("当前容器中的bean的名字======>"+str);
		}
	}
}
