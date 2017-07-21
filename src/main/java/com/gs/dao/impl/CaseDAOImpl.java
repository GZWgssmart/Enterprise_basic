package com.gs.dao.impl;

import com.gs.bean.Case;
import com.gs.common.bean.Pager;
import com.gs.common.util.DateUtil;
import com.gs.dao.AbstractBaseDAO;
import com.gs.dao.CaseDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public class CaseDAOImpl extends AbstractBaseDAO implements CaseDAO {

    public void add(Case aCase) {
        getConnection();
        String sql = "insert into t_case(name,customer,content,image,created_time) values(?,?,?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, aCase.getName());
            preparedStatement.setString(2, aCase.getCustomer());
            preparedStatement.setString(3, aCase.getContent());
            preparedStatement.setString(4, aCase.getImage());
            preparedStatement.setDate(5, DateUtil.convert(Calendar.getInstance().getTime()));
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public void update(Case aCase) {
        getConnection();
        String sql = "update t_case set name=?,customer=?,content=?,image=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, aCase.getName());
            preparedStatement.setString(2, aCase.getCustomer());
            preparedStatement.setString(3, aCase.getContent());
            preparedStatement.setString(4, aCase.getImage());
            preparedStatement.setInt(5, aCase.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public void remove(Integer integer) {
        getConnection();
        String sql = "delect from t_case where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, integer);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public Case queryById(Integer integer) {
        getConnection();
        String sql = "select * from t_case where id = ?;";
        Case c = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, integer);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                c = new Case();
                c.setId(resultSet.getInt("id"));
                c.setName(resultSet.getString("name"));
                c.setCustomer(resultSet.getString("customer"));
                c.setContent(resultSet.getString("content"));
                c.setImage(resultSet.getString("image"));
                c.setCreatedTime(resultSet.getDate("created_time"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return c;
    }

    public List<Case> queryAll() {
        return null;
    }

    public List<Case> queryByPager(Pager<Case> pager) {
        getConnection();
        String sql = "select * from t_case order by created_time desc limit ?,?";
        List<Case> caseList = new ArrayList<Case>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pager.getBeginIndex());
            preparedStatement.setInt(2,pager.getPageSize());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Case c = new Case();
                c.setId(resultSet.getInt("id"));
                c.setName(resultSet.getString("name"));
                c.setCustomer(resultSet.getString("customer"));
                c.setContent(resultSet.getString("content"));
                c.setImage(resultSet.getString("image"));
                c.setCreatedTime(resultSet.getDate("created_time"));
                caseList.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return caseList;
    }

    public int count() {
        getConnection();
        String sql = "select count(id) from t_case";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return 0;
    }
}
