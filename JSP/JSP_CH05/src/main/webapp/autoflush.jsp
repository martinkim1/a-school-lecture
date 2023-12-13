<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ page autoFlush="false" buffer="1kb" %>
	<h2>현재 autoFlush = <%=out.isAutoFlush() %></h2><p>
	
	<%
		for (int i = 1; i < 25; i++) { // 시험 나옴!!!
			out.println("남은 출력 버퍼 크기 (out.getRemaining()) : " + out.getRemaining() + "<br>");
			
			if (out.getRemaining() < 50) {
				out.println("<br>");
				out.flush();
			}
		}
	%>
	<hr>
	초기 출력 버퍼 크기 : <%=out.getBufferSize() %> byte <br>
	남은 출력 버퍼 크기 : <%=out.getRemaining() %> byte
</body>
</html>