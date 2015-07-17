/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.dao;
import com.citasmedicasv2.modelo.Horario;
import com.citasmedicasv2.orm.ORMBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.List;

/**
 *
 * @author Malex
 */
public class HorarioDAO extends ORMBase<Horario>{
    
    private ConexionDB conexionDB = new ConexionDB();
    
    public void insert(Horario horarios) {
//        super.insertSql = "INSERT INTO MME_PROVEEDOR (RUC, RAZON_SOCIAL, DIRECCION, TELEFONO, CONTACTO) VALUES (?, ?, ?, ?, ?)";
          //super.insert(new Object[]{proveedor.getRuc(), proveedor.getRazonSocial(), proveedor.getTelefono(), proveedor.getContacto()});
        super.insertSql = "INSERT INTO horario (HORACITA) VALUES (?)";
        super.insert(new Object[]{horarios.getHorarioCita()});
    }
    
    public void update(Horario horario) {
        try {
            //String sql = "update reo set NOMBREREO=?, APELLIDOREO=?, EDADREO=?, PELIGROSIDADREO=?, SENTENCIAREO=? where CEDULAREO="+reo.getCedula()+"";
            String sql = "update horario set HORACITA=? where IDHORARIO=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, horario.getHorarioCita());
            stmt.executeUpdate();
            System.out.println(stmt);
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void delete(Horario horario) {
        try{
            //String sql = "delete * from reo where CEDULAREO="+ reo.getCedula()+"";
            String sql = "delete from horario where IDHORARIO=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, horario.getIdHorario());
            
            stmt.executeUpdate();
            conexionDB.returnConnection(conn);            
        } catch (SQLException ex) {
            Logger.getLogger(MedicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }     

    }
    
    @Override
    public List<Horario> findAll() {
        super.findAllSql = "select * from HORARIO";
        return super.findAll();
    }

    @Override
    protected Horario crearObjeto(ResultSet rs) throws SQLException {
        Horario horarios = new Horario();
        horarios.setIdHorario(rs.getString("IDHORARIO"));
        horarios.setHorarioCita(rs.getString("HORACITA"));
        return horarios;
    }
    
}
