package com.gs.controller;

import com.alibaba.fastjson.JSON;
import com.gs.bean.Admin;
import com.gs.common.Constants;
import com.gs.common.WebUtil;
import com.gs.service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
@WebServlet(name = "AdminServlet", urlPatterns = "/admin/*")
public class AdminServlet extends HttpServlet {

    private static final long serialVersionUID = 4186956681993096312L;

    private AdminServiceImpl admServiceImpl;

    public AdminServlet() {
        admServiceImpl = new AdminServiceImpl();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String method = WebUtil.getReqMethod(req);
        if (method.equals("login_page")) {
            showLoginPage(req, resp);
        } else if (method.equals("login")) {
            login(req, resp);
        } else {
            HttpSession session = req.getSession();
            Admin adm = (Admin)session.getAttribute("admin");
            if(adm == null) {
                resp.sendRedirect("login_page");
            } else {
                if (method.equals("update_page")) {
                    showUpdatePage(req, resp);
                } else if (method.equals("update_pwd")) {
                    updatePwd(req, resp);
                } else if (method.equals("logout")) {
                    logout(req, resp);
                }
            }
        }
    }

    private void logout(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.removeAttribute("admin");
        resp.sendRedirect("login_page");
    }

    private void login(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String pwd = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        Map<String,String> map = new HashMap<String, String>();
        // 后台验证
        if(name == null || name.trim().equals("")
                || pwd == null || pwd.trim().equals("")) {
            map.put("error","请输入登录名和密码！");
            out.write(JSON.toJSONString(map));
            return;
        }
        Admin adm = admServiceImpl.queryByNamePwd(name, pwd);
        if(adm == null) {
            map.put("error","登录名密码输入错误！");
            out.write(JSON.toJSONString(map));
            return;
        }
        HttpSession session = req.getSession();
        session.setAttribute("admin", adm);
        // 登录成功，转到个人中心
        map.put("error","登录成功");
        out.write(JSON.toJSONString(map));
    }

    private void updatePwd(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String idStr = req.getParameter("id");
        String name = req.getParameter("name");
        String pwd = req.getParameter("password");
        String newPwd = req.getParameter("newPwd");
        String pwdConfirm = req.getParameter("pwdConfirm");
        PrintWriter out = resp.getWriter();
        Map<String,String> map = new HashMap<String, String>();
        // 后台验证
        if(pwd == null || pwd.trim().equals("")) {
            map.put("error","请输入原密码！");
            out.write(JSON.toJSONString(map));
            return;
        }
        if(newPwd == null || newPwd.trim().equals("")) {
            map.put("error","请输入新密码！");
            out.write(JSON.toJSONString(map));
            return;
        }
        if(pwdConfirm == null || pwdConfirm.trim().equals("")) {
            map.put("error","请输入确认密码！");
            out.write(JSON.toJSONString(map));
            return;
        }
        Admin adm = admServiceImpl.queryByNamePwd(name, pwd);
        if(adm == null) {
            map.put("error","原密码输入错误！");
            out.write(JSON.toJSONString(map));
            return;
        }
        int id = Integer.valueOf(idStr);
        admServiceImpl.updatePwd(id,pwdConfirm);
        adm = admServiceImpl.queryById(id);
        HttpSession session = req.getSession();
        session.setAttribute("admin", adm);
        // 修改成功，转到个人中心
        map.put("error","修改成功");
        out.write(JSON.toJSONString(map));
    }

    private void showUpdatePage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute(Constants.CURREANT_ADMIN_PAGE, "pwd");
        req.getRequestDispatcher("/WEB-INF/views/admin/update_pwd.jsp").forward(req, resp);
    }

    private void showLoginPage(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/admin/login.jsp").forward(req, resp);
    }

}
