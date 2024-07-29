/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author giool
 */
public class Controladorusuario {
    public boolean agregarUsuario( Usuario usuario)
    {
        try {
            //creamos la conexion
            Conexion con = new Conexion();
            Connection cn = con.obtenerConexion();
            
            //crear consulta sql
            String query = "INSERT INTO USUARIO (nombre_usuario,contraseña) VALUES(?,?)";
            
            PreparedStatement ps= cn.prepareStatement(query);
            //modificar values
          
            ps.setString(1, usuario.getNombre_usuario());
            ps.setString(2, usuario.getContraseña());
           
            
            
            
           
            
            //ejecutar
            ps.executeUpdate();
            //cerrar ps
            ps.close();
            //cerrar conexion
            cn.close();
            
            return true;
            
        } catch (SQLException e) {
            //mensaje por error
            System.out.println("error bd"+e.getMessage());
            return false;
        }
        
        
    }
    
    public Usuario buscarUsuario(String nombre_usuario,String contraseña)
    {
        Usuario usuario = new Usuario();
    
     try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
               
            String query = "SELECT * FROM usuario WHERE nombre_usuario = ? and contraseña= ?";
            PreparedStatement ps = cnt.prepareStatement(query);
            ps.setString(1, nombre_usuario);
            ps.setString(2, contraseña);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
               
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombre_usuario(rs.getString("nombre_usuario"));
                usuario.setContraseña(rs.getString("contraseña"));
            }
              
            rs.close();
            ps.close();
            cnt.close();
               
        } catch (SQLException e) {
            
               System.out.println("Error BD: "+ e.getMessage());
        }
        
        return usuario;
    }
    
    
}
