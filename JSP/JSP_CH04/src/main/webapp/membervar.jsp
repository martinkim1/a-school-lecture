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
	[��������] i = <%= ++i %>
	<p></p>
	[�ҼӺ���] memi = <%= ++memi %>
	<%! int memi = 10; %> <!-- ��������� �����ϴ� <.%! %>�±� -->
</body>
</html>