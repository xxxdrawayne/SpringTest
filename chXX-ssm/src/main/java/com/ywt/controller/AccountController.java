package com.ywt.controller;

import com.ywt.domain.Account;
import com.ywt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/20 16:45
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //保存
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Account account) {
        accountService.save(account);
        return "保存成功";
    }

    //查询
    @RequestMapping(value = "/findAll")
    public ModelAndView findAll() {
        System.out.println("...");
        List<Account> accountList = accountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accountList);
        System.out.println("...");
        modelAndView.setViewName("accountList");
        return modelAndView;
    }
}
