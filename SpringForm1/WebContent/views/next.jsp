<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="storeData.obj" method="post" modelAttribute="log">
<form:input path="name"/>
<form:errors path="name" cssClass="error"></form:errors>

<form:input path="dept"/>
<form:errors path="dept"></form:errors>

<form:select path="city">
<form:option value="select"></form:option>
<form:options items="${cityList}"/>
</form:select>
<input type="submit" value="store">
</form:form>

</body>
</html>