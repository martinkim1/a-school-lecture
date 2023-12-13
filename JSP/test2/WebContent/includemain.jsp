<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	20231573 - 김동연<br>
	1. 태그 param이 없는 태그 include <p>
	<jsp:include page="paramsub2.jsp" />
	
	2. 태그 param이 있는 태그 include <p>
	<jsp:include page="paramsub2.jsp">
		<jsp:param name="programming" value="jsp"/>
	</jsp:include>
</body>
</html>