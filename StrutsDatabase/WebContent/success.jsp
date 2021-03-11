<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="">hello <%=session.getAttribute("firstName") %></h1>
	<table>
		<tr>
			<td>Full Name :</td>
			<td><%=session.getAttribute("firstName") %> <%=session.getAttribute("lastName") %></td>
			
		</tr>
		<tr>
			<td>Email :</td>
			<td><%=session.getAttribute("email") %></td>
		</tr>
		<tr>
			<td>phoneNumber :</td>
			<td>	<%=session.getAttribute("phoneNumber") %></td>
		</tr>
	</table>
</body>
</html>