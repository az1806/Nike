<%@ page language="java" import="java.util.*,com.Nike.entity.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			List<News> nes = (List<News>)request.getAttribute("nlist");
			List<Newstype> nts = (List<Newstype>)request.getAttribute("nslist");
			
%>

<!DOCTYPE html>
<html>
  
  <head>
	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="admin/css/font.css">
    <link rel="stylesheet" href="admin/css/xadmin.css">
    
    <script type="text/javascript" src="admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="admin/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
   
  </head>
 	 <script type="text/javascript">
 		function addnews(){
 			var ntitle = document.getElementById("ntitle").value;
 			var ncon = document.getElementById("ncon").value;
 			var ndate = document.getElementById("ndate").value;
 			var type = document.getElementById("type").value;
 			if(ntitle!="" && ncon!="" &&  ndate!="" && type!="" ){
 				window.location.href="admin/newslist?method=addNews&ntitle="+encodeURI(encodeURI(ntitle))+"&ncon="+encodeURI(encodeURI(ncon))+"&ndate="+encodeURI(encodeURI(ndate))+"&type="+encodeURI(encodeURI(type));
 			}
 		}
 		function search(){
 			var nstitle = document.getElementById("nstitle").value;
 			var ncont = document.getElementById("ncont").value;
 			var type = document.getElementById("type1").value;
 			window.location.href="admin/newslist?method=searchNews&nstitle="+encodeURI(encodeURI(nstitle))+"&ncont="+encodeURI(encodeURI(ncont))+"&type="+type;
 		}
 		
 	</script>
  <body>
    <div class="x-nav">		
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a><cite>导航元素</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a> 
    </div>
    <div class="x-body">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so layui-form-pane">
        <input class="layui-input" placeholder="新闻标题" name="ntitle" id="ntitle">
          <input class="layui-input" placeholder="新闻内容" name="ncon" id="ncon">
           <input class="layui-input" placeholder="新闻时间" name="ndate" id="ndate">
           <input class="layui-input" placeholder="新闻类型" name="type" id="type">
          <input class="layui-btn"  type="button" onclick="addnews()" value="添加" >
        </form>
      </div>
    
      <div>
        <form class="layui-form layui-col-md12 x-so layui-form-pane">
        
           <input  class="layui-input" placeholder="新闻标题" name="nstitle" id="nstitle" >
          <input class="layui-input" placeholder="新闻内容" name="ncont" id="ncont">
          <input class="layui-btn"  type="button" onclick="search()" value="查询" >
        </form>
         <select  style="width:110px;margin-left:0px" id="type1" >
            	<option value="0">请选择</option>
            	<%for(int i=0;i<nts.size();i++){ %>
            	<option value="<%=nts.get(i).getType_Id() %>"><%=nts.get(i).getType_Name()%></option>
            	<%} %>
            </select>
      </div>
      </div>
          <table class="layui-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>新闻标题</th>
            <th>新闻内容</th>
            <th>新闻时间</th>
            <th>新闻类型</th>
            <th>操作</th>
        </thead>
        <tbody>
        <%for(int i=0;i<nes.size();i++){ %>
          <tr>
            <td><%=nes. get(i).getNews_Id()%></td>
            <td><%=nes. get(i).getNews_title()%></td>
            <td><%=nes.get(i).getNews_content() %></td>
            <td><%=nes. get(i).getNew_date()%></td>
             <td><%=nes.get(i).getNews_type() %></td>
            <td class="td-manage">
              <a title="编辑"   href="admin/newslist?method=updateNews&news_Id=<%=nes.get(i).getNews_Id()%>">
                <i class="layui-icon">&#xe642;</i>
              </a>
              <a title="删除" onclick="return confirm('确定要执行此操作吗？')" href="admin/newslist?method=deletNews&news_Id=<%=nes.get(i).getNews_Id()%>">
                <i class="layui-icon">&#xe640;</i>
              </a>
            </td>
          </tr>
          <%} %>
        </tbody>
      </table>
    </div>
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