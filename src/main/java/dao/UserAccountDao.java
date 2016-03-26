package dao;

import domain.UserAccount;
import viewmodel.UserInfoViewModel;

/**
 * Created by wanghy on 2016/3/26.
 */
public interface UserAccountDao {
    void  Register(UserAccount userAccount);
    UserAccount GetModel(String telphone);
    UserInfoViewModel GetModel(int id);
}
