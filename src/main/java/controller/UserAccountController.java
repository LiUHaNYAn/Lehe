package controller;

import common.ResultModel;
import dtomodel.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.UserAccountService;
import viewmodel.UserInfoViewModel;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by wanghy on 2016/3/26.
 */
@Controller
@RequestMapping("/user")
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;
    @RequestMapping(value = {"","index"})
    public ModelAndView Index(){
        return  new ModelAndView("index");
    }
    @RequestMapping(value = {"/user/{id}"})
    @ResponseBody
    public UserInfoViewModel UserInfo(@PathVariable("id") int id){

        return  userAccountService.GetModel(id);
    }
    @RequestMapping(value = {"/user/register"},method = RequestMethod.POST)
    @ResponseBody
    public ResultModel UserRegister(@Valid @NotNull RegisterDto dto, BindingResult result){
        ResultModel resultModel=new ResultModel();
        if(result.hasErrors()){
            resultModel.setMsg(result.getAllErrors().get(0).getDefaultMessage());
            resultModel.setResultcode(-1);
            return  resultModel;
        }
        try {
            userAccountService.Register(dto);
            resultModel.setResultcode(0);
        } catch (Exception e) {
            e.printStackTrace();
            resultModel.setResultcode(-1);
            resultModel.setMsg(e.getLocalizedMessage());
        }
        return  resultModel;
    }



}
