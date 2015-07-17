/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.servicio;
import com.citasmedicasv2.dao.HorarioDAO;
import com.citasmedicasv2.modelo.Horario;

import java.util.List;

/**
 *
 * @author Malex
 */
public class HorarioServicio {
    public List<Horario> obtenerTodos() {
        HorarioDAO dao = new HorarioDAO();
        return dao.findAll();
    }
}
