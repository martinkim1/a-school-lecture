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
5. ������ Ŭ������ ���ǵ� �޼ҵ带 �±� ���̺귯�� ��ũ���Ϳ��� �Լ��� �����Ͽ�,
   ǥ������ �̿��ϴ� ������ ����Ͽ���. ������ ������ ���Ͻÿ�.
   
   (1) ���� Ŭ�������� �޼ҵ� hello()�� ǥ������ �Լ��� �̿��� �����̴�.
       �� ������ �˸��� Ű���� �����ΰ�?
       
       package sample;
       		
       		public class HelloTLD {
       		
       		public @@@ String hello() {
       			return "Hello TLD!";
       		}
       	}
       	
       	- static
       
   (2) ������ TLD ���� ELfunction.tld ������ �Ϻ��̴�.
       ���� �� ������ �˸°� ä��ÿ�.
       
       <function>
       		<description>������ ���ڿ� ��ȯ</description>
       		<name>getHello</name>
       		<function-class>
       			@@@
       		</function-class>
       		<function-signature>
       			java.lang.String hello()
       		</function-signature>
       	</function>
       	
       	- sample.HelloTLD
       	
   (3) ������ ������ ���� �Լ��� ȣ���ϴ� ǥ������̴�.
       ���� �� ������ �˸°� ä��ÿ�.
       
       <%@ taglib prefix="@@@" uri="/WEB-INF/tld/ELfunction.tld" %>
       
       ${ test:@@@ }
       
       - test, getHello()
       
   (4) �� (3)�� ���α׷��� ����� �����ΰ�?
       
       - Hello TLD! 
      
 --%>

</body>
</html>