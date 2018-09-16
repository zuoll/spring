package com.zl.bean;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean<Color> {

	public Color getObject() throws Exception {

		System.out.println("==========>ColorFactoryBean.getObject()");
		return new Color();
	}

	public Class<?> getObjectType() {
		return Color.class;
	}

	/**
	 * 指名bean是否是但实例的
	 */
	public boolean isSingleton() {
		return true;
	}

}
