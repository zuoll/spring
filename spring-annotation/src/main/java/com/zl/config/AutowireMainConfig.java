package com.zl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zl.dao.BookDao;

@Configuration
@ComponentScan({"com.zl.controller","com.zl.service", "com.zl.dao"})
public class AutowireMainConfig {
	
	
	@Primary
	@Bean("bookDao2")
	public BookDao bookDao() {
		BookDao bookDao = new BookDao();
		bookDao.setLable(2);
		return bookDao;
	}
	
	

}
