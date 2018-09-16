package com.zl.bean;

public class Car {

	
	public Car() {
		System.out.println("Car.Car()...执行无参数的构造函数创建对象。。。");
	}
	
	
	public void init() {
		System.out.println("Car.init().......执行初始化方法");
	}
	
	public void destory() {
		System.out.println("Car.destory().........执行销毁方法");
	}
}
