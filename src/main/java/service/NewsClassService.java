package service;

import common.ResultModel;
import domain.entity.NewsClass;
import dtomodel.NewsClassAddDto;
import dtomodel.NewsClassUpdateDto;
import org.springframework.validation.BindingResult;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by admin on 2016/3/30.
 */
public interface NewsClassService {
    @Transactional
    ResultModel AddNewsClass(@Valid @NotNull NewsClassAddDto newsClass, BindingResult result);
    @Transactional
    ResultModel  UpdateNewsClass(NewsClassUpdateDto newsClassUpdateDto,BindingResult result);
    @Transactional
    ResultModel  DeleteNewsClass(int newsclassid);
    public  ResultModel GetModel(int id,BindingResult bindingResult);
}
