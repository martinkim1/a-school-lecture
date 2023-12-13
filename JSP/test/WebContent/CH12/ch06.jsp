<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ch06</title>
</head>
<body>

<%--
6. 다음에서 표현언어 비활성화 지시자를 살펴보고, 다음 표현언어의 결과를 기술하시오.

   (1)
     보기	|  <%@ page isELIgnored="false" %>	|
	 	|									|
	  	|  ${ 2 / 4 }						|	
	  
       - 0.5
   
   (2)
   	보기	|  <%@ page isELIgnored="true" %>	|
	 	|									|
	  	|  ${ 2 / 4 }						|	
	  
       - ${ 2 / 4 } 
    
 --%>

</body>
</html>