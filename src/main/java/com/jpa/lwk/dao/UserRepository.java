package com.jpa.lwk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.lwk.entity.MyUser;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<MyUser, String>{
	
}
