package com.atguigu.dao;

import com.atguigu.entity.PageResult;
import com.atguigu.pojo.TravelItem;
import com.github.pagehelper.Page;

import java.util.List;

public interface TravelItemDao {
    //添加
    void add(TravelItem travelItem);
    //分页查询
    Page<TravelItem> findPage(String queryString);
    //删除
    void deleteById(Integer id);
    //查找删除的idk在关联表中是否存在
    long findCountByTravelItemId(Integer id);
    //删除关联表中的关联记录
    void deleteRelationTravelItemId(Integer id);

    TravelItem findById(Integer id);

    void edit(TravelItem travelItem);

    List<TravelItem> findAll();
}
