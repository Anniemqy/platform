package com.hiveview.dao;

import com.hiveview.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICategoryDao extends  IBaseDao<Category>{
    int deleteByPrimaryKey(Long id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> getList(Category category);

    List<Category> getSonCategory(long parentId);

    /* 只查少部分内容 */
    List<Category> getListByCode(String code);

    int deleteCategoryByCode(String code);

    int batchDelete(List<Long> ids);

    List<Category> getCategoryAndAttr(Category category);

    int updateByCode(Category category);

    /**
     * 检查类目名称是否重复个数
     * @param name
     * @param type
     * @return
     */
    int checkCategoryNameRepetition(@Param("name") String name, @Param("type") Integer type);

    /**
     * 修改二级的子类目全称
     * @return
     */
    int updateSecondLevelOfSonCategoryFullName(Category category);
}