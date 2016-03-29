package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wanghy on 2016/3/29.
 */
@Controller
@RequestMapping(value = {"/","/home"})
public class HomeController {
    @RequestMapping(value = {"","index"})
    public ModelAndView Index(){
        return  new ModelAndView("/home/index");
    }
}
