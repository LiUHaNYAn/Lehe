package service;

import dtomodel.LoginDto;
import dtomodel.RegisterDto;
import org.hibernate.bytecode.spi.NotInstrumentedException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import viewmodel.UserInfoViewModel;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by wanghy on 2016/3/26.
 */
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class, NotInstrumentedException.class})
public interface UserAccountService {
    public  void  Register(@Valid @NotNull RegisterDto userAccount) throws Exception;
    public UserInfoViewModel GetModel(@Min(value = 1L,message = "请输入一个大于0的整数") int id);
    public  UserInfoViewModel Login(@NotNull @Valid LoginDto dto );
}
