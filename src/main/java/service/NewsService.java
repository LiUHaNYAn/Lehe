package service;

import common.ResultModel;

/**
 * Created by admin on 2016/3/30.
 */
public interface NewsService {
    public ResultModel AddNews();
    public  ResultModel UpdateEntity();
    public  ResultModel DeleteNews(int id);
    public ResultModel GetModel(int id);

}
