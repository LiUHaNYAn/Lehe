package domain.entity;

import domain.core.IEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 2016/4/5.
 */
@Entity(name = "tb_managergroup")
public class ManagerGroup  implements IEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gid;
    @Column(name = "groupname",length = 50,nullable = false)
    private  String groupName;

    @Column(name = "remark",length = 100,nullable = false)
    private  String remark;
    @Temporal(TemporalType.DATE)
    @Column(name = "createtime",nullable = false)
    private Date createtime;
    @Column(nullable = false)
    private int sortorder;
    @Column(nullable = false)
    private  int isopen;
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getSortorder() {
        return sortorder;
    }

    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }

    public int getIsopen() {
        return isopen;
    }

    public void setIsopen(int isopen) {
        this.isopen = isopen;
    }

}
