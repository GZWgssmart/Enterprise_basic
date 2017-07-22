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
        if (method.equals("comreg")) { // 公司注册
            showComregPage(req, resp);
        } else if(method.equals("sort_out")) {  // 乱账整理
            showSortOutPage(req,resp);
        } else if(method.equals("bookkeep")) { // 代理记账
            showBookkepingPage(req,resp);
        } else if(method.equals("com_change")) { // 企业变更
            showComChangePage(req,resp);
        } else if(method.equals("com_cancal")) { // 公司注销
            showComCancalPage(req,resp);
        } else if(method.equals("license")) { // 食品流通许可证
            showLicensePage(req,resp);
        } else if(method.equals("service_permit")) { // 餐饮服务许可证
            showServicePermitPage(req,resp);
        } else if(method.equals("recognition")) { // 进口权认定
            showRecognitionPage(req,resp);
        } else if(method.equals("identified")) { // 一般纳税人认定
            showIdentifiedPage(req,resp);
        } else if(method.equals("trademark_reg")) { // 商标注册
            showTrademarkRegPage(req,resp);
        }
    }

    /**
     * 乱账整理
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showSortOutPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException  {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "sort_out");
        req.getRequestDispatcher("/WEB-INF/views/service/account_sort_out.jsp").forward(req, resp);
    }

    /**
     * 公司注册
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showComregPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "comreg");
        req.getRequestDispatcher("/WEB-INF/views/service/comreg.jsp").forward(req, resp);
    }

    /**
     * 代理记账
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showBookkepingPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException  {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "bookkeep");
        req.getRequestDispatcher("/WEB-INF/views/service/bookkeeping.jsp").forward(req, resp);
    }

    /**
     * 企业变更
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showComChangePage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "com_change");
        req.getRequestDispatcher("/WEB-INF/views/service/business_change.jsp").forward(req, resp);
    }

    /**
     * 公司注销
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showComCancalPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException  {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "com_cancal");
        req.getRequestDispatcher("/WEB-INF/views/service/company_canceled.jsp").forward(req, resp);
    }

    /**
     * 食品流通许可证
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showLicensePage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "license");
        req.getRequestDispatcher("/WEB-INF/views/service/food_distribution_license.jsp").forward(req, resp);
    }

    /**
     *  餐饮服务许可证
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showServicePermitPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException  {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "service_permit");
        req.getRequestDispatcher("/WEB-INF/views/service/food_service_permit.jsp").forward(req, resp);
    }

    /**
     * 进口权认定
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showRecognitionPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "recognition");
        req.getRequestDispatcher("/WEB-INF/views/service/import_rights_recognition.jsp").forward(req, resp);
    }

    /**
     * 一般纳税人认定
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showIdentifiedPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException  {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "identified");
        req.getRequestDispatcher("/WEB-INF/views/service/taxpayer_identified.jsp").forward(req, resp);
    }

    /**
     * 商标注册
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void showTrademarkRegPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURRENT_SERVICE_PAGE, "trademark_reg");
        req.getRequestDispatcher("/WEB-INF/views/service/trademark_reg.jsp").forward(req, resp);
    }

}
