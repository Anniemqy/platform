package com.hiveview.entity;

import java.util.Date;

public class Company {
    private Long id;

    private String companyName;

    private String logo;

    private String summary;

    private Date addTime;

    private Long typeLinkId;

    private String address;

    private String introduce;

    private Date updateTime;

    private String code;
    
    private Integer membercount;
   
    private String areaCode;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getTypeLinkId() {
        return typeLinkId;
    }

    public void setTypeLinkId(Long typeLinkId) {
        this.typeLinkId = typeLinkId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
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

	public Integer getMembercount() {
		return membercount;
	}

	public void setMembercount(Integer membercount) {
		this.membercount = membercount;
	}


	
    
}