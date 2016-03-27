package dao;

import domain.UserAccount;
import viewmodel.UserInfoViewModel;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by wanghy on 2016/3/26.
 */
public interface UserAccountDao {
    void  Register(@NotNull(message = "请输入正确的用户信息") @Valid UserAccount userAccount);
    UserAccount GetModel(String telphone);
    UserInfoViewModel GetModel(@Min(value = 1,message = "请输入正确的用户编号") int id);
}
