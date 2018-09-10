package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Lenovo
 * 日期: 2018-09-09
 * 时间: 16:12
 */
public interface AreaDao {

    /**
     * 列出区域列表
     * @return areaList
     */
    List<Area> queryList() ;
}
