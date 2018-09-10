package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

/**
 * @author 郑爱民
 * 日期: 2018-09-10
 * 时间: 16:58
 */
public interface ShopDao {

    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop) ;

    /**
     * 更新店铺信息
     * @param shop
     * @return
     */
    int updateShop(Shop shop) ;


}
