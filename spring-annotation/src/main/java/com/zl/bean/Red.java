package com.zl.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.util.StringValueResolver;

public class Red implements ApplicationContextAware,  BeanNameAware, EmbeddedValueResolverAware{
	
	private ApplicationContext applicationContext;

	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		//值解析器可以解析spring环境变量中的值
		String resolveStringValue = resolver.resolveStringValue("我是${os.name}, 我来自#{20 * 18}");
		System.out.println("Red.setEmbeddedValueResolver()===>"+resolveStringValue);
	}

	public void setBeanName(String name) {
		System.out.println("Red.setBeanName()===========>执行了"+name);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		System.out.println("Red.setApplicationContext()=============>执行了"+applicationContext.hashCode());
		this.applicationContext = applicationContext;
	}

}
