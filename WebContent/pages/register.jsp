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
		height: 400px;
		width: 600px;
		background-image: linear-gradient(#9E9E9E,#bbffaa);
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
		var repassword = $("#repassword").val();
		var emailaddress = $("#emailaddress").val();
		
		if(username == "" || password==""|| repassword=="" ){
			alert("用户名或密码不能为空");
			return false;
			}
		var userReg = /^[a-zA-Z0-9_-]{3,16}$/;
		var pdReg = /^[a-zA-Z0-9_-]{6,18}$/;
		var emailReg = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
		if(!userReg.test(username)){
			alert("用户名格式不正确，请输入以字母开头，3至16个字符的用户名称！");
			return false;
		}
		if(!pdReg.test(password)){
			alert("密码格式不正确，请输入只包含数字、大小写字母和“_”、“-”，的6至18位密码！");
			return false;
		}
		if(!emailReg.test(emailaddress)){
			alert("邮箱格式不正确，请确认！");
			return false;
		}
		if(password!=repassword){
			$("#repassword").val("");
			alert("两次密码不一致！");
			return false;
		}
	});
	$("#username").change(function(){
		var username =$(this).val();

		var url = "CheckUsernameServlet";
		var params = "username="+username;
		$.post(url,params)

	});
}); 
</script>
<script type="text/javascript">
	$(function(){
//给按钮绑定单击事件
		$("#btnId").click(function(){
			alert($)
		});
	});
</script>
</head>
<body>
<div>
	<button id = "btnId">通过$.Ajax</button><h1 align="center">欢迎注册</h1><br>
	
	<form action="RegisterServlet" method="post" align="center">
		用户名称：<input type="text" name="username" id="username" class="input1">	
		<br>
		<br>
		用户密码：<input type="password" name="password" id="password" class="input1">
		<br>
		<br>
		重复密码：<input type="password" name="repassword" id="repassword" class="input1">
		<br>
		<br>
		邮箱地址：<input type="text" name="emailaddress" id="emailaddress" class="input1">		
		<br>
		<span style="color: red" id="msgspan">${msg}</span>
		<br>
		<br>
		<input type="submit" value="注册" id="sub">
	</form>

</div>
</body>
</html>