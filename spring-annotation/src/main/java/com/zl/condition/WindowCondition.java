package com.zl.condition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import com.zl.bean.Person;

public class WindowCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		System.out.println("beanFactory====>"+beanFactory);
		Environment environment = context.getEnvironment();
		
		System.out.println("environment===>"+environment);
		String osName = environment.getProperty("os.name");
		
		BeanDefinitionRegistry registry = context.getRegistry();
		System.out.println("registry====>"+registry);
		boolean containsBeanDefinition = registry.containsBeanDefinition("person");
		System.out.println("containsBeanDefinition="+containsBeanDefinition);
		RootBeanDefinition beanDefinition = new RootBeanDefinition();
		beanDefinition.setBeanClass(Person.class);
		registry.registerBeanDefinition("pp", beanDefinition );
		System.out.println(osName);
		if(osName.contains("Windows")) {
			return true;
		}
		return false;
	}

}
