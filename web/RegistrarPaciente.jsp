<%-- 
    Document   : RegistrarPaciente
    Created on : 16/04/2015, 12:44:28
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Paciente</title>
    </head>
    <body>
        <h1> Formulario de Registro de Paciente</h1>
        <form name="form1" action="registrarpaciente.do" >
            <p>Cédula: <input type='text' name='cedulap'></p>
            <p>Nombre: <input type='text' name='nombrep'></p>
            <p>Apellido: <input type='text' name='apellidop'></p>
            <p>Edad: <input type='text' name='edadp'></p>
            <p>Seleccione su Sexo: <select id='sexo' name='sexop'>
                    <option value='masculino'>Masculino</option>
                    <option value='femenino'>Femenino</option>
                </select></p>
            <p>E-mail: <input type='text' name='emailp'></p>
            <p>Contraseña: <input type='password' name='contraseniap'></p>
            <p><input type='submit' value='Registrarse'></p>
        </form>
    </body>
</html>
