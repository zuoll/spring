package com.zl.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {

	public Dog() {
	
		System.out.println("Dog.Dog()");
	
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Dog.init()------------>@PostConstruct");
	}
	
	
	@PreDestroy
	public void destory() {
		System.out.println("Dog.destory()-----------@PreDestroy");
	}
}
