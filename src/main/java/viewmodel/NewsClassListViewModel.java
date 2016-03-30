package viewmodel;

import java.util.Date;

/**
 * Created by wanghy on 2016/3/30.
 */
public class NewsClassListViewModel {
    public  NewsClassListViewModel(){

    }

    public NewsClassListViewModel( String classname , Date createtime,int ishome,int classid) {

        this.classname = classname;
        this.createtime = createtime;
      this.ishome = ishome;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getName() {
        return classname;
    }

    public void setName(String name) {
        this.classname = name;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getIshome() {
        return ishome;
    }

    public void setIshome(int ishome) {
        this.ishome = ishome;
    }


    private  String classname;
    private Date createtime;
    private  int ishome;
    private  int classid;
}
