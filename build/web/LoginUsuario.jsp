<%-- 
    Document   : LoginUsuario
    Created on : 07/05/2015, 0:25:24
    Author     : Malex
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Usuario</title>
        <!--<link rel="stylesheet" href="/web/css/login.css">-->
    </head>
    
    <body>
        <form name="form1" action="loginusuario.do">
            <table align="center">
                <tr>
                    <td><h1>Login Usuario</h1></td>
                </tr>
                <tr>
                    <td>Cedula:</td>
                    <td><input type="text" name="cedulausuario" id="cedulausuario" size="15" maxlenght="32" value=""></td>
                </tr>
                <tr>
                    <td>Contraseña:</td>
                    <td><input type="password" name="passwordusuario" id="passwordusuario" size="15" maxlenght="32" value=""></td>
                </tr>
            </table><br>
            <p align="center"><input type="submit" value="Entrar"></p>
        </form>
    </body>
    
</html>
