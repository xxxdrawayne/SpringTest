package com.ywt.web;

import com.ywt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/8 17:46
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("applicationConfig.xml");
        ServletContext servletContext = req.getServletContext();
//        ApplicationContext ac = (ApplicationContext) servletContext.getAttribute("ac");
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = ac.getBean(UserService.class);
        userService.save();
    }
}
