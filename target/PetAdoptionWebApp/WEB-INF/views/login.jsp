<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/fontawesome/css/all.css">
    <link rel="stylesheet" href="./css/style.css">
    <script defer src="./js/app.js"></script>
</head>
<body>
<%-- the header fragment--%>
<%@include file="../fragments/header.jsp" %>
<div class="container jumbotron">
    <h3>Login</h3><br>
    <form method="post" id="login-form" action="/PetAdoptionWebApp/login">

    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-5">
            <div class="form-group">
                <label for="loginUserName"><i class="fas fa-user prefix grey-text"></i> *UserName:</label>
                <input required type="text" class="form-control" id="loginUserName" name="loginUserName" placeholder="Enter your Username">
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-5">
            <div class="form-group">
                <label for="loginpassword"><i class="fas fa-lock prefix grey-text"></i> *Password:</label>
                <input required type="password" class="form-control" name="loginpassword" id="loginpassword" placeholder="Enter your Password">
            </div>
        </div>
    </div>
        <div class="modal-footer d-flex justify-content-center">
            <input type="submit" class="btn btn-success" value="Login"></input>
        </div>
</form>

</div>

<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>
</body>
</html>
