<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Minha página de bot 2</h1>
	<h1>${bots}</h1>

<table class="table table-striped">
	<c:forEach items="${bots}" var="bot">
		<tr>
			<td>${bot.name}</td>

			
		</tr>
	</c:forEach>


</table>


</body>
</html>