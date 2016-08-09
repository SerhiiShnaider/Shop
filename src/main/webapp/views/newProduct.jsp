<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 14.07.2016
  Time: 23:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<form:form method="post" action="/createProduct">
    <label for="productName">Товар:</label>
    <input id="productName" type="text" name="productName" placeholder="Вид товару">
    <label for="model">Модель:</label>
    <input id="model" type="text" name="model" placeholder="Модель товару">
    <label for="cost">Вартість:</label>
    <input id="cost" type="text" name="cost" placeholder="Вартість товару">
    <label for="description">Опис:</label>
    <input id="description" type="text" name="description" placeholder="...">
    <button value="post">Send</button>

</form:form>
