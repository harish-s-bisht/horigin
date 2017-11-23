<%--
  Created by IntelliJ IDEA.
  User: harish
  Date: 21/11/17
  Time: 4:49 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Book Objects</title>
</head>

<body>
<g:form method="POST" controller="book" action="create">
    <input type="submit" value="Create Book Object"/>
</g:form>

<g:form method="delete" controller="book" action="delete">
    <label>Book-ID</label>
    <g:textField name="id" value="${id}"/>
    <input type="submit" value="delete"/>
</g:form>

<g:form method="get" controller="book" action="byTitle">
    <label>Book-Title</label>
    <g:textField name="title" value="${title}"/>
    <input type="submit" value="Find"/>
</g:form>


<g:link controller="book" action="listBook" methods="get">List Book</g:link>
</body>
</html>