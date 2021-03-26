package com.ywt.ba03;

import com.ywt.ba02.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
    * 环绕方法的定义格式：公共方法public，
    *               必须有一个返回值，推荐是Object
    *               方法名称自定义，
    *               方法是有参数的，固定的参数 ProceedingJointPoint
    */

    /**
     * @Around:环绕置通知
     *      属性：value 切入表达式
     *      位置：在方法定义的上面
     *      特点：1.它是功能最强的通知
     *           2.在目标方法前和后都能增强功能。
     *           3.控制目标方法是否被调用执行。
     *           4.修改原来的目标方法的执行结果。 影响最后的调用结果。
     *
     *          环绕通知，等同于JDK动态代理的 InvocationHandler接口
     *          参数：ProceedingJoinPoint 等同于Method
     *          返回值：就是目标方法的执行结果，可以被修改
     *
     *          环绕通知：经常做事务，在目标方法之前开启事务，执行目标方法，在目标方法之后执行事务。
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjb) throws Throwable {
        //实现环绕通知
        Object obj = null;
        System.out.println("在目标方法执行之前，添加日志："+new Date());
        //目标方法调用
        obj = pjb.proceed(); //等同于method.invote();
        System.out.println("在目标方法执行之后，提交事务");
        obj = "sss";
        return obj;
    }
}
