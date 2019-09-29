package com.wnwy.project.entities;

import java.io.Serializable;

public class Taste implements Serializable {
    private Integer tasteId;

    private String tasteName;

    private static final long serialVersionUID = 1L;

    public Integer getTasteId() {
        return tasteId;
    }

    public void setTasteId(Integer tasteId) {
        this.tasteId = tasteId;
    }

    public String getTasteName() {
        return tasteName;
    }

    public void setTasteName(String tasteName) {
        this.tasteName = tasteName == null ? null : tasteName.trim();
    }
}