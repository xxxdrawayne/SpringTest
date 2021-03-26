package com.ywt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/19 16:53
 */
@Controller
@RequestMapping("/interceptor")
public class TargetController {
    @RequestMapping(value = "/target")
    public ModelAndView show() {
        System.out.println("目标资源执行。。。。。。");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","ywt");
        modelAndView.setViewName("index1");
        return modelAndView;
    }
}
