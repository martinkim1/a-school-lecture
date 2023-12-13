<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>표현언어 예제</title>
</head>
<body>

\${ empty 2 } = ${ empty 2 } <br>

\${ empty 0 } = ${ empty 0 } <br>

\${ empty name } = ${ empty name } <br>

\${ empty requestScope } = ${ empty requestScope } <br>

\${ empty header } = ${ empty header } <br>
 
<%--
2. 다음 JSP 프로그램에서 표현언어에 주의하여 그 결과를 기술하시오.
 
${ empty 2 } = false 
${ empty 0 } = false 
${ empty name } = true 
${ empty requestScope } = true 
${ empty header } = false 
 --%>

</body>
</html>