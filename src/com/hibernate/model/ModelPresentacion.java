package com.hibernate.model;

import com.hibernate.model.persistencia.Presentacion;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModelPresentacion {
    static public List<Presentacion> verPresentaciones(){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            List<Presentacion> presentaciones = session.createQuery("FROM Presentacion").list();
            session.getTransaction().commit();
            
            return presentaciones;
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
    
    static public Presentacion verPresentacion(int id){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Presentacion presentacion = (Presentacion) session.get(Presentacion.class, id);
            session.getTransaction().commit();
            
            return presentacion;
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
    
    static public void crearPresentacion(Presentacion presentacion){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            session.save(presentacion);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro de Presentacion Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void actualizarPresentacion(int id, String descripcion){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Presentacion presentacion = (Presentacion) session.get(Presentacion.class, id);
            presentacion.setDescripcion(descripcion);
            session.saveOrUpdate(presentacion);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Actualización de Presentacion Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void eliminarPresentacion(int id){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Presentacion presentacion = (Presentacion) session.get(Presentacion.class, id);
            session.delete(presentacion);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Eliminación de Presentacion Correcto");
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
