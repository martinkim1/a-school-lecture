<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- 20231573 - �赿�� --%>
20231573 - �赿�� <br>
 <% int num, sum = 0; %>
 <%
 	for (num=1; num<=100; num++) {
 		sum += num;
 	}
	out.print("1���� 100������ ���� "+sum+"�̴�.");
 %>
</body>
</html>