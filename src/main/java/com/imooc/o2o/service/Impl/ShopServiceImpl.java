package com.imooc.o2o.service.Impl;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * @author 郑爱民
 * 日期: 2018-09-12
 * 时间: 19:12
 */
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao ;

    @Override
    public ShopExecution addShop(Shop shop, File shopImg) {
        if (shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP) ;
        }

        try {

        } catch () {


        }
        return null;
    }

}
