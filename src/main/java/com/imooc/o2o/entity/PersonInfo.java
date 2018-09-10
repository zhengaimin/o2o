package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author Lenovo
 * 日期: 2018-09-07
 * 时间: 15:09
 */
public class PersonInfo {

    /**
     * ID
     */
    private Long userId ;

    /**
     * 名称
     */
    private String name ;

    /**
     * 头像
     */
    private String profileImg ;

    /**
     * 邮箱
     */
    private String email ;

    /**
     * 性别
     */
    private String gender ;

    /**
     * 启用状态 0.禁止使用本商城   1.允许使用本商城
     */
    private Integer enableStatus ;

    /**
     * 身份标志 1.顾客    2.店家    3.超级管理员
     */
    private Integer userType ;

    /**
     * 创建时间
     */
    private Date createTime ;

    /**
     * 修改时间
     */
    private Date lastEditTime ;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
