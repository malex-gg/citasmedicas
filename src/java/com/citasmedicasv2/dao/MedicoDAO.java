/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.dao;

import com.citasmedicasv2.modelo.Medico;
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
public class MedicoDAO extends ORMBase<Medico> {
    
    private ConexionDB conexionDB = new ConexionDB();
    
    public void insert(Medico medicos) {
//        super.insertSql = "INSERT INTO MME_PROVEEDOR (RUC, RAZON_SOCIAL, DIRECCION, TELEFONO, CONTACTO) VALUES (?, ?, ?, ?, ?)";
          //super.insert(new Object[]{proveedor.getRuc(), proveedor.getRazonSocial(), proveedor.getTelefono(), proveedor.getContacto()});
        super.insertSql = "INSERT INTO medico (CEDULAMEDICO, NOMBREMEDICO, APELLIDOMEDICO, EDADMEDICO, ESPECIALIDADMEDICO, TELEFONOMEDICO, EMAILMEDICO, CONTRASENIAMEDICO) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        super.insert(new Object[]{medicos.getCedulaMedico(),medicos.getNombreMedico(),medicos.getApellidoMedico(),medicos.getEdadMedico(),medicos.getEspecialidadMedico(),medicos.getTelefonoMedico(),medicos.getEmailMedico(), medicos.getContraseniaMedico()});
    }
    
    public void update(Medico medico) {
        try {
            //String sql = "update reo set NOMBREREO=?, APELLIDOREO=?, EDADREO=?, PELIGROSIDADREO=?, SENTENCIAREO=? where CEDULAREO="+reo.getCedula()+"";
            String sql = "update medico set NOMBREMEDICO=?, APELLIDOMEDICO=?, EDADMEDICO=?, ESPECIALIDADMEDICO=?, TELEFONOMEDICO=?, EMAILMEDICO=?, CONTRASENIAMEDICO=? where CEDULAMEDICO=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, medico.getNombreMedico());
            stmt.setString(2, medico.getApellidoMedico());
            stmt.setString(3, medico.getEdadMedico());
            stmt.setString(4, medico.getEspecialidadMedico());
            stmt.setString(5, medico.getTelefonoMedico());
            stmt.setString(6, medico.getEmailMedico());
            stmt.setString(7, medico.getContraseniaMedico());
            stmt.executeUpdate();
            System.out.println(stmt);
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void delete(Medico medico) {
        try{
            //String sql = "delete * from reo where CEDULAREO="+ reo.getCedula()+"";
            String sql = "delete from medico where CEDULAMEDICO=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, medico.getCedulaMedico());
            
            stmt.executeUpdate();
            conexionDB.returnConnection(conn);            
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     

    }
    
    
    public Medico findByPK(String cedula) {
        super.findByPkSql = "select * from medico where CEDULAMEDICO=?";
        return super.findByPK(new Object[]{cedula});
    }
    
    @Override
    public List<Medico> findAll() {
        super.findAllSql = "SELECT * FROM medico";
        return super.findAll();
    }
    
    public List<Medico> findByNombre(String patron) {
        super.findSomeSql= "select * from medico where NOMBREMEDICO=?";
        return super.findSome(new Object[]{patron});

    }
    
    @Override
    protected Medico crearObjeto(ResultSet rs) throws SQLException {
        Medico medicos = new Medico();
        medicos.setCedulaMedico(rs.getString("CEDULAMEDICO"));
        medicos.setNombreMedico(rs.getString("NOMBREMEDICO"));
        medicos.setApellidoMedico(rs.getString("APELLIDOMEDICO"));
        medicos.setEdadMedico(rs.getString("EDADMEDICO"));
        medicos.setEspecialidadMedico(rs.getString("ESPECIALIDADMEDICO"));
        medicos.setTelefonoMedico(rs.getString("TELEFONOMEDICO"));
        medicos.setEmailMedico(rs.getString("EMAILMEDICO"));
        medicos.setContraseniaMedico(rs.getString("CONTRASENIAMEDICO"));
        return medicos;
    }
    
}
