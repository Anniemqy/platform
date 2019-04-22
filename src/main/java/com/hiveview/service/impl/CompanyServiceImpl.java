package com.hiveview.service.impl;

import com.hiveview.dao.ICompanyDao;
import com.hiveview.entity.Company;
import com.hiveview.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by hxq on 2017/3/13.
 */
@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private ICompanyDao companyDao;

    @Override
    public String getCompanyNameById(Long id) {
        Company company = companyDao.selectByPrimaryKey(id);
        return company.getCompanyName();
    }
    public List<Map<String,Object>> getCompanyByCompanyIds(Set<Long> set){
        List<Long> list  = new ArrayList<Long>();
        for (Long l: set) {
            list.add(l);
        }
        return companyDao.getCompanyByCompanyIds(list);
    }
    @Override
    public int saveCompany(Company company) {
        return companyDao.insert(company);
    }

    @Override
    public List<Company> getCompanyPage(Company company) {

        return companyDao.getCompany(company);
    }
	@Override
	public List<Company> queryCompanyList() {
		
		return companyDao.queryCompanyList();
	}
	@Override
	public List<Company> queryCompanyListByName(String name) {
		return companyDao.queryCompanyListByName(name);
	}
	@Override
	public Company selectByPrimaryKey(Long id) {
		
		return companyDao.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(Company record) {
		
		return companyDao.updateByPrimaryKeySelective(record);
	}
}
