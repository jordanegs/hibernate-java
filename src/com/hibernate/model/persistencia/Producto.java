package com.hibernate.model.persistencia;

public class Producto implements java.io.Serializable {
    private int id_producto;
    private Marca marca;
    private Presentacion presentacion;
    private Proveedor proveedor;
    private Zona zona;
    private int codigo;
    private String descripcion_producto;
    private double precio;
    private int stock;
    private int iva;
    private double peso;

    public Producto() {
    }

    public Producto(int id_producto, Marca marca, Presentacion presentacion, Proveedor proveedor, Zona zona, int codigo, String descripcion_producto, double precio, int stock, int iva, double peso) {
        this.id_producto = id_producto;
        this.marca = marca;
        this.presentacion = presentacion;
        this.proveedor = proveedor;
        this.zona = zona;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
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
