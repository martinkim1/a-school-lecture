<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ����� ����</title>
</head>
<body>

\${ 3 div 6 } = ${ 3 div 6 }<br>

\${ 10 mod 3 } = ${ 10 mod 3 }<br>

\${ 3 gt 4 } = ${ 3 gt 4 }<br>

\${ 2 * 3 ne 6 } = ${ 2 * 3 ne 6 }<br>

\${ not (5 lt 6 and 7 ge 6) } = ${ not (5 lt 6 and 7 ge 6) }<br>

<%--
1. ���� JSP ���α׷����� ǥ���� �����Ͽ� �� ����� ����Ͻÿ�.
 
 ${ 3 div 6 } = 0.5
 ${ 10 mod 3 } = 1
 ${ 3 gt 4 } = false
 ${ 2 * 3 ne 6 } = false
 ${ not (5 lt 6 and 7 ge 6) } = false
 --%>

</body>
</html>