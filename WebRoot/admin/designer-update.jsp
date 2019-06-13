<%@ page language="java" import="java.util.*,com.Nike.entity.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Designer des = (Designer) request.getAttribute("delist");
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
<script type="text/javascript" src="admin/lib/layui/layui.js"charset="utf-8"></script>
<script type="text/javascript" src="admin/js/xadmin.js"></script>
 <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="admin/layui/css/layui.css" type="text/css"></link>
    <script type="text/javascript" src="admin/layui/layui.js"></script>
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript">
	function update() {
		var dname = document.getElementById("dname").value;
		var sex = document.getElementById("sex").value;
		var con = document.getElementById("con").value;
		var pic = document.getElementById("pic").value;
		window.location.href = "admin/designerlist?method=updatesDesigner&dname="
				+ encodeURI(encodeURI(dname))
				+ "&sex="
				+ encodeURI(encodeURI(sex))
				+ "&con="
				+ encodeURI(encodeURI(con))
				+ "&pic="
				+ encodeURI(encodeURI(pic))
				+"&id=<%=des.getDesigner_Id()%>";
	}
</script>
</head>

<body>
	<div class="x-body">
		<form class="layui-form">
			<div class="layui-form-item">
				<label for="username" class="layui-form-label"> <span
					class="x-red">*</span>姓名 </label>
				<div class="layui-input-inline">
					<input type="text" id="dname" name="dname" required=""
						lay-verify="required" autocomplete="off" class="layui-input"
						value="<%=des.getDesigner_Name()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="phone" class="layui-form-label"> <span
					class="x-red">*</span>性别</label>
				<div class="layui-input-inline">
					<input type="text" id="sex" name="sex" required=""
						lay-verify="phone" autocomplete="off" class="layui-input"
						value="<%=des.getDesigner_Sex()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_email" class="layui-form-label"> <span
					class="x-red">*</span>简介 </label>
				<div class="layui-input-inline">
					<input type="text" id="con" name="con" required=""
						lay-verify="email" autocomplete="off" class="layui-input"
						value="<%=des.getDesigner_About()%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_pass" class="layui-form-label"> <span
					class="x-red">*</span>图片 </label>
				<div class="layui-input-inline">
					<input type="text" id="pic" name="pic" required=""
						lay-verify="pass" autocomplete="off" class="layui-input"
						value="<%=des.getDesigner_Pic()%>">
						<input type="button" id="test1" class="layui-btn"  value="浏览上传">
				</div>
			</div>
			<div class="layui-form-item">
				<label for="L_repass" class="layui-form-label"> </label> <input
					type="button" class="layui-btn" lay-filter="add" lay-submit=""
					value="修改" onclick="update()">


			</div>
		</form>
	</div>
<script type="text/javascript" src="admin/js/jquery-1.8.2.min.js"></script>  
      <script type="text/javascript">
          var layer,upload;
        $(function (){  //jQuery组件的ready事件，
            layui.use(['upload','layer'],function(){  //layui中包含了大量的组件，此处指明仅仅加载upload和layer组件
                upload = layui.upload; //upload指代上传组件
                layer=layui.layer;  //layer指代各种弹出窗口弹出窗口组件，非常有利于业务的控制，我们项目中可以大量使用
                upload.render({
                    elem:'#test1',  //点击哪个按钮时，选择本地文件 
                        url:'admin/htproduct?method=saveImg', //服务器端接收文件数据的地址
                        done:function(res){ //当服务器端保存成功后回调此方法，已经约定res格式为json
                            //res对象中到底有哪些属性， 由服务器端控制。    
                            layer.alert(res.message);  //layer的alert方法，可以呈现1个更好看的弹出框
                            document.getElementById("pic").value="images/"+res.message;  
                        }
                    });
              });
        });
    </script>


</body>

</html>