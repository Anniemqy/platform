package com.hiveview.service.impl;

import com.hiveview.dao.ICategoryDao;
import com.hiveview.dao.IClassAttributeDao;
import com.hiveview.entity.Attribute;
import com.hiveview.entity.Category;
import com.hiveview.entity.LevelCategoriesDto;
import com.hiveview.service.ICategoryService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.LevelUtil;
import utils.log.LogMgr;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by hxq on 2017/3/13.
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;
    @Autowired
    private IClassAttributeDao classAttributeDao;


    @Override
    public List<Category> getCategory(Category category) {
        return categoryDao.getList(category);
    }

    @Override
    public List<Category> getSonCategory(long parentId) {
        return categoryDao.getSonCategory(parentId);
    }

    @Override
    public List<Category> getCategoryList(Category category) {
        return categoryDao.getList(category);
    }

    @Override
    public Category getCategoryById(Long classId) {
        return categoryDao.selectByPrimaryKey(classId);
    }

    @Override
    public List<Attribute> getCategoryAttribute(long categoryId) {
        Attribute attribute = new Attribute();
        attribute.setClassId(categoryId);
        return classAttributeDao.getList(attribute);
    }

    @Override
    public int updateCategory(Category category) {
        return categoryDao.updateByPrimaryKeySelective(category);
    }
    @Override
    public int updateByCode(Category category) {
        return categoryDao.updateByCode(category);
    }

    @Override
    public int deleteCategoryByCode(String code) {
        return categoryDao.deleteCategoryByCode(code);
    }

    @Override
    public void batchDelete(List<Long> ids) {
         categoryDao.batchDelete(ids);
    }

    @Override
    public Category getCategoryAndAttr(long id) {
        Category category = new Category();
        category.setId(id);
        List<Category> categories = categoryDao.getCategoryAndAttr(category);
        Category result = Optional.ofNullable(categories).filter(c -> c.size() > 0).map(c1 -> c1.get(0)).orElse(null);
        return result;
    }

    @Override
    public void updateCategoryAndAttr(Category category) {
        String oldName = category.getOldName();
        String name = category.getName();
        if (!oldName.equals(name)) {
            String newFullName = null;
            String[] strs = category.getFullName().split("-");
            if (category.getLevel() == 2) {
                newFullName = strs[0] + "-" + name;
                categoryDao.updateSecondLevelOfSonCategoryFullName(category);
            }
            if (category.getLevel() == 3) {
                newFullName = strs[0]+"-"+ strs[1] +"-" + name;
            }
            category.setFullName(newFullName);
        }
        categoryDao.updateByPrimaryKeySelective(category);
        List<Attribute> attrs = category.getAttributes();
        Long categoryId = category.getId();
        if (categoryId != null) {
            classAttributeDao.deleteByClassId(categoryId);
            if (CollectionUtils.isNotEmpty(attrs)) {
                List<Attribute> isNoNullData = attrs.stream().filter(attribute -> StringUtils.isNotEmpty(attribute.getName())).collect(Collectors.toList());
                if (CollectionUtils.isNotEmpty(isNoNullData)) {
                    classAttributeDao.batchSaveAttr(isNoNullData);
                }
            }
        }
    }

    @Override
    public void saveCategory(Category category) {
        category.setAddTime(new Date());
        categoryDao.insertSelective(category);
        String code;
        if (category.getLevel() == LevelUtil.ONE_LEVEL.getVal()) {
            code = category.getId() + "-";
        } else {
            code = category.getParentCode()+category.getId() + "-";
        }
        category.setCode(code);
        categoryDao.updateByPrimaryKeySelective(category);
    }

    @Override
    public Category getCategoryByCode(String classCode) {
        Category category = new Category();
        category.setCode(classCode);
        return categoryDao.get(category);
    }

    @Override
    public Category getCategoryByIdAndType(Long categoryId, int type) {
        Category category = new Category();
        category.setId(categoryId);
        category.setType(type);
        return categoryDao.get(category);
    }

    @Override
    public boolean checkCategoryNameRepetition(String name, Integer type) {
        int count = categoryDao.checkCategoryNameRepetition(name, type);
        return count >0?true:false;
    }

    @Override
    public boolean updateSecondLevelOfSonCategoryFullName(Category category) {
        boolean isSuccess = false;
        try {
            if (category.getLevel() == 2) {
                category.setName("-" + category.getName() + "-");
                category.setOldName("-" + category.getOldName() + "-");
            }
            categoryDao.updateSecondLevelOfSonCategoryFullName(category);
            isSuccess = true;
        } catch (Exception e) {
            LogMgr.writeErrorLog(e);
        }
        return isSuccess;
    }


    @Override
    public LevelCategoriesDto getLevelCategory(String categoryCode,int type) {
        LevelCategoriesDto levelCategoriesDto = new LevelCategoriesDto();
        Category category = new Category();
        category.setLevel(LevelUtil.ONE_LEVEL.getVal());
        category.setType(type);
        List<Category> oneLevelCategories = this.getCategory(category);
        levelCategoriesDto.setOneLevelCategories(oneLevelCategories);
        if (StringUtils.isNotEmpty(categoryCode)) {
            String[] codes = categoryCode.split("-");
            Category param = new Category();
            param.setType(type);
            if (codes.length > 1) {
                String oneLevelCategoryCode = codes[0] + "-";
                param.setCode(oneLevelCategoryCode);
                param.setLevel(LevelUtil.TWO_LEVEL.getVal());
                List<Category> twoLevelCategories = this.getCategoryList(param);
                levelCategoriesDto.setTwoLevelCategories(twoLevelCategories);
                if (codes.length > 2) {
                    String twoLevelCategoryCode = codes[0] + "-" + codes[1] + "-";
                    param.setCode(twoLevelCategoryCode);
                    param.setLevel(LevelUtil.THREE_LEVEL.getVal());
                    List<Category> threeLevelCategories = this.getCategoryList(param);
                    levelCategoriesDto.setThreeLevelCategories(threeLevelCategories);
                }
            }
        }
        return levelCategoriesDto;
    }

    @Override
    public List<Category> getListByCode(String code) {
        return categoryDao.getListByCode(code);
    }
}
