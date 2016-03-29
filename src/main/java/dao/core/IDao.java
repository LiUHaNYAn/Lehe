package dao.core;

import java.util.List;

/**
 * Created by wanghy on 2016/3/29.
 */
public interface IDao<T> {
    public   void AddEntity(T entity);
    public  void  UpdateEntity(T entity);
    public boolean  DeleteEntity(T entity);
    public List<T> GetList(String hql);
    public List<T> Pager(String hql,int pageindex,int pagesize);
}
