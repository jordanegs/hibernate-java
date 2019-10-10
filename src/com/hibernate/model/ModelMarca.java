package com.hibernate.model;

import com.hibernate.model.persistencia.Marca;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModelMarca {
    static public List<Marca> verMarcas(){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            List<Marca> marcas = session.createQuery("FROM Marca").list();
            session.getTransaction().commit();
            
            return marcas;
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
    
    static public Marca verMarca(String descripcion){
        Session session = null;
        try{
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session =sessionFactory.openSession();
            session.beginTransaction();
            Query query = session.createQuery("FROM Marca where descripcion = :descripcion");
            query.setParameter("descripcion", descripcion);
            List<?> list = query.list();
            Marca marca = (Marca)list.get(0);
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
