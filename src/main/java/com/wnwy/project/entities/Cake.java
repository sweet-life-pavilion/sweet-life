package com.wnwy.project.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * 蛋糕实体
 */
public class Cake implements Serializable {
    private Integer cakeId;//蛋糕编号

    private Integer cakeInfoId;//蛋糕详情编号

    private String cakeName;//蛋糕名字

    private Integer tasteId;//口味编号

    private Integer classId;//蛋糕分类编号

    private Double price;//蛋糕价格、默认为一磅的

    private String imageUrl;//图片路径

    private String description;//蛋糕描述

    private Integer payAmount;//总购买数

    private Integer isHot;//是否热门 0:No 1：yes

    private Date createDate;//创建时间

    private static final long serialVersionUID = 1L;

    public Integer getCakeId() {
        return cakeId;
    }

    public void setCakeId(Integer cakeId) {
        this.cakeId = cakeId;
    }

    public Integer getCakeInfoId() {
        return cakeInfoId;
    }

    public void setCakeInfoId(Integer cakeInfoId) {
        this.cakeInfoId = cakeInfoId;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName == null ? null : cakeName.trim();
    }

    public Integer getTasteId() {
        return tasteId;
    }

    public void setTasteId(Integer tasteId) {
        this.tasteId = tasteId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}