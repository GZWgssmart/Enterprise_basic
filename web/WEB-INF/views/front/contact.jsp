<%--
  Created by IntelliJ IDEA.
  User: Wang Genshen
  Date: 2017-07-17
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>联系我们</title>
    <%@include file="../master/style.inc.jsp"%>
    <style>
        #allmap {
            width: 100%;
            height: 100%;
            overflow: hidden;
            margin:0;
            font-family:"微软雅黑";
        }
    </style>
</head>
<body>
<%@include file="../master/header.jsp"%>
<div class="container">
    <div class="row" style="margin-top: 20px;">
        <%@include file="../master/left_sidebar.jsp"%>
        <div class="col-lg-9 col-md-9 col-sm-8 col-xs-12">
            <h3>联系我们</h3>
            <p>
                联系人：谢总
            </p>
            <p>手机号：15170180577</p>
            <p>地址：江西赣州市章贡区钨都大道2-62号201室</p>
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="map" style="min-height:300px;"></div>
        </div>
    </div>

    <%@include file="../master/footer.jsp"%>
</div>

</body>
<%@include file="../master/script.inc.jsp"%>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=s2BbtgjfOzPzzI0VB6v0GUYTeRRR31oD"></script>
<script type="text/javascript">
    var map = new BMap.Map("map");
    var point = new BMap.Point(114.931678,25.840426);
    map.centerAndZoom(point, 15);
    map.addControl(new BMap.MapTypeControl());
    map.setCurrentCity("赣州");
    map.enableScrollWheelZoom(true);
    var marker = new BMap.Marker(point);  // 创建标注
    map.addOverlay(marker);
</script>
</html>
