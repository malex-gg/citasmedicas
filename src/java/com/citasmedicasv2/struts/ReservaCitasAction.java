/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.struts;

import com.citasmedicasv2.modelo.Citas;
import com.citasmedicasv2.servicio.CitasServicio;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Malex
 */
public class ReservaCitasAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String EXISTS = "exists";
    
    
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
        CitasServicio servicio = new CitasServicio();
        Citas citas = new Citas();
        
        
        citas.setCedulaPaciente(request.getParameter("cedulacita"));
        citas.setNombrePacienteCita(request.getParameter("nombrecita"));
        citas.setApellidoPacienteCita(request.getParameter("apellidocita"));
        citas.setEdadPacienteCita(request.getParameter("edadcita"));
        citas.setSexoPacienteCita(request.getParameter("sexocita"));
        citas.setFechaCita(request.getParameter("datepicker"));
        citas.setIdHorarioCita(request.getParameter("horariocita"));
        citas.setCedulaMedico(request.getParameter("medicocita"));
        
        String serv = servicio.crearCitas(citas);
        if (SUCCESS.equals(serv)) {
            return mapping.findForward(SUCCESS);
        } else if (BAD.equals(serv)) {
            return mapping.findForward(BAD);
        } else if (EXISTS.equals(serv)) {
            return mapping.findForward(EXISTS);
        } else {
            return mapping.findForward(BAD);
        }
    }
}
