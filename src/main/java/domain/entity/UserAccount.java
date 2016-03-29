package domain.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by wanghy on 2016/3/26.
 */
@Entity

public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private  int id;
    @Column(name = "username",nullable = false,length = 30)
    private  String username;
    @Column(name = "password",nullable = false,length = 50)
    private  String password;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createtime")
    private Date createtime;
    @Column(name = "telphone",nullable = false,length = 11,unique = true)
    private String telphone;
    @Column(name = "account",nullable = false,precision = 18,scale = 2)
    private BigDecimal account;
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }
}
