<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�����ͺ��̽� ���� : dbconnect.jsp</title>
</head>
<body>

<%@ page import="java.sql.*" %>

<h2>�����ͺ��̽� ����̹��� DB univdb ���� ���� ���α׷� </h2>
<%
try {
    String driverName = "org.gjt.mm.mysql.Driver";
    String dbURL = "jdbc:mysql://localhost:3306/univdb";

    Class.forName(driverName);
    Connection con = DriverManager.getConnection(dbURL, "root", "");
    out.println("MySql �����ͺ��̽� univdb�� ���������� �����߽��ϴ�");
    con.close();
}
catch (Exception e) {
	out.println("MySql �����ͺ��̽� univdb ���ӿ� ������ �ֽ��ϴ�. <hr>");
    out.println(e.getMessage());
    e.printStackTrace();
}
%>

</body>
</html>