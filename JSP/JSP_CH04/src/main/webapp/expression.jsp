<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 표현식 <.%= %>는 변수, 계산식, 함수 호출 결과를 문자열 형태로 출력한다. -->
	<% int year = 365; %>
	
	<% out.println("1년은 약 몇 주 일까요? <p>"); %>
	<%= year / 7 %>
	<%= "주 입니다." %>
</body>
</html>