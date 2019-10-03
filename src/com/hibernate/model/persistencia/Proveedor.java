package com.hibernate.model.persistencia;

public class Proveedor implements java.io.Serializable {
    private int id_proveedor;
    private String descripcion;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String descripcion) {
        this.id_proveedor = id_proveedor;
        this.descripcion = descripcion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
