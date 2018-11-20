package com.darshan.spring.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darshan.spring.dao.UserInfoDAO;
import com.darshan.spring.model.UserInfo;
import com.darshan.spring.service.UserInfoService;

@Service
public class UserInfoIServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDAO userInfoDao;

	@Override
	@Transactional
	public void addUserInf(UserInfo userInfo) {
		userInfoDao.addUserInf(userInfo);
	}

}
