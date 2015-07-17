<%-- 
    Document   : ActualizarCita
    Created on : 16/04/2015, 19:05:52
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
        <h1> Reserva de Cita Médica</h1> 
        <form name="form1" action='actualizarcita.do' method='POST'>
            <p>Cédula: <input type='text' name='cedulacita'></p>
            <p>Nombre: <input type='text' name='nombrecita'></p>
            <p>Apellido: <input type='text' name='apellidocita'></p>
            <p>Edad: <input type='text' name='edadcita'></p>
            <p>Seleccione el Sexo: <select id='sexo' name='sexocita'>
                    <option value='masculino'>Masculino</option>
                    <option value='femenino'>Femenino</option>
                </select></p>
            <!--<p>Seleccione el día: <select id='dia' name='dia'>
                <option value='lunes'>Lunes</option>
                <option value='martes'>Martes</option>
                <option value='miercoles'>Miercoles</option>
                <option value='jueves'>Jueves</option>
                <option value='viernes'>Viernes</option>
                <option value='sabado'>Sábado</option>
                </select></p>-->
            <p>Seleccione el día: <input type="date" id="datepicker" name="datepicker"></p>
            <p>Seleccione el Médico: <select id='medico' name='medicocita'>
                    <option value='drnavajas'>Dr. Pedro Navajas</option>
                    <option value='drcharro'>Dr. Diego Charro</option>
                    <option value='drcuervo'>Dr. Jose Cuervo</option>
                    <option value='drfernandez'>Dr. Vicente Fernandez</option>
                </select></p>

            <p><input type='submit' value='Actualizar Cita Médica'></p>
        </form>
    </body>
</html>
