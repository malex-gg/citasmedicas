/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.dao;

import com.citasmedicasv2.modelo.Paciente;
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
public class PacienteDAO extends ORMBase<Paciente>{
    
    private ConexionDB conexionDB = new ConexionDB();
    
    public void insert(Paciente pacientes) {
//        super.insertSql = "INSERT INTO MME_PROVEEDOR (RUC, RAZON_SOCIAL, DIRECCION, TELEFONO, CONTACTO) VALUES (?, ?, ?, ?, ?)";
          //super.insert(new Object[]{proveedor.getRuc(), proveedor.getRazonSocial(), proveedor.getTelefono(), proveedor.getContacto()});
        super.insertSql = "INSERT INTO paciente (CEDULAPACIENTE, NOMBREPACIENTE, APELLIDOPACIENTE, EDADPACIENTE, SEXOPACIENTE, EMAILPACIENTE, CONTRASENIAPACIENTE) VALUES (?, ?, ?, ?, ?, ?, ?)";
        super.insert(new Object[]{pacientes.getCedulaPaciente(),pacientes.getNombrePaciente(),pacientes.getApellidoPaciente(),pacientes.getEdadPaciente(),pacientes.getSexoPaciente(),pacientes.getEmailPaciente(),pacientes.getContraseniaPaciente()});
    }
    
    public void update(Paciente paciente) {
        try {
            //String sql = "update reo set NOMBREREO=?, APELLIDOREO=?, EDADREO=?, PELIGROSIDADREO=?, SENTENCIAREO=? where CEDULAREO="+reo.getCedula()+"";
            String sql = "update paciente set NOMBREPACIENTE=?, APELLIDOPACIENTE=?, EDADPACIENTE=?, SEXOPACIENTE=?, EMAILPACIENTE=?, CONTRASENIAPACIENTE=? where CEDULAPACIENTE=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, paciente.getNombrePaciente());
            stmt.setString(2, paciente.getApellidoPaciente());
            stmt.setString(3, paciente.getEdadPaciente());
            stmt.setString(4, paciente.getSexoPaciente());
            stmt.setString(5, paciente.getEmailPaciente());
            stmt.setString(6, paciente.getContraseniaPaciente());
            stmt.setString(7, paciente.getCedulaPaciente());
            stmt.executeUpdate();
            System.out.println(stmt);
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void delete(Paciente paciente) {
        try{
            //String sql = "delete * from reo where CEDULAREO="+ reo.getCedula()+"";
            String sql = "delete from paciente where CEDULAPACIENTE=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, paciente.getCedulaPaciente());
            
            stmt.executeUpdate();
            conexionDB.returnConnection(conn);            
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     

    }
    
    public Paciente findByPK(String cedula) {
        super.findByPkSql = "select * from paciente where CEDULAPACIENTE=?";
        return super.findByPK(new Object[]{cedula});
    }
    
    @Override
    public List<Paciente> findAll() {
        super.findAllSql = "SELECT * FROM paciente";
        return super.findAll();
    }
    
    public List<Paciente> findByNombre(String patron) {
        super.findSomeSql= "select * from paciente where NOMBREPACIENTE=?";
        return super.findSome(new Object[]{patron});

    }
    
    @Override
    protected Paciente crearObjeto(ResultSet rs) throws SQLException {
        Paciente pacientes = new Paciente();
        pacientes.setCedulaPaciente(rs.getString("CEDULAPACIENTE"));
        pacientes.setNombrePaciente(rs.getString("NOMBREPACIENTE"));
        pacientes.setApellidoPaciente(rs.getString("APELLIDOPACIENTE"));
        pacientes.setEdadPaciente(rs.getString("EDADPACIENTE"));
        pacientes.setSexoPaciente(rs.getString("SEXOPACIENTE"));
        pacientes.setEmailPaciente(rs.getString("EMAILPACIENTE"));
        pacientes.setContraseniaPaciente(rs.getString("CONTRASENIAPACIENTE"));
        return pacientes;
    }
    
}
