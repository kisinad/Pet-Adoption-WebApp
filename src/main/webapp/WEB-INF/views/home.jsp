
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pet Adoption</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/fontawesome/css/all.css">
    <link rel="stylesheet" href="./css/style.css">
    <script defer src="./js/app.js"></script>
</head>
<body>
<%-- the header fragment--%>
<%@ include file="../fragments/homeHeader.jsp" %>
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
            <img class="d-block w-100" src="./images/AdobeStock_pets.jpeg" alt="Puppies in a box">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="./images/cbd-for-pets.jpg" alt="Cats and Dogs">
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
<br>
<div class="container">
    <br>
    <h4>Pet Adoption</h4>
    <p>
        Lorem ipsum dolor, sit amet consectetur adipisicing elit.
        Aperiam consequuntur repellat a illum consectetur? Laboriosam quod quidem ipsa hic consectetur maxime, deserunt,
        accusamus ipsum natus perspiciatis doloremque enim minima expedita.
        Lorem ipsum dolor, sit amet consectetur adipisicing elit.
        Aperiam consequuntur repellat a illum consectetur? Laboriosam quod quidem ipsa hic consectetur maxime, deserunt,
        accusamus ipsum natus perspiciatis doloremque enim minima expedita.
    </p>

    <section id="ctl00_cph_main_content_sctMain" class="">
        <p style="text-align: center;"><a class="menu-btn" href="javascript:void()">
            <i aria-hidden="true" class="fa fa-filter"></i>FILTER PETS</a>
        </p>

        <div class="toggle_filters">
            <div class="popover_selects clearfix">
                <div class="popover_parent popover_list">
                    <ul class="pet_filter">
                        <li><a href="#" class="active"><img alt="dogs" src="./images/dogs.png"><span>Dogs</span></a>
                        </li>
                        <li><a href="#"><img alt="cats" src="./images/cats.png"><span>Cats</span></a></li>
                        <li><a href="#"><img alt="small animals" src="./images/small.png"><span>Small Pets</span></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>



        <p class="lead mt-5">
            Find Pet
        </p>
        <ul class="pet-list">
            <li>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="./images/cute-puppy.jpg" alt="Cute Puppy">
                    <div class="card-body">
                        <h5 class="card-title">Cute Puppy</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
                            the
                            card's content.</p>
                        <a href="#" class="btn btn-primary">Details</a>

            <li>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="./images/cute-puppy.jpg" alt="Cute Puppy">
                    <div class="card-body">
                        <h5 class="card-title">Cute Puppy</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
                            the
                            card's content.</p>
                        <a href="#" class="btn btn-primary">Details</a>
                    </div>
                </div>
            </li>
            <li>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src="./images/cute-puppy.jpg" alt="Cute Puppy">
                    <div class="card-body">
                        <h5 class="card-title">Cute Puppy</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
                            the
                            card's content.</p>
                        <a href="#" class="btn btn-primary">Details</a>
                    </div>
                </div>
            </li>
        </ul>
    </section>
</div>


</div>


<div style="background: rgb(238, 238, 238) none repeat scroll 0% 0%; border: 0px solid rgb(204, 204, 204); padding: 5px 10px; text-align: center;">
    <br>
    <span class="text_green">Have a dog, cat or small pet that you'd like to register?<br>
                            <a class="btn btn-clean" href="/register-pet">Register a Pet</a><br>
                            &nbsp;</span>
</div>


</div>
</div>
<div class="container">

    <%--Log Out Modal--%>
    <div class="modal fade" id="modalLogOut" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header text-center">
                    <h4 class="modal-title w-100 font-weight-bold">Log Out</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <form method="post" id="logOut" action="/index">

                        <div class="row">
                            <div class="col-md-12 container">
                                <p>Are you sure you want to log out</p>
                            </div>
                        </div>
                        <div class="modal-footer d-flex justify-content-center">
                            <a href="./index" class="btn btn-danger float-right" data-dismiss="modal">Log out</a>
                            <a href="./home" class="btn btn-secondary float-left" data-dismiss="modal">Cancel</a>
                        </div>
                    </form>
                </div>
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
                                        <label for="loginUserName"><i class="fas fa-userDTO prefix grey-text"></i>
                                            *UserName:</label>
                                        <input required type="text" class="form-control" id="loginUserName"
                                               name="loginUserName" placeholder="Enter your Username">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label for="loginpassword"><i class="fas fa-lock prefix grey-text"></i>
                                            *Password:</label>
                                        <input required type="text" class="form-control" name="loginpassword"
                                               id="loginpassword">
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