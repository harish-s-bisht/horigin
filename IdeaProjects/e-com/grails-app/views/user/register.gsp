<%--
  Created by IntelliJ IDEA.
  User: harish
  Date: 17/11/17
  Time: 11:17 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Registration..</title>
</head>
<link href="css/custom.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body>
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <div>
                <custom:add a="10" b="5"/>
            </div>
           %{-- <div>
                <custom:addlist list="[10,20,30,40]"/>
            </div>--}%
            <g:form method="get" controller="user">
                <g:textField id="searchid" name="id"/>
                <div style="font-size: 25px; display: inline; cursor: pointer;" onclick="hitAjax();">Search</div>
                %{--<button class="btn btn-primary" onclick="hitAjax();">Search</button>--}%
            </g:form>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-1 top-note">
            Register Here..
        </div>
        <div class="col-md-6 col-md-offset-1 top-note">
            Login Here..
        </div>

    </div>
    <div class="row">
        <div class="col-md-6 box">
            <g:form method="post" controller="user" action="register">
                <div class="row">
                    <div class="col-md-3">
                        <label>Name:</label>
                    </div>
                    <div class="col-md-3">
                        <g:textField name="name" value="${name}" id="name"></g:textField>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3">
                        <label>Email:</label>
                    </div>
                    <div class="col-md-3">
                        <g:textField name="email" value="${email}" id="email"></g:textField>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-3">
                        <label>Password:</label>
                    </div>
                    <div class="col-md-3">
                        <g:passwordField name="password" value="${password}" id="password"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3">
                        <label>Role:</label>
                    </div>
                    <div class="col-md-3">
                        <g:textField name="role" value="${role}" id="role"></g:textField>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <button type="submit" class="btn btn-primary">Register</button>
                    </div>
                </div>
            </g:form>
        </div>
    <div class="col-md-5 col-md-offset-1 box">
        <g:form controller="userController" action="login">
            <div class="row">
                <div class="col-md-3">
                    <label>Emial:</label>
                </div>
                <div class="col-md-3">
                    <g:textField name="email" value="${email}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <label>Password</label>
                </div>
                <div class="col-md-3">
                    <g:textField name="password" value="${password}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <button type="submit" class="btn btn-primary">Login</button>
                </div>
            </div>
        </g:form>
    </div>
    </div>
</div>
</body>
<script>
    function hitAjax(){
        var id = $('#searchid').val();
         $.ajax({
            url: 'getByIds?id='+id,
            type: "GET",
            success: function (data) {
                if(!($.isEmptyObject(data))){
                    $('#name').val(data.name);
                    $('#password').val(data.password);
                    $('#email').val(data.email);
                    $('#role').val(data.role)
                }else{
                    alert("No User Found At id " +id)
                }
            }
        });
    }
</script>

</html>