package controller;

import common.ResultModel;
import domain.entity.NewsClass;
import dtomodel.NewsClassAddDto;
import dtomodel.NewsClassQueryDto;
import dtomodel.NewsClassUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.NewsClassService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**87729276
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
        ResultModel newsClasses= newsClassService.GetList(dto.getPageindex(),dto.getPagesize(),dto.getName(),dto.getLanguage());
        return  newsClasses;
    }
    @RequestMapping(value = {"add"},method ={RequestMethod.POST})
    @ResponseBody
    public ResultModel AddEntity(@Valid @NotNull NewsClassAddDto dto, BindingResult bindingResult){
        return  newsClassService.AddNewsClass(dto,bindingResult);
    }
    @RequestMapping(value = {"update"},method ={RequestMethod.POST})
    @ResponseBody
    public  ResultModel UpdateEntity(@Valid @NotNull NewsClassUpdateDto dto,BindingResult bindingResult){
        return  newsClassService.UpdateNewsClass(dto,bindingResult);
    }

}
