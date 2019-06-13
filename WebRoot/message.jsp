<%@ page language="java" import="java.util.*,com.Nike.entity.*" pageEncoding="UTF-8"%>
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
  <script type="text/javascript">
	function checkFrom(a) {
		var pp = document.getElementById("ww").value;
		var aa = document.getElementById("ee").value;
		if (pp == "") {
			alert("联系方式不能为空");
			return false;
		}
		if (aa = "") {
			alert("留言方式不能为空");
			return false;
		}
		return;
	}
</script>
  <body>
   <div>
		<header class="header-article-list">
		<h1>在线留言</h1>

		</header>
		<div>
			<form class="message-form" method="post" action="MessageServletQian" onsubmit="return checkFrom(this)">

				   <label>
				         姓名 <input type="text" name="xingming">
				   <span>*</span>
				  </label>
				   <label>
				       电话 <input type="text" name="dianhua" id="ww"> 
				   <span>*</span>
				  </label> 
				  <label>
				      邮箱 <input type="email" name="email"> <span>*</span>
				  </label> 
				  <label>
				         内容 <textarea type="text" name="neirong" id="ee" ></textarea> <span>*</span>
				    </label>
                  <button type="submit" class="am-btn am-btn-danger">提交</button>
			</form>
		</div>
	</div>
  </body>
</html>
