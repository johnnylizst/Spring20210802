package com.study.spring.case03.service;

import org.springframework.stereotype.Service;

import com.study.spring.case03.dao.UserDao;
import com.study.spring.case03.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService{
	
	private UserDao userDao = new UserDaoImpl();
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
    }
	
	@Override
	public void addUser() {
		userDao.createUser();
	}
	
}
