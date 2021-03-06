<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css"></link>
<title>Insert title here</title>
</head>
<body>

	<sf:form method="post"
		action="${pageContext.request.contextPath}/docreate"
		commandName="offer">
		<table class="formtable">
			<tr>
				<td class="label">Name:</td>
				<td><sf:input class="control" path="name" name="name"
						type="text" /><br /> <sf:errors path="name" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Email:</td>
				<td><sf:input class="control" path="email" name="email"
						type="text" /><br /> <sf:errors path="email" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Your Offer:</td>
				<td><sf:textarea class="control" path="text" name="text"></sf:textarea><br />
					<sf:errors path="text" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td></td>
				<td><input class="control" value="Create advert" type="submit"></td>
			</tr>
		</table>
	</sf:form>

</body>
</html>