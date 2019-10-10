package com.hibernate.model;

import com.hibernate.model.persistencia.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModelProducto {

    static public List<Producto> verProductos() {
        Session session = null;
        try {
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            List<Producto> productos = session.createQuery("FROM Producto").list();
            session.getTransaction().commit();

            return productos;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }

    static public Producto verProducto(int id) {
        Session session = null;
        try {
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            Producto producto = (Producto) session.get(Producto.class, id);
            session.getTransaction().commit();

            return producto;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }

    static public void crearProducto(Producto producto) {
        Session session = null;
        try {
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(producto);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Registro de Producto Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }

    static public void actualizarProducto(Producto producto) {
        Session session = null;
        try {
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.saveOrUpdate(producto);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Actualización de Producto Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }

    static public void eliminarProducto(int id) {
        Session session = null;
        try {
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            Producto producto = (Producto) session.get(Producto.class, id);
            session.delete(producto);
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Eliminación de Producto Correcto");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
    }
}
