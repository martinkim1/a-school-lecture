<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>������� �̷¼�</h1>
    <%
        // ������ ���޵� �����͸� �޾ƿ�
        String name = request.getParameter("name");
        String resident1 = request.getParameter("resident1");
        String resident2 = request.getParameter("resident2");
        String education = request.getParameter("education");
        String major = request.getParameter("major");
        String platform = request.getParameter("platform");
    %>
    <p>�̸� : <%= name %></p>
    <p>�ֹι�ȣ : <%= resident1 %> - <%= resident2 %></p>
    <p>�з� : <%= education %></p>
    <p>���� : <%= major %></p>
    <p>���� �÷��� : [<%= platform %>]</p>
</body>
</html>