<%--
  Created by IntelliJ IDEA.
  User: harish
  Date: 14/11/17
  Time: 6:21 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <style>
        .inline{
            display: inline!important;
        }
        .m-l-10{
            margin-left: 10%;
        }
    </style>
</head>

<body>
<div>Product List:-----</div>
<div>
    <div class="inline">Product Name</div>
    <div class="inline">Product Price</div>
    <g:each in="${product}" var="prod">

        <div>${prod.name}
        <span class="m-l-10">${prod.price}</span></div>
    </g:each>

</div>
</body>
</html>