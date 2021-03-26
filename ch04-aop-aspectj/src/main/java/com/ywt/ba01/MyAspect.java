package com.ywt.ba01;

import org.aspectj.lang.JoinPoint;
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
    * 1.定义方法，方法是实现切面功能的。
    * 方法的定义要求：公共方法public，方法没有返回值，方法名称自定义，
    *               方法可以有参数，也可以没有参数（如果有参数，参数不是自定义的，有几个参数类型可以使用）
    */
//    @Before(value = "execution(public void com.ywt.ba01.SomeServiceImpl.doSome(String,Integer) )")
//    public void myBefore() {
//        System.out.println("前置通知，目标方法之前输出代码执行时间："+new Date());
//    }
    /**
    * 指定通知方法中的参数：JoinPoint
    * JoinPoint：业务方法，要加入切面功能的业务方法
    *       作用是：可以在通知方法中获取方法执行的信息，例如方法名称，方法实参等。
    *       如果你的切面功能中要用到方法的信息，就加入JoinPoint。
    *       这个JointPoint参数的值是由框架赋予，必须是第一个位置的参数
    */
    @Before(value = "execution(void com.ywt.ba01.SomeServiceImpl.do*(String,Integer) )")
    public void myBefore(JoinPoint joinPoint) {
        //获取方法的完整定义
        System.out.println("方法的签名(定义) = "+joinPoint.getSignature());
        System.out.println("方法的名称 = "+joinPoint.getSignature().getName());
        //获取方法的实参
        Object[] args = joinPoint.getArgs();
        for(Object o:args)
            System.out.println("参数 = "+o);

        System.out.println("前置通知，目标方法之前输出代码执行时间："+new Date());
    }
}
