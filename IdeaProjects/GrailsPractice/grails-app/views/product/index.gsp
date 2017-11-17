<%--
  Created by IntelliJ IDEA.
  User: harish
  Date: 14/11/17
  Time: 6:07 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <style>
        a{
            text-decoration: none;
        }
    </style>
</head>

<body>

<div><a href="product/listProducts">List Product</a></div>
<div> Add product details</div>
<div>
    <g:form method="POST" action="addProduct">
        <div><label>Name</label><g:textField name="name" value="${name}"></g:textField></div>
        <div><label>Price</label><g:textField name="price" value="${price}"></g:textField></div>
        <div><label>Mode Of Payment</label><g:textField name="mop" value="${mop}"></g:textField></div>
        <div><label>Amount</label><g:textField name="amount" value="${amount}"></g:textField></div>
        <div><input type="submit" value="Add"/></div>
    </g:form>

</div>
</body>
</html>