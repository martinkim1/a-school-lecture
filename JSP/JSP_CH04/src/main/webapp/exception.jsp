<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ page isErrorPage="true" %>
	<h2> 처리 중 문제 발생 </h2>
	빠른 시일 내에 복구하도록 하겠습니다. <p>
	exception.getMessage() : <%= exception.getMessage() %> <p>
	exception.toString() : <%= exception.toString() %>
</body>
</html>