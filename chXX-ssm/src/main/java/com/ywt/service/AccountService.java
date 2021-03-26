package com.ywt.service;

import com.ywt.domain.Account;

import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/20 16:43
 */
public interface AccountService {
    public void save(Account account);

    public List<Account> findAll();
}
