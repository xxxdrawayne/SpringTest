package com.ywt.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ywt.domain.User;
import com.ywt.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author ywt
 * @version 1.0
 * @date 2020/12/9 17:05
 */

@Controller
@RequestMapping("/user")
public class UserController {
    //作用：用来建立请求URL和处理请求方法之间的关系。
    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = "name")
    public String save() {
        System.out.println("Controller save running......");
        return "success";
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        /**
         * Model:模型 作用封装数据
         * View:视图  作用是展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username","张学友");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username","郭富城");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick4")
    public String save4(Model model) {

        model.addAttribute("username","刘德华");
        return "success";
    }

    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest httpServletRequest) {

        httpServletRequest.setAttribute("username","黎明");
        return "success";
    }

    @RequestMapping(value = "/quick6")
    public void save6(HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.getWriter().print("hello mvc");
    }

    @RequestMapping(value = "/quick7")
    @ResponseBody  //告知spingMVC框架  不进行视图跳转  直接进行数据响应
    public String save7() {
        return "hello shit";
    }

    @RequestMapping(value = "/quick8")
    @ResponseBody
    public String save8() throws IOException {
        User user = new User();
        user.setName("李四"); user.setAge(23);

        //使用json的转换工具将对象转换成json格式字符串再返回
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = objectMapper.writeValueAsString(user);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping(value = "/quick9")
    @ResponseBody
    //期望spingMVC自动将User转换成Json格式的字符串
    public User save9() {
        User user = new User();
        user.setName("李四"); user.setAge(23);
        return user;
    }
    /*         数据请求           */

    @RequestMapping(value = "/quick10")
    @ResponseBody
    public void save10(String name,int age) {
        //获取到的请求参数打印到控制台
        System.out.println(name);
        System.out.println(age);
    }

    @RequestMapping(value = "/quick11")
    @ResponseBody
    public void save11(User user) {
        System.out.println(user);
    }

    @RequestMapping(value = "/quick12")
    @ResponseBody
    public void save12(String[] strings) throws IOException{
        System.out.println(Arrays.asList(strings));
    }

    @RequestMapping(value = "/quick13")
    @ResponseBody
    public void save13(VO vo){
        System.out.println(vo);
    }

    @RequestMapping(value = "/quick14")
    @ResponseBody
    public void save14(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick15")
    @ResponseBody
    public void save15(@RequestParam(value = "username",required = false) String name) {
        System.out.println(name);
    }

    @RequestMapping(value = "/quick16/{name}",method = RequestMethod.GET)
    @ResponseBody
    public void save16(@PathVariable(value = "name",required = true) String name) {
        System.out.println(name);
    }

    @RequestMapping(value = "/quick17")
    @ResponseBody
    public void save17(Date date) {
        System.out.println(date);
    }

    @RequestMapping(value = "/quick18")
    @ResponseBody
    public void save18(HttpServletRequest request, HttpServletResponse response, HttpSession session)  {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping(value = "/quick19")
    @ResponseBody
    public void save19(@RequestHeader(value = "User-Agent",required = false)String user_agent)  {
        System.out.println(user_agent);
    }

    @RequestMapping(value = "/quick20")
    @ResponseBody
    public void save20(@CookieValue(value = "JSESSIONID",required = false)String jsessionid)  {
        System.out.println(jsessionid);
    }

    @RequestMapping(value = "/quick21")
    @ResponseBody
    public void save21(String name, MultipartFile uploadFile,MultipartFile uploadFile2) throws IOException {
        System.out.println(name);
        //获得上传文件的名称
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("C:\\Users\\dell\\Desktop\\DiskGenius\\upload\\"+originalFilename));

        String originalFilename2 = uploadFile2.getOriginalFilename();
        uploadFile2.transferTo(new File("C:\\Users\\dell\\Desktop\\DiskGenius\\upload\\"+originalFilename2));
    }

    @RequestMapping(value = "/quick22")
    @ResponseBody
    public void save22(String name, MultipartFile[] uploadFile) throws IOException {
        System.out.println(name);
        //获得上传文件的名称
        for(MultipartFile multipartFile:uploadFile) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("C:\\Users\\dell\\Desktop\\DiskGenius\\upload\\"+originalFilename));
        }
    }
}
