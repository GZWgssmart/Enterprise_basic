package com.gs.common;

import com.gs.bean.Case;
import com.gs.bean.News;
import com.gs.common.bean.Pager;
import com.gs.service.impl.CaseServiceImpl;
import com.gs.service.impl.NewsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 7025 on 2017/7/24.
 */
public class CommonMethod {
    /**
     * 案例详情的通用方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public static void caseDetailCommon(HttpServletRequest req, HttpServletResponse resp, CaseServiceImpl caseServiceImpl)
            throws ServletException, IOException {
        String idStr = req.getParameter("id");
        if(idStr != null) {
            int id = Integer.valueOf(idStr);
            Case aCase = caseServiceImpl.queryById(id);
            req.setAttribute("aCase",aCase);
        }
    }

    /**
     * 案例分页的通用方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public static void caseListCommon(HttpServletRequest req, HttpServletResponse resp, CaseServiceImpl caseServiceImpl)
            throws ServletException, IOException  {
        int total = caseServiceImpl.count();
        int pageCount = total % Constants.PAGESIZE == 0 ? total / Constants.PAGESIZE : total / Constants.PAGESIZE + 1 ;// 总页数
        String pageStr = req.getParameter("page");
        int page = 1;
        if(pageStr != null) {
            page = Integer.valueOf(pageStr); // 当前页
            if(page <= 0) {
                page = 1;
            } else if(page > pageCount) {
                page = pageCount;
            }
        }
        Pager<Case> pager = new Pager<Case>();
        pager.setPageSize(Constants.PAGESIZE);
        pager.setPage(page);
        List<Case> caseList = caseServiceImpl.queryByPager(pager);
        pager.setResults(caseList);
        pager.setTotal(total);
        req.setAttribute("casePager",pager);
    }

    /**
     * 新闻详情的通用方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public static void newsDetailCommon(HttpServletRequest req, HttpServletResponse resp, NewsServiceImpl newsServiceImpl)
            throws ServletException, IOException {
        String idStr = req.getParameter("id");
        if(idStr != null) {
            int id = Integer.valueOf(idStr);
            News news = newsServiceImpl.queryById(id);
            req.setAttribute("news",news);
        }
    }

    /**
     *新闻分页的通用方法
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public static void newsListCommon(HttpServletRequest req, HttpServletResponse resp, NewsServiceImpl newsServiceImpl)
            throws ServletException, IOException  {
        int total = newsServiceImpl.count();
        int pageCount = total % Constants.PAGESIZE == 0 ? total / Constants.PAGESIZE : total / Constants.PAGESIZE + 1 ;// 总页数
        String pageStr = req.getParameter("page");
        int page = 1;
        if(pageStr != null) {
            page = Integer.valueOf(pageStr); // 当前页
            if(page <= 0) {
                page = 1;
            } else if(page > pageCount) {
                page = pageCount;
            }
        }
        Pager<News> pager = new Pager<News>();
        pager.setPageSize(Constants.PAGESIZE);
        pager.setPage(page);
        List<News> caseList = newsServiceImpl.queryByPager(pager);
        pager.setResults(caseList);
        pager.setTotal(total);
        req.setAttribute("newsPager",pager);
    }
}
