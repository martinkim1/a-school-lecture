<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.util.Enumeration" %>
<% request.setCharacterEncoding("euc-kr"); %>

<h2>취미와 가보고 싶은 국가결과</h2>

<%
	Enumeration<String> e = request.getParameterNames();

	while (e.hasMoreElements()){
		String name = e.nextElement();
		String [] data = request.getParameterValues(name);
		if (data != null) {
			for (String eachdata : data)
				out.println(eachdata + " ");
		}
		out.println("<p>");
	}
%>
</body>
</html>