package domain;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by wanghy on 2016/3/18.
 */
public class User {

    public String getUserName() {
        return UserName;
    }


    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @NotNull(message = "用户名不能为空")
    @Size(min = 5,max = 30)
    private String UserName;
    @NotNull
    private  String gender;
}
