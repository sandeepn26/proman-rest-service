<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><tiles:getAsString name="title" /></title>
<link href="https://fonts.googleapis.com/css?family=Chela+One|Galada|Julius+Sans+One|Merienda|Raleway|Signika|Open+Sans|Montserrat|Source+Sans+Pro|Lato" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Chela+One|Galada|Julius+Sans+One|Merienda|Raleway|Signika|Open+Sans|Source+Sans+Pro|Noto+Sans|Poppins|Roboto|Arimo|Montserrat" rel="stylesheet">
  
<link rel="stylesheet" href="/proman/resources/css/navbar.css">
<link rel="stylesheet" href="/proman/resources/css/forms.css">
<link rel="stylesheet" href="/proman/resources/css/datepicker.css">
<link rel="stylesheet" href="/proman/resources/css/search.css">
<link rel="stylesheet" href="/proman/resources/css/footer.css">
</head>

<body>
	<header id="header" class="header">
		<tiles:insertAttribute name="header" />
	</header>

	<section id="site-content">
		<tiles:insertAttribute name="body" />
	</section>

	<footer id="footer">
		<tiles:insertAttribute name="footer" />
	</footer>
</body>
</html>