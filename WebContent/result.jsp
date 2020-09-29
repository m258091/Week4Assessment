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
<h1>Temperature Conversion Result</h1>
<p>${userTemperature.getTemperature()} ${userTemperature.getTemperatureType()} 
= ${userTemperature.getConvertedTemperature()} ${userTemperature.getConvertedTemperatureType()}<br />
</p>
<a href="convertToCelsius.jsp">Convert to Celsius</a> &nbsp;
<a href="convertToFahrenheit.jsp">Convert to Fahrenheit</a> 
</body>
</html>