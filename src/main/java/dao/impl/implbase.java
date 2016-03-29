package dao.impl;

import dao.core.IDao;
import org.hibernate.SessionFactory;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wanghy on 2016/3/29.
 */
public abstract    class implbase<T> implements IDao<T> {
    @Autowired
    private SessionFactory sessionFactory;

    public void AddEntity(T entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    public void UpdateEntity(T entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    public void DeleteEntity(T entity) {
          sessionFactory.getCurrentSession().delete(entity);
    }

    public List<T> GetList(String hql) {
      return (List<T>) sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    public List<T> Pager(String hql, int pageindex, int pagesize) {
        return (List<T>)sessionFactory.getCurrentSession().createQuery(hql).setFirstResult(pagesize*(pageindex-1)+1).setMaxResults(pageindex*pagesize);
    }
}
