<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register Form</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
          integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/fontawesome/css/all.css">
    <link rel="stylesheet" href="./css/style.css">
<%--    <script defer src="./js/app.js"></script>--%>
    <%--    <script defer type="text/javascript" async="" src="//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js"></script>--%>
</head>
<body>
<%-- the header fragment--%>
<%@include file="../fragments/homeHeader.jsp" %>
<div class="container jumbotron">
    ${successMessage}
    <form method="post" id="register-pet" action="./register-pet">
        <p class="container error" id="petCreateError" style="display: none;"></p>
        <div class="row">
            <div class="col-md-4" style="display: none;">
                <span class="form-group">
                    <label for="animal"><i class="fas fa-paw grey-text"></i> *Pet ID:</label>
                    <input type="number" class="form-control" id="animal" name="animalName"
                           placeholder="Pet ID">
                </span>
            </div>
            <div class="col-md-4">
                <span class="form-group">
                    <label for="breed"><i class="fas fa-paw grey-text"></i> *Breed Type:</label>
                    <input required type="text" class="form-control" id="breed" name="breedType"
                           placeholder="Breed Type">
                </span>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <div class="col-sm-6">
                        <label><i class="fas fa-paw grey-text"></i> *Gender:</label><br>
                        <label class="radio-inline">
                            <input required type="radio" name="sexName" value="male"> Male
                        </label>
                        <label class="radio-inline">
                            <input required type="radio" name="sexName" value="female"> Female
                        </label>
                    </div>

                </div>
            </div>
        </div>
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

            <div class="col-md-4">
                    <span class="form-group">
                        <label for="date">Date: </label>
                        <input type="Date" class="form-control" id="date" name="dateName"
                                           placeholder="localDate"
                                           value="localDate">
                    </span>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <%--                    <input required="" type="radio" class="form-control" id="colorName" name="colorName">--%>
                    <label for="color"><i class="fas fa-paw grey-text"></i> *Color:</label>
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
        <div class="row">
            <div class="modal-footer d-flex justify-content-center">
                <input type="submit" value="Register your pet" class="btn btn-success">
            </div>
            <br>
        </div>
    </form>
</div>


<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>

</body>
</html>