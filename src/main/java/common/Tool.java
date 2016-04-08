package common;

/**
 * Created by admin on 2016/4/8.
 */
public class Tool {
    public  static  int GetPageCount(int total,int pagesize){
        if(total%pagesize==0){
            return  total/pagesize;
        }else {
            return  (int) (total/pagesize)+1;
        }
    }
}
