package controller;

import domain.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserAccountService;
import viewmodel.UserInfoViewModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wanghy on 2016/3/26.
 */
@Controller
public class UserAccountController {
    @Autowired
    private UserAccountService userAccountService;
    @RequestMapping(value = {"","index"})
    public ModelAndView Index(){
        UserAccount userAccount=new UserAccount();
        userAccount.setAccount(BigDecimal.valueOf(25.36));
        userAccount.setCreatetime(new Date());
        userAccount.setPassword("123456");
        userAccount.setUsername("王海洋");
        userAccount.setTelphone("18631142824");
        userAccountService.Register(userAccount);
        return  new ModelAndView();
    }
    @RequestMapping(value = {"/user/{id}"})
    @ResponseBody
    public UserInfoViewModel UserInfo(@PathVariable("id") int id){
        return  userAccountService.GetModel(id);
    }

}
