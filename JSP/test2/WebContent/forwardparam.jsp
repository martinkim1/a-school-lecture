<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	20231573 - 김동연
	<% int i = 12; %>
	<% int n = 365; %>
	1년은 <%=i %>달 입니다.
	<jsp:forward page="paramsub1.jsp">
		<jsp:param name="weeks" value="52" />
	</jsp:forward>
	1년은 <%=n %>일 입니다.
</body>
</html>