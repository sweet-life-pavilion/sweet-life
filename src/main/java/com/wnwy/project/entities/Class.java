package com.wnwy.project.entities;

import java.io.Serializable;

/**
 * mr.wang
 */
public class Class implements Serializable {
    private Integer classId;

    private String allClass;

    private static final long serialVersionUID = 1L;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getAllClass() {
        return allClass;
    }

    public void setAllClass(String allClass) {
        this.allClass = allClass == null ? null : allClass.trim();
    }
}