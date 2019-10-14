<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link href="css/index_work.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery-1.8.2.min.js">
</script>
<body>
<table>
	<tr>
		<td>编号</td>
		<td>名称</td>
		<td>价格</td>
		<td>百分比</td>
	</tr>
<c:forEach items="${goodlist}" var="s">
	<tr>
		<td>${s.gid}</td>
		<td>${s.gname}</td>
		<td>${s.price}</td>
		<td>${s.getCount}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>