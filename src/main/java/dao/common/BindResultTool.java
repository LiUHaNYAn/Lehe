package dao.common;

import org.springframework.validation.BindingResult;

/**
 * Created by admin on 2016/3/30.
 */
public class BindResultTool {
    public  static  BindResult IsValid(BindingResult bindingResult){
        BindResult result=new BindResult();
        result.setIsvalid(true);
        if(bindingResult.hasErrors()){
            result.setIsvalid(false);
            result.setMsg(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        return  result;
    }
}
