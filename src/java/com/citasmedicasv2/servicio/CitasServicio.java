/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.servicio;

import com.citasmedicasv2.ValidacionException;
import com.citasmedicasv2.dao.CitasDAO;
import com.citasmedicasv2.modelo.Citas;
import java.util.List;

/**
 *
 * @author Malex
 */
public class CitasServicio {

    public String crearCitas(Citas citas) throws ValidacionException {
        CitasDAO dao = new CitasDAO();
        int result = dao.insert(citas);
        if (result == 1) {
            return "success";
        } else if (result == 0) {
            return "exists";
        } else {
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }

    public String actualizarCitas(Citas citas) throws ValidacionException {
        CitasDAO dao = new CitasDAO();
//        dao.update(reo);
        Citas reoTmp = dao.findByPK(citas.getCedulaPaciente());

        if (reoTmp != null) {
            System.out.println("not null");
            dao.update(citas);
            return "success";
        } else {
            System.out.println("null");
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }

    public String eliminarCitas(Citas citas) throws ValidacionException {
        CitasDAO dao = new CitasDAO();
        Citas reoTmp = dao.findByPK(citas.getCedulaPaciente());

        if (reoTmp != null) {
            dao.delete(citas);
            return "success";
        } else {
            //throw new ValidacionException("El reo con este numero de cedula: " + reo.getCedula() + " ya existe.");
            return "bad";
        }
    }

    public Citas obtenerCitas(String cedula) {
        CitasDAO dao = new CitasDAO();
        return dao.findByPK(cedula);
    }

    public List<Citas> obtenerTodos() {
        CitasDAO dao = new CitasDAO();
        return dao.findAll();
    }

    public List<Citas> obtenerCitasFecha(String fecha) {
        CitasDAO dao = new CitasDAO();
        return dao.findByFecha(fecha);
    }

}
