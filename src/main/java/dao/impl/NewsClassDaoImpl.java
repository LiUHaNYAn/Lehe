package dao.impl;

import dao.NewsClassDao;
import domain.entity.News;
import domain.entity.NewsClass;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;
import viewmodel.NewsClassListViewModel;

import java.util.List;

/**
 * Created by wanghy on 2016/3/29.
 */
@Repository
public class NewsClassDaoImpl extends ImplBase<NewsClass> implements NewsClassDao {
    public NewsClass GetModel(int id) {
      return   (NewsClass) sessionFactory.getCurrentSession().get(NewsClass.class,id);
    }

    public List<NewsClassListViewModel> GetList(int pageindex, int pagesize, String name, int language) {
     return (List<NewsClassListViewModel>)sessionFactory.getCurrentSession().createSQLQuery("select  classname, createtime,ishome,classid from tb_NewsClass as newsclass where (:name='' or newsclass.classname like :likename) and newsclass.language=:language")
                .setParameter("name",name)
                .setParameter("likename","%"+name+"%")
                .setParameter("language",language)
                .setFirstResult((pageindex-1)*pagesize)
                .setMaxResults(pageindex*pagesize).setResultTransformer(Transformers.aliasToBean(NewsClassListViewModel.class)).list();
    }

    public void UpdateIsDelete(int id) {
        sessionFactory.getCurrentSession().createQuery("update NewsClass newsclass set newsclass.isdelete=1 where  newsclass.classid=:id").setParameter("id",id);
    }
}
