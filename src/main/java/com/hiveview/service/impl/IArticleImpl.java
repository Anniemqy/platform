package com.hiveview.service.impl;

import com.hiveview.dao.IArticleDao;
import com.hiveview.entity.Article;
import com.hiveview.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
@Service
public class IArticleImpl implements IArticleService {

    @Autowired
    private IArticleDao articleDao;


    @Override
    public List<Article> getArticleList(Article article) {
        return articleDao.getList(article);
    }

    @Override
    public void saveArticle(Article article) {
         articleDao.insertSelective(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateByPrimaryKeySelective(article);
    }

    @Override
    public Article getArticleById(long articleId) {
        return articleDao.selectByPrimaryKey(articleId);
    }

    @Override
    public void addPageView(long articleId) {
        articleDao.addPageView(articleId);
    }

    @Override
    public List<Article> getRecommendList(Article article) {
        return articleDao.getRecommendList(article);
    }
}
