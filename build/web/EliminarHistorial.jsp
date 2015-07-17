<%-- 
    Document   : EliminarHistorial
    Created on : 16/04/2015, 18:42:07
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
        <form name="form3" action="eliminarhistorial.do">
            <table align="center">
                <tr>
                    <td><h1>Eliminar Historial</h1></td>
                </tr>
                <tr>
                    <td>Ingrese el numero de Cédula del Paciente:</td>
                    <td><input type="text" name="cedulap" id="cedulap" size="15" maxlenght="32" value=""></td>
                </tr>
            </table><br>
            <p align="center"><input type="submit" value="Eliminar Historial" id="eliminarhistorial"></p>
        </form>
    </body>
</html>
