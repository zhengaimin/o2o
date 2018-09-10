package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author Lenovo
 * 日期: 2018-09-07
 * 时间: 20:59
 */
public class Shop {

    /**
     * 店铺ID
     */
    private Long shopId ;

    /**
     * 店铺姓名
     */
    private String shopName ;

    /**
     * 店铺描述
     */
    private String shopDesc ;

    /**
     * 店铺地址
     */
    private String shopAddr ;

    /**
     * 联系电话
     */
    private String phone ;

    /**
     * 店铺图片
     */
    private String shopImg ;

    /**
     * 店铺权重
     */
    private Integer priority ;

    /**
     * 创建时间
     */
    private Date createTime ;

    /**
     * 修改时间
     */
    private Date lastEditTime ;

    /**
     * 店铺状态 -1.不可用 0.审核中 1.可用
     */
    private Integer enableStatus ;

    /**
     * 超级管理员给店家的提醒
     */
    private String advice ;

    /**
     * 区域实体类 区域id
     */
    private Area area ;

    /**
     * 用户信息实体类  用户id
     */
    private PersonInfo owner ;

    /**
     * 店铺类别实体类  类别Id
     */
    private ShopCategory shopCategory ;
}
