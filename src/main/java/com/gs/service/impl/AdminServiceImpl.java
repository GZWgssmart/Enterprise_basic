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

    private AdminDAO adminImpl;

    public AdminServiceImpl() {
        adminImpl = new AdminDAOImpl();
    }

    public void updatePwd(Integer pk, String pwd) {
        adminImpl.updatePwd(pk, pwd);
    }

    public Admin queryByNamePwd(String name, String pwd) {
        return adminImpl.queryByNamePwd(name,pwd);
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
