package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.service.UserService;

public class UserServiceImpl implements UserService {

    public void setUserDao(UserDao userDao) {
        System.out.println(userDao);
    }
}
