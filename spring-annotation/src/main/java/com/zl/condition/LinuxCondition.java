package com.zl.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		Environment environment = context.getEnvironment();
		System.out.println("environment===>"+environment);
		String osName = environment.getProperty("os.name");
		System.out.println(osName);
		
		
		if(osName.contains("Linux")) {
			return true;
		}
		return false;
	}

}
