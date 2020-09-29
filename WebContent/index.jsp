<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temperature Converter</title>
</head>
<body>
<h1>Temperature Converter</h1>
<form action="getTemperatureServlet" method="post"> 
Select the type of temperature conversion: 
<br />
<br />
<a href="convertToCelsius.jsp">Convert to Celsius</a> &nbsp;
<a href="convertToFahrenheit.jsp">Convert to Fahrenheit</a> 
</form> 
</body>
</html>