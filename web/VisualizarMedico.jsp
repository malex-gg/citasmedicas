<%-- 
    Document   : VisualizarMedico
    Created on : 16/04/2015, 18:06:08
    Author     : Malex
--%>

<%@page import="com.citasmedicasv2.modelo.Medico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  
    Medico medico = (Medico) request.getAttribute("medico");
            System.out.println(medico.getCedulaMedico());
    
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
                <td width="80%" align="center">Cédula Médico</td>
                <td width="80%" align="center">Nombre Médico</td>
                <td width="80%" align="center">Apellido Médico</td>
                <td width="80%" align="center">Edad Médico</td>
                <td width="80%" align="center">Especialidad Médico</td>
                <td width="80%" align="center">Teléfono Médico</td>
                <td width="80%" align="center">Correo Médico</td>
            </tr>
            <%--<%for (Reo reo : reos) {%>--%>
            <tr>
                <td width="80%" align="center"><%=medico.getCedulaMedico()%></td>
                <td width="80%" align="center"><%=medico.getNombreMedico()%></td>
                <td width="80%" align="center"><%=medico.getApellidoMedico()%></td>
                <td width="80%" align="center"><%=medico.getEdadMedico()%></td>
                <td width="80%" align="center"><%=medico.getEspecialidadMedico()%></td>
                <td width="80%" align="center"><%=medico.getTelefonoMedico()%></td>
                <td width="80%" align="center"><%=medico.getEmailMedico()%></td>
            </tr>
            <%--<%}%--%>
        </table><br>
    </body>
</html>
