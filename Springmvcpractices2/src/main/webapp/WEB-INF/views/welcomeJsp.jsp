<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcomeJsp</title>
</head>
<body>

      <c:out value="${Printthisinjsp}"></c:out>






<a href="gotosecondpage.bhangale">clickme</a>


<a href="<c:url value='gotosecondpage.bhangale'></c:url>">Click c:url jstl</a>


</body>
</html>