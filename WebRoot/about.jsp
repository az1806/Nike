<%@page import="com.Nike.entity.Company"%>
<%@page import="com.Nike.entity.Designer"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	List<Designer> com = (List<Designer>) request.getAttribute("c2");
	Company com1 = (Company) request.getAttribute("company");
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
	<jsp:include page="head.jsp"></jsp:include>

	<section class="about-section">
	<div>
		<span> <article>公司介绍</article>
			<h6>COMPANY INTRODUCTION</h6> </span> <span></span>
	</div>
	<div></div>
	<div class="about-content">
		<div class="about-image">
			<img src="./images/banner3.jpg" alt="">
		</div>

		<article> <%=com1.getCompany_profile()%> </article>


	</div>

	<div class="about-box">
		<div class="about-leftbox">
			<img src="images/banner4.jpg" alt="">
		</div>
		<div class="about-rightbox">
			<h1>企业文化</h1>
			<p>CORPORATE CULTURE</p>
			<article> <%=com1.getCompany_culture()%> </article>
		</div>
	</div>

	<div class="about-team">
		<div class="am-u-sm-12 am-u-md-12 am-u-lg-12">
			<p>设计团队</p>
			<span>DESIGN TEAM</span>
		</div>
		<div class="about-team-headimg">

			<%
				for (int i = 0; i < com.size(); i++) {
			%>
			<div class="am-u-sm-12 am-u-md-6 am-u-lg-3">
				<img src="<%=com.get(i).getDesigner_Pic()%>" alt="">
				<p><%=com.get(i).getDesigner_Name()%></p>
				<span>首席金牌设计师</span>
			</div>
			<%
				}
			%>



		</div>
		<div class="about-slogan">
			<div>
				<p></p>
			</div>
		</div>
	</div>
	</section>


	<jsp:include page="foot.jsp"></jsp:include>
</body>
</html>