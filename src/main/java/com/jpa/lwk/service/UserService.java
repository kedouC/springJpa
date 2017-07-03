package com.jpa.lwk.service;

import java.util.List;

import com.jpa.lwk.entity.MyUser;

public interface UserService {
	/**
	 * 获取所有user
	 * @return
	 */
	List<MyUser> getAllUser();
}
