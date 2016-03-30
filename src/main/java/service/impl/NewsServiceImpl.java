package service.impl;

import common.ResultModel;
import dao.NewsClassDao;
import dao.NewsDao;
import dao.common.BindResult;
import dao.common.BindResultTool;
import domain.entity.News;
import domain.entity.NewsClass;
import dtomodel.DeleteDto;
import dtomodel.NewsAddDto;
import dtomodel.NewsUpdateDto;
import org.hibernate.loader.custom.RootReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import service.NewsService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by admin on 2016/3/30.
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;
    @Autowired
    private NewsClassDao newsClassDao;
    public ResultModel AddNews(@Valid @NotNull NewsAddDto dto, BindingResult bindingResult) {
        BindResult bindResult= BindResultTool.IsValid(bindingResult);
        ResultModel resultModel=new ResultModel();
        if(!bindResult.isvalid()) {
            resultModel.setResultcode(-1);
            resultModel.setMsg(bindResult.getMsg());
            return resultModel;
        }
        NewsClass newsClass=newsClassDao.GetModel(dto.getClassid());
        if(newsClass==null){
            resultModel.setResultcode(-1);
            resultModel.setMsg("新闻类别不存在");
            return  resultModel;
        }
        News news=new News();
        news.setSortorder(dto.getSortorder());
        news.setIshome(dto.getIshome());
        news.setContent(dto.content);
        news.setCreatetime(new Date());
        news.setNewsClass(newsClass);
        news.setTitle(dto.title);
        newsDao.AddEntity(news);
        resultModel.setResultcode(1);
        return resultModel;
    }

    public ResultModel UpdateEntity(@Valid @NotNull NewsUpdateDto dto, BindingResult bindingResult) {
        BindResult bindResult= BindResultTool.IsValid(bindingResult);
        ResultModel resultModel=new ResultModel();
        if(!bindResult.isvalid()) {
            resultModel.setResultcode(-1);
            resultModel.setMsg(bindResult.getMsg());
            return resultModel;
        }
        NewsClass newsClass=newsClassDao.GetModel(dto.getClassid());
        if(newsClass==null){
            resultModel.setResultcode(-1);
            resultModel.setMsg("新闻类别不存在");
            return  resultModel;
        }
        News news=newsDao.GetModel(dto.getNewsid());
        if(news==null){
            resultModel.setResultcode(-1);
            resultModel.setMsg("新闻不存在");
            return  resultModel;
        }
        news.setSortorder(dto.getSortorder());
        news.setIshome(dto.getIshome());
        news.setContent(dto.content);
        news.setCreatetime(new Date());
        news.setNewsClass(newsClass);
        news.setTitle(dto.title);
        newsDao.UpdateEntity(news);
        resultModel.setResultcode(1);
        return resultModel;
    }

    public ResultModel DeleteNews(@Valid @NotNull DeleteDto dto, BindingResult bindingResult) {
        BindResult bindResult= BindResultTool.IsValid(bindingResult);
        ResultModel resultModel=new ResultModel();
        if(!bindResult.isvalid()) {
            resultModel.setResultcode(-1);
            resultModel.setMsg(bindResult.getMsg());
            return resultModel;
        }
        newsDao.DeleteNews(dto.getId());
        resultModel.setResultcode(1);
        return resultModel;
    }


    public ResultModel GetModel(int id) {
        News news=newsDao.GetModel(id);
        ResultModel resultModel=new ResultModel();
        if(news==null){
            resultModel.setResultcode(-1);
            resultModel.setMsg("新闻不存在");
            return  resultModel;
        }
        resultModel.setResultcode(1);
        resultModel.setData(news);
        return  resultModel;
    }
}
