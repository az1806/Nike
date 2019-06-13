<%@ page language="java" import="java.util.*,com.Nike.entity.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			News nes = (News)request.getAttribute("com");
%>

<!DOCTYPE html>
<html>

<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>欢迎页面-X-admin2.0</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet" href="admin/css/font.css">
<link rel="stylesheet" href="admin/css/xadmin.css">
<script type="text/javascript" src="admin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript" src="admin/js/xadmin.js"></script>
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript">
	function update() {
		
		var ncon = document.getElementById("ncon").value;
		var ntype = document.getElementById("ntype").value;
		window.location.href = "admin/productcate?method=updatesProducttype&ncon="
				+ encodeURI(encodeURI(ncon))+"&ntype="encodeURI(encodeURI(ntype))
				+"&id=<%=nes.getNews_Id()%>";
	}
</script>
</head>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>新闻内容 </label>
				<div class="layui-input-inline">
					<input type="text" id="ncon" name="ncon" required=""
						lay-verify="required" autocomplete="off" class="layui-input"
						value="<%=nes.getNews_content()%>">
				</div>
				<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>新闻类型 </label>
				<div class="layui-input-inline">
					<input type="text" id="ntype" name="ntype" required=""
						lay-verify="required" autocomplete="off" class="layui-input"
						value="<%=nes.getNews_type()%>">
				</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label> <input
					type="button" class="layui-btn" lay-filter="add" 
					value="修改" onclick="update()">


			</div>
		</form>
	</div>

</body>

</html>