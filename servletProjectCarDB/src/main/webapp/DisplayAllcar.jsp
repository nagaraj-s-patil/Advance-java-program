<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style type="text/css">
 	th,td{
 		text-align: center;
 	}
 	table {
 		margin-top: 100px;
 		margin-left: 250px
}
 
 </style>
</head>
<body>
<% ResultSet rs=(ResultSet)request.getAttribute("carList"); %>

	<table border="">
	<tr>
	<th>carId</th>
	<th>carModel</th>
	<th>carBrand</th>
	<th>carColor</th>
	<th>carPrice</th>
	<th>Opration Update</th>
	<th>Opration Delete</th>
	</tr>
	<%while(rs.next()){ %>
	<tr>
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getInt(5) %></td>		
		<td><a href="update-car?carId=<%= rs.getInt(1)%>">Update</a> </td>
		<td><a href="delete.jsp">delete</a> </td> 
	
	</tr>
	<%} %>
	
	</table>
</body>
</html>