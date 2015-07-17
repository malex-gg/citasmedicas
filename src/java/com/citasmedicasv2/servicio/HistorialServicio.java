/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.servicio;

import com.citasmedicasv2.ValidacionException;
import com.citasmedicasv2.dao.HistorialDAO;
import com.citasmedicasv2.modelo.Historial;
import java.util.List;

/**
 *
 * @author Malex
 */
public class HistorialServicio {
    
    public String crearHistorial(Historial historial) throws ValidacionException {
        HistorialDAO dao = new HistorialDAO();
        Historial historialTmp = dao.findByPK(historial.getCedulaPacienteHistorial());
        if (historialTmp == null) {
            dao.insert(historial);
            return "success";
        } else {
            
            return "bad";
        }
    }
    
    public String actualizarHistorial(Historial historial) throws ValidacionException {
        HistorialDAO dao = new HistorialDAO();
//        dao.update(reo);
        Historial reoTmp = dao.findByPK(historial.getCedulaPacienteHistorial());
        
        if (reoTmp != null) {
            System.out.println("not null");
            dao.update(historial);
            return "success";
        } else {
            System.out.println("null");
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public String eliminarHistorial(Historial historial) throws ValidacionException {
        HistorialDAO dao = new HistorialDAO();
        Historial reoTmp = dao.findByPK(historial.getCedulaPacienteHistorial());
        
        if (reoTmp != null) {
            dao.delete(historial);
            return "success";
        } else {
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public Historial obtenerHistorial(String cedula) {
        HistorialDAO dao = new HistorialDAO();
        return dao.findByPK(cedula);
    }
    
    public List<Historial> obtenerTodos() {
         HistorialDAO dao = new HistorialDAO();
        return dao.findAll();
    }
    
}
