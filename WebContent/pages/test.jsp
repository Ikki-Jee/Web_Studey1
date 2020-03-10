<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<% String bathpath = request.getScheme() +"://"+ request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<!DOCTYPE html>
<html>
<head>
<base href="<%=bathpath %>" >
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<button  onclick="window.location.href='LogoutServlet'">注销</button>
<center>
	<h1>欢迎<span style="color:red">${sessionScope.user.username}</span>登录，当前在线<span style="color:red">${applicationScope.count}</span>人</h1>
	<br> 
	<c:if test="${empty sessionScope.users }"><h2>没有任何用户</h2></c:if>
	<br>
	<c:if test="${!empty sessionScope.users }">
	<h2>用户列表</h2>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>ID</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Email</th>
			<th colspan="2">Operate</th>
		</tr>
	<c:forEach items="${sessionScope.users}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.email}</td>
			<td><a href="">编辑</a></td>
			<td><a href="">删除</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>	
</center> 
</body>
</html>