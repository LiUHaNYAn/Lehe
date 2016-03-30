package dtomodel;

import javax.validation.constraints.Min;

/**
 * Created by admin on 2016/3/30.
 */
public class DeleteDto {
    @Min(value = 1,message = "编号大于1")
    private  int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
