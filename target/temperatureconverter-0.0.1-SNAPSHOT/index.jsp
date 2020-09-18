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
Enter the temperature to convert to Celsius:  
<input type="text" name="userTemperature" size="3"> 
<input type="submit" value="Convert" /> 
</form> 
</body>
</html>