package com.ywt.ba05;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

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

    @After(value = "myPointcut()")
    public void myAfter() {
        System.out.println("执行最终通知，总是会执行的");
        //一般是做资源清除工作的
    }

    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",throwing = "e")
    public void myAfterReturning(Exception e) {
        System.out.println("异常通知：方法发生异常时执行："+e.getMessage());
    }

    @Before(value = "myPointcut()")
    public void myBefore() {
        System.out.println("执行前置通知，在目标方法之前执行");
    }

    /**
     * @Pointcut: 定义和管理切入点，如果项目中有多个切入点表达式是重复的，可以复用的，可以使用@Pointcut
     *            属性：value切入点表达式
     *            位置：在自定义的方法上面
     *          特点：当使用@Pointcut定义在一个方法上面，此实这个方法的名称就是切入点表达式的别名。
     *                其他的通知中，value属性就可以使用这个方法名称，代替切入点表达式了
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
    private void myPointcut() {
        //无需代码
    }

}
