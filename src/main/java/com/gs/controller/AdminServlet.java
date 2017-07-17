package com.gs.controller;

import com.gs.common.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
@WebServlet(name = "AdminServlet", urlPatterns = "/admin/*")
public class AdminServlet extends HttpServlet {

    private static final long serialVersionUID = 4186956681993096312L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = WebUtil.getReqMethod(req);
        if (method.equals("update_page")) {
            showUpdatePage(req, resp);
        } else if (method.equals("update_pwd")) {
            updatePwd(req, resp);
        } else if (method.equals("login_page")) {
            showLoginPage(req, resp);
        } else if (method.equals("login")) {
            login(req, resp);
        } else if (method.equals("logout")) {
            logout(req, resp);
        }
    }

    private void logout(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showLoginPage(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void updatePwd(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showUpdatePage(HttpServletRequest req, HttpServletResponse resp) {
    }
}
