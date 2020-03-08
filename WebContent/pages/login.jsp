<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String bathpath = request.getScheme() +"://"+ request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/"; %>
<!DOCTYPE html>
<html>
<head>
<base href="<%=bathpath %>" >
<meta charset="UTF-8">
<title>一辉&亚莉</title>
<style type="text/css">
	div{
		height: 300px;
		width: 600px;
		background-image: linear-gradient(#9E9E9E,#607D8B);
		border: 3px solid #000;
		position: fixed;
		left: 20%;
		<!--text-align:center;--> 
	}
</style>
<script type="text/javascript" src="script/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(function(){
	$(".input1").focus(function(){		
		$("#msgspan").text("");
	});
	$("#sub").click(function(){		
		var username = $("#username").val();
		var password = $("#password").val();
		if(username == "" || password==""){
			alert("用户名或密码不能为空");
			return false;
			}
	});
	$("#sub2").click(function(){		
		$(window).attr("location","pages/register.jsp")
	});
}); 

</script>
</head>
<body>
<div>
	<h1 align="center">欢迎登录</h1><br>
	
	<form action="LoginServlet" method="post" align = "center">
		用户名称：<input type="text" name="username" id="username" class="input1">	
		<br>
		<br>
		用户密码：<input type="password" name="password" id="password" class="input1">
		<br>
		<span style="color: red" id="msgspan">${msg}</span>
		<br>
		<br>
		<input type="submit" value="登录" id="sub"> <span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
		<input type="button" value="注册" id="sub2" >
	</form>

</div>
</body>
</html>