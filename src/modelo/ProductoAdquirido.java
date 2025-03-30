/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author oscar
 */
public class ProductoAdquirido {
    private String codCompra;
    private String codigoProducto;
    private double cantidad;

    public ProductoAdquirido() {
    }

    public ProductoAdquirido(String codCompra, String codigoProducto, double cantidad) {
        this.codCompra = codCompra;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }
    
    
    
    public String getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(String codCompra) {
        this.codCompra = codCompra;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    

    

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
