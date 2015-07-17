<%-- 
    Document   : indexUsuario
    Created on : 07/05/2015, 1:01:19
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Usuario</title>
    </head>
    <body>
        <form >
            <table align="center">
                <tr>
                    <td><h1>Bienvenido Paciente</h1></td>
                </tr>
            </table>
            <table align="center">
                <tr>
                    <td><h2>Menú Paciente</h2></td>
                </tr>
            </table>

        </form>

        <form >
            <table align="center">
                <td><input type="button" value="Reservar Cita Médica" onClick="location.href = 'ReservarCitaMedica.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Actualizar Cita" onClick="location.href = 'ActualizarCita.jsp'"></td>
            </table>
        </form>
        
    </body>
</html>
