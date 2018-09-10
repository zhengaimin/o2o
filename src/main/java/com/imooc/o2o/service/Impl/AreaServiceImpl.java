package com.imooc.o2o.service.Impl;

import com.imooc.o2o.dao.AreaDao;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 郑爱民
 * 日期: 2018-09-10
 * 时间: 10:14
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao ;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryList();
    }
}
