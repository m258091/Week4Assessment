<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Celsius Temperature Converter</h1>
<form action="convertToCelsiusServlet" method="post"> 
Enter the temperature to convert as Integer:  
<input type="text" name="userTemperature" size="5"> 
<input type="submit" name="celsius" value="Convert" /> 
</form>
</body>
</html>