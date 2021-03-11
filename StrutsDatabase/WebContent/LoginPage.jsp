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
	<html:form action="/loginUser" method="post"><br>
		
		<h1 style="color: green;text-align: center;">NEW REGISTRATION</h1>
		
		<table>
			<tr>
				<th>UserName:</th>
				<td>
					<html:text property="username"></html:text><br>
				</td>
			</tr>
			<tr>
				<th>Password:</th>
				<td>
					 <html:text property="password"></html:text><br>
				</td>
			</tr>
			
		</table>
				<html:submit></html:submit>
	</html:form>
</body>
</html>