package dtomodel;

/**
 * Created by admin on 2016/3/30.
 */
public class NewsClassQueryDto {
    private String  name;
    private int pagecount;
    private  int language;
    private  int pageindex;
    private  int pagesize;
    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }



    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }
    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
