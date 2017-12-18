<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2 align="center">Product Details Records</h2>
		
		<div align="center">
		<table border="2">
		
			<tr>
				<th>ProductId</th><th>ProductName</th><th>ProductScale</th><th>ProductVendor</th><th>quantityInStock</th><th>buyPrice</th><th>MSRP</th><th>ProductDescription</th><th>quantityInStock</th>				
			</tr>
			
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.line}</td>
					<td>${product.scale}</td>
					<td>${product.vendor}</td>
					<td>${product.description}</td>
					<td>${product.quantityinstock}</td>
					<td>${product.buyprice}</td>
					<td>${product.MSRP}</td>
		
				</tr>
			</c:forEach>
				
			
			
		</table>
		
		</div>

</body>
</html>