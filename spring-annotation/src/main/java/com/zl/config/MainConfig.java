package com.zl.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.zl.bean.Person;

@Configuration
public class MainConfig {

	
	
	/**
	 * Specifies the name of the scope to use for the annotated component/bean.
	 * <p>Defaults to an empty string ({@code ""}) which implies
	 * {@link ConfigurableBeanFactory#SCOPE_SINGLETON SCOPE_SINGLETON}.
	 * @since 4.2
	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
	 * @see #value
	 */
	/**
	 * String SCOPE_PROTOTYPE = "prototype";
	 * String SCOPE_SINGLETON = "singleton";
	 * @return
	 * 
	 * 
	 * 懒加载：针对但是bean,就是在容器启动的时候不创建bean,而是在获取的时候才创建
	 */
//	@Scope("prototype")
	@Scope
	@Lazy
	@Bean("person")
	public Person person01() {
		
		Person person = new Person("wanglima", 22);
		System.out.println("=====>给容器添加pesion"+person.hashCode());
		return person;
	}
}
