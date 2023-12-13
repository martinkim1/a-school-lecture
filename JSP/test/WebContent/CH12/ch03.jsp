<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch03</title>
</head>
<body>
	
<%--
3. 표현언어의 내장 객체 11가지를 기술하시오.
 
 1) pageContext - JSP 페이지 기본 객체로서, servletContext, session,
 				  request, response 등의 여러 객체를 참조 가능
 				  
 2) pageScope - page 기본 객체에 저장된 속성의 <속성, 값>을 저장한 Map 객체,
                ${pageScope.속성}으로 값을 참조
                
 3) requestScope - request 기본 객체에 저장된 속성의 <속성, 값>을 저장한 Map 객체,
                   ${pageScope.속성}으로 값을 참조
                   
 4) sessionScope - session 기본 객체에 저장된 속성의 <속성, 값>을 저장한 Map 객체,
                   ${sessionScope.속성}으로 값을 참조
                   
 5) applicationScope - Application 기본 객체에 저장된 속성의 <속성,값>을 저장한 Map 객체,
                       ${applicationScope.속성}으로 값을 참조

 6) param - 요청 매개변수 <매개변수이름, 값>을 저장한 Map 객체,
            ${param.name}은 request.getParameter(name)을 대체
 
 7) paramValues - 요청 매개변수 배열을 <매개변수이름, 값>을 저장한 Map 객체,
                  request.getParameterValues() 처리와 동일
 
 8) header - 요청 정보의 <헤더이름, 값>을 저장한 Map 객체,
             ${header["name"]}은 request.getHeader(헤더이름)와 같음
             
 9) headerValues - 요청 정보 배열을 <헤더이름, 값>을 저장한 Map 객체,
                   request.getHeaders()의 처리와 동일
 
 10) initParam - 초기화 매개변수의 <이름, 값>을 저장한 Map 객체,
                 ${initParam.name}은 application.getInitParameter(name)을 대체
 
 11) cookie - 쿠키 정보의 배열을 <쿠키이름, 값>을 저장한 Map 객체,
              request.getCookies()의 Cookie 배열의 이름과 값으로 Map을 생성
 
 --%>
	
</body>
</html>