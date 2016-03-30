package dao;

import dao.core.IDao;
import domain.entity.NewsClass;

/**
 * Created by wanghy on 2016/3/29.
 */
public interface NewsClassDao extends IDao<NewsClass> {
    public  void  UpdateIsDelete(int id);
}
