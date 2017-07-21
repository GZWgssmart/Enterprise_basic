package com.gs.service.impl;

import com.gs.bean.Case;
import com.gs.common.bean.Pager;
import com.gs.dao.CaseDAO;
import com.gs.dao.impl.CaseDAOImpl;
import com.gs.service.CaseService;

import java.util.List;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public class CaseServiceImpl implements CaseService {

    private CaseDAO caseDAO;

    public CaseServiceImpl() {
        caseDAO = new CaseDAOImpl();
    }

    public void add(Case aCase) {
        caseDAO.add(aCase);
    }

    public void update(Case aCase) {
        caseDAO.update(aCase);
    }

    public void remove(Integer integer) {
        caseDAO.remove(integer);
    }

    public Case queryById(Integer integer) {
        return caseDAO.queryById(integer);
    }

    public List<Case> queryAll() {
        return null;
    }

    public List<Case> queryByPager(Pager<Case> pager) {
        return caseDAO.queryByPager(pager);
    }

    public int count() {
        return caseDAO.count();
    }
}
