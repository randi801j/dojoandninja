<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Dojo</title>
</head>
<body>
<h1>Create Dojo</h1>
<form:form method="POST" action="/dojo/createDojo" modelAttribute="dojo">
<p>
<form:label path="name"> Name:</form:label>
<form:errors path="name"/>
<form:input path="name"/>
</p>
<button>Create Dojo</button>
</form:form>
</body>
</html>