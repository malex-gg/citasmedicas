<%-- 
    Document   : VisualizarPaciente
    Created on : 16/04/2015, 17:52:57
    Author     : Malex
--%>

<%@page import="com.citasmedicasv2.modelo.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
    
    Paciente paciente = (Paciente) request.getAttribute("paciente");
    System.out.println(paciente.getCedulaPaciente());
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="50%" align="center" border="3">
            <h1>Visualización Paciente</h1>
            <tr>
                <td width="80%" align="center">Cédula Paciente</td>
                <td width="80%" align="center">Nombre Paciente</td>
                <td width="80%" align="center">Apellido Paciente</td>
                <td width="80%" align="center">Edad Paciente</td>
                <td width="80%" align="center">Sexo Paciente</td>
                <td width="80%" align="center">Correo Paciente</td>
            </tr>
            <%--<%for (Reo reo : reos) {%>--%>
            <tr>
                <td width="80%" align="center"><%=paciente.getCedulaPaciente()%></td>
                <td width="80%" align="center"><%=paciente.getNombrePaciente()%></td>
                <td width="80%" align="center"><%=paciente.getApellidoPaciente()%></td>
                <td width="80%" align="center"><%=paciente.getEdadPaciente()%></td>
                <td width="80%" align="center"><%=paciente.getSexoPaciente()%></td>
                <td width="80%" align="center"><%=paciente.getEmailPaciente()%></td>
            </tr>
            <%--<%}%--%>
        </table><br>
    </body>
</html>
