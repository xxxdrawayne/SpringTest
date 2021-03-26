package com.ywt.ba04;

import com.ywt.ba02.Student;
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

    @Override
    public String doOther(String name, Integer age) {
        System.out.println("---------目标方法doOther()--------");
        return "abcd";
    }

    @Override
    public Student doOther2(String name, Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("---------目标方法doFirst()--------");
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("---------目标方法doSecond()--------"+10/0);
    }

    @Override
    public void doThird() {
        System.out.println("---------目标方法doThird()--------");
    }
}
