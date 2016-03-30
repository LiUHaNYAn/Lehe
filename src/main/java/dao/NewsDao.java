package dao;

import dao.core.IDao;
import domain.entity.News;
import org.springframework.stereotype.Repository;

/**
 * Created by wanghy on 2016/3/29.
 */

public interface NewsDao extends IDao<News> {
    public News GetModel(int id);
    public  void  DeleteNews(int id);
}
