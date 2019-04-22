package com.hiveview.service;

import com.hiveview.entity.Article;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
public interface IArticleService {

    List<Article> getArticleList(Article article);

    void saveArticle(Article article);


    void updateArticle(Article article);

    Article getArticleById(long articleId);

    /**
     * 添加浏览量
     * @param articleId
     */
    void addPageView(long articleId);

    List<Article> getRecommendList(Article article);
}
