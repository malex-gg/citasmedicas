<%-- 
    Document   : RegistrarMedico
    Created on : 16/04/2015, 12:49:08
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Medico</title>
    </head>
    <body>
        <div>
            <h1> Formulario de Registro de Médico</h1>
            <form name="form1" action="registrarmedico.do" method='POST'>
                <p>Cédula: <input type='text' name='cedulamedico'></p>
                <p>Nombre: <input type='text' name='nombremedico'></p>
                <p>Apellido: <input type='text' name='apellidomedico'></p>
                <p>Edad: <input type='text' name='edadmedico'></p>
                <p>Especialidad: <input type='text' name='especialidadmedico'></p>
                <p>Teléfono: <input type='text' name='telefonomedico'></p>
                <p>E-mail: <input type='text' name='emailmedico'></p>
                <p>Contraseña: <input type='password' name='contraseniamedico'></p>
                <p><input type='submit' value='Registrar Médico'></p>
            </form>
        </div>
    </body>
</html>
