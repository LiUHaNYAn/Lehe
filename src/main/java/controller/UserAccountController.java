package controller;

import common.ResultModel;
import domain.UserAccount;
import dtomodel.RegisterDto;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.LogLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserAccountService;
import viewmodel.UserInfoViewModel;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wanghy on 2016/3/26.
 */
@Controller
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;
    @RequestMapping(value = {"/","index"})
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
    public ResultModel UserRegister(@NotNull @Valid RegisterDto dto, Errors errors){
        ResultModel resultModel=new ResultModel();
        if(errors.hasErrors()){
            resultModel.setResultcode(-1);
            resultModel.setMsg(errors.getObjectName());
            return  resultModel;
        }

        try {
            userAccountService.Register(dto);
            resultModel.setResultcode(0);
        } catch (Exception e) {
            resultModel.setResultcode(-1);
            resultModel.setMsg(e.getMessage());
        }
        return  resultModel;
    }


}
