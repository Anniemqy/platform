package com.hiveview.entity;

import java.util.Date;
import java.util.List;

public class Category {
    private Long id;

    private String name;

    private String fullName;

    private Integer level;

    private Long oneLevel;

    private Long twoLevel;

    private Long threeLevel;

    private Date updateTime;

    private Date addTime;

    private Integer type;

    private Integer status;

    private String attribute;

    private String code;

    private String parentCode;

    private String parentId;

    private String content;

    private String oldName;//修改类目名称需要

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    private List<Attribute> attributes;

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getOneLevel() {
        return oneLevel;
    }

    public void setOneLevel(Long oneLevel) {
        this.oneLevel = oneLevel;
    }

    public Long getTwoLevel() {
        return twoLevel;
    }

    public void setTwoLevel(Long twoLevel) {
        this.twoLevel = twoLevel;
    }

    public Long getThreeLevel() {
        return threeLevel;
    }

    public void setThreeLevel(Long threeLevel) {
        this.threeLevel = threeLevel;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}