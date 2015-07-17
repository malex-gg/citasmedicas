/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.orm;

import com.citasmedicasv2.dao.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Malex
 */
public abstract class ORMBase <T>{
    
    protected String insertSql;
    protected String updateSql;
    protected String deleteSql;
    protected String findAllSql;
    protected String findByPkSql;
    protected String findSomeSql;
    protected String selectStatement;
    private ConexionDB conexionDB = new ConexionDB();
    
    public void insert(Object params[]) {
        try {
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(this.insertSql);
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            stmt.executeUpdate();
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(Object params[]) {
        try {
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(this.updateSql);
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            stmt.executeUpdate();
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(Object params[]) {
        try {
            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(this.deleteSql);
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            stmt.executeUpdate();
            conexionDB.returnConnection(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public T findByPK(Object params[]) {
        T object = null;
        Connection conn = conexionDB.getConnection();
        try {

            PreparedStatement stmt = conn.prepareStatement(this.findByPkSql);
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                object = this.crearObjeto(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexionDB.returnConnection(conn);
            return object;
        }
    }
    
    public List<T> findAll() {
        try {

            Connection conn = conexionDB.getConnection();
            PreparedStatement stmt = conn.prepareStatement(this.findAllSql);
            ResultSet rs = stmt.executeQuery();
            List<T> objects = new ArrayList();
            while (rs.next()) {
                objects.add(this.crearObjeto(rs));
            }
            conexionDB.returnConnection(conn);
            return objects;
        } catch (SQLException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    public List<T> findSome(Object params[]) {
        Connection conn = conexionDB.getConnection();
        try {

            PreparedStatement stmt = conn.prepareStatement(this.findSomeSql);
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }
            ResultSet rs = stmt.executeQuery();
            List<T> objects = new ArrayList();
            while (rs.next()) {
                objects.add(this.crearObjeto(rs));
            }
            conexionDB.returnConnection(conn);
            return objects;
        } catch (SQLException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String executeSelect() {
        Connection conn = conexionDB.getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(this.selectStatement);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    protected abstract T crearObjeto(ResultSet rs) throws SQLException;
    
}
