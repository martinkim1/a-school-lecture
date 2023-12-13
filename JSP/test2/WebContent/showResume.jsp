<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>기술정보 이력서</h1>
    <%
        // 폼에서 전달된 데이터를 받아옴
        String name = request.getParameter("name");
        String resident1 = request.getParameter("resident1");
        String resident2 = request.getParameter("resident2");
        String education = request.getParameter("education");
        String major = request.getParameter("major");
        String platform = request.getParameter("platform");
    %>
    <p>이름 : <%= name %></p>
    <p>주민번호 : <%= resident1 %> - <%= resident2 %></p>
    <p>학력 : <%= education %></p>
    <p>전공 : <%= major %></p>
    <p>경험 플랫폼 : [<%= platform %>]</p>
</body>
</html>