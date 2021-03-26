package com.ywt.mapper;

import com.ywt.domain.Account;

import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/20 16:41
 */
public interface AccountMapper {
    public void save(Account account);

    public List<Account> findAll();
}
