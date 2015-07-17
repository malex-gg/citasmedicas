<%-- 
    Document   : RegistrarCita
    Created on : 16/04/2015, 12:49:27
    Author     : Malex
--%>

<%@page import="com.citasmedicasv2.servicio.HorarioServicio"%>
<%@page import="com.citasmedicasv2.modelo.Horario"%>
<%@page import="com.citasmedicasv2.servicio.MedicoServicio"%>
<%@page import="com.citasmedicasv2.modelo.Medico"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List<Medico> medicos = new MedicoServicio().obtenerTodos();
    List<Horario> horarios = new HorarioServicio().obtenerTodos();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
        <title>Reservar Cita Medica</title>
    </head>
    <body>
        <h1> Reserva de Cita Médica</h1> 
        <form name="form1" action='reservacitas.do' method='POST'>
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
            <p>Seleccione el día: <input type="date" id="datepicker" name="datepicker" ></p>
            <!--<p>Seleccione el Médico: <select id='medicocita' name='medicocita'>
                    <option value="0" >--- Seleccione La Celda ---</option>
            <%--<%for (Medico medico : medicos) {%>
            <option value="<%=medico.getNombreMedico()+" "+medico.getApellidoMedico()%>">
                <%=medico.getNombreMedico()+" "+medico.getApellidoMedico()%></option>
                <%}%>--%>
        </select></p>-->
            <p>Seleccione el hora de cita: <select id="horariocita" name="horariocita">
                    <option value="0">--- Seleccione El Horario ---</option>
                    <%for (Horario horario : horarios) {%>
                    <option value="<%=horario.getIdHorario()%>">
                        <%=horario.getHorarioCita()%></option>
                        <%}%>
                </select></p>
            <p>Seleccione el Médico- Dr/a: <select id='medicocita' name='medicocita'>
                    <option value="0" >--- Seleccione El Médico ---</option>
                    <%for (Medico medico : medicos) {%>
                    <option value="<%=medico.getCedulaMedico()%>">
                        <%=medico.getApellidoMedico() + ", " + medico.getNombreMedico()%></option>
                        <%}%>
                    <p><input type='submit' value='Solicitar Cita Médica'></p>
        </form>
    </body>
</html>
