package com.atguigu.service;

import com.atguigu.entity.PageResult;
import com.atguigu.pojo.Setmeal;

public interface SetmealService {
    public void add(Setmeal setmeal, Integer[] travelgroupIds);
    PageResult findPage(Integer currentPage, Integer pageSize, String queryString);
}
