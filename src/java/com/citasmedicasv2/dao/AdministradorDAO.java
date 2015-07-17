/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citasmedicasv2.dao;

import com.citasmedicasv2.modelo.Administrador;
import com.citasmedicasv2.orm.ORMBase;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Malex
 */
public class AdministradorDAO extends ORMBase<Administrador>{
    private ConexionDB conexionDB = new ConexionDB();
    
    public void insert(Administrador admin) {
        
//        super.insertSql = "INSERT INTO MME_PROVEEDOR (RUC, RAZON_SOCIAL, DIRECCION, TELEFONO, CONTACTO) VALUES (?, ?, ?, ?, ?)";
        //super.insert(new Object[]{proveedor.getRuc(), proveedor.getRazonSocial(), proveedor.getTelefono(), proveedor.getContacto()});
        super.insertSql = "INSERT INTO administrador (CEDULAADMIN, CONTRASENIAADMIN) VALUES (?, ?)";
        super.insert(new Object[]{admin.getCedula(), admin.getContrasenia()});
        System.out.println(admin.getCedula());
    }
    
    public Administrador findByPK(String cedula) {
        super.findByPkSql = "select * from administrador where CEDULAADMIN=?";
        return super.findByPK(new Object[]{cedula});
    }
    
    
    
    @Override
    protected Administrador crearObjeto(ResultSet rs) throws SQLException {
        
        Administrador admin = new Administrador();
        admin.setCedula(rs.getString("CEDULAADMIN"));
        admin.setContrasenia(rs.getString("CONTRASENIAADMIN"));        
        return admin;        
    }
    
}
