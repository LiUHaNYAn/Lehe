package dtomodel;

import javax.validation.constraints.NotNull;

/**
 * Created by admin on 2016/3/28.
 */
public class RegisterDto {
    @NotNull
    private   String username;

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    @NotNull
    private   String telphone;
    @NotNull
    private  String password;
    @NotNull
    private  String confirmpassword;
    @NotNull
    private   String checkcode ;
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
