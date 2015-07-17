<%-- 
    Document   : VisualizarCitas
    Created on : 16/04/2015, 18:16:21
    Author     : Malex
--%>

<%@page import="com.citasmedicasv2.modelo.Citas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Citas citas = (Citas) request.getAttribute("citas");
    System.out.println(citas.getCedulaPaciente());
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="50%" align="center" border="3">
            <h1>Visualización Citas Paciente</h1>
            <tr>
                <td width="80%" align="center">Cédula Paciente</td>
                <td width="80%" align="center">Nombre Paciente</td>
                <td width="80%" align="center">Apellido Paciente</td>
                <td width="80%" align="center">Edad Paciente</td>
                <td width="80%" align="center">Sexo Paciente</td>
                <td width="80%" align="center">Fecha Cita</td>
                <td width="80%" align="center">Médico Cita</td>
            </tr>
            <%--<%for (Reo reo : reos) {%>--%>
            <tr>
                <td width="80%" align="center"><%=citas.getCedulaPaciente()%></td>
                <td width="80%" align="center"><%=citas.getNombrePacienteCita()%></td>
                <td width="80%" align="center"><%=citas.getApellidoPacienteCita()%></td>
                <td width="80%" align="center"><%=citas.getEdadPacienteCita()%></td>
                <td width="80%" align="center"><%=citas.getSexoPacienteCita()%></td>
                <td width="80%" align="center"><%=citas.getFechaCita()%></td>
                <td width="80%" align="center"><%=citas.getMedicoCita()%></td>
            </tr>
            <%--<%}%--%>
        </table><br>
    </body>
</html>
