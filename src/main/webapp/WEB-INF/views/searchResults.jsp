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

<table style="text-align: center;">
    <thead>
    <th>Animal</th>
    <th>Type</th>
    <th>Breed</th>
    <th>Date</th>
    </thead>
    <tbody>

    <c:forEach var="key" items="${*.keySet()}">
        <tr>
            <td>${key}</td>
            <td>${*.key}</td>
        </tr>
    </c:forEach>

    </tbody>
    <tfoot>
    <tr>
        <td colspan="2">
            <form method="post">
                <label>Image</label>
                <input type="text" name="item" style="width: 100;">
                <label style="margin-left: 5px;">Sex</label>
                <input type="number" name="qnty" style="width: 50;">
                <input type="submit" value="Add">
            </form>
        </td>
    </tr>

    </tfoot>
</table>


<%-- the footer fragment--%>
<%@include file="../fragments/footer.jsp" %>
</body>
</html>
