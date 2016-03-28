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

import javax.xml.ws.ServiceMode;

/**
 * Created by wanghy on 2016/3/26.
 */
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class, NotInstrumentedException.class})
public interface UserAccountService {
    public  void  Register(RegisterDto userAccount) throws Exception;
    public UserInfoViewModel GetModel(int id);
}
