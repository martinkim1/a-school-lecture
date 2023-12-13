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
	application.log("현재까지 조회 수: " + cnt);
%>
	서버 컨테이너 정보: <%=application.getServerInfo() %> <p>
	현재까지 조회 수 : <%=cnt %>
</body>
</html>