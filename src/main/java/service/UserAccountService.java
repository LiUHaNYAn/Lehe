package service;

import domain.UserAccount;
import dtomodel.RegisterDto;
import org.hibernate.bytecode.spi.NotInstrumentedException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import viewmodel.UserInfoViewModel;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.ws.ServiceMode;

/**
 * Created by wanghy on 2016/3/26.
 */
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class, NotInstrumentedException.class})
public interface UserAccountService {
    public  void  Register(@Valid @NotNull RegisterDto userAccount) throws Exception;
    public UserInfoViewModel GetModel(@Min(value = 1L,message = "请输入一个大于0的整数") int id);
}
