<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>DBCP �̿� : ���̺� student ���ڵ� ����</title>
</head>
<body>

<%@ page import="java.sql.*, javax.sql.*, javax.naming.*" %>

<h2>�����ͺ��̽� univdb�� ���̺� student�� �л� ���� ���α׷� </h2>

<hr><center>
<h2>�л� ����</h2>

<%
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    StringBuffer SQL = new StringBuffer("insert into student "); 
    SQL.append("values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    String name = "������";

    try {
        Context initCtx = new InitialContext();    
        Context env = (Context) initCtx.lookup("java:comp/env/");    
        DataSource ds = (DataSource) env.lookup("jdbc/mysql");
        con = ds.getConnection();

        pstmt = con.prepareStatement(SQL.toString());
        //������ �л� ���ڵ� ������ �Է�
        pstmt.setString(1, "DBCP");
        pstmt.setString(2, "commons");
        pstmt.setString(3, name);
        pstmt.setInt(4, 2010);
        pstmt.setString(5, "1039653");
        pstmt.setString(6, "����������");
        pstmt.setString(7, "011");
        pstmt.setString(8, "2398-9750");
        pstmt.setString(9, "��õ��");
        pstmt.setString(10, "dbcp@gmail.com");

        int rowCount = pstmt.executeUpdate();        
        if (rowCount == 1) out.println("<hr>�л� [" + name+ "] ���ڵ� �ϳ��� ���������� ���� �Ǿ����ϴ�.<hr>");
        else out.println("�л� ���ڵ� ���Կ� ������ �ֽ��ϴ�.");
        
        //�ٽ� �л� ��ȸ
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
    	out.println("MySql �����ͺ��̽� univdb�� student�� ���� �Ǵ� ��ȸ�� ������ �ֽ��ϴ�.<hr>");
        out.println(e.toString());
        e.printStackTrace();
    }
    finally {
        if(pstmt != null) pstmt.close();
        if(con != null) con.close();
    }
%>
</table>
</center>

</body>
</html>