package com;


import domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * Created by wanghy on 2016/3/18.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"index","/"},method = {RequestMethod.GET})
    public ModelAndView index() {
        User user = new User();
        user.setGender("男");
        user.setUserName("james");
        ModelAndView view = new ModelAndView("index");
        view.addObject("user", user);
        return view;
    }

    @RequestMapping("demo")
    @ResponseBody
    public User Demo(HttpServletRequest request, HttpServletResponse response) {
        User user = new User();
        user.setGender("男   ");
        user.setUserName("james");
        return user;
    }

    @RequestMapping("parademo")
    @ResponseBody
    public User ParaDemo(HttpServletRequest request, HttpServletResponse response, @RequestParam("id") int userid) {
        User user = new User();
        user.setGender("男");
        user.setUserName("james");
        return user;
    }
    @RequestMapping("entitydemo")
    @ResponseBody
    public User EntityDemo(HttpServletRequest request, HttpServletResponse response, @Valid User user, BindingResult result, Errors errors) {
        if(result.hasErrors()){
            user.setUserName(result.getAllErrors().get(0).getDefaultMessage());

        }
        return user;
    }
}
