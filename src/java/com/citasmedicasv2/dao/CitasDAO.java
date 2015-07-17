/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.dao;

import com.citasmedicasv2.modelo.Citas;
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
public class CitasDAO extends ORMBase<Citas> {

    private ConexionDB conexionDB = new ConexionDB();

    public int insert(Citas citas) {
        int total = 0;
        try {
            //String sql = "select count(*) as total from citas where FECHACITA='" + citas.getFechaCita() + "' and IDHORARIO='" + citas.getHorarioCita() + "' and CEDULAMEDICO='" + citas.getMedicoCita() + "'";4String sql = "select count(*) as total from citas where FECHACITA='" + citas.getFechaCita() + "' and IDHORARIO='" + citas.getHorarioCita() + "' and CEDULAMEDICO='" + citas.getMedicoCita() + "'";
            String sql = "select count(*) as total from citas where FECHACITA='" + citas.getFechaCita() + "' and IDHORARIO='" + citas.getIdHorarioCita() + "' and CEDULAMEDICO='" + citas.getCedulaMedico()+ "'";
            Connection conn = conexionDB.getConnection();
            ResultSet rs = conn.prepareStatement(sql).executeQuery();
            
            if(rs.next()){
                total = Integer.parseInt(rs.getString("total"));
                System.out.println(total);
            }
            
            if (total == 0){
                super.insertSql = "INSERT INTO citas (CEDULAPACIENTE, CEDULAMEDICO, IDHORARIO, NOMBREPACIENTECITA, APELLIDOPACIENTECITA, EDADPACIENTECITA, SEXOPACIENTECITA, FECHACITA, MEDICOCITA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                super.insert(new Object[]{citas.getCedulaPaciente(), citas.getCedulaMedico(),citas.getIdHorarioCita(), citas.getNombrePacienteCita(), citas.getApellidoPacienteCita(), citas.getEdadPacienteCita(), citas.getSexoPacienteCita(), citas.getFechaCita(), citas.getMedicoCita()});
                return 1;
            } else {
                return 0;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    public void update(Citas citas) {
        try {
            //String sql = "update reo set NOMBREREO=?, APELLIDOREO=?, EDADREO=?, PELIGROSIDADREO=?, SENTENCIAREO=? where CEDULAREO="+reo.getCedula()+"";
            String sql = "update citas set CEDULAMEDICO=?, NOMBREPACIENTECITA=?, APELLIDOPACIENTECITA=?, EDADPACIENTECITA=?, SEXOPACIENTECITA=?, FECHACITA=?, MEDICOCITA=?  where CEDULAPACIENTE=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, citas.getCedulaMedico());
            stmt.setString(2, citas.getNombrePacienteCita());
            stmt.setString(3, citas.getApellidoPacienteCita());
            stmt.setString(4, citas.getEdadPacienteCita());
            stmt.setString(5, citas.getSexoPacienteCita());
            stmt.setString(6, citas.getFechaCita());
            stmt.setString(7, citas.getMedicoCita());
//            stmt.setString(6, cliente.getRuc());
            stmt.executeUpdate();
            System.out.println(stmt);
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void delete(Citas citas) {
        try {
            //String sql = "delete * from reo where CEDULAREO="+ reo.getCedula()+"";
            String sql = "delete from citas where CEDULAPACIENTE=?";
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, citas.getCedulaPaciente());

            stmt.executeUpdate();
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(CitasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Citas findByPK(String cedula) {
        super.findByPkSql = "select * from citas where CEDULAPACIENTE=?";
        return super.findByPK(new Object[]{cedula});
    }

    @Override
    public List<Citas> findAll() {
        super.findAllSql = "SELECT * FROM citas";
        return super.findAll();
    }

    public List<Citas> findByNombre(String patron) {
        super.findSomeSql = "select * from citas where NOMBREPACIENTECITA=?";
        return super.findSome(new Object[]{patron});
    }

    public List<Citas> findByFecha(String patron) {
        super.findSomeSql = "select * from citas where FECHACITA=?";
        return super.findSome(new Object[]{patron});
    }

    public List<Citas> findByFechaMedico(String patron) {
        super.findSomeSql = "select * from citas where FECHACITA=? and MEDICOCITA=?";
        return super.findSome(new Object[]{patron});
    }

    @Override
    protected Citas crearObjeto(ResultSet rs) throws SQLException {
        Citas citas = new Citas();
        citas.setCedulaPaciente(rs.getString("CEDULAPACIENTE"));
        citas.setCedulaMedico(rs.getString("CEDULAMEDICO"));
        citas.setIdHorarioCita(rs.getString("IDHORARIO"));
        citas.setNombrePacienteCita(rs.getString("NOMBREPACIENTECITA"));
        citas.setApellidoPacienteCita(rs.getString("APELLIDOPACIENTECITA"));
        citas.setEdadPacienteCita(rs.getString("EDADPACIENTECITA"));
        citas.setSexoPacienteCita(rs.getString("SEXOPACIENTECITA"));
        citas.setFechaCita(rs.getString("FECHACITA"));
        //citas.setHorarioCita(rs.getString("HORARIOCITA"));
        citas.setMedicoCita(rs.getString("MEDICOCITA"));
        return citas;
    }

}
