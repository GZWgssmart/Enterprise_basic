package com.gs.dao.impl;

import com.gs.bean.News;
import com.gs.common.bean.Pager;
import com.gs.common.util.DateUtil;
import com.gs.dao.AbstractBaseDAO;
import com.gs.dao.NewsDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public class NewsDAOImpl extends AbstractBaseDAO implements NewsDAO {

    public void add(News news) {
        getConnection();
        String sql = "insert into t_news(title,abstracts,content,image,created_time) values(?,?,?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, news.getTitle());
            preparedStatement.setString(2, news.getAbstracts());
            preparedStatement.setString(3, news.getContent());
            preparedStatement.setString(4, news.getImage());
            preparedStatement.setDate(5, DateUtil.convert(Calendar.getInstance().getTime()));
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public void update(News news) {
        getConnection();
        String sql = "update t_news set title=?,abstracts=?,content=?,image=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, news.getTitle());
            preparedStatement.setString(2, news.getAbstracts());
            preparedStatement.setString(3, news.getContent());
            preparedStatement.setString(4, news.getImage());
            preparedStatement.setInt(5, news.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public void remove(Integer integer) {
        getConnection();
        String sql = "delect from t_news where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, integer);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
    }

    public News queryById(Integer integer) {
        getConnection();
        String sql = "select * from t_news where id = ?;";
        News n = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, integer);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                n = new News();
                n.setId(resultSet.getInt("id"));
                n.setTitle(resultSet.getString("title"));
                n.setAbstracts(resultSet.getString("abstracts"));
                n.setContent(resultSet.getString("content"));
                n.setImage(resultSet.getString("image"));
                n.setCreatedTime(resultSet.getDate("created_time"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return n;
    }

    public List<News> queryAll() {
        return null;
    }

    public List<News> queryByPager(Pager<News> pager) {
        getConnection();
        String sql = "select * from t_news order by created_time limit ?,? desc";
        List<News> newsList = new ArrayList<News>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pager.getBeginIndex());
            preparedStatement.setInt(2, pager.getPageSize());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                News n = new News();
                n.setId(resultSet.getInt("id"));
                n.setTitle(resultSet.getString("title"));
                n.setAbstracts(resultSet.getString("abstracts"));
                n.setContent(resultSet.getString("content"));
                n.setImage(resultSet.getString("image"));
                n.setCreatedTime(resultSet.getDate("created_time"));
                newsList.add(n);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        close();
        return newsList;
    }

    public int count() {
        getConnection();
        String sql = "select count(id) from t_news";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
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
