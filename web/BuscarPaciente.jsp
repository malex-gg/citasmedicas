<%-- 
    Document   : BuscarPaciente
    Created on : 16/04/2015, 17:46:35
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
        <!--<form name="form1" method='POST'>-->
            <div>
                <h1> Búsqueda de Paciente</h1>
                <!--<form name="form1" method='POST'>-->
                <form name="form1" action='buscarpaciente.do' method='GET'>
                    <p>Cédula: <input type='text' name='cedulap'></p>
                    <p><input type='submit' value='Buscar Paciente'></p>
                </form>
            </div>
    </body>
</html>
