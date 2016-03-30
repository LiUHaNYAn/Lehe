package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.NewsClassService;

/**
 * Created by admin on 2016/3/30.
 */
@Controller
@RequestMapping(value = {"/newsclass"})
public class NewsClassController {

    @Autowired
    private NewsClassService newsClassService;
    @RequestMapping(value = {"","index"})
    public ModelAndView Index(){
        return new ModelAndView("/newsclass/index");
    }
}
