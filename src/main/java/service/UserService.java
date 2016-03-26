package service;

import org.hibernate.bytecode.spi.NotInstrumentedException;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;

/**
 * Created by wanghy on 2016/3/26.
 */
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class, NotInstrumentedException.class})
public interface UserService {
    public  void  Register(String username,String password) throws Exception;
}
