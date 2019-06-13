<%@ page language="java" import="java.util.*,com.Nike.entity.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
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
	<header>
		<div class="header-top">
			<div class="width-center">
				<div class="header-logo ">
					<img src="images/logo.png" alt="">
				</div>
				<div class="header-title div-inline">
					<strong>某某家具设计公司</strong> <span>www.cssmoban.com</span>
				</div>

				<div class="search-box div-inline">
					<div class="input-box">
						<input type="text" name="" placeholder="             请输入关键字">
					</div>
					<div class="search-botton"></div>
				</div>
			</div>
		</div>
		<div class="header-nav">
			<button class="am-show-sm-only am-collapsed font f-btn"
				data-am-collapse="{target: '.header-nav'}">
				Menu <i class="am-icon-bars"></i>
			</button>
			<nav>
				<ul class="header-nav-ul am-collapse am-in">
					<li class="on"><a href="index.html" name="index">首页</a>
					</li>
					<li><a href="about.html" name="about">关于我们</a>
					</li>
					<li><a href="productlist.html" name="show">产品展示</a>
					</li>
					<li><a href="article_list.html" name="new">新闻资讯</a>
					</li>
					<li><a href="contact.html" name="message">联系我们</a>
						<div class="secondary-menu">

							<ul>
								<li><a href="message.html" class="message"></a>
								</li>
							</ul>
						</div></li>
				</ul>




			</nav>
		</div>

	</header>
	<div class="am-slider am-slider-default"
		data-am-flexslider="{playAfterPaused: 8000}">
		<ul class="am-slides">
			<li><img src="images/banner.jpg" alt="">
			</li>
			<li><img src="images/banner.jpg" alt="">
			</li>
			<li><img src="images/banner.jpg" alt="">
			</li>
			<li><img src="images/banner.jpg" alt="">
			</li>
		</ul>
	</div>
	<div>
		<header class="header-article-list">
			<div class="article-position">
				<a href="article_list_content.html"> <span>上一篇</span> <span>家具有哪些类型</span>
				</a>
			</div>
			<ul>
			<%	List<Newstype> qq = (List<Newstype>) request.getAttribute("news_type");
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
				<a href="article_list_content.html"> <span>下一篇</span> <span>家具有哪些类型</span>
				</a>
			</div>
		</header>

		<section class="article-content">
			<%
				News com = (News) request.getAttribute("news_Id");
			%>

			<h4><%=com.getName()%></h4>
			<main>
			<p><%=com.getNews_content()%></p>
			</main>
		</section>
	</div>
	﻿
	<footer>
		<div>
			<div class="footer-info">
				<div class="footer-content">
					<img src="images/qccode.png" alt="">
					<div>
						<p>招商热线:0714-8868331</p>
						<div class="footer-box">
							<i class="icon-tel"></i> <span>公司电话:</span> <span>0714-8868331</span>
						</div>
						<div class="footer-box">
							<i class="icon-email"></i> <span>公司邮箱:</span> <span>123@dayeyunalading.com</span>
						</div>
						<div class="footer-box">
							<i class="icon-address"></i> <span>公司地址:</span> <span>湖北省XXX市XXX大道小区B栋201</span>
						</div>
					</div>
				</div>
			</div>
			<style>
.footer-bottom a {
	color: #F1404B
}
</style>
			<div class="footer-bottom">
				<div style="text-align:center;color:#fff;line-height:100px;">
					<span><a href="http://www.haothemes.com/" target="_blank"
						title="好主题">好主题</a>提供 - More Templates <a
						href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a>
						- Collect from <a href="http://www.cssmoban.com/" title="网页模板"
						target="_blank">网页模板</a> </span>
				</div>
			</div>
		</div>
	</footer>
</body>
</html>