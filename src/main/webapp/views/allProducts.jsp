<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 14.07.2016
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<h2>All products is here !!</h2>
<table>
    <thead>
    <td>Product</td>
    <td>Model</td>
    <td>Cost</td>
    <td>Description</td>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><a href="/product=${product.id}">${product.productName}</a></td>
            <td>${product.model}</td>
            <td>${product.cost}</td>
            <td>${product.description}</td>
            <td><a href="/basket=${product.id}">Add to basket</a></td>
        </tr>
    </c:forEach>
    </tbody>
    <sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/newProduct">Add new product</a></sec:authorize>
</table>
