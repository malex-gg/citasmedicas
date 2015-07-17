<%-- 
    Document   : indexMedico
    Created on : 07/05/2015, 13:55:48
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Médico</title>
    </head>
    <body>
        <form >
            <table align="center">
                <tr>
                    <td><h1>Bienvenido Médico</h1></td>
                </tr>
            </table>
            <table align="center">
                <tr>
                    <td><h2>Menú Médico</h2></td>
                </tr>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Registrar Historial" onClick="location.href = 'RegistrarHistorial.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Buscar Paciente" onClick="location.href = 'BuscarPaciente.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Buscar Cita" onClick="location.href = 'BusquedaCita.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Buscar Historial" onClick="location.href = 'BuscarHistorial.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Actualizar Historial" onClick="location.href = 'ActualizarHistorial.jsp'"></td>
            </table>
        </form>
    </body>
</html>
