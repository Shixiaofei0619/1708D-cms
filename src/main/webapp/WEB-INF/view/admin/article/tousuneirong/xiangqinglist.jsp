<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投诉详情</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/index_work.css" />
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>

	<form action="xiangqing" method="post">
		文章编号:<input type="text" name="id"><br>
		<br> 标题:<input type="text" name="title" value="${title}"><br>
		<br> 投诉人:<input type="text" name="user_id" value="${user_id}"><br>
		<br> 投诉时间:<input type="date" name="created" value="${created}"><br>
		<br> 投诉类型:<select name="id">
			<option value="A">涉及黄色</option>
			<option value="B">涉及暴力</option>
			<option value="C">涉及违宗教政策</option>
			<option value="D">涉及国家安全</option>
			<option value="E">抄袭内容</option>
			<option value="F">其他</option><br><br>
		</select> 投訴證據：<input type="text" value="urlip" name="urlip">
	</form>


</body>
</html>