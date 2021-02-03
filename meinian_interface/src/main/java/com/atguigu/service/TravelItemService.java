package com.atguigu.service;

import com.atguigu.entity.PageResult;
import com.atguigu.pojo.TravelItem;

import java.util.List;

public interface TravelItemService {
    void add(TravelItem travelItem);
    PageResult findPage(Integer currentPage,Integer pageSize,String queryString);
    void deleteById(Integer id);

    //查找要编辑的id数据
    TravelItem findById(Integer id);
    //编辑
    void edit(TravelItem travelItem);

    //查询所有自由行TravelItem数据
    List<TravelItem> findAll();
}
