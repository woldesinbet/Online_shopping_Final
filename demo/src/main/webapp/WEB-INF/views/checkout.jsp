<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="newCheckout" method="post"
		enctype="multipart/form-data">
		<table>
		<tr>
				<td>Card No:</td>
				<td><form:input id="cardNo" name="cardNo" path="cardNo" type="text" /></td>
				<td><form:errors path="cardNo" cssStyle="color:red;" /></td>
		</tr>
		<tr>
				<td>Name appear in Card:</td>
				<td><form:input id="name" name="name" path="name" type="text" /></td>
				<td><form:errors path="name" cssStyle="color:red;" /></td>
		</tr>
		<tr>
				<td>Expiration Date:</td>
				<td><form:input id="expirationdate" name="expirationdate" path="expirationdate" type="text" /></td>
				<td><form:errors path="expirationdate" cssStyle="color:red;" /></td>
		</tr>
		<tr>
				<td>CCV No:</td>
				<td><form:input id="ccv" name="ccv" path="ccv" type="text" /></td>
				<td><form:errors path="ccv" cssStyle="color:red;" /></td>
		</tr>
		</table>
		<input type="submit" value="Submit">
		
</form:form>

</body>
</html>