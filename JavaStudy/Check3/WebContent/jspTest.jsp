<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="contents">
		<table>
			<tr>
				<td class="content_title">name</td>
				<td class="name_box">
					<input type="text">
				</td>
			</tr>
			<tr>
				<td class="content_title">id</td>
				<td class="id_box">
					<input type="text">
				</td>
			</tr>
		</table>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>