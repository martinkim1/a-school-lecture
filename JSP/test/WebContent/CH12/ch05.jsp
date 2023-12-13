<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch05</title>
</head>
<body>

<%--
5. 다음은 클래스에 정의된 메소드를 태그 라이브러리 디스크립터에서 함수로 정의하여,
   표현언어에서 이용하는 과정을 기술하였다. 각각의 질문에 답하시오.
   
   (1) 다음 클래스에서 메소드 hello()를 표현언어에서 함수로 이용할 예정이다.
       빈 공간에 알맞은 키워드 무엇인가?
       
       package sample;
       		
       		public class HelloTLD {
       		
       		public @@@ String hello() {
       			return "Hello TLD!";
       		}
       	}
       	
       	- static
       
   (2) 다음은 TLD 파일 ELfunction.tld 파일의 일부이다.
       다음 빈 공간을 알맞게 채우시오.
       
       <function>
       		<description>간단한 문자열 반환</description>
       		<name>getHello</name>
       		<function-class>
       			@@@
       		</function-class>
       		<function-signature>
       			java.lang.String hello()
       		</function-signature>
       	</function>
       	
       	- sample.HelloTLD
       	
   (3) 다음은 위에서 만든 함수를 호출하는 표현언어이다.
       다음 빈 공간을 알맞게 채우시오.
       
       <%@ taglib prefix="@@@" uri="/WEB-INF/tld/ELfunction.tld" %>
       
       ${ test:@@@ }
       
       - test, getHello()
       
   (4) 위 (3)번 프로그램의 결과는 무엇인가?
       
       - Hello TLD! 
      
 --%>

</body>
</html>