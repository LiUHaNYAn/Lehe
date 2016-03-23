package dao;

import data.IUserDao;
import domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Created by wanghy on 2016/3/23.
 */
@Repository
public class UserDao implements IUserDao {

    @Autowired(required = true)
    private SessionFactory sessionFactory;
    public    void  WriteData(){
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        User user=new User();
        user.setUserName("James");
        user.setGender("man");
        session.save(user);
        transaction.commit();
    }
}
