package service.impl;

import dao.UserAccountDao;
import domain.UserAccount;
import dtomodel.RegisterDto;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserAccountService;
import viewmodel.UserInfoViewModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wanghy on 2016/3/26.
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserAccountDao userDao;
    private    Logger logger= LogManager.getLogger(getClass().getName());
    public void Register(RegisterDto userAccount) throws Exception {
        if(userDao.GetModel(userAccount.getUsername())!=null){
           logger.warn(String.format("手机号码%s已经注册",userAccount.getUsername()));
            throw  new Exception("该手机号码已经注册");
        }
        UserAccount user=new UserAccount();
        user.setAccount(BigDecimal.valueOf(45.56));
        user.setCreatetime(new Date());
        user.setPassword(userAccount.getPassword());
        user.setTelphone(userAccount.getTelphone());
        user.setUsername(userAccount.getUsername());
        userDao.Register(user);
        logger.info(String.format("手机号码%s成功注册",userAccount.getUsername()));
    }

    public UserInfoViewModel GetModel(int id) {
         UserInfoViewModel userInfoViewModel=  userDao.GetModel(id);
        if(userInfoViewModel==null){
            logger.warn(String.format("编号为%d的用户不存在",id));
        }
        logger.info(String.format("编号为%d的用户存在",id));
        return userInfoViewModel;
    }
}
