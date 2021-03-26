package com.ywt;

import com.ywt.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/30 16:16
 */
public class MyTest03 {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student  = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }

    @Test
    public void test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student  = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }

}
