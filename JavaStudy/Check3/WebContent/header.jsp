<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar,java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<label class="header_title">login</label>
		<label class="date">
			<%
				Calendar cl = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				String formatDate = sdf.format(cl.getTime());
			%>
			<%= formatDate %>
		</label>
	</div>
</body>
</html>