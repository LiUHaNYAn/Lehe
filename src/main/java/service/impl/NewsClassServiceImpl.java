package service.impl;

import dao.NewsClassDao;
import domain.entity.NewsClass;
import org.springframework.beans.factory.annotation.Autowired;
import service.NewsClassService;

/**
 * Created by admin on 2016/3/30.
 */
public class NewsClassServiceImpl implements NewsClassService {
    @Autowired
    private NewsClassDao newsClassDao;

    public void AddNewsClass(NewsClass newsClass) {

    }

    public void UpdateNewsClass(NewsClass newsClass) {

    }

    public void DeleteNewsClass(int newsclassid) {

    }
}
