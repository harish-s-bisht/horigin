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
    .pointer{
    cursor: pointer!important;
    }
</style>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<div class="container">
<div class="row">
<div class="col-md-12">Product List:-----</div>
</div>
<div class="row">
<div class="col-md-12">
    <div class="col-md-6 pointer" onclick="sortMe('name')" id="pname">Product Name</div>
    <div class="col-md-6 pointer" onclick="sortMe('price')" id="pprice">Product Price</div>
</div>
</div>
<div class="row">
    <div class="col-md-12" id="containerDiv">
        <g:each in="${product}" var="prod" status="counter">
            <div class="col-md-6" id="${counter}name">${prod.name}</div>
            <div class="col-md-6" id="${counter}price">${prod.price}</div>
        </g:each>
    </div>
</div>



</div>
<script>
    function sortMe(object){
        var order='';
        if($('#pname').hasClass('asc')){
            order = 'asc';
            $('#pname').removeClass('asc');
            $('#pname').addClass('desc')
        }else{
            order = 'desc';
            $('#pname').addClass('asc');
            $('#pname').removeClass('desc');
        }
        $.ajax({
            url: 'listProductsAjax?columnName='+object+'&order='+order,
            type: "GET",
            success: function (data) {
                var pr=0.0;
                var name="";
                for (var x = 0; x < data.length; x++) {
                   name = data[x].name;
                   pr = data[x].price;
                   $('#'+x+'name').html(name);
                   $('#'+x+'price').html(pr)
               }

            }
        });
    }
</script>
</body>
</html>