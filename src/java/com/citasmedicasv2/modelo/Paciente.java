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
public class Paciente {
    
    private String cedulaPaciente;
    private String nombrePaciente;
    private String apellidoPaciente;
    private String edadPaciente;
    private String sexoPaciente;
    private String emailPaciente;
    private String contraseniaPaciente;

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public String getEdadPaciente() {
        return edadPaciente;
    }

    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public String getEmailPaciente() {
        return emailPaciente;
    }

    public String getContraseniaPaciente() {
        return contraseniaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public void setEdadPaciente(String edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public void setEmailPaciente(String emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public void setContraseniaPaciente(String contraseniaPaciente) {
        this.contraseniaPaciente = contraseniaPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cedulaPaciente);
        hash = 79 * hash + Objects.hashCode(this.nombrePaciente);
        hash = 79 * hash + Objects.hashCode(this.apellidoPaciente);
        hash = 79 * hash + Objects.hashCode(this.edadPaciente);
        hash = 79 * hash + Objects.hashCode(this.sexoPaciente);
        hash = 79 * hash + Objects.hashCode(this.emailPaciente);
        hash = 79 * hash + Objects.hashCode(this.contraseniaPaciente);
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
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.cedulaPaciente, other.cedulaPaciente)) {
            return false;
        }
        if (!Objects.equals(this.nombrePaciente, other.nombrePaciente)) {
            return false;
        }
        if (!Objects.equals(this.apellidoPaciente, other.apellidoPaciente)) {
            return false;
        }
        if (!Objects.equals(this.edadPaciente, other.edadPaciente)) {
            return false;
        }
        if (!Objects.equals(this.sexoPaciente, other.sexoPaciente)) {
            return false;
        }
        if (!Objects.equals(this.emailPaciente, other.emailPaciente)) {
            return false;
        }
        if (!Objects.equals(this.contraseniaPaciente, other.contraseniaPaciente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cedulaPaciente=" + cedulaPaciente + ", nombrePaciente=" + nombrePaciente + ", apellidoPaciente=" + apellidoPaciente + ", edadPaciente=" + edadPaciente + ", sexoPaciente=" + sexoPaciente + ", emailPaciente=" + emailPaciente + ", contraseniaPaciente=" + contraseniaPaciente + '}';
    }
    
}
