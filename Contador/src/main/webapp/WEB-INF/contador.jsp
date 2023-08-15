<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitar contador</title>


<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
 <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<h2> Has visitado la web <c:out value="${contador}"  /> veces </h2>

  <button  type="submit" class="btn btn-info"><a  href="/">volver atras </a></button>
  
 <button  type="submit" class="btn btn-danger"><a  href="/reset"> reseteo </a> </button>



</body>
</html>