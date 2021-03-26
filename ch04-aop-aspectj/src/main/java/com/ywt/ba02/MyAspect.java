package com.ywt.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/1 19:16
 */

/**
 * @Aspect ：是Aspectj框架中的注解。
 *          作用：表示当前类是切面类。
 *          切面类：是用来给业务方法增加功能的类，在这个类中由切面的功能代码。
 */

@Aspect
@Component("myAspect")
public class MyAspect {
    /**
    * 1.后置通知定义方法，方法是实现切面功能的。
    * 方法的定义要求：公共方法public，
    *               方法没有返回值，
    *               方法名称自定义，
    *               方法是有参数的，推荐是Object，类名自定义
    */

    /**
     * @AfterReturning:后置通知
     *      属性：1.value 切入表达式
     *           2.returning 自定义的变量，表示目标方法的返回值的。
     *             自定义变量名必须和通知方法的形参名一样。
     *      位置：在方法定义的上面
     *      特点：1.在目标方法之后执行。
     *           2.能够获得到目标方法的返回值，可以根据这个返回值做不同的处理功能。
     *           3.可以修改这个返回值。
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..) )",returning = "res")
    public void myAfterReturning(Object res) {
        //Object res是目标方法执行后的返回值，可以根据返回值做切面功能处理
        System.out.println("后置通知:在目标方法之后执行的，获取的返回值是："+res);
    }
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther2(..) )",returning = "res")
    public void myAfterReturning2(Object res) {
        Student s = (Student)res;
        s.setAge(99);
        s.setName("brouceLi");

    }
}
