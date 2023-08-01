<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학과정보검색</h2>
	<form action = "<%=request.getContextPath() %>/test/get" method="get">
	학과검색<input type="text" name="departmentNo">
	<button type="submit" value="검색">rjtja</button>
	</form>
</body>
</html>