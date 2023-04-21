package com.me.factory;

import com.me.dao.UserDao;

public class UserDaoFactory {
    public static UserDao getUserDao(){
        return new UserDao();
    };
}
