<%-- 
    Document   : BusquedaCita
    Created on : 16/04/2015, 18:14:56
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
            <h1> Búsqueda de Citas</h1>
            <!--<form name="form1" method='POST'>-->
            <form name="form1" action='buscarcita.do' method='GET'>
                <p>Ingrese el número de Cédula del Paciente: <input type='text' name='cedulap'></p>
                <p><input type='submit' value='Buscar Historial'></p>
            </form>
        </div>
    </body>
</html>
