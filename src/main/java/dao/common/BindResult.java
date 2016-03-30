package dao.common;

/**
 * Created by admin on 2016/3/30.
 */
public class BindResult {
    private   String msg;

    public boolean isvalid() {
        return isvalid;
    }

    public void setIsvalid(boolean isvalid) {
        this.isvalid = isvalid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private  boolean isvalid;
}
