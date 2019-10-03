package com.hibernate.model.persistencia;

public class Presentacion implements java.io.Serializable {
    private int id_presentacion;
    private String descripcion;

    public Presentacion() {
    }

    public Presentacion(int id_presentacion, String descripcion) {
        this.id_presentacion = id_presentacion;
        this.descripcion = descripcion;
    }

    public int getId_presentacion() {
        return id_presentacion;
    }

    public void setId_presentacion(int id_presentacion) {
        this.id_presentacion = id_presentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
