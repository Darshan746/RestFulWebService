package com.darshan.spring.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.darshan.spring.dao.UserDao;
import com.darshan.spring.model.CustomUserDetails;
import com.darshan.spring.model.User;

@Service
public class CustomUserDetailService extends User implements UserDetailsService {

	@Autowired
	UserDao userDao;
	
	@Override
    @Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = Optional.ofNullable(userDao.getUserByName(username));
		optionalUser.orElseThrow(()->new UsernameNotFoundException("userName not found"));
		optionalUser.ifPresent(users->{
			new CustomUserDetails(users);
		});
		return new CustomUserDetails(optionalUser.get());
	}
}
