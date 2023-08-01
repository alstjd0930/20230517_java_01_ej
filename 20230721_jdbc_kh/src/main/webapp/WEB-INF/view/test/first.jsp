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

	<table border="1">
		<tr>
			<td>학과번호</td>
			<td>학과이름</td>
			<td>계열</td>
			<td>개설여부</td>
			<td>정원</td>
		</tr>
	</table>
</body>
</html>