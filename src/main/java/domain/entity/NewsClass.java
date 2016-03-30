package domain.entity;

import domain.core.IEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wanghy on 2016/3/29.
 */
@Entity(name = "tb_newsclass")
public class NewsClass implements IEntity {


    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortorder() {
        return sortorder;
    }

    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getIshome() {
        return ishome;
    }

    public void setIshome(int ishome) {
        this.ishome = ishome;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "createtime",nullable = false)
    private Date createtime;
    @Column(name = "sortorder",nullable = false)
    private  int sortorder;
    @Column(name = "isdelete",nullable = false)
    private  int isdelete;
    @Column(name = "language",nullable = false)
    private  int language;
    @Column(name = "ishome",nullable = false)
    private  int ishome;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "classid")
    private  int classid;
    @Column(name = "classname",nullable = false,length = 20)
    private  String name;
}
