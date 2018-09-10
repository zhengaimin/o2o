package com.imooc.o2o.dao;

import com.imooc.o2o.BestTest;
import com.imooc.o2o.entity.Area;
import junit.runner.BaseTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Lenovo
 * 日期: 2018-09-09
 * 时间: 16:26
 */
public class AreaDaoTest extends BestTest {

    @Autowired
    private AreaDao areaDao ;

    @Test
    public void queryList() {
        List<Area> areaList = areaDao.queryList();
        Assert.assertEquals(2,areaList.size());
    }
}