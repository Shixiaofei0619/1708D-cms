<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>个人中心</title>
<!-- 引入样式 -->
<link href="/resource/css/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
</head>
<body>
<form action="/shoucang" method="post">
	<table class="table table-bordered table-hover">
		<tr align="center">
			<td>序号</td>
			<td>收藏夹文本</td>
			<td>收藏夹地址</td>
			<td>所属用户</td>
			<td>添加时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="c" varStatus="i">
			<tr align="center">
				<td>${i.count}</td>
				<td>${c.text }</td>
				<td>${c.url }</td>
				<td>${c.userId }</td>
				<td><fmt:formatDate value="${c.created }" pattern="yyyy-MM-dd"/> </td>
				<td>
					<a href="del?id="+${c.id }">删除</a>
				</td>
				
			</tr>
		</c:forEach>
	</table>
</form>
</html>