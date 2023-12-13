<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch04_02</title>
</head>
<body>
<%--
(2) 내장 객체 header에서 이용할 수 있는 모든 속성에 대한 저장 값을
    출력하는 프로그램을 작성하시오.
 --%>
 
<h2>\${ header } : 결과</h2>
 ${ header } <p>

<hr>
\${ headerValues } = ${ headerValues } <p>
\${ headerValues.cookie[0] } = ${ headerValues.cookie[0] } <p>
\${ headerValues.connection[0] } = ${ headerValues.connection[0] } <p>
\${ headerValues.host[0] } = ${ headerValues.host[0] } <p>
\${ headerValues.accept[0] } = ${ headerValues.accept[0] } <p>

<hr>
\${ headerValues["accept-language"][0] } = ${ headerValues["accept-language"][0] } <p>
\${ headerValues["user-agent"][0] } = ${ headerValues["user-agent"][0] } <p>
\${ headerValues["accept-language"][0] } = ${ headerValues["accept-language"][0] } <p>
\${ headerValues["ua-cpu"][0] } = ${ headerValues["ua-cpu"][0] } <p>

</body>
</html>