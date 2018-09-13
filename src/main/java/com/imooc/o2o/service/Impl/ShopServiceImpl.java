package com.imooc.o2o.service.Impl;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.exceptions.ShopOperationException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.utils.ImageUtil;
import com.imooc.o2o.utils.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

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
    public ShopExecution addShop(Shop shop, CommonsMultipartFile shopImg) {
        //控制判断 店铺
        if (shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP) ;
        }

        try {
            //初始化
            shop.setEnableStatus(0);
            //添加店铺信息
            int effectedNum = shopDao.insertShop(shop) ;
            if (effectedNum <= 0) {
                throw new ShopOperationException("店铺创建失败") ;
            }else {
                if (shopImg != null) {
                    try {
                        //存储图片
                        addShopImg(shop, shopImg) ;
                    } catch (Exception e) {
                        throw new ShopOperationException("addShopImg error:" + e.getMessage()) ;
                    }
                    //更新店铺的图片地址
                    effectedNum = shopDao.updateShop(shop);
                    if (effectedNum <= 0) {
                        throw new ShopOperationException("更新图片失败") ;
                    }
                }
            }

        } catch (Exception e) {
            throw new ShopOperationException("addShop err:" + e.getMessage()) ;
        }
        return new ShopExecution(ShopStateEnum.CHECK, shop);
    }

    /**
     * 添加商铺图片
     * @param shop
     * @param shopImg
     */
    private void addShopImg(Shop shop, CommonsMultipartFile shopImg) throws Exception{
        //获取shop图片目录的相对值路径
        String dest = PathUtil.getShopImagePath(shop.getShopId()) ;
        String shopImgAddr = ImageUtil.generateThumbnail(shopImg,dest) ;
        shop.setShopImg(shopImgAddr) ;
    }

}
