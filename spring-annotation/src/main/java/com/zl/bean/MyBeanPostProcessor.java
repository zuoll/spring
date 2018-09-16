package com.zl.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 这个类会在每一个bean的初始化方法的前后执行
 * @author ZLL
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization()");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor.postProcessAfterInitialization()");
		
		return bean;
	}

}
