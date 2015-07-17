/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.servicio;

import com.citasmedicasv2.ValidacionException;
import com.citasmedicasv2.dao.PacienteDAO;
import com.citasmedicasv2.modelo.Paciente;
import java.util.List;

/**
 *
 * @author Malex
 */
public class PacienteServicio {
    
    public String crearPaciente(Paciente paciente) throws ValidacionException {
        PacienteDAO dao = new PacienteDAO();
        Paciente pacienteTmp = dao.findByPK(paciente.getCedulaPaciente());
        if (pacienteTmp == null) {
            dao.insert(paciente);
            return "success";
        } else {
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
        
    }
    
    public String actualizarPaciente(Paciente paciente) throws ValidacionException {
        PacienteDAO dao = new PacienteDAO();
//        dao.update(reo);
        Paciente reoTmp = dao.findByPK(paciente.getCedulaPaciente());
        
        if (reoTmp != null) {
            System.out.println("not null");
            dao.update(paciente);
            return "success";
        } else {
            System.out.println("null");
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public String eliminarPaciente(Paciente paciente) throws ValidacionException {
        PacienteDAO dao = new PacienteDAO();
        Paciente reoTmp = dao.findByPK(paciente.getCedulaPaciente());
        
        if (reoTmp != null) {
            dao.delete(paciente);
            return "success";
        } else {
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }
    
    public Paciente obtenerPaciente(String cedula) {
        PacienteDAO dao = new PacienteDAO();
        return dao.findByPK(cedula);
    }
    
    public List<Paciente> obtenerTodos() {
         PacienteDAO dao = new PacienteDAO();
        return dao.findAll();
    }
    
}
