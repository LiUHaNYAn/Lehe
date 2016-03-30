package service.impl;

import common.ResultModel;
import dao.NewsClassDao;
import dao.common.BindResult;
import dao.common.BindResultTool;
import domain.entity.NewsClass;
import dtomodel.NewsClassAddDto;
import dtomodel.NewsClassUpdateDto;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import service.NewsClassService;
import viewmodel.NewsClassListViewModel;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2016/3/30.
 */
@Service
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

    public ResultModel UpdateNewsClass(@Valid @NotNull NewsClassUpdateDto dto,BindingResult bindingResult) {
        BindResult bindResult=BindResultTool.IsValid(bindingResult);
        ResultModel resultModel=new ResultModel();
        if(!bindResult.isvalid()) {
            resultModel.setResultcode(-1);
            resultModel.setMsg(bindResult.getMsg());
            return resultModel;
        }
        NewsClass newsClass=newsClassDao.GetModel(dto.getClassid());
        if(newsClass==null){
            resultModel.setResultcode(-1);
            resultModel.setMsg("不存在此编号");
            return  resultModel;
        }
        newsClass.setIsdelete(dto.getIsdelete());
        newsClass.setIshome(dto.getIshome());
        newsClass.setName(dto.getName());
        newsClass.setSortorder(dto.getSortorder());
        newsClassDao.UpdateEntity(newsClass);
        resultModel.setResultcode(1);
        return  resultModel;
    }

    public ResultModel DeleteNewsClass(int newsclassid) {
        ResultModel resultModel=new ResultModel();
        resultModel.setResultcode(1);
        newsClassDao.UpdateIsDelete(newsclassid);
        return resultModel;
    }

    public ResultModel GetModel(@Min(value = 1,message = "请输入大于0的数字") int id,BindingResult bindingResult) {
        BindResult bindResult=BindResultTool.IsValid(bindingResult);
        ResultModel resultModel=new ResultModel();
        if(!bindResult.isvalid()) {
            resultModel.setResultcode(-1);
            resultModel.setMsg(bindResult.getMsg());
            return resultModel;
        }
        NewsClass newsClass=newsClassDao.GetModel(id);
        if(newsClass==null){
            resultModel.setResultcode(-1);
            resultModel.setMsg("不存在此编号");
            return  resultModel;
        }
        resultModel.setResultcode(1);
        resultModel.setData(newsClass);
        return  resultModel;
    }

    public ResultModel GetList( int pageindex, int pagesize, String name,int language) {
        List<NewsClassListViewModel> list=newsClassDao.GetList(pageindex,pagesize,name,language);
        ResultModel resultmodel=new ResultModel();
        resultmodel.setResultcode(1);
        if(list.size()==0){
            resultmodel.setResultcode(-1);
            resultmodel.setMsg("已经是最后一页");
            return  resultmodel;
        }

        resultmodel.setData(list);
        return  resultmodel;
    }
}
