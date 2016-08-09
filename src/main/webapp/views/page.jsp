<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 15.07.2016
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <p>Product: ${product.productName}</p>
    <p>Model: ${product.model}</p>
    <p>Cost: ${product.cost}</p>
    <p>Description: ${product.description}</p>
    <a href="/basket=${product.id}">Add to basket</a>
</div>
