package com.hiveview.service;

import com.hiveview.entity.Company;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by hxq on 2017/3/13.
 */
public interface ICompanyService {

    /**
     * 获得公司名称
     * @param id
     * @return
     */
    public String getCompanyNameById(Long id);

    public List<Map<String,Object>> getCompanyByCompanyIds(Set<Long> set);

    /**
     *查询公司页面分页
     * @param company
     * @param start 开始数
     * @param count 查询数
     * @return
     */
    List<Company> getCompanyPage(Company company);

    int saveCompany(Company company);
    
    /**
     *  @功能:查询全部的公司信息倒序排序
     *  @作者:李文辉 
     *  @代号:ab
     *  @时间:2017年5月23日
     *  @return  
     */
    List<Company> queryCompanyList();

    
    /**
     *  @功能:通过公司名称查询公司
     *  @作者:李文辉 
     *  @代号:ab
     *  @时间:2017年5月23日
     *  @return  
     */
    List<Company> queryCompanyListByName(String name);

    
    
    /**
     *  @功能:根据id查询一个公司
     *  @作者:李文辉 
     *  @代号:ab
     *  @时间:2017年5月23日
     *  @param id
     *  @return  
     */
    Company selectByPrimaryKey(Long id);
    
    /**
     *  @功能:修改公司信息
     *  @作者:李文辉 
     *  @代号:ab
     *  @时间:2017年5月23日
     *  @param record
     *  @return  
     */
    int updateByPrimaryKeySelective(Company record);
}
