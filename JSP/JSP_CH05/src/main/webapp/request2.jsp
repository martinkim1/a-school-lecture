<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
%>

<%
	String studentNum = request.getParameter("studentNum");
	String[] majors = request.getParameterValues("major");
%>

<h2> 학생정보 입력결과</h2>

학번 : <%= studentNum %><p>
전공 : <%
			if (majors == null) {
				out.println("전공 없음.");
			} else {
				for (int i = 0; i < majors.length; i++)
					out.println(majors[i] + " ");
			}
	%>
	
<h2> 요청 정보 </h2>
요청 방식 : <%= request.getMethod() %><p>
요청 URL : <%= request.getRequestURL() %><p>
요청 URI : <%= request.getRequestURI() %><p>
클라이언트 주소 : <%= request.getRemoteAddr() %><p>
클라이언트 호스트 : <%= request.getRemoteHost() %><p>
프로토콜 방식 : <%= request.getProtocol() %><p>
서버 이름 : <%= request.getServerName() %><p>
서버 포트 번호 : <%= request.getServerPort() %><p>
</body>
</html>