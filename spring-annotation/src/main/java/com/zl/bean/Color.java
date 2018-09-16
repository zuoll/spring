package com.zl.bean;

public class Color {
	
	private Car car;
	
	public Color() {
		System.out.println("Color.Color()=========》构造器执行");
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Color [car=" + car + "]";
	}
	
	
}
