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
<%@include file="../fragments/headerIndex.jsp" %>
<div id="imagesCarousel" class="carousel slide d-flex p-2 justify-content-center" data-ride="carousel">
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


        Pet adopts app serves people and pets from across the Fairfield city.You can see and upload dog,cat and small
        pets .
        you can sign up or log in  and upload pet to the website,find pet by gender, age, color, category and training
        skill.

    </p>
</div>


</div>
            <%-- the footer fragment--%>
            <%@include file="../fragments/footer.jsp" %>
</body>
</html>