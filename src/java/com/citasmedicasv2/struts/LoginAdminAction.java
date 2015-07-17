/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.struts;

import com.citasmedicasv2.modelo.Administrador;
import com.citasmedicasv2.servicio.AdministradorServicio;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Malex
 */
public class LoginAdminAction extends org.apache.struts.action.Action {

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
        
        AdministradorServicio servicio = new AdministradorServicio();
        Administrador admin = servicio.obtenerAdministrador(request.getParameter("cedulaadmin"));
        
        
        if (admin != null) {
            if (request.getParameter("passwordadmin").equals(admin.getContrasenia())) {
                request.getSession().setAttribute("usuario", admin);
                return mapping.findForward(SUCCESS);
            } else {
                return mapping.findForward(BAD);
            }

        } else {
            return mapping.findForward(BAD);
        }
    }
}
