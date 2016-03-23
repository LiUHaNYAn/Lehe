package domain;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


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

    @NotNull
    private String UserName;
    @NotNull
    private  String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;


}
