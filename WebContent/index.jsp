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
Enter the temperature to convert as Integer:  
<input type="text" name="userTemperature" size="5"> 
<input type="submit" name="celsius" value="Convert to Celsius" /> 
<input type="submit" name="fahrenheit" value="Convert To Fahrenheit" />
</form> 
</body>
</html>