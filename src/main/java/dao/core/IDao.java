package dao.core;

import org.hibernate.Query;
import org.hibernate.SQLQuery;

import java.util.List;

/**
 * Created by wanghy on 2016/3/29.
 */
public interface IDao<T> {
    public   void AddEntity(T entity);
    public  void  UpdateEntity(T entity);
    public void   DeleteEntity(T entity);
    public List<T> GetList(String hql);
    public Query Query(String hql);
    public SQLQuery SQLQuery(String sql);
    public List<T> Pager(String hql,int pageindex,int pagesize);
}
