<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%! int cnt = 0; %>

<%
	String scount = (String) application.getAttribute("count");

	if (scount != null) {
		cnt = Integer.parseInt(scount);
	} else {
		cnt = 0;
	}
	
	application.setAttribute("count", Integer.toString(++cnt));
	application.log("������� ��ȸ ��: " + cnt);
%>
	���� �����̳� ����: <%=application.getServerInfo() %> <p>
	������� ��ȸ �� : <%=cnt %>
</body>
</html>