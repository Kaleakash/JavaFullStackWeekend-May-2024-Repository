<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Welcome to HTML Web Page</p>
<%!int a,b,sum; %>
<%
	a=100;
	b=200;
	sum = a+b;
	System.out.println("Welcome to JSP on console");
	out.println("Welcome to JSP on browser");
	out.println("Sum of two number is "+sum);
	out.println("<font color='red'>Sum of two number is "+sum+"</font>");
%>
<p>Sum of two number is <%=10+20 %></p>
<font color="red">Sum of <%=a %> and <%=b %> is <%=sum %></font>

</body>
</html>