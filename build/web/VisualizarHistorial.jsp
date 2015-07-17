<%-- 
    Document   : VisualizarHistorial
    Created on : 16/04/2015, 18:27:24
    Author     : Malex
--%>

<%@page import="com.citasmedicasv2.modelo.Historial"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Historial historial = (Historial) request.getAttribute("historial");
    System.out.println(historial.getCedulaPacienteHistorial());
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="50%" align="center" border="3">
            <h1>Visualización Historial Paciente</h1>
            <tr>
                <td width="80%" align="center">Cédula Paciente</td>
                <td width="80%" align="center">Nombre Paciente</td>
                <td width="80%" align="center">Apellido Paciente</td>
                <td width="80%" align="center">Edad Paciente</td>
                <td width="80%" align="center">Sexo Paciente</td>
                <td width="80%" align="center">Alergia Paciente</td>
                <td width="80%" align="center">Sintomas Paciente</td>
                <td width="80%" align="center">Observaciones Paciente</td>
                <td width="80%" align="center">Sintomas Paciente</td>
                <td width="80%" align="center">Dictamen Médico</td>
                <td width="80%" align="center">Receta Médico</td>
            </tr>
            <%--<%for (Reo reo : reos) {%>--%>
            <tr>
                <td width="80%" align="center"><%=historial.getCedulaPacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getNombrePacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getApellidoPacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getEdadPacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getSexoPacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getAlergiaPacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getSintomasPacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getObservacionesPacienteHistorial()%></td>
                <td width="80%" align="center"><%=historial.getDitamenMedicoHistorial()%></td>
                <td width="80%" align="center"><%=historial.getRecetaMedicoHistorial()%></td>
            </tr>
            <%--<%}%--%>
        </table><br>
    </body>
</html>
