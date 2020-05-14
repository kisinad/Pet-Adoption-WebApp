<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<%@ include file="../fragments/homeHeader.jsp" %>
<div class="container">
    <br>
    <h4>Pet Adoption</h4>
<%--<table class="table">--%>
<%--    <thead class="thead-dark">--%>
<%--    <th scope="col">Type</th>--%>
<%--    <th scope="col">Breed</th>--%>
<%--    <th scope="col">Sex</th>--%>
<%--    <th scope="col">Color</th>--%>
<%--    <th scope="col">Weight</th>--%>
<%--    <th scope="col">Description</th>--%>
<%--    <th scope="col">DatePosted</th>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--        <c:forEach var="pet" items="${pets}" varStatus="iteration">--%>
<%--            <tr>--%>
<%--                <th scope="row"><c:out value="${iteration.index+1}"></c:out>.</th>--%>
<%--                <td><c:out value="${pet.type}"></c:out></td>--%>
<%--                <td><c:out value="${pet.breed}"></c:out></td>--%>
<%--                <td><c:out value="${pet.sex}"></c:out></td>--%>
<%--                <td><c:out value="${pet.color}"></c:out></td>--%>
<%--                <td><c:out value="${pet.weight}"></c:out></td>--%>
<%--                <td><c:out value="${pet.description}"></c:out></td>--%>
<%--                <td><c:out value="${pet.date}"></c:out></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </tbody>--%>
<%--</table>--%>

    <div class="card-group">
        <c:forEach var="pet" items="${pets}" varStatus="iteration">
            <div class="card">
                <img class="card-img-top" src="https://d1941uuft27pfg.cloudfront.net/breed-uploads/2018/08/affenpinscher-detail.jpg?bust=1535565001&width=630" alt="Place holder" style="border-radius: 28%; width: 30%;">
                <div class="card-body">
                    <h5 class="card-title" style="color: #652D88">${pet.type}</h5>
                    <p class="card-text" >Breed: ${pet.breed}</p>
                    <p class="card-text">Color: ${pet.color}</p>
                    <p class="card-text">Weight: ${pet.weight}</p>
                    <p class="card-text">${pet.description}</p>
                </div>
                <div class="card-footer">
                    <small class="text-muted">Date Post: ${pet.date}</small>
                </div>
            </div>
        </c:forEach>

    </div>
    <img src="..." class="rounded mx-auto d-block" alt="...">

    <div class="row">
        <div class="column">
            <img src="img_snow.jpg" alt="Snow" style="width:100%">
        </div>
        <div class="column">
            <img src="img_forest.jpg" alt="Forest" style="width:100%">
        </div>
        <div class="column">
            <img src="img_mountains.jpg" alt="Mountains" style="width:100%">
        </div>
    </div>
</div>

<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>
</body>
</html>
