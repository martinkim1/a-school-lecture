<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�Խ��� �⺻ ���� : �Խ� ��� ǥ��</title>
</head>
<body>
<h2>�Խ��� ��� ǥ�� ���α׷� </h2>
<hr>
<center>

	<%@ page import="java.util.ArrayList, univ.BoardEntity, java.text.SimpleDateFormat" %>
	<jsp:useBean id="brddb" class="univ.BoardDBCP" scope="page" />
	<% 
		//�Խ� ����� ���� �迭����Ʈ�� �ڹ���� �̿��Ͽ� Ȯ�� 
		ArrayList<BoardEntity> list = brddb.getBoardList(); 
	   	int counter = list.size();
	   	int row = 0;
	   	
	   	if (counter > 0) {
	%>
    <table width=800 border=0 cellpadding=1 cellspacing=3>
    
    <tr>
       <th><font color=blue><b>��ȣ</b></font></th>
       <th><font color=blue><b>����</b></font></th>
       <th><font color=blue><b>�ۼ���</b></font></th>
       <th><font color=blue><b>�ۼ���</b></font></th>
       <th><font color=blue><b>���ڸ���</b></font></th>
    </tr>
	<%
		//�Խ� ������� 2010-3-15 10:33:21 ���·� ����ϱ� ���� Ŭ���� 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for( BoardEntity brd : list ) {
			//Ȧ¦���� �ٸ��� ���� ����
			String color = "papayawhip";
			if ( ++row % 2 == 0 ) color = "white"; 
	%>
    <tr bgcolor=<%=color %> 
		onmouseover="this.style.backgroundColor='SkyBlue'"
    	onmouseout="this.style.backgroundColor='<%=color %>'">
		<!-- ������ ������ ���� ��ũ�� id�� ���� -->
       <td align=center><a href="editboard.jsp?id=<%= brd.getId()%>"><%= brd.getId()%></a></td>
       <td align=left><%= brd.getTitle() %></td>
       <td align=center><%= brd.getName() %></td>
		<!-- �Խ� �ۼ����� 2010-3-15 10:33:21 ���·� ��� -->
       <td align=center><%= df.format(brd.getRegdate()) %></td>
       <td align=center><%= brd.getEmail() %></td>
    </tr>
	<%
	    }
	%>
	</table>
<% 	}
%>
<hr width=90%>
<p>��ȸ�� �Խ��� ��� ���� <%=counter%>�� �Դϴ�.
</center><hr>
<center>
<form name=form method=post action=editboard.jsp>
      <input type=submit value="�Խõ��"> 
</form>
</center>

</body>
</html>
