<%@page import="kh.test.jdbckh.department.test.vo.TestVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과값</h2>
	<%TestVo vo =(TestVo)request.getAttribute("dvo");  %>
	<%if(vo !=null){ %>
	<table border="1">
		<tr>
			<td>학과번호</td>
			<td><%=vo.getDepartmentNo() %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=vo.getDepartmentName()%></td>
		</tr>
	</table>
	<a href="<%=request.getContextPath() %>/test/first">되돌아가기</a>
	<%}else{ %>
		<h2>결과없음</h2>
		<a href="<%=request.getContextPath() %>/test/first">되돌아가기</a>
	<%} %>
</body>
</html>