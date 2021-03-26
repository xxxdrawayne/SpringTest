package com.ywt.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/19 18:40
 */
@Service
public class ExceptionServiceImpl {
    public void show1() {
        System.out.println("抛出类型转换异常");
        Object str="zhangsan";
        Integer num = (Integer)str;
    }
}
