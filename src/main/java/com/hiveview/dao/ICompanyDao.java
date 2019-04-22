package com.hiveview.dao;

import com.hiveview.entity.Company;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ICompanyDao extends IBaseDao<Company>{
    int deleteByPrimaryKey(Long id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

    /**
     * 公司查询分页
     * @param company
     * @param start
     * @param count
     * @return
     */
    List<Company> getCompanyPage(@Param("company") Company company, @Param("start") int start, @Param("count") int count);

    List<Company> getCompany(Company company);

    List<Map<String,Object>> getCompanyByCompanyIds(List<Long> list);
    
    
    /**
     *  @功能:查询全部的公司信息按时间倒序排列
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
    

}