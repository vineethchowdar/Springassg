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

		<h2 align="center">Order Form</h2>
		
		<table>
			<form action="orderProcess">
				<tr><td>OrderId      : </td><td><input type="text" name="orderId"/></td></tr>
				<tr><td>ProductId    : </td>			
				<td>
					<input type="text" name="productId"/> 
				</td>					
				</tr>
				<tr><td>OrderQuantity: </td><td><input type="text" name="orderQuantiy"/></td></tr>
				<tr><td><input type="submit" value="Place Order"/></td></tr>
			</form>
		</table>

</body>
</html>