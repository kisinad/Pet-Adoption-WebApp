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
<table class="table">
    <thead class="thead-dark">
    <th scope="col">Type</th>
    <th scope="col">Breed</th>
    <th scope="col">Sex</th>
    <th scope="col">Color</th>
    <th scope="col">Weight</th>
    <th scope="col">Description</th>
    <th scope="col">DatePosted</th>
    </thead>
    <tbody>
        <c:forEach var="pet" items="${pets}" varStatus="iteration">
            <tr>
                <th scope="row"><c:out value="${iteration.index+1}"></c:out>.</th>
                <td><c:out value="${pet.type}"></c:out></td>
                <td><c:out value="${pet.breed}"></c:out></td>
                <td><c:out value="${pet.sex}"></c:out></td>
                <td><c:out value="${pet.color}"></c:out></td>
                <td><c:out value="${pet.weight}"></c:out></td>
                <td><c:out value="${pet.description}"></c:out></td>
                <td><c:out value="${pet.date}"></c:out></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</div>

<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>
</body>
</html>
