<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hi</h1>
	<form:form>
		用户名：<form:input path="userName" />
				<br>
		密 码：<form:password path="password" />
				<br>
		Email：<form:input path="email" />
		<br>
		<input type="submit" value="注册" name="testSubmit" />
		<input type="reset" value="重置" />
	</form:form>
</body>
</html>