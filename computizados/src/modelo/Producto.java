/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author giool
 */
public class Producto {
      private int codigo,precio,stock_minimo,stock_actual;
   private String objeto_teconologico,descripcion;
   
   //constructor sin parametros.

    public Producto() {
    }
   
    //constructor con parametros.

    public Producto(int codigo, int precio, int stock_minimo, int stock_actual, String objeto_teconologico, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.stock_minimo = stock_minimo;
        this.stock_actual = stock_actual;
        this.objeto_teconologico = objeto_teconologico;
        this.descripcion = descripcion;
    }
    
    
    //getter y setter.

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public int getStock_actual() {
        return stock_actual;
    }

    public void setStock_actual(int stock_actual) {
        this.stock_actual = stock_actual;
    }

    public String getObjeto_teconologico() {
        return objeto_teconologico;
    }

    public void setObjeto_teconologico(String objeto_teconologico) {
        this.objeto_teconologico = objeto_teconologico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //metodo override

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", precio=" + precio + ", stock_minimo=" + stock_minimo + ", stock_actual=" + stock_actual + ", objeto_teconologico=" + objeto_teconologico + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
}
