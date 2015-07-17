/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.dao;

import com.citasmedicasv2.modelo.Historial;
import com.citasmedicasv2.orm.ORMBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Malex
 */
public class HistorialDAO extends ORMBase<Historial>{
    
    private ConexionDB conexionDB = new ConexionDB();
    
    public void insert(Historial historial) {
//        super.insertSql = "INSERT INTO MME_PROVEEDOR (RUC, RAZON_SOCIAL, DIRECCION, TELEFONO, CONTACTO) VALUES (?, ?, ?, ?, ?)";
          //super.insert(new Object[]{proveedor.getRuc(), proveedor.getRazonSocial(), proveedor.getTelefono(), proveedor.getContacto()});
        //super.insertSql = "INSERT INTO historial (CEDULAPACIENTE, NOMBREPACIENTEHISTORIAL, APELLIDOPACIENTEHISTORIAL, EDADPACIENTEHISTORIAL, SEXOPACIENTEHISTORIAL, TIPOSANGREPACIENTEHISTORIAL, ALERGIAPACIENTEHISTORIAL, SINTOMASPACIENTEHISTORIAL, OBSERVACIONESPACIENTEHISTORIAL, DICTAMENMEDICOHISTORIAL, RECETAMEDICOHISTORIAL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        super.insertSql = "INSERT INTO historial (CEDULAPACIENTE, NOMBREPACIENTEHISTORIAL, APELLIDOPACIENTEHISTORIAL, EDADPACIENTEHISTORIAL, SEXOPACIENTEHISTORIAL, ALERGIAPACIENTEHISTORIAL, SINTOMASPACIENTEHISTORIAL, OBSERVACIONESPACIENTEHISTORIAL, DICTAMENMEDICOHISTORIAL, RECETAMEDICOHISTORIAL) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //super.insert(new Object[]{historial.getCedulaPacienteHistorial(),historial.getNombrePacienteHistorial(),historial.getApellidoPacienteHistorial(),historial.getEdadPacienteHistorial(),historial.getSexoPacienteHistorial(),historial.getTipoSangrePacienteHistorial(),historial.getAlergiaPacienteHistorial(),historial.getSintomasPacienteHistorial(),historial.getObservacionesPacienteHistorial(),historial.getDitamenMedicoHistorial(),historial.getRecetaMedicoHistorial()});
        super.insert(new Object[]{historial.getCedulaPacienteHistorial(),historial.getNombrePacienteHistorial(),historial.getApellidoPacienteHistorial(),historial.getEdadPacienteHistorial(),historial.getSexoPacienteHistorial(),historial.getAlergiaPacienteHistorial(),historial.getSintomasPacienteHistorial(),historial.getObservacionesPacienteHistorial(),historial.getDitamenMedicoHistorial(),historial.getRecetaMedicoHistorial()});
    }
    
    public void update(Historial historial) {
        try {
            //String sql = "update reo set NOMBREREO=?, APELLIDOREO=?, EDADREO=?, PELIGROSIDADREO=?, SENTENCIAREO=? where CEDULAREO="+reo.getCedula()+"";
            String sql = "update historial set NOMBREPACIENTEHISTORIAL=?, APELLIDOPACIENTEHISTORIAL=?, EDADPACIENTEHISTORIAL=?, SEXOPACIENTEHISTORIAL=?, TIPOSANGREPACIENTEHISTORIAL=?, ALERGIAPACIENTEHISTORIAL=?, SINTOMASPACIENTEHISTORIAL=?, OBSERVACIONESPACIENTEHISTORIAL=?, DICTAMENMEDICOHISTORIAL=?, RECETAMEDICOHISTORIAL=?  where CEDULAPACIENTE=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, historial.getNombrePacienteHistorial());
            stmt.setString(2, historial.getApellidoPacienteHistorial());
            stmt.setString(3, historial.getEdadPacienteHistorial());
            stmt.setString(4, historial.getSexoPacienteHistorial());
            stmt.setString(5, historial.getTipoSangrePacienteHistorial());
            stmt.setString(6, historial.getAlergiaPacienteHistorial());
            stmt.setString(7, historial.getSintomasPacienteHistorial());
            stmt.setString(8, historial.getObservacionesPacienteHistorial());
            stmt.setString(9, historial.getDitamenMedicoHistorial());
            stmt.setString(10, historial.getRecetaMedicoHistorial());
//            stmt.setString(6, cliente.getRuc());
            stmt.executeUpdate();
            System.out.println(stmt);
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(HistorialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void delete(Historial historial) {
        try{
            //String sql = "delete * from reo where CEDULAREO="+ reo.getCedula()+"";
            String sql = "delete from historial where CEDULAPACIENTE=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, historial.getCedulaPacienteHistorial());
            
            stmt.executeUpdate();
            conexionDB.returnConnection(conn);            
        } catch (SQLException ex) {
            Logger.getLogger(HistorialDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     

    }
    
    public Historial findByPK(String cedula) {
        super.findByPkSql = "select * from historial where CEDULAPACIENTE=?";
        return super.findByPK(new Object[]{cedula});
    }
    
    @Override
    public List<Historial> findAll() {
        super.findAllSql = "SELECT * FROM historial";
        return super.findAll();
    }
    
    public List<Historial> findByNombre(String patron) {
        super.findSomeSql= "select * from historial where NOMBREPACIENTEHISTORIAL=?";
        return super.findSome(new Object[]{patron});

    }
    
    @Override
    protected Historial crearObjeto(ResultSet rs) throws SQLException {
        Historial historial = new Historial();
        historial.setCedulaPacienteHistorial(rs.getString("CEDULAPACIENTE"));
        historial.setNombrePacienteHistorial(rs.getString("NOMBREPACIENTEHISTORIAL"));
        historial.setApellidoPacienteHistorial(rs.getString("APELLIDOPACIENTEHISTORIAL"));
        historial.setEdadPacienteHistorial(rs.getString("EDADPACIENTEHISTORIAL"));
        historial.setSexoPacienteHistorial(rs.getString("SEXOPACIENTEHISTORIAL"));
        historial.setTipoSangrePacienteHistorial(rs.getString("TIPOSANGREPACIENTEHISTORIAL"));
        historial.setAlergiaPacienteHistorial(rs.getString("ALERGIAPACIENTEHISTORIAL"));
        historial.setSintomasPacienteHistorial(rs.getString("SINTOMASPACIENTEHISTORIAL"));
        historial.setObservacionesPacienteHistorial(rs.getString("OBSERVACIONESPACIENTEHISTORIAL"));
        historial.setDitamenMedicoHistorial(rs.getString("DICTAMENMEDICOHISTORIAL"));
        historial.setRecetaMedicoHistorial(rs.getString("RECETAMEDICOHISTORIAL"));
        return historial;
    }
    
}
