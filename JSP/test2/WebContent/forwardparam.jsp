<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	20231573 - �赿��
	<% int i = 12; %>
	<% int n = 365; %>
	1���� <%=i %>�� �Դϴ�.
	<jsp:forward page="paramsub1.jsp">
		<jsp:param name="weeks" value="52" />
	</jsp:forward>
	1���� <%=n %>�� �Դϴ�.
</body>
</html>