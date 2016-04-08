package dao;

import dao.core.IDao;
import domain.entity.NewsClass;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import viewmodel.NewsClassListViewModel;

import java.util.List;

/**
 * Created by wanghy on 2016/3/29.
 */

public interface NewsClassDao extends IDao<NewsClass> {
    public  void  UpdateIsDelete(int id);
  public   NewsClass GetModel(int id);
    public List<NewsClassListViewModel> GetList(int pageindex, int pagesize, String name, int language) ;
    public  int GetCount(String name,int language);
}
