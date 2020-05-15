<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Pets</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/fontawesome/css/all.css">
    <link rel="stylesheet" href="./css/style.css">
    <script defer src="./js/app.js"></script>
</head>
<body>
<%-- the header fragment--%>
<%@ include file="../fragments/homeHeader.jsp" %>
<div class="container">
    <br>
    <h4>Pet Adoption</h4>
    ${deleted}
    ${failed}

    <div class="container">
        <main class="grid">
            <c:forEach var="pet" items="${pets}" varStatus="iteration">
                <article>
                    <img src="https://d1941uuft27pfg.cloudfront.net/breed-uploads/2018/08/affenpinscher-detail.jpg?bust=1535565001&width=630" alt="Sample photo" style="width: 40%;margin: 5%;">
                    <div class="text">
                        <h3 style="color: #652D88;">${pet.type}</h3>
                        <p class="card-text" >Breed: ${pet.breed}</p>
                        <p class="card-text">Color: ${pet.color}</p>
                        <p class="card-text">Weight: ${pet.weight}</p>
                        <small class="text-muted">Date Post: ${pet.date}</small>
                        <p>Description :${pet.description}</p>
<%--                        <input  type="text" value="${pet.petID}" name="petName" style="display: none">--%>
                        <a href="./delete?petName=${pet.petID}" class="btn btn-danger btn-block">Delete Pet.</a>
                    </div>
                </article>
            </c:forEach>

        </main>
    </div>



</div>

<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>
</body>
</html>
