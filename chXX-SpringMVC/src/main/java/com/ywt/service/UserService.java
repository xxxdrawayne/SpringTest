package com.ywt.service;

import com.ywt.dao.UserDao;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/8 17:37
 */
public interface UserService {

    public void setUserDao(UserDao userDao);
    public void save();
}
