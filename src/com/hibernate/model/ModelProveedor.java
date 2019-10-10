package com.hibernate.model;

import com.hibernate.model.persistencia.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModelProveedor {
    static public List<Proveedor> verProveedores(){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            List<Proveedor> proveedores = session.createQuery("FROM Proveedor").list();
            session.getTransaction().commit();
            
            return proveedores;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
        return null;
    }
    
    static public Proveedor verProveedor(String descripcion){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Query query = session.createQuery("FROM Proveedor where descripcion = :descripcion");
            query.setParameter("descripcion", descripcion);
            List<?> list = query.list();
            Proveedor proveedor = (Proveedor)list.get(0);
            session.getTransaction().commit();
            
            return proveedor;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
        return null;
    }
    
    static public void crearProveedor(Proveedor proveedor){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            session.save(proveedor);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro de Proveedor Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void actualizarProveedor(int id, String descripcion){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Proveedor proveedor = (Proveedor) session.get(Proveedor.class, id);
            proveedor.setDescripcion(descripcion);
            session.saveOrUpdate(proveedor);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Actualización de Proveedor Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void eliminarProveedor(int id){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Proveedor proveedor = (Proveedor) session.get(Proveedor.class, id);
            session.delete(proveedor);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Eliminación de Proveedor Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
}
