package com.gs.service.impl;

import com.gs.bean.News;
import com.gs.common.bean.Pager;
import com.gs.dao.NewsDAO;
import com.gs.dao.impl.NewsDAOImpl;
import com.gs.service.NewsService;

import java.util.List;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public class NewsServiceImpl implements NewsService {

    private NewsDAO newsDAO;

    public NewsServiceImpl() {
        newsDAO = new NewsDAOImpl();
    }

    public void add(News news) {
        newsDAO.add(news);
    }

    public void update(News news) {
        newsDAO.update(news);
    }

    public void remove(Integer integer) {
        newsDAO.remove(integer);
    }

    public News queryById(Integer integer) {
        return newsDAO.queryById(integer);
    }

    public List<News> queryAll() {
        return null;
    }

    public List<News> queryByPager(Pager<News> pager) {
        return newsDAO.queryByPager(pager);
    }

    public int count() {
        return newsDAO.count();
    }
}
