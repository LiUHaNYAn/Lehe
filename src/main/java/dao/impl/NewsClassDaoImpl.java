package dao.impl;

import dao.NewsClassDao;
import domain.entity.News;
import domain.entity.NewsClass;

/**
 * Created by wanghy on 2016/3/29.
 */
public class NewsClassDaoImpl extends ImplBase<NewsClass> implements NewsClassDao {

    @Override
    public NewsClass GetModel(int id) {
      return   (NewsClass) sessionFactory.getCurrentSession().get(NewsClass.class,id);
    }

    public void UpdateIsDelete(int id) {
        sessionFactory.getCurrentSession().createQuery("update NewsClass newsclass set newsclass.isdelete=1 where  newsclass.classid=:id").setParameter("id",id);
    }
}
