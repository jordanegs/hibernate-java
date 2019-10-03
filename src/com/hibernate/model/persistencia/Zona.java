package com.hibernate.model.persistencia;

public class Zona implements java.io.Serializable {
    private int id_zona;
    private String descripcion;

    public Zona() {
    }

    public Zona(int id_zona, String descripcion) {
        this.id_zona = id_zona;
        this.descripcion = descripcion;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
