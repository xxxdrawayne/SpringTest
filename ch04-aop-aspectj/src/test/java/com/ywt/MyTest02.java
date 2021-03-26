package com.ywt;

import com.ywt.ba02.SomeService;
import com.ywt.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/1 19:37
 */
public class MyTest02 {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取目标对象
        SomeService proxy = (SomeService) ac.getBean("someService");
        //System.out.println(proxy.getClass().getName());

        //通过代理的对象执行方法，实现目标方法执行时，增强了功能
        Student s= proxy.doOther2("zs",23);
        System.out.println(s.toString());
    }
}
