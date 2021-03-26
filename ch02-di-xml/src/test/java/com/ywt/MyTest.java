package com.ywt;

import com.ywt.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/25 21:13
 */
public class MyTest {


    /*
    *  Spring默认创建对象的时间：在创建Spring容器时，会创建配置文件中所有的对象。
    *  Spring创建对象：默认的是调用对象的无参构造方法。
    * */
    @Test
    public void test01(){
        //使用spring容器创建的对象
        //1.指定spring配置文件的名称
        String config = "ba01/applicationContext.xml";
        //2.创建表示spring容器的对象，ApplicationContext
        //ApplicationContext就是表示Spring容器，通过容器获取对象了
        //ClassPathXmlApplicationContext:表示从类路径中加载spring的配置文件
        ApplicationContext ac= new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，要调用对象的方法
        //getBean("配置文件中的bean的id值")
        Student myStudent = (Student) ac.getBean("myStudent");

        System.out.println(myStudent);
    }

    //获取Spring容器中java对象的信息
    @Test
    public void test03(){
        String config = "ba01/applicationContext.xml";

        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        System.out.println(ac.getBeanDefinitionCount());

        System.out.println(ac.getBeanDefinitionNames()[0]);

        Date myDate = (Date) ac.getBean("myDate");
        System.out.println(myDate);
    }
}
