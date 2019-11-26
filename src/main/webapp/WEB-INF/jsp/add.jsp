<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nové Auto</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link type="text/css"
              rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/bootstrap.css"/>
    </head>
    <body>
        <div class="container ">
            <h2><b>Nové Auto</b></h2><br>
            <a href="list" class="btn btn-success">Zpět</a><br><br>
            <form action="addAuto" method="GET">
                <div class="form-group">
                    <label for="make">Značka:</label>
                    <input type="text" class="form-control" id="make" name= "make">
                </div>
                <div class="form-group">
                    <label for="model">Model:</label>
                    <input type="text" class="form-control" id="model" name= "model">
                </div>
                <div class="form-group">
                    <label for="colour">Barva:</label>
                    <input type="text" class="form-control" id="colour" name= "colour">
                </div>
                <div class="form-group">
                    <label for="power">Výkon:</label>
                    <input type="text" class="form-control" id="power" name= "power">
                </div>
                <div class="form-group">
                    <label for="id">Číslo:</label>
                    <input type="text" class="form-control" id="id" name= "id">
                </div>
                <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-ok-sign"></span><b> Potvrdit</b></button>
            </form> 
        </div>
    </body>
</html>
