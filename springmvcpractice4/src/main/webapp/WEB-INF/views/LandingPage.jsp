<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>landing page</title>
</head>
<body>

		<p>This is landing page</p>

		<c:out value="${pringmymsg}" ></c:out>


<form id="firstForm" action="formhandlewithurl.clickme" method="post" model modelAttribute="firstformmodalatrribute">

<input type="text" name="username" />
<input type="password" name="password" />

<input type="submit" value="submit">
</form>







</body>
</html>