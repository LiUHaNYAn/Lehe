package dtomodel;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by admin on 2016/3/30.
 */
public class NewsClassUpdateDto {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Range(min =0,message = "排序值范围是0-9999",max = 9999)
    private  int sortorder;

    @Range(min = 0,max = 1,message = "1首页显示0首页不要显示")
    private  int ishome;

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Range(min = 0,max = 1,message = "1删除0未删除")
    private  int isdelete;
    @NotNull(message = "请输入名称")
    @NotEmpty(message = "请输入名称")
    @Size(min = 2,max = 20,message = "名称长度在2-20之间")
    private  String name;
    @Min(value = 1,message = "编号应大于0")
    private  int classid;

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
