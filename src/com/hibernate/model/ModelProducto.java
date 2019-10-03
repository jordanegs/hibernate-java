package com.hibernate.model;

import com.hibernate.model.persistencia.Producto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModelProducto {
    static public void verProducto(){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            
            Producto producto = (Producto) session.get(Producto.class, 1);
            System.out.println(producto.getCodigo());
            System.out.println(producto.getDescripcion_producto());
            System.out.println(producto.getMarca().getDescripcion());
            System.out.println(producto.getPresentacion().getDescripcion());
            System.out.println(producto.getProveedor().getDescripcion());
            System.out.println(producto.getZona().getDescripcion());
            session.getTransaction().commit();
            System.out.println("Correcto!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
}
