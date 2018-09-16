package com.zl.dao;

import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDao {
	
	private int lable = 1;

	public int getLable() {
		return lable;
	}

	public void setLable(int lable) {
		this.lable = lable;
	}

	@Override
	public String toString() {
		return "BookDao [lable=" + lable + "]";
	}

}
