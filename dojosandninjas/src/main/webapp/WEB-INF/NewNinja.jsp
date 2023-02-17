<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
<h1>Create Ninja</h1>
<form:form method="POST" action="/ninja/createNinja" modelAttribute="ninja">
<p>
<form:label path="dojo"> Name:</form:label>
<form:errors path="dojo"/>
<form:select path="dojo">
<c:forEach items= "${allDojos}" var="dojo">
<option value= "${dojo.id }">${dojo.name }</option>

</c:forEach>

</form:select>
</p>
<p>
<form:label path="firstname">First Name:</form:label>
<form:errors path="firstname"/>
<form:input path="firstname"/>
</p>
<p>
<form:label path="lastname">Last Name:</form:label>
<form:errors path="lastname"/>
<form:input path="lastname"/>
</p>
<p>
<form:label path="age">Age:</form:label>
<form:errors path="age"/>
<form:input path="age"/>
</p>
<button>Create Ninja</button>
</form:form>
</body>
</html>