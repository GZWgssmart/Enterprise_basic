package com.gs.controller;

import com.gs.common.Constants;
import com.gs.common.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Wang Genshen on 2017-07-21.
 */
@WebServlet(name = "ServiceServlet", urlPatterns = "/service/*")
public class ServiceServlet extends HttpServlet {

    private static final long serialVersionUID = 6089467806629297240L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = WebUtil.getReqMethod(req);
        if (method.equals("comreg")) {
            showComregPage(req, resp);
        }
    }

    private void showComregPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_PAGE, "service");
        req.getRequestDispatcher("/WEB-INF/views/service/comreg.jsp").forward(req, resp);
    }
}
