package com.hibernate.model;

import com.hibernate.model.persistencia.Marca;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModelMarca {
    static public Marca verMarca(int id){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Marca marca = (Marca) session.get(Marca.class, id);
            session.getTransaction().commit();
            
            return marca;
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
    
    static public void crearMarca(Marca marca){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            session.save(marca);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro de Marca Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void actualizarMarca(int id, String descripcion){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Marca marca = (Marca) session.get(Marca.class, id);
            marca.setDescripcion(descripcion);
            session.saveOrUpdate(marca);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Actualización de Marca Correcto");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
          session.flush();
          session.close();
        }
    }
    
    static public void eliminarMarca(int id){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Marca marca = (Marca) session.get(Marca.class, id);
            session.delete(marca);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Eliminación de Marca Correcto");
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
