package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zl.bean.Red;

@Configuration
public class AwareIntfMainConfig3 {

	/**
	 * spring提供了一种回调方式让我们使用spring底层的一些组件的一些接口。总的父接口是aware<br>
	 * 像，ApplicationContextAware 可以让我们获取spring的容器对象, <br>
	 * BeanFactoryAware 可以让我们获取spring创建实例的bean工厂，所有的命名方式是xxxAware.<br>
	 * 
	 * 这种方式使得可以把spring底层的一些组件传递到我们自定义的bean中保存起来使用，
	 * 其底层的核心是一些后置处理器在处理这些XXXAware接口
	 * 例如ApplicationContextAware <=========>ApplicationContextAwareProcessor
	 * 
	 */
	
	@Bean
	public Red red() {
		return new Red();
	}
	
}
