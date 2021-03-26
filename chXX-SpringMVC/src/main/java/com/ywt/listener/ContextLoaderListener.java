package com.ywt.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/8 19:01
 */
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //读取web.xml中的全局参数
        ServletContext servletContext = servletContextEvent.getServletContext();
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");

        ApplicationContext ac = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将spring的应用上下文对象存储到ServletContext域中

        servletContext.setAttribute("ac",ac);
        System.out.println("spring容器创建完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
