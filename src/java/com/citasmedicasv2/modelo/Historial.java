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
public class Historial {
    
    private int codigoHistorial;
    private String cedulaPacienteHistorial;
    private String nombrePacienteHistorial;
    private String apellidoPacienteHistorial;
    private String edadPacienteHistorial;
    private String sexoPacienteHistorial;
    private String tipoSangrePacienteHistorial;
    private String alergiaPacienteHistorial;
    private String sintomasPacienteHistorial;
    private String observacionesPacienteHistorial;
    private String ditamenMedicoHistorial;
    private String recetaMedicoHistorial;

    
    //*******************************GETTERS***********************************
    public int getCodigoHistorial() {
        return codigoHistorial;
    }

    public String getCedulaPacienteHistorial() {
        return cedulaPacienteHistorial;
    }

    public String getNombrePacienteHistorial() {
        return nombrePacienteHistorial;
    }

    public String getApellidoPacienteHistorial() {
        return apellidoPacienteHistorial;
    }

    public String getEdadPacienteHistorial() {
        return edadPacienteHistorial;
    }

    public String getSexoPacienteHistorial() {
        return sexoPacienteHistorial;
    }

    public String getTipoSangrePacienteHistorial() {
        return tipoSangrePacienteHistorial;
    }

    public String getAlergiaPacienteHistorial() {
        return alergiaPacienteHistorial;
    }

    public String getSintomasPacienteHistorial() {
        return sintomasPacienteHistorial;
    }

    public String getObservacionesPacienteHistorial() {
        return observacionesPacienteHistorial;
    }

    public String getDitamenMedicoHistorial() {
        return ditamenMedicoHistorial;
    }

    public String getRecetaMedicoHistorial() {
        return recetaMedicoHistorial;
    }
    
    //****************************SETTERS***************************************
    public void setCodigoHistorial(int codigoHistorial) {
        this.codigoHistorial = codigoHistorial;
    }

    public void setCedulaPacienteHistorial(String cedulaPacienteHistorial) {
        this.cedulaPacienteHistorial = cedulaPacienteHistorial;
    }

    public void setNombrePacienteHistorial(String nombrePacienteHistorial) {
        this.nombrePacienteHistorial = nombrePacienteHistorial;
    }

    public void setApellidoPacienteHistorial(String apellidoPacienteHistorial) {
        this.apellidoPacienteHistorial = apellidoPacienteHistorial;
    }

    public void setEdadPacienteHistorial(String edadPacienteHistorial) {
        this.edadPacienteHistorial = edadPacienteHistorial;
    }

    public void setSexoPacienteHistorial(String sexoPacienteHistorial) {
        this.sexoPacienteHistorial = sexoPacienteHistorial;
    }

    public void setTipoSangrePacienteHistorial(String tipoSangrePacienteHistorial) {
        this.tipoSangrePacienteHistorial = tipoSangrePacienteHistorial;
    }

    public void setAlergiaPacienteHistorial(String alergiaPacienteHistorial) {
        this.alergiaPacienteHistorial = alergiaPacienteHistorial;
    }

    public void setSintomasPacienteHistorial(String sintomasPacienteHistorial) {
        this.sintomasPacienteHistorial = sintomasPacienteHistorial;
    }

    public void setObservacionesPacienteHistorial(String observacionesPacienteHistorial) {
        this.observacionesPacienteHistorial = observacionesPacienteHistorial;
    }

    public void setDitamenMedicoHistorial(String ditamenMedicoHistorial) {
        this.ditamenMedicoHistorial = ditamenMedicoHistorial;
    }

    public void setRecetaMedicoHistorial(String recetaMedicoHistorial) {
        this.recetaMedicoHistorial = recetaMedicoHistorial;
    }

    //*************************HASH********************************************
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.codigoHistorial;
        hash = 13 * hash + Objects.hashCode(this.cedulaPacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.nombrePacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.apellidoPacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.edadPacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.sexoPacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.tipoSangrePacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.alergiaPacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.sintomasPacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.observacionesPacienteHistorial);
        hash = 13 * hash + Objects.hashCode(this.ditamenMedicoHistorial);
        hash = 13 * hash + Objects.hashCode(this.recetaMedicoHistorial);
        return hash;
    }

    //****************************EQUALS***************************************
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Historial other = (Historial) obj;
        if (this.codigoHistorial != other.codigoHistorial) {
            return false;
        }
        if (!Objects.equals(this.cedulaPacienteHistorial, other.cedulaPacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.nombrePacienteHistorial, other.nombrePacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.apellidoPacienteHistorial, other.apellidoPacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.edadPacienteHistorial, other.edadPacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.sexoPacienteHistorial, other.sexoPacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.tipoSangrePacienteHistorial, other.tipoSangrePacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.alergiaPacienteHistorial, other.alergiaPacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.sintomasPacienteHistorial, other.sintomasPacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.observacionesPacienteHistorial, other.observacionesPacienteHistorial)) {
            return false;
        }
        if (!Objects.equals(this.ditamenMedicoHistorial, other.ditamenMedicoHistorial)) {
            return false;
        }
        if (!Objects.equals(this.recetaMedicoHistorial, other.recetaMedicoHistorial)) {
            return false;
        }
        return true;
    }

    //***************************TO STRING**************************************
    @Override
    public String toString() {
        return "Historial{" + "codigoHistorial=" + codigoHistorial + ", cedulaPacienteHistorial=" + cedulaPacienteHistorial + ", nombrePacienteHistorial=" + nombrePacienteHistorial + ", apellidoPacienteHistorial=" + apellidoPacienteHistorial + ", edadPacienteHistorial=" + edadPacienteHistorial + ", sexoPacienteHistorial=" + sexoPacienteHistorial + ", tipoSangrePacienteHistorial=" + tipoSangrePacienteHistorial + ", alergiaPacienteHistorial=" + alergiaPacienteHistorial + ", sintomasPacienteHistorial=" + sintomasPacienteHistorial + ", observacionesPacienteHistorial=" + observacionesPacienteHistorial + ", ditamenMedicoHistorial=" + ditamenMedicoHistorial + ", recetaMedicoHistorial=" + recetaMedicoHistorial + '}';
    }
    
}
