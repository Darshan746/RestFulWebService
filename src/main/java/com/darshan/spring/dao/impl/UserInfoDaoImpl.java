package com.darshan.spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darshan.spring.dao.UserInfoDAO;
import com.darshan.spring.model.UserInfo;

@Repository
public class UserInfoDaoImpl implements UserInfoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUserInf(UserInfo userInfo) {
		sessionFactory.getCurrentSession().save(userInfo);
	}
}
