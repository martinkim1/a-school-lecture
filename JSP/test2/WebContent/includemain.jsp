<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	20231573 - �赿��<br>
	1. �±� param�� ���� �±� include <p>
	<jsp:include page="paramsub2.jsp" />
	
	2. �±� param�� �ִ� �±� include <p>
	<jsp:include page="paramsub2.jsp">
		<jsp:param name="programming" value="jsp"/>
	</jsp:include>
</body>
</html>