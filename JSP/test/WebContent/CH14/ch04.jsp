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
4.	������ ����Ǵ� ������ �����ϴ� Ŀ���� �±׸� JSP 2.0 �±� ó���� ������� �ۼ��ϰ�,
	���� �� ������ ���Ͻÿ�.
	
	�� �±� �����̸� : *
	�� �±� ���� : ��ü �κ��� ���ڿ��� Purple �������� ���
	�� �±� �̸� : printpurple
	�� �±� ���ξ� : mycustom
	�� �±� ��� JSP �����̸� : PrintBodyTagFile.jsp
	
	1) �±� ���� �̸��� �������� �ؾ� �ϴ°�?
	 - printpurple.tag
	
	2) �±� ������ ����Ǵ� ������ ��ġ�� ����ΰ�?
	 - WEB-INF �Ϻ� tags ������ ����
	
	3) �±� ��� JSP ���� PrintBodyTagFile.jsp���� �̿�Ǵ� ������ taglib�� ����Ͻÿ�.
	 - <%@ taglib prefix="mycustom" tagdir="/WEB-INF/tags" %>
	
	4) �±� ��� JSP ���� PrintBodyTagFile.jsp���� �̿�Ǵ� �±� printpurple�� �� ���� ����Ͻÿ�.
	 -	<mycustom:printpurple>
			�� �ؽ�Ʈ�� Purple �������� ��µ˴ϴ�.
    	</mycustom:printpurple>
	
 --%>

</body>
</html>