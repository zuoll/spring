package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.zl.bean.Color;
import com.zl.bean.Person;
import com.zl.bean.Red;
import com.zl.condition.LinuxCondition;
import com.zl.condition.WindowCondition;

@Configuration
//@Conditional(WindowCondition.class)
@Import({Color.class, Red.class})
public class MainConfig2 {

	
	@Bean
	public Person person01() {
		System.out.println("向容器中添加一个person");
		return new Person("zs", 22);
	}
	
	
	@Bean("linux")
	@Conditional({LinuxCondition.class})
	public Person person02() {
		return new Person("linux", 60);
	}

	
	@Bean("window")
	public Person person03() {
		return new Person("bill", 50);
	}
	
}


