<%--
  Created by IntelliJ IDEA.
  User: elvis
  Date: 15.07.2016
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="label" uri="http://www.springframework.org/tags/form" %>
<div>
    <div> Hello, <sec:authentication property="name"/></div>
    <sec:authorize access="isAnonymous()">
        <div class="sign">
            <form:form class="pure-form" action="/loginprocessing" method="post">
                <fieldset>
                    <input id="name" type="text" placeholder="Email or phone" name="username" required>
                    <input type="password" placeholder="Password" name="password" required>
                    <button type="submit" class="pure-button pure-button-primary">Sign in</button>
                </fieldset>
            </form:form>
        </div>

    </sec:authorize>
    <div class="logout">
        <sec:authorize access="isAuthenticated()">
            <form:form action="/logout">
                <button class="logoutbutton button-secondary pure-button " type="submit">logout</button>
            </form:form>
        </sec:authorize>
    </div>
</div>