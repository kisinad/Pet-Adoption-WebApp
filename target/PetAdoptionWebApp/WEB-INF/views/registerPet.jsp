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
<<<<<<< HEAD
<p>Register Page is working</p>
<form>
    <div class="form-group">
        <%--@declare id="pet-detail"--%><p3>Register Pet</p3>
        <label for="pet-Detail"> Pet Detail:</label>
        <input type="text" class="form-control" id="Animal-Id" placeholder="Animal ID">

    </div>
    <div class="form-group">
        <%--@declare id="type"--%><label for="type">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="form-group form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
=======

<div class="container jumbotron">
    <form method="post" id="register-pet" action="/register-pet">
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-5">
                <div class="form-group">
                    <label for="animalID"><i class="fas fa-paw grey-text"></i> *Animal ID:</label>
                    <input readonly type="text" class="form-control" id="animalID" name="animalID" placeholder="Animal ID">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">

            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <label for="type"><i class="fas fa-paw prefix grey-text"></i> Type:</label>
                    <select id="type">
                        <option value="">Select Type ...</option>
                        <option value="Dog">Dog</option>
                        <option value="Cat">Cat</option>
                        <option value="Other Small Pets">Other Small Pets</option>
                    </select>
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <label for="breed"><i class="fas fa-paw grey-text"></i> *Breed:</label>
                    <input required type="text" class="form-control" id="breed" name="breed" placeholder="Breed">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <label for="color"><i class="fas fa-paw grey-text"></i> *color:</label>
                    <input required type="color" class="form-control" id="color" name="color" placeholder="Breed">
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <label for="weight"><i class="fas fa-paw grey-text"></i> *Weight:</label>
                    <input required type="number" class="form-control" id="weight" name="weight" placeholder="Weight in Kgs">
                </div>
            </div>
            <div class="col-md-4">
                <div class="custom-file">
                    <input type="file" class="custom-file-input" id="customFile">
                    <label class="custom-file-label" for="customFile">Choose file</label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="description"><i class="fas fa-paw grey-text"></i> *Description:</label>
                    <textarea required rows="10" cols="5" id="description" placeholder="Short Description ..."></textarea>
                </div>
            </div>
        </div>
        <div class="modal-footer d-flex justify-content-center">
            <input type="submit" value="Sign Up"  class="btn btn-success">
        </div><br>
    </form>
</div>

<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>
>>>>>>> origin
</body>
</html>
