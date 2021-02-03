package com.atguigu.dao;

import com.atguigu.pojo.TravelGroup;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface TravelGroupDao {
    //添加跟团游
    void add(TravelGroup travelGroup);
    //设置跟团游相关联的自由行
    void setTravelGroupAndTravelItem(Map<String, Integer> map);
    //跟团游分页
    Page<TravelGroup> findPage(String queryString);
    //根据跟团游id查找数据
    TravelGroup findById(Integer id);
    //查找跟团游相关的自由行数据
    List<Integer> findTravelItemIdByTravelgroupId(Integer id);
    //删除跟团游和自由行关联表中的数据
    void deleteTravelGroupAndTravelItemByTravelGroupId(Integer id);
    //修改跟团游
    void edit(TravelGroup travelGroup);

    //删除跟团游
    void deleteById(Integer id);
    //统计某一个跟团游的相关自由行
    long findCountByTravelGroupId(Integer id);
    //查询所有的跟团游
    List<TravelGroup> findAll();


}
