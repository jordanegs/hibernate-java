package com.hibernate.model.persistencia;

public class Producto implements java.io.Serializable {
    private int id_producto;
    private int id_marca;
    private int id_presentacion;
    private int id_proveedor;
    private int id_zona;
    private int codigo;
    private String descripcion_producto;
    private double precio;
    private int stock;
    private int iva;
    private double peso;

    public Producto() {
    }

    public Producto(int id_producto, int id_marca, int id_presentacion, int id_proveedor, int id_zona, int codigo, String descripcion_producto, double precio, int stock, int iva, double peso) {
        this.id_producto = id_producto;
        this.id_marca = id_marca;
        this.id_presentacion = id_presentacion;
        this.id_proveedor = id_proveedor;
        this.id_zona = id_zona;
        this.codigo = codigo;
        this.descripcion_producto = descripcion_producto;
        this.precio = precio;
        this.stock = stock;
        this.iva = iva;
        this.peso = peso;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_presentacion() {
        return id_presentacion;
    }

    public void setId_presentacion(int id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
