package com.hibernate.controller;

import com.hibernate.model.ModelProducto;
import com.hibernate.model.persistencia.Producto;
import java.util.List;

public class ControllerProducto extends Controller{

    public ControllerProducto() {
    }
    
    public List<Producto> verProductos(){
        List<Producto> productos = ModelProducto.verProductos();
        return productos;
    }
    
    public void crearProducto(Producto producto){
        ModelProducto.crearProducto(producto);
    }
    
    public void actualizarProducto(Producto producto){
        ModelProducto.actualizarProducto(producto);
    }
    
    public void eliminarProducto(int id){
        ModelProducto.eliminarProducto(id);
    }
}
