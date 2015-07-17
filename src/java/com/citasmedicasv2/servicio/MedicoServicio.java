/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.servicio;

import com.citasmedicasv2.ValidacionException;
import com.citasmedicasv2.dao.MedicoDAO;
import com.citasmedicasv2.modelo.Medico;
import java.util.List;

/**
 *
 * @author Malex
 */
public class MedicoServicio {
    
    public String crearMedico(Medico medico) throws ValidacionException {
        MedicoDAO dao = new MedicoDAO();
        Medico medicoTmp = dao.findByPK(medico.getCedulaMedico());
        if (medicoTmp == null) {
            dao.insert(medico);
            return "success";
        } else {
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public String actualizarMedico(Medico medico) throws ValidacionException {
        MedicoDAO dao = new MedicoDAO();
//        dao.update(reo);
        Medico reoTmp = dao.findByPK(medico.getCedulaMedico());
        
        if (reoTmp != null) {
            System.out.println("not null");
            dao.update(medico);
            return "success";
        } else {
            System.out.println("null");
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public String eliminarMedico(Medico medico) throws ValidacionException {
        MedicoDAO dao = new MedicoDAO();
        Medico reoTmp = dao.findByPK(medico.getCedulaMedico());
        
        if (reoTmp != null) {
            dao.delete(medico);
            return "success";
        } else {
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public Medico obtenerMedico(String cedula) {
        MedicoDAO dao = new MedicoDAO();
        return dao.findByPK(cedula);
    }
    
    public List<Medico> obtenerTodos() {
        MedicoDAO dao = new MedicoDAO();
        return dao.findAll();
    }
    
}
