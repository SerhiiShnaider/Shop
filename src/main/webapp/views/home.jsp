<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 05.07.2016
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<h1>Hello!</h1>
<p>This is home page</p>
<sec:authorize access="isAnonymous()">
    <a class="button-success pure-button" href="/registration"><h3>Registration</h3></a>
</sec:authorize>




