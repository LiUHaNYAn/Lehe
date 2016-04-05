package domain.entity;

import domain.core.IEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2016/4/5.
 */
@Entity(name = "tb_manager")
public class Manager implements IEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int mid;

    @Column(name = "name",length = 50,nullable = false)
    private  String name;
    @Temporal(TemporalType.DATE)
    @Column(name = "createtime",nullable = false)
    private Date createtime;
    @Column(name = "isopen",nullable = false)
    private  int isopen;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private  ManagerGroup managerGroup;
    public int getIsopen() {
        return isopen;
    }

    public void setIsopen(int isopen) {
        this.isopen = isopen;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return mid;
    }

    public void setId(int id) {
        this.mid = id;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public ManagerGroup getManagerGroup() {
        return managerGroup;
    }

    public void setManagerGroup(ManagerGroup managerGroup) {
        this.managerGroup = managerGroup;
    }

}
