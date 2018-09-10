package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author Lenovo
 * 日期: 2018-09-07
 * 时间: 21:20
 */
public class ProductCategory {

    /**
     * 产品类别id
     */
    private Long productCategoryId ;

    /**
     * 商铺Id
     */
    private Long shopId ;

    /**
     * 产品类别名称
     */
    private String productCategoryName ;

    /**
     * 产品类别权重
     */
    private Integer priority ;

    /**
     * 创建时间
     */
    private Date createTime ;

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
