/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.*;
import java.util.ArrayList;
import modelo.Producto;
import static modelo.Idescuento.desCelular;
import static modelo.Idescuento.desComputador;
import static modelo.Idescuento.desConsola;
import modelo.Usuario;


/**
 *
 * @author giool
 */
public class Controladorproductos {
     public boolean agregarProducto( Producto producto)
    {
        try {
            //creamos la conexion
            Conexion con = new Conexion();
            Connection cn = con.obtenerConexion();
            
            //crear consulta sql
            String query = "INSERT INTO producto (descripcion,precio,stock_minimo,stock_actual,objeto_tecnologico) VALUES(?,?,?,?,?)";
            
            PreparedStatement ps= cn.prepareStatement(query);
            //modificar values
            ps.setString(1, producto.getDescripcion());
            ps.setInt(2, producto.getPrecio());
            ps.setInt(3, producto.getStock_minimo());
            ps.setInt(4, producto.getStock_actual());
            ps.setString(5, producto.getObjeto_teconologico());
            
            
           
            
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
    
    public boolean modificarProducto(Producto producto)
    {
    
        try {
            
            //creamos la conexion
            Conexion con = new Conexion();
            Connection cn = con.obtenerConexion();
            
            //Crear consulta SQL
            String query = "UPDATE producto SET descripcion=?, precio=?, stock_minimo=?, stock_actual=?, objeto_tecnologico=? WHERE codigo=?";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setString(1, producto.getDescripcion());
            ps.setInt(2, producto.getPrecio());
            ps.setInt(3, producto.getStock_minimo());
            ps.setInt(4, producto.getStock_actual());
            ps.setString(5, producto.getObjeto_teconologico());
            ps.setInt(6, producto.getCodigo());
            
            ps.executeUpdate();
            ps.close();
            cn.close();
            
            return true;
       
         
            
        } catch (SQLException e) {
            
            System.out.println("Error BD: "+ e.getMessage());
            return false;
        }
    
    }
    
   public boolean eliminar(int codigo)
    {
     try {
            //creamos la conexion
            Conexion con = new Conexion();
            Connection cn = con.obtenerConexion();
            //Crear consulta SQL
            String query = "DELETE FROM producto WHERE codigo = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            
            ps.setInt(1, codigo);
            
            ps.executeUpdate();
            ps.close();
            cn.close();
            
            return true;
            
        } catch (SQLException e) {       
            System.out.println("Error BD: "+ e.getMessage());
            return false;
        }
    
    }
   
     
     public ArrayList<Producto> traerProducto()
    {
        ArrayList<Producto> listaProducto = new ArrayList<>();
        
           try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
               
            String query = "SELECT codigo, descripcion, precio, stock_minimo, stock_actual, objeto_tecnologico   FROM producto";
            PreparedStatement ps = cnt.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock_minimo(rs.getInt("stock_minimo"));
                producto.setStock_actual(rs.getInt("stock_actual"));
                producto.setObjeto_teconologico(rs.getString("objeto_tecnologico"));
                
                
                listaProducto.add(producto);
                
            }
              
            rs.close();
            ps.close();
            cnt.close();
               
        } catch (SQLException e) {
            
               System.out.println("Error BD: "+ e.getMessage());
        }
  
        return listaProducto;
    
    }
     public ArrayList<Producto> filtrarPorStock()
    {
        ArrayList<Producto> listaProducto = new ArrayList<>();
        
           try {
            Conexion con = new Conexion();
            Connection cnt = con.obtenerConexion();
               
            String query = "SELECT codigo, descripcion, precio, stock_minimo, stock_actual, objeto_tecnologico   FROM producto";
            PreparedStatement ps = cnt.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecio(rs.getInt("precio"));
                producto.setStock_minimo(rs.getInt("stock_minimo"));
                producto.setStock_actual(rs.getInt("stock_actual"));
                producto.setObjeto_teconologico(rs.getString("objeto_tecnologico"));
                
                if(producto.getStock_actual()<=producto.getStock_minimo()){
                    listaProducto.add(producto);
                }
                
                
            }
              
            rs.close();
            ps.close();
            cnt.close();
               
        } catch (SQLException e) {
            
               System.out.println("Error BD: "+ e.getMessage());
        }
  
        return listaProducto;
    
    }
     
     public int obtener_stock_actual(int codigo){
        int stock_registrado = 0;
         try {
            Conexion con = new Conexion();
            try (Connection cnt = con.obtenerConexion()) {
                String query = "SELECT stock_actual FROM producto WHERE codigo=?";
                try (PreparedStatement ps = cnt.prepareStatement(query)) {
                    ps.setInt(1, codigo);
                    
                    try (ResultSet rs = ps.executeQuery()) {
                           if(rs.next()){

                             stock_registrado = rs.getInt(1);

        }
                    }
                }
            }
           return stock_registrado; 
        } catch (SQLException e) {
            
               System.out.println("Error BD: "+ e.getMessage()+"EN EL obtener_stock_actual");
               return stock_registrado; 
        }
         
        
  
        
       
    }
     
     
     
    
    public double  calcular_venta(int codigo,int cantidad){
       int total=0;
         
            Conexion con = new Conexion();
            try (Connection cnt = con.obtenerConexion()) {
                String query = "SELECT precio FROM producto WHERE codigo=?";
                try (PreparedStatement ps = cnt.prepareStatement(query)) {
                    ps.setInt(1,codigo);
                    try (ResultSet rs = ps.executeQuery()) {
                        if(rs.next()){

                             total = rs.getInt(1);
                    }
                }
            }
           if(codigo==1){
               System.out.println("");
                    double totald = total*desCelular;
                    totald=total-totald;
               return totald*cantidad;
           }
           if(codigo==2){
               System.out.println("");
               double totald = total*desComputador;
               totald=total-totald;
               return totald*cantidad;
           }
           if(codigo==3){
               System.out.println("");
               double totald = total*desConsola;
               totald=total-totald;
               return totald*cantidad;
           }
           return total*cantidad;
           
           
        } catch (SQLException e) {
            
               System.out.println("Error BD: "+ e.getMessage()+"EN EL METODOcalcular_venta");
        }
        
        
  
        
        
        return total;
    }
  
    
     public void vender_producto(int codigo,int cantidad){
          try {
            
            //creamos la conexion
            Conexion con = new Conexion();
            Connection cn = con.obtenerConexion();
            
            //Crear consulta SQL
            String query = "UPDATE producto SET stock_actual=? WHERE codigo=?";
            PreparedStatement ps = cn.prepareStatement(query);
            
            int nuevo_stock = obtener_stock_actual(codigo)-cantidad;
            
            ps.setInt(1, nuevo_stock);
            ps.setInt(2, codigo);
            
            
            ps.executeUpdate();
            ps.close();
            cn.close();
            
            
       
         
            
        } catch (SQLException e) {
            
            System.out.println("Error BD: "+ e.getMessage()+"EN EL vender_producto");
            
        }
        
        
        
    }
     
     
}
    
   

