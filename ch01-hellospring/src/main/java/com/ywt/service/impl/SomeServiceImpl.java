package com.ywt.service.impl;

import com.ywt.service.SomeService;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/25 21:11
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行了someservice的dosome方法");
    }
}
