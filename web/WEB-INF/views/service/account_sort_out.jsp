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
    <title>乱账整理</title>
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
                    <button type="button" class="btn btn-default btn-xs" data-toggle="offcanvas">所有服务</button>
                </p>
                <h3>乱账整理</h3>
                <p>
                乱账是指组织机构在生产经营过程中或是行为活动中所发生的经济记录不能得到正确反映，出现了记载事项与事实不符的现象。具体是指企业的经营活动的会计记录不正确、不真实，清理乱账是还原真实账务的过程。
                清理乱帐所需的资料：会计账簿、财务报表、会计凭证、财务制度及其他相关资料。
                </p>
                <p>
                一：会计基础工作检查：主要检查会计凭证的会计科目应用是否正确、会计账簿的登记是否合规、会计凭证的原始单据是否充分等。
                </p>
                <p>
                二：清查货币资金：主要是盘点库存现金及银行存款，并出具现金及银行存款盘点表。方案。
                </p>
                <p>
                三：清理往来款项：主要是清查应收账款、其他应收款、应付账款、其他应付款等科目余额。并编制应收、应付款明细账。
                </p>
                <p>
                四：清理固定资产：主要是清点实有固定资产并登记固定资产卡片。
                </p>
                <p>
                五：清理库存商品：主要是盘点库存商品实物，结合账面余额进行会计技术性调整。
                </p>
                <p>
                六：清查营业收入：主要是逐年逐月核实营业收入及成本、费用的各项数据并据此清查有无欠缴税款。
                </p>
            </div>
        </div>
        <%@include file="../master/footer.jsp"%>
    </div>

</div>
</body>
<%@include file="../master/script.inc.jsp"%>
</html>