package com.imooc.o2o.service;

import com.imooc.o2o.BestTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 郑爱民
 * 日期: 2018-09-10
 * 时间: 10:17
 */
public class AreaServiceTest extends BestTest {

    @Autowired
    private AreaService areaService ;

    @Test
    public void getAreaList() {
        List<Area> areaList = areaService.getAreaList();
        assertEquals("西苑",areaList.get(0).getAreaName()); ;
    }
}