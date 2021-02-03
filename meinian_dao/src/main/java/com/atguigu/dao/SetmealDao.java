package com.atguigu.dao;

import com.atguigu.pojo.Setmeal;
import com.github.pagehelper.Page;

import java.util.Map;

public interface SetmealDao {
    void add(Setmeal setmeal);
    void setSetmealAndTravelGroup(Map<String, Integer> map);

    Page<Setmeal> findPage(String queryString);
}
