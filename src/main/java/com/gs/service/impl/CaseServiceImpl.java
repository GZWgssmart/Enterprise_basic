package com.gs.service.impl;

import com.gs.bean.Case;
import com.gs.common.bean.Pager;
import com.gs.service.CaseService;

import java.util.List;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public class CaseServiceImpl implements CaseService {

    private CaseService caseImpl;

    public CaseServiceImpl() {
        caseImpl = new CaseServiceImpl();
    }

    public void add(Case aCase) {
        caseImpl.add(aCase);
    }

    public void update(Case aCase) {
        caseImpl.update(aCase);
    }

    public void remove(Integer integer) {
        caseImpl.remove(integer);
    }

    public Case queryById(Integer integer) {
        return caseImpl.queryById(integer);
    }

    public List<Case> queryAll() {
        return null;
    }

    public List<Case> queryByPager(Pager<Case> pager) {
        return caseImpl.queryByPager(pager);
    }

    public int count() {
        return caseImpl.count();
    }
}
