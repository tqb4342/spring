<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<table border=1 width="400">
		<tr>
			<td>序号</td>
			<td>书名</td>
			<td>价格</td>
			<td>操作</td>
		</tr>
		<!-- varStatus="state"记录当前遍历的序号 -->
		<c:forEach items="${pageInfo.list }" var="b" varStatus="state">
			<tr>
				<td>${state.count }</td>
				<td>${b.bname }</td>
				<td>${b.price }</td>
				<td>操作</td>
			</tr>
		</c:forEach>
		
	 	<tr>
    		<td colspan="4">共${pageInfo.recordCount }条记录，共${pageInfo.pageCount}页，当前是第${pageInfo.currentPage}页 
    		&nbsp;<br/>
    		<a href="${pageInfo.action}?pageInfo.currentPage=1">首页</a>
    		<c:if test="${pageInfo.currentPage!=1}">
    			<a href="${pageInfo.action}?pageInfo.currentPage=${pageInfo.currentPage-1}">上一页</a>
    		</c:if>
    		<c:if test="${pageInfo.currentPage!=pageInfo.pageCount}">
    		<a href="${pageInfo.action}?pageInfo.currentPage=${pageInfo.currentPage+1}">下一页</a>
    		</c:if>
    		
    		<a href="${pageInfo.action}?pageInfo.currentPage=${pageInfo.pageCount}">末页</a>
    		
    		</td>
    	</tr>
		
		
	</table>

	<a href="book_insert.jsp">插入图书</a>
  </body>
</html>
