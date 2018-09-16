package com.zl.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zl.bean.Car;
import com.zl.bean.Color;

@Configuration
@ComponentScan({"com.zl.bean"})
public class AutowireMainConfig2 {
	
	/**
	 * 这里的属性上的@Autowired可以省略
	 * @param car
	 * @return
	 */
	@Bean
	public Color color(@Autowired Car car) {
		Color color = new Color();
		color.setCar(car);//这个car是容器中的car
		return color;
	}
	
	
}
