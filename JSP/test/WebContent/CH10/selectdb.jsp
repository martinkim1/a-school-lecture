<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�����ͺ��̽� ���� : ���̺� student ��ȸ</title>
</head>
<body>

<%@ page import="java.sql.*" %>

<h2>�����ͺ��̽� univdb�� ���̺� student ��ȸ ���α׷� </h2>

<hr><center>
<h2>�л����� ��ȸ</h2>

<%
    Connection con = null;
    Statement stmt = null;
    //String driverName = "org.gjt.mm.mysql.Driver";
    String driverName = "com.mysql.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost/univdb";

    try {
        Class.forName(driverName);
        con = DriverManager.getConnection(dbURL, "root", "");
        stmt = con.createStatement();
        ResultSet result = stmt.executeQuery("select * from student;");
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
<%
        while (result.next()) {
%>
    <tr>
       <td align=center><%= result.getString(1) %></td>
       <td align=center><%= result.getString(2) %></td>
       <td align=center><%= result.getString(3) %></td>
       <td align=center><%= result.getString(4) %></td>
       <td align=center><%= result.getString(5) %></td>
       <td align=center><%= result.getString(6) %></td>
       <td align=center><%= result.getString(7) %></td>
       <td align=center><%= result.getString(8) %></td>
       <td align=center><%= result.getString(9) %></td>
       <td align=center><%= result.getString(10) %></td>
    </tr>
<%
        }
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
