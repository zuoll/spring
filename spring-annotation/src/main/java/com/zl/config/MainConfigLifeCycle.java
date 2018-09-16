package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zl.bean.Car;
import com.zl.bean.Cat;
import com.zl.bean.Dog;
import com.zl.bean.MyBeanPostProcessor;

@Configuration
public class MainConfigLifeCycle {

	
	/**
	 * 方式一：
	 * bean的默认范围是单实例的，也就是在容器启动的时候就调用构造函数创建出来了
	 * 多实例的，是在每次获取的时候创建的，容器负责执行创建和初始化方法，销毁方法容器不会执行，只有自己手动去执行
	 * 但是单实例的，容器启动时就执行构造函数和初始化方法，容器关闭时执行销毁方法
	 * 
	 * 第二种方式：通过实现接口的方式
	 * InitializingBean 指定初始化逻辑
	 * DisposableBean 指定销毁逻辑
	
	 * 第三种方式JSR250中定义注解
	 * @PostConstruct 构造器执行完并且属性都赋值好后，执行这个注解标注的方法
	 * @PreDestroy 容器销毁bean执行的一个通知回调方法，执行去做一些清理的工作。
	 * 
	 *第四种方式是使用bean的底层大量的扩展方式BeanPostProcessor，bean的一个后置处理器
	 *postProcessBeforeInitialization，初始化之前的做一些后置处理工作
	 *postProcessAfterInitialization，初始化之后的做一些后置处理工作
	 *
			MainConfigLifeCycle.car()
			Car.Car()...执行无参数的构造函数创建对象。。。
			MyBeanPostProcessor.postProcessBeforeInitialization()
			Car.init().......执行初始化方法
			MyBeanPostProcessor.postProcessAfterInitialization()
	 * 
	 * @return
	 */
//	@Scope("prototype")
	@Bean(initMethod="init", destroyMethod="destory")
	public Car car() {
		System.out.println("MainConfigLifeCycle.car()");
		return new Car();
	}
	
	
	@Bean
	public Cat cat() {
		System.out.println("MainConfigLifeCycle.cat()");
		return new Cat();
	}
	
	@Bean
	public Dog dog() {
		System.out.println("MainConfigLifeCycle.dog()");
		return new Dog();
	}
	
	@Bean
	public MyBeanPostProcessor myBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}
}
