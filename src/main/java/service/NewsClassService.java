package service;

import common.ResultModel;
import domain.entity.NewsClass;
import dtomodel.NewsClassAddDto;
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
    ResultModel  UpdateNewsClass(NewsClass newsClass);
    @Transactional
    ResultModel  DeleteNewsClass(int newsclassid);
}
