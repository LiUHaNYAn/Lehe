package domain;


import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;


@Entity(name = "tb_user")
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


    @Column(name = "username",nullable = false,length =30)
    private String UserName;
    @Column(name = "gender",nullable = false,length = 4)
    private  String gender;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long  id;

    public java.util.Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "createtime")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createtime;

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    private  String telphone;


}
