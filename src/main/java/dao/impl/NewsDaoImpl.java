package dao.impl;

import dao.NewsDao;
import domain.entity.News;

/**
 * Created by wanghy on 2016/3/29.
 */
public class NewsDaoImpl extends ImplBase<News> implements NewsDao  {

    public News GetModel(int id) {
        return  (News)sessionFactory.getCurrentSession().get(News.class,id);
    }
}
