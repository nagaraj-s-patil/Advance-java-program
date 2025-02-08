<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="add-car" method="post">
	
	<label>ID: </label>
	<input type="number" placeholder="Enete car Id" name="carId"><br>
	
	<label>model</label>
	<input type="text" placeholder="Enete car model" name="carModel"><br>
	
	<label>Brand</label>
	<input type="text" placeholder="Enete car Brand" name="carBrand"><br>
	
	<label>color</label>
	<input type="text" placeholder="Enete car Color" name="carColor"><br>
	
	<label>price</label>
	<input type="number" placeholder="Enete car Price" name="carPrice">	<br>
	
	<input type="submit" value="Add">
	</form>

</body>
</html>