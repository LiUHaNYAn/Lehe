package service;

import domain.entity.NewsClass;

import javax.transaction.Transactional;

/**
 * Created by admin on 2016/3/30.
 */
public interface NewsClassService {
    @Transactional
    void  AddNewsClass(NewsClass newsClass);
    @Transactional
    void  UpdateNewsClass(NewsClass newsClass);
    @Transactional
    void  DeleteNewsClass(int newsclassid);
}
