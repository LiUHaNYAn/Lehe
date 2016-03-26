package service.impl;

import dao.impl.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

/**
 * Created by wanghy on 2016/3/26.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void Register(String username, String password) throws Exception {
        try{
            if(userDao.Register(username,password)){
                throw  new Exception("demo");
            }

            userDao.Register(username,password);
        }catch (Exception ex){
            throw  ex;
        }

    }
}
