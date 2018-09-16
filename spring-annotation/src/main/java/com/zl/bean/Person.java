package com.zl.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	/**
	 * @value注解给属性赋值
	 * 1，SLEL表达式
	 * 2，基本类型的值
	 * 3，属性配置文件，其实本质是spring环境变量中的值Environment
	 */
	
	@Value("王麻子")
	private String name;
	
	@Value("#{20-2}")
	private Integer age;
	
	@Value("${person.nickname}")
	private String nickName;
	
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person(String name, Integer age, String nickName) {
		this(nickName, age);
		this.nickName = nickName;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nickName=" + nickName + "]";
	}
	
	
}
