<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ����� ����</title>
</head>
<body>

\${ empty 2 } = ${ empty 2 } <br>

\${ empty 0 } = ${ empty 0 } <br>

\${ empty name } = ${ empty name } <br>

\${ empty requestScope } = ${ empty requestScope } <br>

\${ empty header } = ${ empty header } <br>
 
<%--
2. ���� JSP ���α׷����� ǥ���� �����Ͽ� �� ����� ����Ͻÿ�.
 
${ empty 2 } = false 
${ empty 0 } = false 
${ empty name } = true 
${ empty requestScope } = true 
${ empty header } = false 
 --%>

</body>
</html>