<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Jakarta DBCP</title>
</head>
<body>

<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>

<h2>Jakarta DBCP�� �̿��� DB univdb ���� ���� ���α׷� </h2>
<%
try {
	InitialContext ctx = new InitialContext();
    DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/mysql");
    Connection con = ds.getConnection();
    
	/*
    Context initCtx = new InitialContext();    
    Context env = (Context) initCtx.lookup("java:comp/env/");    
    DataSource ds = (DataSource) env.lookup("jdbc/mysql");
    Connection con = ds.getConnection();
	*/
	
    out.println("MySql �����ͺ��̽� univdb�� ���������� �����߽��ϴ�");
    con.close();
} catch (Exception e) {
	out.println("MySql �����ͺ��̽� univdb ���ӿ� ������ �ֽ��ϴ�. <hr>");
    out.println(e.getMessage());
    e.printStackTrace();
}
%>

</body>
</html>