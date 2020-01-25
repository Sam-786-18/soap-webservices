<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@include file="searchBook.jsp" %>
<table border="1">
	<tr>
		<th>ISBN</th>
		<th>TITLE</th>
		<th>AUTHOR</th>
		<th>Price</th>
	</tr>
	<tr>
		<td>${book.isbn}</td>
		<td>${book.title}</td>
		<td>${book.author}</td>
		<td>${book.price}</td>
	</tr>
</table>