<%@page import="com.Nike.entity.Company"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
         

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
    <title>某某家具设计公司企业官网-模板之家</title>
    ﻿<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate icon" type="image/png" href="images/favicon.png">
<link rel='icon' href='favicon.ico' type='image/x-ico' />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/default.min.css?t=227" />
<!--[if (gte IE 9)|!(IE)]><!-->
<script type="text/javascript" src="lib/jquery/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="lib/amazeui/amazeui.ie8polyfill.min.js"></script>
<![endif]-->
<script type="text/javascript" src="lib/handlebars/handlebars.min.js"></script>
<script type="text/javascript" src="lib/iscroll/iscroll-probe.js"></script>
<script type="text/javascript" src="lib/amazeui/amazeui.min.js"></script>
<script type="text/javascript" src="lib/raty/jquery.raty.js"></script>
<script type="text/javascript" src="js/main.min.js?t=1"></script>
</head>
  
  <body>
<jsp:include page="head.jsp"></jsp:include>
<div class="am-slider am-slider-default" data-am-flexslider="{playAfterPaused: 8000}">
    <ul class="am-slides">
        <li><img src="images/banner.jpg" alt="" ></li>
        <li><img src="images/banner.jpg" alt="" ></li>
        <li><img src="images/banner.jpg" alt="" ></li>
        <li><img src="images/banner.jpg" alt="" ></li>
    </ul>
</div>

    <header class="header-article-list">
        <div class="contact-left">联系我们</div>
        <div class="contact-right">
            <a href="index.html">首页 </a>&#62;<a href="#">联系我们</a>
        </div>
    </header>

    <main class="contact">
        <iframe src="map.html" width="636" height="378" frameborder="0" scrolling="no"></iframe>
        <ul>
            <li>
                <span><img src="images/contact1.png"/></span>
                <h2>联系我们</h2>
                <p>电话:  <% Company com = (Company)request.getAttribute("c"); %>
                    <%= com.getCompany_Phone() %></p>
            </li>
            <li>
                <span><img src="images/contact2.png"/></span>
                <h2>公司地址</h2>
                <p>地址:<% Company com3 = (Company) request.getAttribute("c"); %></span>
                          <%= com3.getCompany_address() %>北省大冶市大冶大道116号金穗小区B栋201号</p>
            </li>
            <li>
                <span><img src="images/contact3.png"/></span>
                <h2>电子邮箱</h2>
                <p>邮箱:<% Company com2 = (Company) request.getAttribute("c"); %>
                     <%= com2.getCompany_Email() %></p>
            </li>
        </ul>
    </main>
</div>
<jsp:include page="foot.jsp"></jsp:include>
  </body>
</html>
