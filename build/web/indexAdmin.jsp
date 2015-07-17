<%-- 
    Document   : indexAdmin
    Created on : 16/04/2015, 19:12:38
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Administrador</title>
    </head>
    <body>
        <form >
            <table align="center">
                <tr>
                    <td><h1>Bienvenido Administrador</h1></td>
                </tr>
            </table>
            <table align="center">
                <tr>
                    <td><h2>Menú Administrador</h2></td>
                </tr>
            </table>
            <table align="center">
                <tr>
                    <td><input type="button" value="Registrar Paciente" onClick="location.href = 'RegistrarPaciente.jsp'"></td>
                </tr>
            </table>
        </form>

        <form >
            <table align="center">
                <td><input type="button" value="Registrar Médico" onClick="location.href = 'RegistrarMedico.jsp'"></td>
            </table>
        </form>

        <form >
            <table align="center">
                <td><input type="button" value="Reservar Cita Médica" onClick="location.href = 'ReservarCitaMedica.jsp'"></td>
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
                <td><input type="button" value="Buscar Medico" onClick="location.href = 'BuscarMedico.jsp'"></td>
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
                <td><input type="button" value="Eliminar Paciente" onClick="location.href = 'EliminarPaciente.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Eliminar Médico" onClick="location.href = 'EliminarMedico.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Eliminar Cita" onClick="location.href = 'EliminarCita.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Eliminar Historial" onClick="location.href = 'EliminarHistorial.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Actualizar Paciente" onClick="location.href = 'ActualizarPaciente.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Actualizar Médico" onClick="location.href = 'ActualizarMedico.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Actualizar Historial" onClick="location.href = 'ActualizarHistorial.jsp'"></td>
            </table>
        </form>
        
        <form >
            <table align="center">
                <td><input type="button" value="Actualizar Cita" onClick="location.href = 'ActualizarCita.jsp'"></td>
            </table>
        </form>
        
    </body>
</html>
