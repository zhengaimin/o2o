package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author Lenovo
 * 日期: 2018-09-07
 * 时间: 15:36
 */
public class WechatAuth {

    /**
     * ID
     */
    private Long wechatAuthId ;

    /**
     * 微信openid
     */
    private String openId ;

    /**
     * 创建时间
     */
    private Date createTime ;

    /**
     * 用户信息, 用户Id和本地账号关联
     */
    private PersonInfo personInfo ;

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public void setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
