<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 05.07.2016
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>All clients here!!</h2>
<table>
    <thead>
    <td>Name</td>
    <td>Surame</td>
    <td>Age</td>
    <td>Email</td>
    <td>Phone</td>
    </thead>
    <tbody>
    <c:forEach items="${clients}" var="client">
        <tr>
            <td>${client.name}</td>
            <td>${client.surname}</td>
            <td>${client.age}</td>
            <td>${client.email}</td>
            <td>${client.phone}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
