<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testImg.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</link><script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
 	 <link rel="stylesheet" href="lib/layui/css/layui.css" type="text/css">
 	 <script type="text/javascript" src="lib/layui/layui.js"></script>
 	 <script type="text/javascript">
 	 	var layer,upload;
 	 $(function(){
 	 	layui.use(['layer','upload'],function(){
 	 		layer = layui.layer;
 	 		upload = layui.upload;
 	 		upload.render({
 	 			elem:'#test1',
 	 			url:'admin/htproduct?method=saveImg',
 	 			done:function(res){
 	 			layer.alert(res.message);
 	 			}
 	 		});
 	 	});
 	 
 	 });
 	 </script>
 	 </head>
  <body>
    <form class="form-x">        
        商品名字：<input type="text" value="Jim Green" name="dname"/><br />
        图片：<img id="imgFace" style="width:120px" /><br />        
        <input type="file" name="file" class="layui-upload-file" />    <br />
        <button type="button" class="layui-btn" id="test1">上传图片</button>
    </form>
  </body>
</html>
