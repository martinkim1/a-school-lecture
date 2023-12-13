<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% int i = 0; %>
	[지역변수] i = <%= ++i %>
	<p></p>
	[소속변수] memi = <%= ++memi %>
	<%! int memi = 10; %> <!-- 멤버변수를 선언하는 <.%! %>태그 -->
</body>
</html>