package com.gs.service.impl;

import com.gs.bean.Admin;
import com.gs.common.bean.Pager;
import com.gs.dao.AdminDAO;
import com.gs.dao.impl.AdminDAOImpl;
import com.gs.service.AdminService;

import java.util.List;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public class AdminServiceImpl implements AdminService {

    private AdminDAO adminDAO;

    public AdminServiceImpl() {
        adminDAO = new AdminDAOImpl();
    }

    public void updatePwd(Integer pk, String pwd) {
        adminDAO.updatePwd(pk, pwd);
    }

    public Admin queryByNamePwd(String name, String pwd) {
        return adminDAO.queryByNamePwd(name,pwd);
    }

    public void add(Admin admin) {

    }

    public void update(Admin admin) {

    }

    public void remove(Integer integer) {

    }

    public Admin queryById(Integer integer) {
        return null;
    }

    public List<Admin> queryAll() {
        return null;
    }

    public List<Admin> queryByPager(Pager<Admin> pager) {
        return null;
    }

    public int count() {
        return 0;
    }
}
