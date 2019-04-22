package com.hiveview.enums;

/**
 * Created by gonglixun on 2017/6/2.
 */
public enum CategoryEnum {

    //顾问、需求、产品
    GW_FL("法律服务",260,226,3),
    GW_JR("金融服务",261,227,2),
    GW_PP("品牌。营销。软件",263,null,1),
    GW_QY("企业主高端定制",264,null,null),
    GW_GS("工商 商标 专利",266,228,1);


    CategoryEnum(String cName,int code, Integer nCode,Integer pCode) {
        this.code=code;
        this.nCode=nCode;
        this.pCode=pCode;
    }

    private Integer code;
    private Integer nCode;
    private Integer pCode;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getnCode() {
        return nCode;
    }

    public void setnCode(Integer nCode) {
        this.nCode = nCode;
    }

    public Integer getpCode() {
        return pCode;
    }

    public void setpCode(Integer pCode) {
        this.pCode = pCode;
    }
}
