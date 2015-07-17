/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.modelo;

import java.util.Objects;

/**
 *
 * @author Malex
 */
public class Horario {
    
    private String idHorario;
    private String horarioCita;

    public String getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorarioCita() {
        return horarioCita;
    }

    public void setHorarioCita(String horarioCita) {
        this.horarioCita = horarioCita;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.idHorario);
        hash = 13 * hash + Objects.hashCode(this.horarioCita);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horario other = (Horario) obj;
        if (!Objects.equals(this.idHorario, other.idHorario)) {
            return false;
        }
        if (!Objects.equals(this.horarioCita, other.horarioCita)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", horarioCita=" + horarioCita + '}';
    }

    
    
    
}
