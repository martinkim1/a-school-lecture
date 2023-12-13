<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch03</title>
</head>
<body>

<%--
3.	다음에 기술되는 조건을 만족하는 커스텀 태그를 JSP 2.0 태그 처리기 방식으로 작성하고,
	다음 각 질문에 답하시오.
	
	· 태그 처리기 파일이름 : PrintBody.java
	· 태그 역할 : 몸체 부분의 문자열을 purple 색상으로 출력
	· TLD 파일이름 : PrintBody.tld
	· 태그 이름 : print
	· 태그 접두어 : mycustom
	· 태그 사용 JSP 파일이름 : PrintBody.jsp
	
	1) 태그 처리기 파일 PrintBody.java에서 상속받는 클래스는 무엇인가?
	 - SimpleTagSupport
	
	2) TLD 파일 PrintBody.tld가 저장되는 폴더의 위치는 어디인가?
	 - WEB-INF 하부 폴더 tld 폴더에 저장
	
	3) 태그 사용 JSP 파일 PrintBody.jsp에서 이용되는 지시자 taglib를 기술하시오.
	 - <%@ taglib uri="/WEB-INF/tld/PrintBody.tld" prefix="mycustom"%>
	
	4) 태그 사용 JSP 파일 PrintBody.jsp에서 이용되는 태그 print의 한 예를 기술하시오.
	 -	<mycustom:print>
	 		이 텍스트는 purple 색상으로 출력됩니다.
		</mycustom:print>
	 
 --%>

</body>
</html>