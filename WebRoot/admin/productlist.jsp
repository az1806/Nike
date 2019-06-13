<%@ page language="java" import="java.util.*,com.Nike.entity.*"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
	List<Product> pro = (List<Product>)request.getAttribute("list");
	List<Producttype> prd = (List<Producttype>)request.getAttribute("ptlist");
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

<script type="text/javascript" src="admin/js/jquery-3.1.1.min.js"></script>
<link rel="stylesheet" href="admin/layui/css/layui.css" type="text/css"></link>
<script type="text/javascript" src="admin/layui/layui.js"></script>
<!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
<!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<script type="text/javascript">
  function searchpro(){
    var tid = document.getElementById("tid").value;
 	var proname = document.getElementById("proname").value;
 	var procon = document.getElementById("procon").value;
 	window.location.href="admin/productlist?method=chaxunpro&proname="+encodeURI(encodeURI(proname))+"&procon="+encodeURI(encodeURI(procon))+"&tid="+tid;
 	
  }
  
  </script>
<script type="text/javascript">
 		function addproduct(){
 			var pname = document.getElementById("pname").value;
 			var type_Id = document.getElementById("type_Id").value;
 			var pprice = document.getElementById("pprice").value;
 			var pcontent = document.getElementById("pcontent").value;
 			var ppic = document.getElementById("ppic").value;
 			if(pname!="" && pprice!="" && pcontent!="" && ppic!=""){
 				window.location.href="admin/productlist?method=addProduct&pname="+encodeURI(encodeURI(pname))+"&type_Id="+type_Id+"&pprice="+encodeURI(encodeURI(pprice))+"&pcontent="+encodeURI(encodeURI(pcontent))+"&ppic="+encodeURI(encodeURI(ppic));
 			}
 			
 		}
 	</script>
<body>
	<div class="x-nav">
		<span class="layui-breadcrumb"> <a href="">首页</a> <a href="">演示</a>
			<a> <cite>导航元素</cite>
		</a> </span> <a class="layui-btn layui-btn-small"
			style="line-height:1.6em;margin-top:3px;float:right"
			href="javascript:location.replace(location.href);" title="刷新"> <i
			class="layui-icon" style="line-height:30px">ဂ</i>
		</a>
	</div>
	<div class="x-body">
		<div class="layui-row">
			<form class="layui-form layui-col-md12 x-so layui-form-pane">
				<input class="layui-input" placeholder="产品名称" name="cate_name"
					id="pname"> <input class="layui-input" placeholder="类型名称"
					name="cate_name" id="type_Id"> <input class="layui-input"
					placeholder="产品单价" name="cate_name" id="pprice"> <input
					class="layui-input" placeholder="产品简介" name="cate_name"
					id="pcontent"> <input class="layui-input"
					placeholder="产品图片" name="cate_name" id="ppic">
				<button class="layui-btn" type="button" id="test1">浏览上传</button>
				<button class="layui-btn" type="button" onclick="addproduct()">
					<i class="layui-icon"></i>增加
				</button>
				</br>

			</form>
			<form>
			<input class="layui-input" placeholder="产品名称" name="proname"
				id="proname"> <input class="layui-input" placeholder="产品简介"
				name="procon" id="procon">
			<select id="tid">
			<option value="0">请选择</option>
			
				<%for(int i=0;i<prd.size();i++){ %>
			
			<option value="<%=prd.get(i).getType_Id()%>"><%=prd.get(i).getType_Name()%></option>
			<%
				}
			%> </select>
			<input class="layui-btn" type="button" onclick="searchpro()" value="查询">
				
			
			</form>
		</div>
		<table class="layui-table">
			<thead>
				<tr>

					<th>ID</th>
					<th>产品名称</th>
					<th>类型</th>
					<th>产品单价</th>
					<th>产品简介</th>
					<th>产品图片</th>
					<th>操作</th>
			</thead>
			<tbody>
				<%
					for(int i=0;i<pro.size();i++){
				%>
				<tr>
					<td><%=pro.get(i).getProduct_Id()%></td>
					<td><%=pro.get(i).getProduct_Name()%></td>
					<td><%=pro.get(i).getProduct_type()%></td>
					<td><%=pro.get(i).getProduct_price()%></td>
					<td><%=pro.get(i).getProduct_content()%></td>
					<td><img src="<%=pro.get(i).getProduct_pic()%>"></img>
					</td>
					<td class="td-manage"><a title="编辑"
						href="admin/productlist?method=updateProduct&Product_Id=<%=pro.get(i).getProduct_Id()%>">
							<i class="layui-icon">&#xe642;</i> </a> <a title="删除"
						onclick="return confirm('确定要执行此操作吗？')"
						href="admin/productlist?method=deletProduct&Product_Id=<%=pro.get(i).getProduct_Id()%>">
							<i class="layui-icon">&#xe640;</i> </a></td>
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>

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
                            document.getElementById("ppic").value="images/"+res.message;  
                        }
                    });
              });
        });
    </script>
	<script>
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
      }
    </script>

</body>

</html>