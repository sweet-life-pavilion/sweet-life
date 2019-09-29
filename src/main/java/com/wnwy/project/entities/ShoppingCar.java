package com.wnwy.project.entities;

import java.io.Serializable;

public class ShoppingCar implements Serializable {
    private Integer cId;

    private Integer cakeId;

    private Integer cakeInfoId;

    private Integer userId;

    private Integer sum;

    private static final long serialVersionUID = 1L;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}