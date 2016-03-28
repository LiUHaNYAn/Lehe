package dtomodel;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by admin on 2016/3/28.
 */
public class RegisterDto {
    @NotNull(message = "用户名不能为空")
    @Size(min = 3,max = 20,message = "用户名长度在3-20")
    private   String username;
    @NotNull(message = "联系方式不能为空")
    @Size(min = 11,max = 11,message = "联系方式长度是11")
    private   String telphone;
    @NotNull(message = "密码不能为空")
    @Size(min =6,max = 20,message = "密码长度在6-20")
    private  String password;
    @NotNull(message = "确认密码不能为空")
    @Size(min =6,max = 20,message = "密码长度在6-20")
    private  String confirmpassword;
    @NotNull(message = "验证码不能为空")
    @Size(min = 4,max = 4,message = "验证码长度是4")
    private   String checkcode ;
    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }


    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

}
