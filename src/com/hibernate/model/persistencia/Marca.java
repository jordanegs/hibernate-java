package com.hibernate.model.persistencia;

public class Marca implements java.io.Serializable {
    private int id_marca;
    private String descripcion;

    public Marca() {
    }

    public Marca(int id_marca, String descripcion) {
        this.id_marca = id_marca;
        this.descripcion = descripcion;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
