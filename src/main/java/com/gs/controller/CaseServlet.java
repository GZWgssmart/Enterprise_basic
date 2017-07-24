package com.gs.controller;

import com.alibaba.fastjson.JSON;
import com.gs.bean.Admin;
import com.gs.bean.Case;
import com.gs.common.CommonMethod;
import com.gs.common.Constants;
import com.gs.common.WebUtil;
import com.gs.common.util.FileUtil;
import com.gs.service.CaseService;
import com.gs.service.impl.CaseServiceImpl;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
@WebServlet(name = "CaseServlet", urlPatterns = "/case/*")
public class CaseServlet extends HttpServlet {
    private static final long serialVersionUID = 2580077429082764753L;

    private CaseService caseServiceImpl;

    public CaseServlet() {
        caseServiceImpl = new CaseServiceImpl();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String method = WebUtil.getReqMethod(req);
        if (method.equals("list")) {
            list(req, resp);
        } else if (method.equals("detail")) {
            detail(req, resp);
        } else {
            HttpSession session = req.getSession();
            Admin adm = (Admin) session.getAttribute("admin");
            if (adm == null) {
                resp.sendRedirect("../front/index");
            } else {
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
                }
            }
        }
    }

    /**
     * 案例详情
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    private void detail(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        CommonMethod.caseDetailCommon(req,resp,caseServiceImpl);
        req.getRequestDispatcher("/WEB-INF/views/front/case.jsp").forward(req, resp);
    }

    private void list(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        CommonMethod.caseListCommon(req,resp,caseServiceImpl);
        req.setAttribute(Constants.CURRENT_PAGE, "case");
        req.getRequestDispatcher("/WEB-INF/views/front/case_list.jsp").forward(req, resp);
    }

    private void adminDetail(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        CommonMethod.caseDetailCommon(req,resp,caseServiceImpl);
        req.setAttribute(Constants.CURREANT_ADMIN_PAGE, "case");
        req.getRequestDispatcher("/WEB-INF/views/case/case.jsp").forward(req, resp);
    }

    private void adminList(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        CommonMethod.caseListCommon(req,resp,caseServiceImpl);
        req.setAttribute(Constants.CURREANT_ADMIN_PAGE, "case");
        req.getRequestDispatcher("/WEB-INF/views/case/case_list.jsp").forward(req, resp);
    }

    private void remove(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Map<String, String> map = new HashMap<String, String>();
        String idStr = req.getParameter("id");
        if(idStr != null) {
            int id = Integer.valueOf(idStr);
            caseServiceImpl.remove(id);
            map.put("error", "删除成功");
            out.write(JSON.toJSONString(map));
        } else {
            map.put("error", "删除失败");
            out.write(JSON.toJSONString(map));
        }
    }

    private void edit(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Map<String, String> map = new HashMap<String, String>();
        if (ServletFileUpload.isMultipartContent(req)) {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setHeaderEncoding("utf-8");
            Case cases = new Case();
            try {
                List<FileItem> items = upload.parseRequest(req);
                for (FileItem item : items) {
                    if (item.isFormField()) {
                        String name = item.getFieldName();
                        if (name.equals("name")) {
                            if (item.getString("utf-8") == null || item.getString("utf-8").trim().equals("")) {
                                map.put("error", "请输入正确的案例名称!");
                                out.write(JSON.toJSONString(map));
                                return;
                            }
                            cases.setName(item.getString("utf-8"));
                        } else if (name.equals("customer")) {
                            if (item.getString("utf-8") == null || item.getString("utf-8").trim().equals("")) {
                                map.put("error", "请输入正确的客户名称!");
                                out.write(JSON.toJSONString(map));
                                return;
                            }
                            cases.setCustomer(item.getString("utf-8"));
                        } else if (name.equals("content")) {
                            if (item.getString("utf-8") == null || item.getString("utf-8").trim().equals("")) {
                                map.put("error", "请输入案例详情!");
                                out.write(JSON.toJSONString(map));
                                return;
                            }
                            cases.setContent(item.getString("utf-8"));
                        } else if (name.equals("id")) {
                            cases.setId(Integer.valueOf(item.getString("utf-8")));
                        }
                    } else { // 文件
                        String name = item.getFieldName();
                        if (name.equals("image")) {
                            FileUtil.save(req, item);
                            cases.setImage("uploads/" + item.getName());
                        }
                    }
                }
                Case aCase = caseServiceImpl.queryById(cases.getId());// 如果没有选择图片，则用使用之前的图片
                if (cases.getImage() == null) {
                    cases.setImage(aCase.getImage());
                }
                caseServiceImpl.update(cases);
                resp.setContentType("json");
                map.put("error", "修改成功");
                out.write(JSON.toJSONString(map));
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Map<String, String> map = new HashMap<String, String>();
        if (ServletFileUpload.isMultipartContent(req)) {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setHeaderEncoding("utf-8");
            Case cases = new Case();
            try {
                List<FileItem> items = upload.parseRequest(req);
                for (FileItem item : items) {
                    if (item.isFormField()) { //表单域
                        String name = item.getFieldName();
                        if (name.equals("name")) {
                            if (item.getString("utf-8") == null || item.getString("utf-8").trim().equals("")) {
                                map.put("error", "请输入正确的案例名称!");
                                out.write(JSON.toJSONString(map));
                                return;
                            }
                            cases.setName(item.getString("utf-8"));
                        } else if (name.equals("customer")) {
                            if (item.getString("utf-8") == null || item.getString("utf-8").trim().equals("")) {
                                map.put("error", "请输入正确的客户名称!");
                                out.write(JSON.toJSONString(map));
                                return;
                            }
                            cases.setCustomer(item.getString("utf-8"));
                        } else if (name.equals("content")) {
                            if (item.getString("utf-8") == null || item.getString("utf-8").trim().equals("")) {
                                map.put("error", "请输入案例详情!");
                                out.write(JSON.toJSONString(map));
                                return;
                            }
                            cases.setContent(item.getString("utf-8"));
                        }
                    } else { // 文件
                        String name = item.getFieldName();
                        if (name.equals("image")) {
                            FileUtil.save(req, item);
                            cases.setImage("uploads/" + item.getName());
                        }
                    }
                }
                if (cases.getImage() == null) {
                    cases.setImage("uploads/logo.jpg");
                }
                caseServiceImpl.add(cases);
                resp.setContentType("json");
                map.put("error", "添加成功");
                out.write(JSON.toJSONString(map));
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    private void showEditPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String idStr = req.getParameter("id");
        int id = Integer.valueOf(idStr);
        Case aCase = caseServiceImpl.queryById(id);
        req.setAttribute("aCase",aCase);
        req.setAttribute(Constants.CURREANT_ADMIN_PAGE, "case");
        req.getRequestDispatcher("/WEB-INF/views/case/edit_case.jsp").forward(req, resp);
    }

    private void showAddPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURREANT_ADMIN_PAGE, "addCase");
        req.getRequestDispatcher("/WEB-INF/views/case/add_case.jsp").forward(req, resp);
    }

}