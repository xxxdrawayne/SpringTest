package com.ywt.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
    * 异常通知方法的定义格式：公共方法public，
    *               没有一个返回值
    *               方法名称自定义，
    *               方法是有一个参数Exception，可以加的参数JointPoint
    */

    /**
     * @AfterThrowing:异常通知
     *      属性：value 切入表达式
     *            throwing 自定义的变量，表示目标方法抛出的异常对象
     *                      变量名必须和方法的参数名一样。
     *      位置：在方法定义的上面
     *      特点：1.在目标方法抛出异常时执行
     *           2. 可以做异常的监控程序，监控目标方法中是不是有异常
     */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",throwing = "e")
    public void myAfterReturning(Exception e) {
        System.out.println("异常通知：方法发生异常时执行："+e.getMessage());
    }

    /**
     * 最终通知方法的定义格式：公共方法public，
     *               没有一个返回值
     *               方法名称自定义，
     *               方法没有参数，可以加的参数JointPoint
     */

    /**
     * @After:最终通知
     *      属性：value 切入表达式
     *      位置：在方法定义的上面
     *      特点：1.在目标方法之后执行
     *           2. 总会执行
     */
    @After(value = "execution(* *..SomeServiceImpl.doThird(..))")
    public void myAfter() {
        System.out.println("执行最终通知，总是会执行的");
        //一般是做资源清除工作的
    }

}
