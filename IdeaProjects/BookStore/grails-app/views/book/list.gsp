<%--
  Created by IntelliJ IDEA.
  User: harish
  Date: 21/11/17
  Time: 5:35 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List</title>
    <style>
        .m-l-20{
            margin: 5%;
        }
    </style>
</head>

<body>
<span class="m-l-20">Auther</span>
<span class="m-l-20">Book Name</span>
<span class="m-l-20">ISBN</span>
<br/>
<g:each in="${booklist}" var="auther">

    <span class="m-l-20">${auther.name}</span>
    <g:each in="${auther.book}" var="books">
        <span class="m-l-20">${books.title}</span>
        <span class="m-l-20">${books.isbn}</span>
        <br/>

    </g:each>
    <br>
</g:each>
</body>
</html>