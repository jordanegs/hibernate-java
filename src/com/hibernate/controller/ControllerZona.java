package com.hibernate.controller;

import com.hibernate.model.ModelZona;
import com.hibernate.model.persistencia.Zona;
import java.util.List;

public class ControllerZona extends Controller {

    public ControllerZona() {
    }
    
    public List<Zona> verZonas(){
        List<Zona> zonas = ModelZona.verZonas();
        return zonas;
    }
    
    public Zona verZona(String descripcion){
        return ModelZona.verZona(descripcion);
    }
    
    public void crearZona(String d){
        Zona zona = new Zona();
        zona.setDescripcion(d);
        ModelZona.crearZona(zona);
    }
}
