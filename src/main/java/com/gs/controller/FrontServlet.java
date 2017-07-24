package com.gs.controller;

import com.gs.common.CommonMethod;
import com.gs.common.Constants;
import com.gs.common.WebUtil;
import com.gs.service.impl.CaseServiceImpl;
import com.gs.service.impl.NewsServiceImpl;

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

    private NewsServiceImpl newsServiceImpl;
    private CaseServiceImpl caseServiceImpl;

    public FrontServlet() {
        newsServiceImpl = new NewsServiceImpl();
        caseServiceImpl = new CaseServiceImpl();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String method = WebUtil.getReqMethod(req);
        if (method.equals("index")) {
            showIndexPage(req, resp);
        } else if (method.equals("about")) {
            showAboutPage(req, resp);
        } else if (method.equals("service")) {
            showServicePage(req, resp);
        } else if (method.equals("contact")) {
            showContactPage(req, resp);
        }
    }

    private void showIndexPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        CommonMethod.newsListCommon(req,resp,newsServiceImpl);
        CommonMethod.caseListCommon(req,resp,caseServiceImpl);
        req.setAttribute(Constants.CURRENT_PAGE, "index");
        req.getRequestDispatcher("/WEB-INF/views/front/index.jsp").forward(req, resp);
    }

    private void showContactPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_PAGE, "contact");
        req.getRequestDispatcher("/WEB-INF/views/front/contact.jsp").forward(req, resp);
    }

    private void showServicePage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_PAGE, "service");
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "comreg");
        req.getRequestDispatcher("/WEB-INF/views/front/services.jsp").forward(req, resp);
    }

    private void showAboutPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_PAGE, "about");
        req.getRequestDispatcher("/WEB-INF/views/front/about.jsp").forward(req, resp);
    }
}
