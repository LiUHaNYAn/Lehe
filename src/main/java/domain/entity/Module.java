package domain.entity;

import domain.core.IEntity;

import javax.persistence.*;
import java.util.Date;

/**m
 * Created by admin on 2016/4/5.
 */
@Entity(name = "tb_module")
public class Module implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int mid;
    @Column(name = "modulename",nullable = false,length = 50)
    private  String modulename;
    @Column(name = "type",nullable = false,length = 50)
    private  int type;
    @Column(name = "pid",nullable = false,length = 50)
    private int pid;
    @Temporal(TemporalType.DATE)
    @Column(name = "createtime",nullable = false)
    private Date createtime;
    @Column(name = "isopen",nullable = false)
    private int isopen;
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getIsopen() {
        return isopen;
    }

    public void setIsopen(int isopen) {
        this.isopen = isopen;
    }


}
