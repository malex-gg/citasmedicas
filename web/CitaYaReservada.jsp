<%-- 
    Document   : CitaYaReservada
    Created on : 11/06/2015, 11:20:16
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cita Ya Reservada</title>
    </head>
    <body>
        <h1>Querido Paciente:</h1>
        <p>La cita solicitada en la fecha y hora que usted solicito ya se encuentra solicitada por otro paciente.</p>
        <p>Por favor escoja otra hora o solicitela en otro día en el mismo horario. Gracias.</p> 
        
        <form >
            <table align="center">
                <td><input type="button" value="Reservar Cita Médica" onClick="location.href = 'ReservarCitaMedica.jsp'"></td>
            </table>
        </form>
        
    </body>
</html>
