<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 15.07.2016
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="tiels" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/style/reset.css">
    <link rel="stylesheet" href="/resources/style/style.css">
    <title><tiels:getAsString name="title"></tiels:getAsString></title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">

</head>
<body>
<div class="header"><tiels:insertAttribute name="header"></tiels:insertAttribute></div>
<div class="menu"><tiels:insertAttribute name="menu"></tiels:insertAttribute></div>
<div><tiels:insertAttribute name="body"></tiels:insertAttribute></div>
<div><tiels:insertAttribute name="footer"></tiels:insertAttribute></div>
</body>
</html>
