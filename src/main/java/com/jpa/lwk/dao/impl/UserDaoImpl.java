package com.jpa.lwk.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jpa.lwk.dao.UserDao;
import com.jpa.lwk.entity.MyUser;
@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager manger; //通过spring注解获取事务中的管理类对象
	
	@Override
	public List<MyUser> findAll(String sql) {
		return manger.createQuery(sql).getResultList();
	 
	}

}
