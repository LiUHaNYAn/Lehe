package dao;

import domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by wanghy on 2016/3/23.
 */
@Component
public interface IUserDao {
    public    boolean  Register(String username,String gender);

}
