<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ page errorPage="exception.jsp" %>
	<% String []str = {"�����մϴ�.", "Thank you"}; %>
	�ѱ���� <%= str[0]%>�� <br>
	����� <%= str[2] %>�̴�.
</body>
</html>