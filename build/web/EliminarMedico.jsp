<%-- 
    Document   : EliminarMedico
    Created on : 16/04/2015, 18:42:17
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form3" action="eliminarmedico.do">
            <table align="center">
                <tr>
                    <td><h1>Eliminar Historial</h1></td>
                </tr>
                <tr>
                    <td>Ingrese el numero de Cédula del Médico:</td>
                    <td><input type="text" name="cedulam" id="cedulam" size="15" maxlenght="32" value=""></td>
                </tr>
            </table><br>
            <p align="center"><input type="submit" value="Eliminar Médico" id="eliminarmedico"></p>
        </form>
    </body>
</html>
