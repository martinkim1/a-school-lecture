<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>데이터베이스 예제 : 테이블 student 조회</title>
</head>
<body>

<%@ page import="java.sql.*" %>

<h2>데이터베이스 univdb의 테이블 student 조회 프로그램 </h2>

<hr><center>
<h2>학생정보 조회</h2>

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
       <td align=center><b>아이디</b></td>
       <td align=center><b>암호</b></td>
       <td align=center><b>이름</b></td>
       <td align=center><b>입학년도</b></td>
       <td align=center><b>학번</b></td>
       <td align=center><b>학과</b></td>
       <td align=center><b>휴대폰1</b></td>
       <td align=center><b>휴대폰2</b></td>
       <td align=center><b>주소</b></td>
       <td align=center><b>이메일</b></td>
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
    	out.println("MySql 데이터베이스 univdb의 student 조회에 문제가 있습니다. <hr>");
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
