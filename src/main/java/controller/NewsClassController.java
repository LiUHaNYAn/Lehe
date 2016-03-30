package controller;

import common.ResultModel;
import domain.entity.NewsClass;
import dtomodel.NewsClassQueryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.NewsClassService;

import java.util.List;

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
    @RequestMapping(value = {"list"})
    @ResponseBody
    public ResultModel ClassList(NewsClassQueryDto dto){
        ResultModel newsClasses= newsClassService.GetList(1,15,"");
        return  newsClasses;
    }
}
