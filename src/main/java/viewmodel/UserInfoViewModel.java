package viewmodel;

import java.util.Date;

/**
 * Created by wanghy on 2016/3/26.
 */
public class UserInfoViewModel {
    public String username;
    public Date createtime;
    private String telphone;
    public UserInfoViewModel(String username, Date createtime, String telphone) {
        this.username = username;
        this.createtime = createtime;
        this.telphone = telphone;
    }
    public UserInfoViewModel(){}
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
