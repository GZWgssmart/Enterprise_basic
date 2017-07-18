package com.gs.dao;

import com.gs.bean.Admin;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public interface AdminDAO extends BaseDAO<Integer, Admin> {

    public void updatePwd(Integer pk, String pwd);

    public Admin queryByNamePwd(String name,String pwd);
}
