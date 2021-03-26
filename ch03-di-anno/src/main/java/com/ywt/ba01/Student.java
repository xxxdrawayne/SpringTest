package com.ywt.ba01;

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
    private String name;
    private int age;

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
                '}';
    }
}
