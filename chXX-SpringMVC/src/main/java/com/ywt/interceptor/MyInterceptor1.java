package com.ywt.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/19 16:58
 */
public class MyInterceptor1 implements HandlerInterceptor {
    //在目标方法执行之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle.....");
        String parameter = request.getParameter("parameter");
        if("yes".equals(parameter)) {
            return true;
        }else {
            request.getRequestDispatcher("/error.jsp").forward(request,response);
            return false;
        }

        //返回true  代表放行
    }
    //在目标方法执行之后 视图方法返回之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("name","Crips");
        System.out.println("postHandle.....");
    }
    //在流程都执行完毕后 执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion.....");
    }
}
