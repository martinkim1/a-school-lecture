<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�������̽� ResultSetMetaData ��ȸ</title>
</head>
<body>

<%@ page import="java.sql.*" %>

<h2>���̺� student�� ���̺� ��Ÿ������ ��ȸ ���α׷� </h2>

<hr><center>
<h2>�������̽� ResultSetMetaData �̿�</h2>

<%
    Connection con = null;
    Statement stmt = null;
    //String driverName = "org.gjt.mm.mysql.Driver";
    String driverName = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost:3306/univdb";

    try {
        Class.forName(driverName);
        con = DriverManager.getConnection(dbURL, "root", "");
        stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select * from student;");
        ResultSetMetaData rsmd = result.getMetaData();
        int cCount = rsmd.getColumnCount();
%>
    <table width=100% border=2 cellpadding=1>
    <tr>
       <td align=center><b>���̵�</b></td>
       <td align=center><b>��ȣ</b></td>
       <td align=center><b>�̸�</b></td>
       <td align=center><b>���г⵵</b></td>
       <td align=center><b>�й�</b></td>
       <td align=center><b>�а�</b></td>
       <td align=center><b>�޴���1</b></td>
       <td align=center><b>�޴���2</b></td>
       <td align=center><b>�ּ�</b></td>
       <td align=center><b>�̸���</b></td>
    </tr>
    <tr>
<%
		for ( int i = 1; i <= cCount; i++ ) {
%>
       <td align=center><%= rsmd.getColumnName(i) %></td>
<%
		}
%>
    </tr>
    <tr>
<%
		for ( int i = 1; i <= cCount; i++ ) {
%>
       <td align=center><%= rsmd.getColumnTypeName(i) %></td>
<%
		}
%>
    </tr>
    <tr>
<%
		for ( int i = 1; i <= cCount; i++ ) {
%>
       <td align=center><%= rsmd.getPrecision(i) %></td>
<%
		}
%>
    </tr>
<%
        result.close();
    }
    catch(Exception e) {
    	out.println("MySql �����ͺ��̽� univdb�� student ��ȸ�� ������ �ֽ��ϴ�. <hr>");
        out.println(e.toString());
        e.printStackTrace();
    }
    finally {
        if(stmt != null) stmt.close();
        if(con != null) con.close();
    }
%>
</table>
</center>

</body>
</html>