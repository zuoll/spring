package com.zl.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 这是一个猫的bean
 * 
 * @author ZLL
 *
 */
public class Cat implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {

		System.out.println("Cat.destroy()");
	}

	/**
	 *在构造函数执行完毕，并且属性都赋值好了，就执行这个初始化方法
	 */
	public void afterPropertiesSet() throws Exception {

		System.out.println("Cat.afterPropertiesSet()");
	}

	
	public Cat() {
		System.out.println("Cat.Cat()");
	}

}
