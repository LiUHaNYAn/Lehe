package dao.impl;

import dao.IUserDao;
import domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.type.TrueFalseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

/**
 * Created by wanghy on 2016/3/23.
 */
@Repository
public class UserDao implements IUserDao {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    public boolean Register(String username, String gender) {
        Session session = sessionFactory.getCurrentSession();
        User user = new User();
        System.out.println(sessionFactory.hashCode());
        user.setUserName(username);
        user.setGender(gender);
        session.save(user);
        return true;
    }
}
