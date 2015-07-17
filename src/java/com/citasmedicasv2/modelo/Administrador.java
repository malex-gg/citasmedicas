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
public class Administrador {
    
    private String cedula;
    private String contrasenia;

    public String getCedula() {
        return cedula;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.cedula);
        hash = 41 * hash + Objects.hashCode(this.contrasenia);
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
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.contrasenia, other.contrasenia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrador{" + "cedula=" + cedula + ", contrasenia=" + contrasenia + '}';
    }
    
    
}
