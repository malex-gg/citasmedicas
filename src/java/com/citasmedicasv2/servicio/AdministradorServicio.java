/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.servicio;

import com.citasmedicasv2.ValidacionException;
import com.citasmedicasv2.dao.AdministradorDAO;
import com.citasmedicasv2.modelo.Administrador;

/**
 *
 * @author Malex
 */
public class AdministradorServicio {
    
    public String crearAdministrador(Administrador admin) throws ValidacionException {
        AdministradorDAO dao = new AdministradorDAO();
        Administrador reoTmp = dao.findByPK(admin.getCedula());
        if (reoTmp == null) {
            dao.insert(admin);
            return "success";
        } else {
            //throw new ValidacionException("El Jefe de Policia con este numero de cedula: " + jefepolicia.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public Administrador obtenerAdministrador(String cedula) {
        AdministradorDAO dao = new AdministradorDAO();
        return dao.findByPK(cedula);
    }
    
}
