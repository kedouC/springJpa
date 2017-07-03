package com.jpa.lwk.dao;

import java.util.List;

import com.jpa.lwk.entity.MyUser;

public interface UserDao {
	/**
	 * 查询所有用 jpa entity类
	 * @return
	 */
	List<MyUser> findAll(String sql);
}
