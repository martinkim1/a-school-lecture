<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ page autoFlush="false" buffer="1kb" errorPage="error.jsp" %>
	
	<%
		for (int i = 1; i < 25; i++) {
			out.println("���� ��� ���� ũ�� (out.getRemaining()) : " + out.getRemaining() + "<br>");
		}
	%>
</body>
</html>