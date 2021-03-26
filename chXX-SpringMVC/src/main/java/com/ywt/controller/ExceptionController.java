package com.ywt.controller;

import com.ywt.service.impl.ExceptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/19 18:38
 */
@Controller
public class ExceptionController {

    @Autowired
    private ExceptionServiceImpl exceptionService;

    @RequestMapping(value = "/show")
    public String show() {
        exceptionService.show1();
        return "index1";
    }
}
