package com.wnwy.project.entities;

import java.io.Serializable;

/**
 * 蛋糕详情
 * mr.wang
 */
public class CakeInfo implements Serializable {
    private Integer cakeInfoId;//蛋糕详情id

    private String pound;//榜

    private String size;//尺寸

    private String number;//食用人数

    private String tableware;//参数数量

    private String imgSize;//图片尺寸

    private static final long serialVersionUID = 1L;

    public Integer getCakeInfoId() {
        return cakeInfoId;
    }

    public void setCakeInfoId(Integer cakeInfoId) {
        this.cakeInfoId = cakeInfoId;
    }

    public String getPound() {
        return pound;
    }

    public void setPound(String pound) {
        this.pound = pound == null ? null : pound.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getTableware() {
        return tableware;
    }

    public void setTableware(String tableware) {
        this.tableware = tableware == null ? null : tableware.trim();
    }

    public String getImgSize() {
        return imgSize;
    }

    public void setImgSize(String imgSize) {
        this.imgSize = imgSize == null ? null : imgSize.trim();
    }
}