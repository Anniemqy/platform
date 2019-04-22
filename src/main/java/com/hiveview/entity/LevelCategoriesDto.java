package com.hiveview.entity;

import java.util.List;

/**
 * Created by hxq on 2017/7/6.
 */
public class LevelCategoriesDto {

    private List<Category> oneLevelCategories;

    private List<Category> twoLevelCategories;

    private List<Category> threeLevelCategories;

    public List<Category> getOneLevelCategories() {
        return oneLevelCategories;
    }

    public void setOneLevelCategories(List<Category> oneLevelCategories) {
        this.oneLevelCategories = oneLevelCategories;
    }

    public List<Category> getTwoLevelCategories() {
        return twoLevelCategories;
    }

    public void setTwoLevelCategories(List<Category> twoLevelCategories) {
        this.twoLevelCategories = twoLevelCategories;
    }

    public List<Category> getThreeLevelCategories() {
        return threeLevelCategories;
    }

    public void setThreeLevelCategories(List<Category> threeLevelCategories) {
        this.threeLevelCategories = threeLevelCategories;
    }
}
