package service;

import common.ResultModel;
import dtomodel.DeleteDto;
import dtomodel.NewsAddDto;
import dtomodel.NewsUpdateDto;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by admin on 2016/3/30.
 */

public interface NewsService {
    @Transactional
    public ResultModel AddNews(@Valid @NotNull NewsAddDto dto, BindingResult bindingResult);
    @Transactional
    public  ResultModel UpdateEntity(@Valid @NotNull NewsUpdateDto dto,BindingResult bindingResult);
    @Transactional
    public  ResultModel DeleteNews(@Valid @NotNull DeleteDto dto,BindingResult bindingResult);
    public ResultModel GetModel(int id);

}
