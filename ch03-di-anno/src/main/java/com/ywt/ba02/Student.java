package com.ywt.ba02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/11/30 15:55
 */
/*
 * @Component 创建对象的，等同于<bean>的功能
 *      属性：value就是对象的名称，也就是bean的id值
 *            value的值是唯一的，创建的对象在整个Spring容器中就一个
 *      位置：在类的上面
 *   @Component就等同于<bean id="myStudent" class="com/ywt/ba01/Student.java"/>
 *
 * spring中和@Component功能一致，创建对象的注解还有：
 *  1.@Respository（用于持久层类的上面）：放在dao的实现类上面，
 *                  表示dao创建对象，dao对象是能访问数据库的。
 *  2.@Service（用于业务层类的上面）：放在service的实现类上面，
 *                  创建service对象，service对象是做业务处理，可以有事务等功能的。
 *  3.Controller（用在控制器上面）：放在控制器（处理器）类的上面，
 *                  创建控制器对象，能够接收用户提供的参数，显示请求的处理结果。
 * 以上三个注解的使用语法是和@Component一样的，都是创建对象，但是这三个注解还有额外的功能。
 * @Respository，@Service，@Controller是给项目的对象分层的。
 */
//使用value属性，指定对象名称
//@Component(value = "myStudent")
//不指定value名称，由spring提供默认名称：类名的首字母小写
//@Component
//省略value
@Component("myStudent")
public class Student
{
    /*
    * @Value：简单类型的属性赋值
    *   属性：value是String类型的，表示简单类型的属性值
    *   位置：1：在属性定义的上面，无需set方法，推荐使用
    *        2：在set方法的上面
    * */
    @Value("张飞")
    private String name;
    @Value("18")
    private int age;

    /*
    * 引用类型
    * @Autowired：spring框架中提供的注解，实现引用类型的赋值
    * spring中通过注解给引用类型赋值，使用的是自动注入原理，支持byType，byName
    * @Autowired：默认使用的是byType自动注入。
    * */
    @Autowired
    @Qualifier("mySchool")
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
