<%--
  Created by IntelliJ IDEA.
  User: harish
  Date: 13/11/17
  Time: 1:51 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Test Grails first Time </title>
</head>
<g:form method="POST" id="user" controller="user">
    <div><label>Name</label><g:textField name="name" value="${name}"></g:textField></div>
    <div><g:actionSubmit value="Submit" action="saveUser"/></div>

</g:form>
<body>

</body>
</html>