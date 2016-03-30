package dtomodel;


import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by admin on 2016/3/30.
 */
public class NewsAddDto {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSortorder() {
        return sortorder;
    }

    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
    }

    public int getIshome() {
        return ishome;
    }

    public void setIshome(int ishome) {
        this.ishome = ishome;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    @NotNull(message = "标题不能为空")
    @Size(min = 3,max = 100,message = "标题长度在3-100")
    public  String title;
    @NotNull(message = "请输入内容")
    public  String content;
    @Range(min =0,message = "排序值范围是0-9999",max = 9999)
    private  int sortorder;
    @Range(min = 0,max = 1,message = "1首页显示0首页不要显示")
    private  int ishome;
    @Min(value = 1,message = "请输入大于0的编号")
    private  int classid;
}
