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

    private NewsDAO newsImpl;

    public NewsServiceImpl() {
        newsImpl = new NewsDAOImpl();
    }

    public void add(News news) {
        newsImpl.add(news);
    }

    public void update(News news) {
        newsImpl.update(news);
    }

    public void remove(Integer integer) {
        newsImpl.remove(integer);
    }

    public News queryById(Integer integer) {
        return newsImpl.queryById(integer);
    }

    public List<News> queryAll() {
        return null;
    }

    public List<News> queryByPager(Pager<News> pager) {
        return newsImpl.queryByPager(pager);
    }

    public int count() {
        return newsImpl.count();
    }
}
