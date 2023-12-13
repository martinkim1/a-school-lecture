<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>표현언어 예제</title>
</head>
<body>

\${ 3 div 6 } = ${ 3 div 6 }<br>

\${ 10 mod 3 } = ${ 10 mod 3 }<br>

\${ 3 gt 4 } = ${ 3 gt 4 }<br>

\${ 2 * 3 ne 6 } = ${ 2 * 3 ne 6 }<br>

\${ not (5 lt 6 and 7 ge 6) } = ${ not (5 lt 6 and 7 ge 6) }<br>

<%--
1. 다음 JSP 프로그램에서 표현언어에 주의하여 그 결과를 기술하시오.
 
 ${ 3 div 6 } = 0.5
 ${ 10 mod 3 } = 1
 ${ 3 gt 4 } = false
 ${ 2 * 3 ne 6 } = false
 ${ not (5 lt 6 and 7 ge 6) } = false
 --%>

</body>
</html>