<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch04</title>
</head>
<body>

<%--
4.	다음에 기술되는 조건을 만족하는 커스텀 태그를 JSP 2.0 태그 처리기 방식으로 작성하고,
	다음 각 질문에 답하시오.
	
	· 태그 파일이름 : *
	· 태그 역할 : 몸체 부분의 문자열을 Purple 색상으로 출력
	· 태그 이름 : printpurple
	· 태그 접두어 : mycustom
	· 태그 사용 JSP 파일이름 : PrintBodyTagFile.jsp
	
	1) 태그 파일 이름은 무엇으로 해야 하는가?
	 - printpurple.tag
	
	2) 태그 파일이 저장되는 폴더의 위치는 어디인가?
	 - WEB-INF 하부 tags 폴더에 저장
	
	3) 태그 사용 JSP 파일 PrintBodyTagFile.jsp에서 이용되는 지시자 taglib를 기술하시오.
	 - <%@ taglib prefix="mycustom" tagdir="/WEB-INF/tags" %>
	
	4) 태그 사용 JSP 파일 PrintBodyTagFile.jsp에서 이용되는 태그 printpurple의 한 예를 기술하시오.
	 -	<mycustom:printpurple>
			이 텍스트는 Purple 색상으로 출력됩니다.
    	</mycustom:printpurple>
	
 --%>

</body>
</html>