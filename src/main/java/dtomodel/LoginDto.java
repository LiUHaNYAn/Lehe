package dtomodel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by admin on 2016/4/5.
 */
public class LoginDto {
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

    @NotNull(message = "用户名不能为空")
    @Size(min = 3,max = 20,message = "用户名长度是{0}-{1}")
    private  String username;
    @NotNull(message = "密码不能为空")
    @Size(min = 6,max = 20,message = "密码长度是{0}-{1}")
    private  String password;
}
