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
<title>投诉列表</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	     <table class="table table-dark">
	       <tr>
	          <td>序号</td>
	          <td>文章ID</td>
	          <td>投诉用户</td>
	          <td>投诉类型</td>
	          <td>用户提交证据</td>
	          <td>投诉次数</td>
	          <td>操作</td>
	       </tr>
	       <c:forEach items="${infos.list}" var="s">
	         <tr>
	            <td>${s.id}</td>
	            <td>${s.article}</td>
	            <td>${s.user_id}</td>
	            <td>${s.complaintype}</td>
	            <td>${s.urlip}</td>
	            <td>${s.tousucishu}</td>
	            <td><input type="button" value="详情" onclick="xq()"></td>
	             <td><input type="button" value="投诉" onclick="tousu()"></td>
	         </tr>
	       </c:forEach>
	       <tr>
	          <td colspan="10">
	             <a href="tousuliebiao?pageNum=1">首页</a>
	             <a href="tousuliebiao?pageNum=${infos.prePage}">上一页</a>
	             <a href="tousuliebiao?pageNum=${infos.nextPage}">下一页</a>
	             <a href="tousuliebiao?pageNum=${infos.pages}">尾页</a>
	          </td>
	       </tr>
	     </table>
</body>
<script type="text/javascript">
   function xq() {
	location.href="xiangqinglist";
}
   function tousu() {
	location.href="tousu";
}
</script>
</html>