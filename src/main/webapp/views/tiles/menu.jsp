<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 15.07.2016
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--<h3>Menu</h3>--%>
<div>
    <%--<a href="/">Home</a>
    <sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/allClients">All clients</a></sec:authorize>
    <a href="/allProducts">All products</a>--%>

    <div class="pure-menu pure-menu-horizontal">
        <a href="/" class="pure-menu-heading pure-menu-link">Home</a>
<sec:authorize access="hasRole('ROLE_ADMIN')"><a href="/allClients" class="pure-menu-heading pure-menu-link">All clients</a></sec:authorize>
        <a href="/allProducts" class="pure-menu-heading pure-menu-link">All products</a>
        <a href="/basket" class="pure-menu-heading pure-menu-link">Basket</a>
        <a href="/order" class="pure-menu-heading pure-menu-link">Orders</a>

    </div>
</div>
