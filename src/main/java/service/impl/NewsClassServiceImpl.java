package service.impl;

import common.ResultModel;
import dao.NewsClassDao;
import dao.common.BindResult;
import dao.common.BindResultTool;
import domain.entity.NewsClass;
import dtomodel.NewsClassAddDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import service.NewsClassService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by admin on 2016/3/30.
 */
public class NewsClassServiceImpl implements NewsClassService {
    @Autowired
    private NewsClassDao newsClassDao;

    public ResultModel AddNewsClass(@Valid @NotNull NewsClassAddDto newsClassAdddto, BindingResult result) {
        BindResult bindResult=BindResultTool.IsValid(result);
        ResultModel resultModel=new ResultModel();
        if(!bindResult.isvalid()) {
            resultModel.setResultcode(-1);
            resultModel.setMsg(bindResult.getMsg());
            return resultModel;
        }
        NewsClass newsClass=new NewsClass();
        newsClass.setCreatetime(new Date());
        newsClass.setIsdelete(0);
        newsClass.setIshome(newsClassAdddto.getIshome());
        newsClass.setLanguage(newsClassAdddto.getLanguage());
        newsClass.setName(newsClassAdddto.getName());
        newsClass.setSortorder(newsClassAdddto.getSortorder());
        newsClassDao.AddEntity(newsClass);
        resultModel.setResultcode(1);
        return resultModel;
    }

    public ResultModel UpdateNewsClass(NewsClass newsClass) {
        return  null;
    }

    public ResultModel DeleteNewsClass(int newsclassid) {
        ResultModel resultModel=new ResultModel();
        resultModel.setResultcode(1);
        newsClassDao.UpdateIsDelete(newsclassid);
        return resultModel;
    }
}
