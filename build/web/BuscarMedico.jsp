<%-- 
    Document   : BuscarMedico
    Created on : 16/04/2015, 18:01:04
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
            <div>
                <h1> Búsqueda de Médico</h1>
                <!--<form name="form1" method='POST'>-->
                <form name="form1" action='buscarmedico.do' method='GET'>
                    <p>Cédula: <input type='text' name='cedulam'></p>
                    <p><input type='submit' value='Buscar Paciente'></p>
                </form>
            </div>
    </body>
</html>
