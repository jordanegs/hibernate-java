package com.hibernate.controller;

import com.hibernate.model.ModelProveedor;
import com.hibernate.model.persistencia.Proveedor;
import java.util.List;

public class ControllerProveedor extends Controller {

    public ControllerProveedor() {
    }
    
    public List<Proveedor> verProveedores(){
        List<Proveedor> proveedores = ModelProveedor.verProveedores();
        return proveedores;
    }
    
    public Proveedor verProveedor(String descripcion){
        return ModelProveedor.verProveedor(descripcion);
    }
    
    public void crearProveedor(String d){
        Proveedor proveedor = new Proveedor();
        proveedor.setDescripcion(d);
        ModelProveedor.crearProveedor(proveedor);
    }
}
