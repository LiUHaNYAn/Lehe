package controller;

import common.ResultModel;
import dtomodel.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserAccountService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by admin on 2016/4/5.
 */
@Controller
public class LoginController {
    @Autowired
    private UserAccountService userAccountService;
    @RequestMapping(value={"/login/index","/login"})
    public ModelAndView Index(){
        return  new ModelAndView("login/index");
    }
    @RequestMapping("/login/login")
    @ResponseBody
    public ResultModel Login(@Valid @NotNull LoginDto dto){
        userAccountService.Login(dto);
        return  new ResultModel();
    }
}
