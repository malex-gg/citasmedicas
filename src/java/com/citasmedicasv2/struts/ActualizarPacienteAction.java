/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.struts;

import com.citasmedicasv2.modelo.Paciente;
import com.citasmedicasv2.servicio.PacienteServicio;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Malex
 */
public class ActualizarPacienteAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    /* forward name="bad" path="" */
    private static final String BAD = "bad";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        PacienteServicio servicio = new PacienteServicio();
        Paciente paciente = new Paciente();
        
        paciente.setCedulaPaciente(request.getParameter("cedulap"));
        System.out.println(paciente.getCedulaPaciente());
        paciente.setNombrePaciente(request.getParameter("nombrep"));
        paciente.setApellidoPaciente(request.getParameter("apellidop"));
        paciente.setEdadPaciente(request.getParameter("edadp"));
        paciente.setSexoPaciente(request.getParameter("sexop"));
        paciente.setEmailPaciente(request.getParameter("emailp"));
        paciente.setContraseniaPaciente(request.getParameter("contraseniap"));
        
        String serv = servicio.actualizarPaciente(paciente);
        if (SUCCESS.equals(serv)) {
            return mapping.findForward(SUCCESS);
        } else if (BAD.equals(serv)) {
            return mapping.findForward(BAD);
        } else {
            return mapping.findForward(BAD);
        }
    }
}
