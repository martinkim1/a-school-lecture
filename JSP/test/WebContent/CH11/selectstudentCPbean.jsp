<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�����ͺ��̽� �ڹ� ���� ���� : CP �̿�</title>
</head>
<body>

<%@ page import="java.util.ArrayList, univ.StudentEntity" %>

<h2> �ڹ� ���� StudentDatabaseCP�� �̿��� ���̺� student ��ȸ ���α׷� </h2>
<hr><center>
<h2>�л����� ��ȸ</h2>

	<jsp:useBean id="stdtdb" class="univ.StudentDatabaseCP" scope="page" />
<%
	ArrayList<StudentEntity> list = stdtdb.getStudentList();
	int counter = list.size();
	if (counter > 0) {
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
		for( StudentEntity stdt : list ) {
%>
    <tr>
       <td align=center><%= stdt.getId() %></td>
       <td align=center><%= stdt.getPasswd() %></td>
       <td align=center><%= stdt.getName() %></td>
       <td align=center><%= stdt.getYear() %></td>
       <td align=center><%= stdt.getSnum() %></td>
       <td align=center><%= stdt.getDepart() %></td>
       <td align=center><%= stdt.getMobile1() %></td>
       <td align=center><%= stdt.getMobile2() %></td>
       <td align=center><%= stdt.getAddress() %></td>
       <td align=center><%= stdt.getEmail() %></td>
    </tr>
<%
	    }
%>
	</table>
<% 	}
%>

</center>

<p><hr>��ȸ�� �л� ���� <%=counter%>�� �Դϴ�.

</body>
</html>
