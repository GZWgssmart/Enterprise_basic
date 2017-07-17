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
@WebServlet(name = "FrontServlet", urlPatterns = "/front/*")
public class FrontServlet extends HttpServlet {
    private static final long serialVersionUID = -7525261178354023288L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = WebUtil.getReqMethod(req);
        if (method.equals("about")) {
            showAboutPage(req, resp);
        } else if (method.equals("service")) {
            showServicePage(req, resp);
        } else if (method.equals("contact")) {
            showContactPage(req, resp);
        }
    }

    private void showContactPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/front/contact.jsp").forward(req, resp);
    }

    private void showServicePage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/front/services.jsp").forward(req, resp);
    }

    private void showAboutPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/front/about.jsp").forward(req, resp);
    }
}
