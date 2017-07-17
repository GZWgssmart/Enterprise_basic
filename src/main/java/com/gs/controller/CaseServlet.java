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
@WebServlet(name = "CaseServlet", urlPatterns = "/case/*")
public class CaseServlet extends HttpServlet {
    private static final long serialVersionUID = 2580077429082764753L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = WebUtil.getReqMethod(req);
        if (method.equals("add_page")) {
            showAddPage(req, resp);
        } else if (method.equals("edit_page")) {
            showEditPage(req, resp);
        } else if (method.equals("add")) {
            add(req, resp);
        } else if (method.equals("edit")) {
            edit(req, resp);
        } else if (method.equals("remove")) {
            remove(req, resp);
        } else if (method.equals("admin_list")) {
            adminList(req, resp);
        } else if (method.equals("admin_detail")) {
            adminDetail(req, resp);
        } else if (method.equals("list")) {
            list(req, resp);
        } else if (method.equals("detail")) {
            detail(req, resp);
        }
    }

    private void detail(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void list(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void adminDetail(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void adminList(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void remove(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showEditPage(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showAddPage(HttpServletRequest req, HttpServletResponse resp) {
    }

}