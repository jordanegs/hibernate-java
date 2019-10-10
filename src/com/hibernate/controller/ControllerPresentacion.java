package com.hibernate.controller;

import com.hibernate.model.ModelPresentacion;
import com.hibernate.model.persistencia.Presentacion;
import java.util.List;

public class ControllerPresentacion extends Controller {

    public ControllerPresentacion() {
    }
    
    public List<Presentacion> verPresentaciones(){
        List<Presentacion> presentaciones = ModelPresentacion.verPresentaciones();
        return presentaciones;
    }
    
    public Presentacion verPresentacion(String descripcion){
        return ModelPresentacion.verPresentacion(descripcion);
    }
    
    public void crearPresentacion(String d){
        Presentacion presentacion = new Presentacion();
        presentacion.setDescripcion(d);
        ModelPresentacion.crearPresentacion(presentacion);
    }
}
