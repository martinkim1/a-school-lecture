<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ page info="���� ��ü page : page �ڱ� �ڽ��� ��ü" %>
	<%= this.getServletInfo() %><p>
	<%= ((org.apache.jasper.runtime.HttpJspBase) (page)).getServletInfo() %>
</body>
</html>