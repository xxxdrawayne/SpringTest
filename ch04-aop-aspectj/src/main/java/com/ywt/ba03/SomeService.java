package com.ywt.ba03;

import com.ywt.ba02.Student;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/1 19:07
 */
public interface SomeService {
    public void doSome(String name, Integer age);
    public String doOther(String name, Integer age);
    public Student doOther2(String name, Integer age);
    public String doFirst(String name, Integer age);
}
