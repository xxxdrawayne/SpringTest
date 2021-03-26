package com.ywt.dao;

import com.ywt.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/7 15:26
 */
public interface UserMapper {
    public List<User> findByCondition(User user);
    public List<User> findAll();

}
