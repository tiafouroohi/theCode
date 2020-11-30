<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p><c:out value="${error}"/></p>
<h1>What is The Code?</h1>
<form action="/code" method="POST">
<input type="text" name="code" placeholder="What is the Code?">
<input type="submit" value="submit">



</form>


</body>
</html>