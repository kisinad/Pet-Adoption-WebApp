<!DOCTYPE html>
<html lang="en"><head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/fontawesome/css/all.css">
    <link rel="stylesheet" href="./css/style.css">
    <script defer="" src="./js/app.js"></script>
    <script type="text/javascript" async="" src="//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js"></script></head>
<body>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link rel="stylesheet" href="./css/style.css">
<script defer="" src="./js/app.js"></script>


<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Pet Adoption</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarColor01">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="./index">Home<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./register-pet">Register Pet<span class="sr-only">(current)</span></a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <a href="./signup" class="btn btn-info btn-signup">Sign Up</a>
                <a href="./login" class="btn btn-primary btn-login ">Login</a>
                <input class="form-control mr-sm-2" type="text" placeholder="Search">
                <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
</header>
<div class="container jumbotron">
    <form method="post" id="register-pet" action="/PetAdoptionWebApp/register-pet">
        <div class="row">

            <div class="col-md-4">
                <span class="form-group">
                    <label for="animal"><i class="fas fa-paw grey-text"></i> *Pet ID:</label>
                    <input readonly type="number" class="form-control" id="animal" name="animalName"
                           placeholder="Pet ID">
                </span>


            </div>
            <div class="col-md-4">
                <span class="form-group">
                    <label for="breed"><i class="fas fa-paw grey-text"></i> *Breed Type:</label>
                    <input required type="text" class="form-control" id="breed" name="breedType"
                           placeholder="Breed Type">
                </span></div>
            <div class="col-md-4">
                <div class="form-group">
                    <label ><i class="fas fa-paw grey-text"></i> Gender</label>
                    </div>

                <div class="col-md-4">
                <span class="form-group">
                    <label for="date"><i ></i> </label>
                    <input style="visibility: hidden" type="Date" class="form-control" id="date" name="dateName"
                           value="LocalDate.now().format(DateTimeFormatter.ofPattern((EEEE, dd MMMM yyyy))">
                </span>
                </div>
<%--                    <input required type="text" class="form-control" id="sex" name="sexName"--%>
<%--                           placeholder="Sex">-



                <div>
                    <input type="radio" id="male" name="sexName" value="male">
                    <label for="male">Male</label>
                    <input type="radio" id="female" name="sexName" value="female">
                    <label for="female">Female</label>
                </div>

                </div>



        </div>
        <div class="col-md-4">
                <span class="form-group">
                    <label for="date"><i ></i> </label>
                    <input style="visibility: hidden" type="Date" class="form-control" id="date" name="dateName"
                           >
                </span></div>

        <div class="row">

            <div class="col-md-4">
                <div class="form-group">
                    <label for="type"><i class="fas fa-paw prefix grey-text"></i>Pet Type:</label>
                    <select id="type" class="form-control" name="typeName">
                        <option value="">----Select Type----</option>
                        <option value="Dog">Dog</option>
                        <option value="Cat">Cat</option>
                        <option value="Other Small Pets">Other Small Pets</option>
                    </select>
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <label for="weight"><i class="fas fa-paw grey-text"></i> *Weight:</label>
                    <input required="" type="number" class="form-control" id="weight" name="weightName"
                           placeholder="Weight in Kgs">
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
<%--                    <input required="" type="radio" class="form-control" id="colorName" name="colorName">--%>
                    <label for="color"><i class="fas fa-paw grey-text"></i> *color:</label>
                    <select id="color" class="form-control" name="colorName">
                        <option value="">----Select Type----</option>
                        <option value="Black">Black</option>
                        <option value="White">White</option>
                        <option value="Grey">Grey</option>
                        <option value="mixed">Mixed</option>
                    </select>
                </div>
            </div>

            <div class="col-md-4">
                <div class="custom-file">

                    <label class="custom-file-label" for="customFile">Upload Images</label>
                    <input type="file" class="custom-file-input,form-control" id="customFile" name="imageName">

                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="description"><i class="fas fa-paw grey-text"></i> *Description:</label>
                    <textarea required="" rows="10" cols="80" name="descriptionName" id="description"
                              placeholder="Short Description ..."></textarea>
                </div>
            </div>
        </div>
        <div class="modal-footer d-flex justify-content-center">
            <input type="submit" value="Register your pet" class="btn btn-success">
        </div><br>
    </form>
</div>



<footer class="footer">
    <div id="footer-content">
        <span class="text-muted">Pet Adoption</span>
        <span style="float:right;" class="text-muted">©  2020 . All rights reserved. Powered by Panthers.</span>
    </div>
</footer>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
&gt;&gt;&gt;&gt;&gt;&gt;&gt; origin


</body></html>