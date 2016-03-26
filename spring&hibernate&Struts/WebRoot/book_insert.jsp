<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'book_insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript" src="js/jquery.js"></script>
	
	<script type="text/javascript">
		$(function(){
			$("#bname").blur(function(){
				$.post("book_chackBname.action",{bname:$(this).val()},function(data){
				console.log(data);
					$("#bname_message").html(data);
				});
			});
		
		});
	
	</script>

  </head>
  
  <body>
   <form action="book_save.action" method="post">
   		bookName:<input type="text" name="bname" id="bname"><span id="bname_message"></span><br/>
   		bookPrice:<input type="text" name="price"><br/>
   		<input type="submit" value="提交">
   </form>
  </body>
</html>
