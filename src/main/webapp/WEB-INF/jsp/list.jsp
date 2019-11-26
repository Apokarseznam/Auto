<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seznam Aut</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/bootstrap.css"/>
    </head>
    <body>
        <div class="container">
            <h2><b>Seznam Aut</b></h2> <br>
            <a href="add" class="btn btn-success" >Nové Auto</a><br><br>
            <div class="table-responsive">
                <table class="table table-striped">
                    <tr>
                        <th>Značka</th>
                        <th>Model</th>
                        <th>Barva</th>
                        <th>Výkon</th>
                        <th>Číslo</th>
                        <th>Upravit</th>
                        <th>Smazat</th>
                    </tr>
                    <tbody>
                        <c:forEach var="tempAuto" items="${modelAuto}">
                            <tr>
                                <td> ${tempAuto.make} </td>
                                <td> ${tempAuto.model} </td>
                                <td> ${tempAuto.colour} </td>
                                <td> ${tempAuto.power} </td>
                                <td> ${tempAuto.id} </td>
                                <td><a href="updateAuto?id=${tempAuto.id}">
                                        <i class="material-icons" title="Upravit">&#xE254;</i>
                                    </a>
                                </td>
                                <td><a href="deleteAuto?id=${tempAuto.id}">
                                        <i class="material-icons"  title="Smazat">&#xE872;</i>
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
