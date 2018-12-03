package com.darshan.spring.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darshan.spring.dao.UserDao;
import com.darshan.spring.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public User getUserByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User u where u.name=:name");
		query.setParameter("name", name);
		User user = (User) query.list().get(0);
		return user;
	}
}
