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
public class Medico {
    
    private String cedulaMedico;
    private String nombreMedico;
    private String apellidoMedico;
    private String edadMedico;
    private String especialidadMedico;
    private String telefonoMedico;
    private String emailMedico;
    private String contraseniaMedico;

    public String getCedulaMedico() {
        return cedulaMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public String getEdadMedico() {
        return edadMedico;
    }

    public String getEspecialidadMedico() {
        return especialidadMedico;
    }

    public String getTelefonoMedico() {
        return telefonoMedico;
    }

    public String getEmailMedico() {
        return emailMedico;
    }

    public String getContraseniaMedico() {
        return contraseniaMedico;
    }

    public void setCedulaMedico(String cedulaMedico) {
        this.cedulaMedico = cedulaMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }

    public void setEdadMedico(String edadMedico) {
        this.edadMedico = edadMedico;
    }

    public void setEspecialidadMedico(String especialidadMedico) {
        this.especialidadMedico = especialidadMedico;
    }

    public void setTelefonoMedico(String telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }

    public void setEmailMedico(String emailMedico) {
        this.emailMedico = emailMedico;
    }

    public void setContraseniaMedico(String contraseniaMedico) {
        this.contraseniaMedico = contraseniaMedico;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.cedulaMedico);
        hash = 37 * hash + Objects.hashCode(this.nombreMedico);
        hash = 37 * hash + Objects.hashCode(this.apellidoMedico);
        hash = 37 * hash + Objects.hashCode(this.edadMedico);
        hash = 37 * hash + Objects.hashCode(this.especialidadMedico);
        hash = 37 * hash + Objects.hashCode(this.telefonoMedico);
        hash = 37 * hash + Objects.hashCode(this.emailMedico);
        hash = 37 * hash + Objects.hashCode(this.contraseniaMedico);
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
        final Medico other = (Medico) obj;
        if (!Objects.equals(this.cedulaMedico, other.cedulaMedico)) {
            return false;
        }
        if (!Objects.equals(this.nombreMedico, other.nombreMedico)) {
            return false;
        }
        if (!Objects.equals(this.apellidoMedico, other.apellidoMedico)) {
            return false;
        }
        if (!Objects.equals(this.edadMedico, other.edadMedico)) {
            return false;
        }
        if (!Objects.equals(this.especialidadMedico, other.especialidadMedico)) {
            return false;
        }
        if (!Objects.equals(this.telefonoMedico, other.telefonoMedico)) {
            return false;
        }
        if (!Objects.equals(this.emailMedico, other.emailMedico)) {
            return false;
        }
        if (!Objects.equals(this.contraseniaMedico, other.contraseniaMedico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medico{" + "cedulaMedico=" + cedulaMedico + ", nombreMedico=" + nombreMedico + ", apellidoMedico=" + apellidoMedico + ", edadMedico=" + edadMedico + ", especialidadMedico=" + especialidadMedico + ", telefonoMedico=" + telefonoMedico + ", emailMedico=" + emailMedico + ", contraseniaMedico=" + contraseniaMedico + '}';
    }

}
