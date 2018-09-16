package com.zl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zl.dao.BookDao;

@Service
public class BookService {

	/**
	 * autoWire的工作原理 <br>
	 * 1>，首先按照类型查找，等价于applicationContext.getBean(BookDao.class);
	 * 	但是如果在容器中使用applicationContext.getBean(BookDao.class);
	 * 	就会抛错下面的错误NoUniqueBeanDefinitionException，提示发现了多个名称的相同类型的<br>
	 * 2>，如果该类型的有多个，则是按照属性的名称去查找 等价于：applicationContext.getBean("bookDao");<br>
	 * 3>，@Qualifier("bookDao") 也可以手动通过注解指定要装配哪个名字的bean,这个会覆盖属性的名字查找<br>
	 * 4>,只要用了@Autowired注解，默认是一定要为该属性装配好值的，也就是容器中必须存在这样的一个bean，否则会报错NoSuchBeanDefinitionException。<br>
	 * 	这个也等价于也就是容器会调用applicationContext.getBean("bookDao");没找到也会报错NoSuchBeanDefinitionException<br>
	 * 	但是 我们可以指定没有该bean，也不影响@Autowired(required=false).
	 * 5> @Primary注解进行首选设置，也就是发现多个类型相同的bean，选中这个被Primary标注的bean，属性名字查找被覆盖
	 * 但是如果要强行使用某个bean,可以用Qualifier，这个会覆盖primary
	 *  
	 */

	@Qualifier("bookDao")
	@Autowired(required = false)
	BookDao bookDao;

	public void print() {
		System.out.println("BookService.print()===>" + bookDao);
	}
}
