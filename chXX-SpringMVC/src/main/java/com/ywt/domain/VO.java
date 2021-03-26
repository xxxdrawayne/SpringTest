package com.ywt.domain;

import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/16 18:20
 */
public class VO {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
