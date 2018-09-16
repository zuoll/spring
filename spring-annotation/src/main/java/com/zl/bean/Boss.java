package com.zl.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 总结：
 * <p>
 * 1,@Autowired注解标注在属性或者setter方法上必须要求有一个无参数的构造器<br>
 * 2,@Autowired标注在有一个参数的构造器上可以不需要有无参数的构造器，<br>
 * 并且如果有且仅有一个构造器有该注入的属性，该标注还可以省略<br>
 * 3,@Autowired标注标注在setter方法上，必须要求有一个带参数的构造器，执行方式是先执行这个带参数的构造器，在执行setter方法。<br>
 * 所以可以在setter这里做点初始化的逻辑<br>
 * 4,@Autowired标注在setter方法的参数上，也是必须要有个带参数的构造器，并且注入该属性只会执行这个带参数的构造器，不会执行setter方法<br>
 * 
 * @author ZLL
 *
 */
@Component
public class Boss {

	// 这种方式会执行无参数的构造函数先创建一个对象，所有必须要求有一个无参数的Boss构造器，否则会报错
	/* @Autowired */
	private Car car;

	private Car car2;

//	public Boss() {
//		System.out.println("Boss.Boss()===========>无参数的构造器执行");
//	}
	/**
	 * 如果有且仅有一个带参数的Car，这个@Autowired注解还可以省略
	 * 
	 * @param car
	 */
//	@Autowired
	public Boss(Car car) {
		super();
		this.car = car;
		System.out.println("Boss.Boss(Car car)========>执行boss的一个带参数的构造器方法，从容器中获取car,并赋值个属性");
	}

	// 两个参数的是不能标注@Autowired的
//	public Boss(Car car, Car car2) {
//		super();
//		this.car = car;
//		this.car2 = car2;
//		System.out.println("Boss.Boss(Car car, Car car2)=====>执行boss的一个带参数的构造器方法，从容器中获取car,并赋值个属性");
//	}

	public Car getCar() {
		return car;
	}

	/**
	 * 这个默认是从容器中获取Car,这种方式一定要有且仅有一个有Car参数的构造器，<br>
	 * 首先执行有参数的构造器，再调用setCar方法对属性赋值<br>
	 * 
	 * 第二种标注在方法的参数上。
	 * 这种方式其实是执行带一个Car参数的构造器，没有无参数的构造器没关系
	 * @param car
	 */
	@Autowired 
	public void setCar(/*@Autowired*/ Car car) {
		System.out.println("Boss.setCar()========>执行setCar方法，从容器中获取car,并赋值个属性");
		this.car = car;
	}

	public Car getCar2() {
		return car2;
	}

	public void setCar2(Car car2) {
		this.car2 = car2;
	}

	@Override
	public String toString() {
		return "Boss [car=" + car + ", car2=" + car2 + "]";
	}
}
