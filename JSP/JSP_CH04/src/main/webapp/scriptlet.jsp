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
		out.println("�Ϸ��" + i + "�ð��̸�, <br>"); //<br>�� ����ǥ �ȿ� �־����
		out.println("�Ϸ��" + i*60 + "�� �Դϴ�.");
	%>
</body>
</html>