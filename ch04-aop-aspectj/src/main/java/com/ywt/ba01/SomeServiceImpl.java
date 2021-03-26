package com.ywt.ba01;

import org.springframework.stereotype.Component;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/1 19:08
 */
//目标类
@Component("someService")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
       //给doSome方法增加一个功能，在doSome执行之前，输出方法的执行时间
        System.out.println("---------目标方法doSome()--------");
    }
}
