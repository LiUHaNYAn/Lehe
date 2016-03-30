package dao.common;

/**
 * Created by admin on 2016/3/30.
 */
public final class ResultModel {
    private  int resultcode;
    private  String msg;
    private  Object data;

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
