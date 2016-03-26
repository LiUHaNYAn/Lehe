package dao.impl;

import dao.UserAccountDao;
import domain.UserAccount;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;
import org.jboss.marshalling.TraceInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Transformer;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import viewmodel.UserInfoViewModel;

import java.util.List;

/**
 * Created by wanghy on 2016/3/26.
 */
@Repository
public class UserAccountDaoImpl implements UserAccountDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void Register(UserAccount userAccount) {
        Session session=sessionFactory.getCurrentSession();
        session.save(userAccount);
    }

    public UserAccount GetModel(String telphone) {
        Session session=sessionFactory.getCurrentSession();
       List<UserAccount> user=(List<UserAccount>)session.createQuery("from UserAccount as u where u.telphone=:telphone").setParameter("telphone",telphone).list();
        if(user.size()==0){
            return  null;
        }
        return user.get(0);
    }

    public UserInfoViewModel GetModel(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query=session.createSQLQuery("select username,createtime,telphone  from useraccount as u where u.userid=:id").
                setParameter("id", id);
         List result=query.list();
        List<UserInfoViewModel> user = (List<UserInfoViewModel>) query.setResultTransformer(Transformers.aliasToBean(UserInfoViewModel.class)).list();
        if (user.size() == 0) {
            return null;
        }
        return user.get(0);

    }
}
