<%-- 
    Document   : LoginAdministrador
    Created on : 16/04/2015, 19:06:49
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Administrador</title>
    </head>
    <body>
        <form name="form1" action="loginadmin.do">
            <table align="center">
                <tr>
                    <td><h1>Login Administrador</h1></td>
                </tr>
                <tr>
                    <td>Cedula:</td>
                    <td><input type="text" name="cedulaadmin" id="cedulaadmin" size="15" maxlenght="32" value=""></td>
                </tr>
                <tr>
                    <td>Contraseña:</td>
                    <td><input type="password" name="passwordadmin" id="passwordadmin" size="15" maxlenght="32" value=""></td>
                </tr>
            </table><br>
            <p align="center"><input type="submit" value="Entrar"></p>
        </form>
    </body>
</html>
