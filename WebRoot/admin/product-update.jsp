<%@ page language="java" import="java.util.*,com.Nike.entity.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Product pro = (Product) request.getAttribute("list");
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
		var name = document.getElementById("username").value;
		var type = document.getElementById("type").value;
		var price = document.getElementById("price").value;
		var con = document.getElementById("con").value;
		var pic = document.getElementById("pic").value;
		window.location.href = "admin/productlist?method=updatesProduct&username="
				+ encodeURI(encodeURI(name))
				+ "&type="
				+ encodeURI(encodeURI(type))
				+ "&price="
				+ price
				+ "&con="
				+ encodeURI(encodeURI(con))
				+ "&pic="
				+ encodeURI(encodeURI(pic))
				+"&id=<%=pro.getProduct_Id()%>";
	}
</script>
</head>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>产品名称 </label>
				<div class="layui-input-inline">
					<input type="text" id="username" name="username" required=""
						lay-verify="required" autocomplete="off" class="layui-input"
						value="<%=pro.getProduct_Name()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="phone" class="layui-form-label"> <span
					class="x-red">*</span>产品类型 </label>
				<div class="layui-input-inline">
					<input type="text" id="type" name="type" required=""
						lay-verify="phone" autocomplete="off" class="layui-input"
						value="<%=pro.getProduct_type()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>产品单价 </label>
				<div class="layui-input-inline">
					<input type="text" id="price" name="price" required=""
						lay-verify="email" autocomplete="off" class="layui-input"
						value="<%=pro.getProduct_price()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_pass" class="layui-form-label"> <span
					class="x-red">*</span>产品简介 </label>
				<div class="layui-input-inline">
					<input type="text" id="con" name="con" required=""
						lay-verify="pass" autocomplete="off" class="layui-input"
						value="<%=pro.getProduct_content()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> <span
					class="x-red">*</span>产品图片 </label>
				<div class="layui-input-inline">
					<input type="text" id="pic" name="pic" required=""
						lay-verify="repass" autocomplete="off" class="layui-input"
						value="<%=pro.getProduct_pic()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label> <input
					type="button" class="layui-btn" lay-filter="add" lay-submit=""
					value="修改" onclick="update()">


			</div>
		</form>
	</div>

</body>

</html>