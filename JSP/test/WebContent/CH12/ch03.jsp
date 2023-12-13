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
3. ǥ������� ���� ��ü 11������ ����Ͻÿ�.
 
 1) pageContext - JSP ������ �⺻ ��ü�μ�, servletContext, session,
 				  request, response ���� ���� ��ü�� ���� ����
 				  
 2) pageScope - page �⺻ ��ü�� ����� �Ӽ��� <�Ӽ�, ��>�� ������ Map ��ü,
                ${pageScope.�Ӽ�}���� ���� ����
                
 3) requestScope - request �⺻ ��ü�� ����� �Ӽ��� <�Ӽ�, ��>�� ������ Map ��ü,
                   ${pageScope.�Ӽ�}���� ���� ����
                   
 4) sessionScope - session �⺻ ��ü�� ����� �Ӽ��� <�Ӽ�, ��>�� ������ Map ��ü,
                   ${sessionScope.�Ӽ�}���� ���� ����
                   
 5) applicationScope - Application �⺻ ��ü�� ����� �Ӽ��� <�Ӽ�,��>�� ������ Map ��ü,
                       ${applicationScope.�Ӽ�}���� ���� ����

 6) param - ��û �Ű����� <�Ű������̸�, ��>�� ������ Map ��ü,
            ${param.name}�� request.getParameter(name)�� ��ü
 
 7) paramValues - ��û �Ű����� �迭�� <�Ű������̸�, ��>�� ������ Map ��ü,
                  request.getParameterValues() ó���� ����
 
 8) header - ��û ������ <����̸�, ��>�� ������ Map ��ü,
             ${header["name"]}�� request.getHeader(����̸�)�� ����
             
 9) headerValues - ��û ���� �迭�� <����̸�, ��>�� ������ Map ��ü,
                   request.getHeaders()�� ó���� ����
 
 10) initParam - �ʱ�ȭ �Ű������� <�̸�, ��>�� ������ Map ��ü,
                 ${initParam.name}�� application.getInitParameter(name)�� ��ü
 
 11) cookie - ��Ű ������ �迭�� <��Ű�̸�, ��>�� ������ Map ��ü,
              request.getCookies()�� Cookie �迭�� �̸��� ������ Map�� ����
 
 --%>
	
</body>
</html>