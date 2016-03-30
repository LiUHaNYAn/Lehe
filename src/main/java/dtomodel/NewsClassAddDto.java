package dtomodel;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by admin on 2016/3/30.
 */
public class NewsClassAddDto {
    public int getSortorder() {
        return sortorder;
    }

    public void setSortorder(int sortorder) {
        this.sortorder = sortorder;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Range(min =0,message = "排序值范围是0-9999",max = 9999)
    private  int sortorder;
    @Range(min =1,message = "1中文2英文",max = 2)
    private  int language;
    @Range(min = 0,max = 1,message = "1首页显示0首页不要显示")
    private  int ishome;
    @NotNull(message = "请输入名称")
    @NotEmpty(message = "请输入名称")
    @Size(min = 2,max = 20,message = "名称长度在2-20之间")
    private  String name;
}
