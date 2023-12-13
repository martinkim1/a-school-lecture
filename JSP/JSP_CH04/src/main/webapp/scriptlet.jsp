<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% int i = 24; %>
	<%
		out.println("하루는" + i + "시간이며, <br>"); //<br>을 따옴표 안에 넣어야함
		out.println("하루는" + i*60 + "분 입니다.");
	%>
</body>
</html>