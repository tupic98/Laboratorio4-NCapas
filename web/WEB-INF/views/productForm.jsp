<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Labo04</title>
</head>
<body>
	<h1>${message}</h1>
	<form:form action="${pageContext.request.contextPath}/formProduct" method="POST" modelAttribute="product">
	
		<label>Nombre del producto: </label>
		<form:input type="text" name="productName" path="name"/>
		<form:errors path="name" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Marca: </label>
		<form:input type="text" name="productBrand" path="brand"/>
		<form:errors path="brand" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Descripción del producto: </label>
		<form:input type="text" name="productDescription" path="description"/>
		<form:errors path="description" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Categoría del producto: </label>
		<form:input type="text" name="productCategory" path="category"/>
		<form:errors path="category" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Precio: </label>
		$<form:input type="number"  min="0.01" step="0.01" name="productPrice" path="price"/>
		<form:errors path="price" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Fecha de vencimiento: </label>
		<form:input type="date" name="productDueDate" path="dueDate"/>
		<form:errors path="dueDate" cssStyle="color:#E81505;"></form:errors><br>
		
		<input type="submit" value="Agregar Producto">
	</form:form>
</body>
</html>