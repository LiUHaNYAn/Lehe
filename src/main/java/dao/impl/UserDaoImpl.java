package dao.impl;

import dao.UserDao;
import domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by wanghy on 2016/3/23.
 */
@Repository
public class UserDaoImpl implements UserDao {

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
