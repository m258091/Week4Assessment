<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<h1>Temperature Converter</h1>
<p>${userTemperature.getTemperature()} ${userTemperature.getTemperatureType()} 
= ${userTemperature.getConvertedTemperature()} ${userTemperature.getConvertedTemperatureType()}<br />
</p>
<a href="index.jsp">Select another temperature to convert</a>
</body>
</html>