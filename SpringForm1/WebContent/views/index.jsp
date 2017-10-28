<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <c:url value="store.obj" var="url" /> --%>
	${err} <br>
	${smsg}
	
	<form:form action="store.obj" modelAttribute="empl" method="post">
	Name : <form:input path="name" />
	<form:errors path="name"></form:errors>
	dept : <form:input path="dept" />
	
	city : <form:select path="city">
			<form:option value="SELECT"></form:option>
			<form:options items="${cList}"></form:options>
		</form:select>
		<input type="submit" value="store" />
	</form:form>
	<a href="next.obj">click</a>
</body>
</html>