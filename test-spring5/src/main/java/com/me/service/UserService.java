package com.me.service;

import com.me.dao.UserDao;
import com.me.factory.UserDaoFactory;

public class UserService {
    public void addUser(){
        UserDao userDao = UserDaoFactory.getUserDao();
        userDao.addUser();
    }
}
