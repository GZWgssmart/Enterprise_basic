<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-21
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>公司注册</title>
    <%@include file="../master/style.inc.jsp"%>
</head>
<body>
<%@include file="../master/header.jsp"%>
<div class="container">
    <div class="row-offcanvas row-offcanvas-left" style="margin-top: 20px;">
        <div class="row">
            <%@include file="../master/left_sidebar_canvas.jsp"%>
            <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12 ">
                <p class="visible-xs">
                    <button type="button" class="btn btn-default" data-toggle="offcanvas">所有服务</button>
                </p>
                <h3>公司注册</h3>

                <h4>1、个体工商户注册指南</h4>
                <p>类型：个体工商户</p>
                <p>概述：依照《个体工商户条例》的规定经工商行政管理部门登记，从事个体工商经营的公民</p>
                <p>所需材料：</p>
                <ol>
                    <li>经营者签署的《个体工商户开业登记申请书》</li>
                    <li>经营者的身份证复印件</li>
                    <li>经营场所使用证明</li>
                    <li>经营者1寸照片1张</li>
                    <li>国家工商行政管理总局规定提交的其他文件</li>
                </ol>
                <p>办理程序：</p>
                <ol>
                    <li>到工商局申请名称预先核准，取得《企业名称预先核准通知书》</li>
                    <li>填写相关表格及准备相关材料</li>
                    <li>到工商局提交设立登记申请材料</li>
                </ol>
                <h4>2、有限责任公司注册指南</h4>
                <p>类型：独资企业、二人或以上有限责任公司</p>
                <p>概述：由一人或一人以上投资组建的有限责任公司</p>
                <p>所需材料：</p>
                <ol>
                    <li>公司备用名</li>
                    <li>法人身份证原件及复印件</li>
                    <li>股东身份证复印件</li>
                    <li>房产证复印件</li>
                    <li>租赁合同</li>
                </ol>
                <p>办理程序：</p>
                <ol>
                    <li>到工商局申请名称预先核准，取得《企业名称预先核准通知书》</li>
                    <li>公司股东制定公司章程和决定公司机构相关事项</li>
                    <li>经营范围涉及前置许可经营项目的，持《企业名称预先核准通知书》到相关部门取前置审批证</li>
                    <li>填写相关表格及准备相关材料</li>
                    <li>到工商局提交设立登记申请材料，取得《受理通知书》</li>
                    <li>经受理二个工作日后（不含受理日，法定节假日），持《受理通知书》到工商局领取营业执照</li>
                </ol>
            </div>
        </div>
        <%@include file="../master/footer.jsp"%>
    </div>
</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>