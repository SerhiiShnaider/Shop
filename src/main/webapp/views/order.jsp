<%--
  Created by IntelliJ IDEA.
  User: Elvis
  Date: 05.08.2016
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
            <td><a href="/products=${product.id}" }>${product.productName}</a></td>
            <td>${product.model}</td>
            <td>${product.cost}</td>
            <td>${product.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
