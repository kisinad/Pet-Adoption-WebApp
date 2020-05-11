<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pet Adoption</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/fontawesome/css/all.css">
    <link rel="stylesheet" href="./css/style.css">
    <script defer src="./js/app.js"></script>
</head>
<body>
<%-- the header fragment--%>
<%@include file="../fragments/header.jsp" %>
<div id="imagesCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#imagesCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#imagesCarousel" data-slide-to="1"></li>
        <li data-target="#imagesCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-100" src="./images/pets_big.png" alt="All Pets">
        </div>
        <div class="carousel-item">
<<<<<<< HEAD
            <img class="d-block w-100" src="./images/pets-elephant-dog-and-cat-transparent.png" alt="Puppies in a box">
=======
            <img class="d-block w-100" src="./images/pets-png-dog-clipart.png" alt="Puppies in a box">
>>>>>>> fdbb73a9d0da723444173f903674b451c97e799f
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="./images/pets-png-clip-art.png" alt="Cats and Dogs">
        </div>
    </div>
    <a class="carousel-control-prev" href="#imagesCarousel" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#imagesCarousel" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<div class="jumbotron">
    <h4>Pet Adoption</h4>
    <p>
        Lorem ipsum dolor, sit amet consectetur adipisicing elit.
        Aperiam consequuntur repellat a illum consectetur? Laboriosam quod quidem ipsa hic consectetur maxime, deserunt,
        accusamus ipsum natus perspiciatis doloremque enim minima expedita.
    </p>

    <section id="ctl00_cph_main_content_sctMain" class="">
        <p style="text-align: center;"><a class="menu-btn" href="javascript:void()"><i aria-hidden="true" class="fa fa-filter"></i>FILTER PETS</a></p>

        <div class="toggle_filters">
            <div class="popover_selects clearfix">
                <div class="popover_parent popover_list">
                    <ul class="pet_filter">
                        <li><a href="#" class="active"><img alt="dogs" src="./images/dogs.png"><span>Dogs</span></a></li>
                        <li><a href="#"><img alt="cats" src="./images/cats.png"><span>Cats</span></a></li>
                        <li><a href="#"><img alt="small animals" src="./images/small.png"><span>Small Pets</span></a></li>
                    </ul>
                </div>
            </div>
        </div>

        <ul class="pet-list">
            <li>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="./images/cute-puppy.jpg" alt="Cute Puppy">
                    <div class="card-body">
                        <h5 class="card-title">Cute Puppy</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Details</a>
                    </div>
                </div>
            </li>
            <li>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="./images/cute-puppy.jpg" alt="Cute Puppy">
                    <div class="card-body">
                        <h5 class="card-title">Cute Puppy</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Details</a>
                    </div>
                </div>
            </li>
            <li>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="./images/cute-puppy.jpg" alt="Cute Puppy">
                    <div class="card-body">
                        <h5 class="card-title">Cute Puppy</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Details</a>
                    </div>
                </div>
            </li>
        </ul>

        <div style="background: rgb(238, 238, 238) none repeat scroll 0% 0%; border: 0px solid rgb(204, 204, 204); padding: 5px 10px; text-align: center;"><br>
            <span class="text_green">Have a dog, cat or small pet that you'd like to register?<br>
<a class="btn btn-clean" href="/registerPet">Register a Pet</a><br>
&nbsp;</span></div>



        <p class="lead mt-5">
            <a class="btn btn-primary btn-lg" href="./register-pet" role="button">Register Pet</a>
        </p>
</div>
</div>
<div class="container">

<%--Sign up Modal--%>
<div class="modal fade" id="modalRegisterForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header text-center">
                <h4 class="modal-title w-100 font-weight-bold">Sign up</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form method="post" id="sign-up-form" action="/user-registration">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="firstName"><i class="fas fa-user prefix grey-text"></i> *First Name:</label>
                                <input required type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter your First Name">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="lastName"><i class="fas fa-user prefix grey-text"></i> *Last Name:</label>
                                <input required type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter your Last Name">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="username"><i class="fas fa-user prefix grey-text"></i> *Username:</label>
                                <input type="text" class="form-control" id="username" name="userName" placeholder="Enter a Username">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="email"><i class="fas fa-envelope prefix grey-text"></i> *Email:</label>
                                <input type="text" class="form-control" id="email" name="email" placeholder="Enter your Email Address">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="age"><i class="fas fa-envelope prefix grey-text"></i> *Age:</label>
                                <input required type="text" class="form-control" id="age" name="email" placeholder="Enter your Age">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="password"><i class="fas fa-lock prefix grey-text"></i> *Password:</label>
                                <input required type="text" class="form-control" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" id="password"
                                       title="Must contain at least one number and one uppercase and lowercase letter, and at least 6r or more characters">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer d-flex justify-content-center">
<<<<<<< HEAD
                        <a href="" class="btn btn-success" data-toggle="modal" data-target="#modalSuccess">Login</a>
                        <button class="btn" type="button">Sign up</button>
=======
                        <a href="" class="btn btn-success" data-toggle="modal" data-target="#modalSuccess" data-dismiss="modal">Sign up</a>

>>>>>>> 64f48d8f6e5edc1ccb401855a132d9cc794a32d5
                    </div>
                </form>
        </div>
    </div>
</div>

<%--    success pop-up--%>
    <div class="modal" tabindex="-1" role="dialog" id="modalSuccess">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title">Success !!</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p>Yo have successfully signed up.</p>
                    <p>Thank You !</p>
                </div>
                <div class="modal-footer">
<%--                    <button type="button" class="btn btn-primary">Save changes</button>--%>
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>

    <%--Login Modal--%>
    <div class="modal fade" id="modalLoginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header text-center">
                    <h4 class="modal-title w-100 font-weight-bold">Sign up</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form method="post" id="login-form">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="loginUserName"><i class="fas fa-user prefix grey-text"></i> *UserName:</label>
                                    <input required type="text" class="form-control" id="loginUserName" name="loginUserName" placeholder="Enter your Username">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="loginpassword"><i class="fas fa-lock prefix grey-text"></i> *Password:</label>
                                    <input required type="text" class="form-control" name="loginpassword" id="loginpassword">
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer d-flex justify-content-center">
                            <input type="submit" class="btn btn-success">Login</input>
                        </div>
                    </form>
                </div>
            </div>
        </div>
<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>
</body>
</html>