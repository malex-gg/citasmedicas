<%-- 
    Document   : LoginMedico
    Created on : 07/05/2015, 12:10:16
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Médico</title>
    </head>
    <body>
        <form name="form1" action="loginmedico.do">
            <table align="center">
                <tr>
                    <td><h1>Login Administrador</h1></td>
                </tr>
                <tr>
                    <td>Cedula:</td>
                    <td><input type="text" name="cedulamedico" id="cedulamedico" size="15" maxlenght="32" value=""></td>
                </tr>
                <tr>
                    <td>Contraseña:</td>
                    <td><input type="password" name="passwordmedico" id="passwordmedico" size="15" maxlenght="32" value=""></td>
                </tr>
            </table><br>
            <p align="center"><input type="submit" value="Entrar"></p>
        </form>
    </body>
</html>
