package service.impl;

import dao.UserAccountDao;
import domain.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserAccountService;
import viewmodel.UserInfoViewModel;

/**
 * Created by wanghy on 2016/3/26.
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserAccountDao userDao;

    public void Register(UserAccount userAccount)   {
        if(userDao.GetModel(userAccount.getTelphone())!=null){
            System.out.println("手机号码已经注册");
            return;
        }
        userDao.Register(userAccount);
        System.out.println("手机号码已经注册成功");
    }

    public UserInfoViewModel GetModel(int id) {
         return  userDao.GetModel(id);
    }
}
