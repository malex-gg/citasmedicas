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
public class Citas {
    
    private String codigoCita;
    private String cedulaPaciente;
    private String cedulaMedico;
    private String nombrePacienteCita;
    private String apellidoPacienteCita;
    private String edadPacienteCita;
    private String sexoPacienteCita;
    private String fechaCita;
    private String medicoCita;
    private String idHorarioCita;

    public String getCodigoCita() {
        return codigoCita;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public String getCedulaMedico() {
        return cedulaMedico;
    }

    public String getNombrePacienteCita() {
        return nombrePacienteCita;
    }

    public String getApellidoPacienteCita() {
        return apellidoPacienteCita;
    }

    public String getEdadPacienteCita() {
        return edadPacienteCita;
    }

    public String getSexoPacienteCita() {
        return sexoPacienteCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }
    

    public String getMedicoCita() {
        return medicoCita;
    }

    public void setCodigoCita(String codigoCita) {
        this.codigoCita = codigoCita;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public void setCedulaMedico(String cedulaMedico) {
        this.cedulaMedico = cedulaMedico;
    }

    public void setNombrePacienteCita(String nombrePacienteCita) {
        this.nombrePacienteCita = nombrePacienteCita;
    }

    public void setApellidoPacienteCita(String apellidoPacienteCita) {
        this.apellidoPacienteCita = apellidoPacienteCita;
    }

    public void setEdadPacienteCita(String edadPacienteCita) {
        this.edadPacienteCita = edadPacienteCita;
    }

    public void setSexoPacienteCita(String sexoPacienteCita) {
        this.sexoPacienteCita = sexoPacienteCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public void setMedicoCita(String medicoCita) {
        this.medicoCita = medicoCita;
    }
    
    public String getIdHorarioCita() {
        return idHorarioCita;
    }

    public void setIdHorarioCita(String idHorarioCita) {
        this.idHorarioCita = idHorarioCita;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codigoCita);
        hash = 89 * hash + Objects.hashCode(this.cedulaPaciente);
        hash = 89 * hash + Objects.hashCode(this.cedulaMedico);
        hash = 89 * hash + Objects.hashCode(this.nombrePacienteCita);
        hash = 89 * hash + Objects.hashCode(this.apellidoPacienteCita);
        hash = 89 * hash + Objects.hashCode(this.edadPacienteCita);
        hash = 89 * hash + Objects.hashCode(this.sexoPacienteCita);
        hash = 89 * hash + Objects.hashCode(this.fechaCita);
        hash = 89 * hash + Objects.hashCode(this.medicoCita);
        hash = 89 * hash + Objects.hashCode(this.idHorarioCita);
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
        final Citas other = (Citas) obj;
        if (!Objects.equals(this.codigoCita, other.codigoCita)) {
            return false;
        }
        if (!Objects.equals(this.cedulaPaciente, other.cedulaPaciente)) {
            return false;
        }
        if (!Objects.equals(this.cedulaMedico, other.cedulaMedico)) {
            return false;
        }
        if (!Objects.equals(this.nombrePacienteCita, other.nombrePacienteCita)) {
            return false;
        }
        if (!Objects.equals(this.apellidoPacienteCita, other.apellidoPacienteCita)) {
            return false;
        }
        if (!Objects.equals(this.edadPacienteCita, other.edadPacienteCita)) {
            return false;
        }
        if (!Objects.equals(this.sexoPacienteCita, other.sexoPacienteCita)) {
            return false;
        }
        if (!Objects.equals(this.fechaCita, other.fechaCita)) {
            return false;
        }

        if (!Objects.equals(this.medicoCita, other.medicoCita)) {
            return false;
        }
        if (!Objects.equals(this.idHorarioCita, other.idHorarioCita)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Citas{" + "codigoCita=" + codigoCita + ", cedulaPaciente=" + cedulaPaciente + ", cedulaMedico=" + cedulaMedico + ", nombrePacienteCita=" + nombrePacienteCita + ", apellidoPacienteCita=" + apellidoPacienteCita + ", edadPacienteCita=" + edadPacienteCita + ", sexoPacienteCita=" + sexoPacienteCita + ", fechaCita=" + fechaCita + ", medicoCita=" + medicoCita + ", idHorarioCita=" + idHorarioCita + '}';
    }

}
