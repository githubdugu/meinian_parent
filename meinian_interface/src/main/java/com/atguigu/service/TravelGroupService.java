package com.atguigu.service;

import com.atguigu.entity.PageResult;
import com.atguigu.pojo.TravelGroup;
import com.atguigu.pojo.TravelItem;
import java.util.List;

public interface TravelGroupService {
    //跟团游添加
    void add(TravelGroup travelGroup, Integer[] travelItemIds);
    //跟团与分页查询
    PageResult findPage(Integer currentPage, Integer pageSize, String queryString);
    //查找相关id数据
    TravelGroup findById(Integer id);
    //跟团游编辑
    void edit(Integer[] travelItemIds, TravelGroup travelGroup);
    //根据跟团游id查找相关的自由行
    List<Integer> findTravelItemIdByTravelgroupId(Integer id);

    //删除
    void deleteById(Integer id);

    //查询所有的跟团游
    List<TravelGroup> findAll();
}
