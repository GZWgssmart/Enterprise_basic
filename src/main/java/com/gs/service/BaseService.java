package com.gs.service;

import com.gs.common.bean.Pager;

import java.util.List;

/**
 * Created by Wang Genshen on 2017-07-04.
 */
public interface BaseService<PK, T> {
    public void add(T t);
    public void update(T t);
    public void remove(PK pk);
    public T queryById(PK pk);
    public List<T> queryAll();
    public List<T> queryByPager(Pager<T> pager);
    public int count();
}
