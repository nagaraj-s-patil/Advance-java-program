<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% ResultSet rs=(ResultSet)request.getAttribute("carList");
 rs.next();
%>

	<form action="update-car" method="post">
	
	<label>ID: </label>
	<input type="number" value="<%=rs.getInt(1) %>" name="carId" readonly="readonly"><br>
	
	<label>model</label>
	<input type="text" value="<%=rs.getString(2) %>" name="carModel"><br>
	
	<label>Brand</label>
	<input type="text" <%=rs.getString(3) %> name="carBrand"><br>
	
	<label>color</label>
	<input type="text" <%=rs.getString(4) %> name="carColor"><br>
	
	<label>price</label>
	<input type="number" <%=rs.getInt(5) %> name="carPrice">	<br>
	
	<input type="submit" value="update">
	</form>
	
</body>
</html>