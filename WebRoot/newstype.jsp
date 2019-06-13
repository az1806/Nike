<%@page import="com.Nike.entity.Company"%>
<%@ page language="java" import="java.util.*,com.Nike.entity.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	List<Newstype> qq = (List<Newstype>) request.getAttribute("type");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
<title>某某家具设计公司企业官网-模板之家</title> ﻿
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
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
	<div>
		<header class="header-article-list">
		<div class="article-position">新闻资讯</div>
		<ul>
			<%
				for (int i = 0; i < qq.size(); i++) {
			%>
			<li class="article-on"><a
				href="newstypeServlet?news_type=<%=qq.get(i).getType_Id()%>"><%=qq.get(i).getType_Name()%></a>
			</li>
			<%
				}
			%>

		</ul>
		<div class="article-more-btn">
			<a href="article_list_more.html">MORE &#62; &#62;</a>
		</div>
		</header>

		<section class="article-content">
		<ul>

			<%
				List<News> qq1 = (List<News>) request.getAttribute("news_type");
			%>
			<%
				for (int i = 0; i < qq1.size(); i++) {
			%>
			<li>
				<div class="article-date">
					<strong><%=qq1.get(i).getNews_Id()%></strong>
					<p>2017/05</p>
				</div>
				<div class="article-info">
					<a href="newsxiangqing?news_Id=<%=qq1.get(i).getNews_Id()%>">
						<h3><%=qq1.get(i).getName()%></h3>
						<p><%=qq1.get(i).getNews_content()%></p> </a>
				</div>
			</li>
			<%
				}
			%>

		</ul>

		</section>
	</div>


</body>
</html>
