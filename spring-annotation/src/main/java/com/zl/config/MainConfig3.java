package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.zl.bean.Color;
import com.zl.bean.ColorFactoryBean;
import com.zl.bean.Person;
import com.zl.bean.Red;
import com.zl.condition.MyImportBeanDefinitionRegistrar;
import com.zl.condition.MyImportSelector;

@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig3 {

	
	/**
	 * 通过FactoryBean向容器中添加bean
	 * 默认获取的是bean的getObject方法，如果要获取工厂bean本身则需要加一个前缀&
	 * @return
	 */
	@Bean
	public ColorFactoryBean colorFactoryBean() {
		return new ColorFactoryBean();
	}
	
	
	
	@Bean
	public Person person01() {
		System.out.println("向容器中添加一个person");
		return new Person("zs", 22);
	}
	
}


