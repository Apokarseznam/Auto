<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Odstranění Auta</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/bootstrap.css"/>
    </head>
    <body>
        <div class="container">
            <h2><b>Odstranění Auta</b></h2> <br>
            <a href="list" class="btn btn-success" >Zpět</a>
            <p class="lead text-center">Chcete tuto položku opravdu odstranit?</p>
            <div class="table-responsive">
                <table class="table table-striped">
                    <tr>
                        <th>Značka</th>
                        <th>Model</th>
                        <th>Barva</th>
                        <th>Výkon</th>
                        <th>Číslo</th>
                    </tr>
                    <tbody>
                            <tr>
                                <td> <c:out value = "${modelAuto.make}"></c:out> </td>
                                <td> <c:out value = "${modelAuto.model}"></c:out> </td>
                                <td> <c:out value = "${modelAuto.colour}"></c:out> </td>
                                <td> <c:out value = "${modelAuto.power}"></c:out> </td>
                                <td> <c:out value = "${modelAuto.id}"></c:out> </td>
                            </tr>
                    </tbody>
                </table>
            </div>
               <a href="deleteConfirmed?id=${modelAuto.id}" class="btn btn-danger" style="float: right">Smazat</a>             
        </div>
    </body>
</html>
