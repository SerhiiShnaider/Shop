<%--
  Created by IntelliJ IDEA.
  User: Elvis
  Date: 05.08.2016
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
            <td><a href="/basketdel=${product.id}">Remove from basket</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<%--<form:form action="/order">
    <button type="submit">Add to order</button>
</form:form>--%>
<a href="/order">Add to order</a>
