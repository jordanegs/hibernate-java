package com.hibernate.controller;

import com.hibernate.model.ModelMarca;
import com.hibernate.model.persistencia.Marca;
import java.util.List;

public class ControllerMarca extends Controller{

    public ControllerMarca() {
    }
    
    public List<Marca> verMarcas(){
        return ModelMarca.verMarcas();
    }
    
    public Marca verMarca(String descripcion){
        return ModelMarca.verMarca(descripcion);
    }
    
    public void crearMarca(String d){
        Marca marca = new Marca();
        marca.setDescripcion(d);
        ModelMarca.crearMarca(marca);
    }
}
