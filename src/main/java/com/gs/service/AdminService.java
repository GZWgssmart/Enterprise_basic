package com.gs.service;

import com.gs.bean.Admin;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public interface AdminService extends BaseService<Integer, Admin> {

    public void updatePwd(Integer pk, String pwd);

    public Admin queryByNamePwd(String name,String pwd);
}
