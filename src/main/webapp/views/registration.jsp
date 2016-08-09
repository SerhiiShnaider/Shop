<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 15.07.2016
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
<form:form action="/registration" method="post" modelAttribute="client">
    <form:label path="name">Ім'я:</form:label>
    <form:input path="name" placeholder="Введіть ім'я"/>
    <form:label path="surname">Прізвище:</form:label>
    <form:input path="surname" placeholder="Введіть прізвище"/>
    <form:label path="age">Вік:</form:label>
    <form:input path="age" placeholder="Введіть вік"/>
    <form:label path="email">Email:</form:label>
    <form:input type="email" path="email" placeholder="Введіть email"/>
    <form:label path="phone">Телефон:</form:label>
    <form:input type="phone" path="phone" placeholder="Введіть телефон"/>
    <form:label path="password">Пароль:</form:label>
    <form:input type="password" path="password" placeholder="Введіть пароль"/>
    <form:button>Send!</form:button>
</form:form>
</div>
