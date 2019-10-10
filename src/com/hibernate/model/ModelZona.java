package com.hibernate.model;

import com.hibernate.model.persistencia.Zona;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModelZona {
    static public List<Zona> verZonas(){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            List<Zona> zonas = session.createQuery("FROM Zona").list();
            session.getTransaction().commit();
            
            return zonas;
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
    
    static public Zona verZona(int id){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Zona zona = (Zona) session.get(Zona.class, id);
            session.getTransaction().commit();
            
            return zona;
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
    
    static public void crearZona(Zona zona){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            session.save(zona);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro de Zona Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void actualizarZona(int id, String descripcion){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Zona zona = (Zona) session.get(Zona.class, id);
            zona.setDescripcion(descripcion);
            session.saveOrUpdate(zona);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Actualización de Zona Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void eliminarZona(int id){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Zona zona = (Zona) session.get(Zona.class, id);
            session.delete(zona);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Eliminación de Zona Correcto");
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
