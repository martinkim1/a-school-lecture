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
3.	������ ����Ǵ� ������ �����ϴ� Ŀ���� �±׸� JSP 2.0 �±� ó���� ������� �ۼ��ϰ�,
	���� �� ������ ���Ͻÿ�.
	
	�� �±� ó���� �����̸� : PrintBody.java
	�� �±� ���� : ��ü �κ��� ���ڿ��� purple �������� ���
	�� TLD �����̸� : PrintBody.tld
	�� �±� �̸� : print
	�� �±� ���ξ� : mycustom
	�� �±� ��� JSP �����̸� : PrintBody.jsp
	
	1) �±� ó���� ���� PrintBody.java���� ��ӹ޴� Ŭ������ �����ΰ�?
	 - SimpleTagSupport
	
	2) TLD ���� PrintBody.tld�� ����Ǵ� ������ ��ġ�� ����ΰ�?
	 - WEB-INF �Ϻ� ���� tld ������ ����
	
	3) �±� ��� JSP ���� PrintBody.jsp���� �̿�Ǵ� ������ taglib�� ����Ͻÿ�.
	 - <%@ taglib uri="/WEB-INF/tld/PrintBody.tld" prefix="mycustom"%>
	
	4) �±� ��� JSP ���� PrintBody.jsp���� �̿�Ǵ� �±� print�� �� ���� ����Ͻÿ�.
	 -	<mycustom:print>
	 		�� �ؽ�Ʈ�� purple �������� ��µ˴ϴ�.
		</mycustom:print>
	 
 --%>

</body>
</html>