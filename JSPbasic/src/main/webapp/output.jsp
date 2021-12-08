<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output</title>
</head>
<body>
Number 1:<%=request.getAttribute("num1")%>
<br>
Number 2:<%=request.getAttribute("num2")%>
<br>
Result:<%String no1=request.getAttribute("num1").toString();
String no2=request.getAttribute("num2").toString();
int c=Integer.parseInt(no1)+Integer.parseInt(no2);
out.println(c);%>
<!-Result:<%=request.getAttribute("c")%>-->
</body>
</html>