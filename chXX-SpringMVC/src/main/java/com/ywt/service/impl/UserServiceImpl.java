package com.ywt.service.impl;

import com.ywt.dao.UserDao;
import com.ywt.service.UserService;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/8 17:40
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
