package dao.impl;

import dao.NewsDao;
import domain.entity.News;
import org.springframework.stereotype.Repository;

/**
 * Created by wanghy on 2016/3/29.
 */
@Repository
public class NewsDaoImpl extends ImplBase<News> implements NewsDao  {

    public News GetModel(int id) {
        return  (News)sessionFactory.getCurrentSession().get(News.class,id);
    }

    public void DeleteNews(int id) {
        sessionFactory.getCurrentSession().createQuery("delete from News where newsid=:newsid").setParameter("newsid",id);
    }

}
