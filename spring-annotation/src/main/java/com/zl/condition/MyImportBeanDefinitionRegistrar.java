package com.zl.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.alibaba.fastjson.JSON;
import com.zl.bean.RainBow;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		
		String[] interfaceNames = importingClassMetadata.getInterfaceNames();
		System.out.println(JSON.toJSONString(interfaceNames));
		
		boolean containsBeanDefinition = registry.containsBeanDefinition("com.zl.bean.Red");
		boolean containsBeanDefinition2 = registry.containsBeanDefinition("com.zl.bean.Blue");
		if(containsBeanDefinition && containsBeanDefinition2) {
			RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
			registry.registerBeanDefinition("rainBow", beanDefinition);
		}
	}

}
