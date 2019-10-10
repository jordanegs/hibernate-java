package com.hibernate.view;

import com.hibernate.model.ModelMarca;
import com.hibernate.model.ModelPresentacion;
import com.hibernate.model.ModelProducto;
import com.hibernate.model.ModelProveedor;
import com.hibernate.model.ModelZona;
import com.hibernate.model.persistencia.Marca;
import com.hibernate.model.persistencia.Presentacion;
import com.hibernate.model.persistencia.Producto;
import com.hibernate.model.persistencia.Proveedor;
import com.hibernate.model.persistencia.Zona;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class VistaProducto extends javax.swing.JFrame {
    DefaultTableModel model;
    boolean actualizar = false;
    
    public VistaProducto() {
        initComponents();
        setLocationRelativeTo(null);
        this.model = new DefaultTableModel();
        this.tablaProductos();
        this.llenarTabla();
        this.llenarMarca();
        this.llenarPresentacion();
        this.llenarProveedor();
        this.llenarZona();
        this.ocultar();
    }
    
    public void ocultar(){
        this.btnCrear.setVisible(!actualizar);
        this.txtId.setVisible(actualizar);
        this.btnActualizar.setVisible(actualizar);
    }
    
    public void tablaProductos(){
        model.addColumn("ID");
        model.addColumn("Marca");
        model.addColumn("Presentacion");
        model.addColumn("Proveedor");
        model.addColumn("Zona");
        model.addColumn("Codigo");
        model.addColumn("Descripcion");
        model.addColumn("Precio");
        model.addColumn("Stock");
        model.addColumn("IVA");
        model.addColumn("Peso");
    }
    
    public void llenarTabla(){
        model.setRowCount(0);
        List<Producto> productos = ModelProducto.verProductos();
        productos.forEach((producto) -> {
            model.addRow(new Object[]{
                producto.getId_producto(),
                producto.getMarca().getDescripcion(),
                producto.getPresentacion().getDescripcion(),
                producto.getProveedor().getDescripcion(),
                producto.getZona().getDescripcion(),
                producto.getCodigo(),
                producto.getDescripcion_producto(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getIva(),
                producto.getPeso()
            });
        });
        
        tableProductos.setModel(model);
    }
    
    public void llenarMarca(){
        List<Marca> marcas = ModelMarca.verMarcas();
        marcas.forEach((marca)-> {
            jComboMarca.addItem(marca.getDescripcion());
        });
    }
    
    public void llenarPresentacion(){
        List<Presentacion> presentaciones = ModelPresentacion.verPresentaciones();
        presentaciones.forEach((presentacion)-> {
            jComboPresentacion.addItem(presentacion.getDescripcion());
        });
    }
    
    public void llenarProveedor(){
        List<Proveedor> proveedores = ModelProveedor.verProveedores();
        proveedores.forEach((proveedor)-> {
            jComboProveedor.addItem(proveedor.getDescripcion());
        });
    }
    
    public void llenarZona(){
        List<Zona> zonas = ModelZona.verZonas();
        zonas.forEach((zona)-> {
            jComboZona.addItem(zona.getDescripcion());
        });
    }
    
    public void limpiar(){
        jComboMarca.setSelectedIndex(0);
        jComboPresentacion.setSelectedIndex(0);
        jComboProveedor.setSelectedIndex(0);
        jComboZona.setSelectedIndex(0);
        this.txtCodigo.setText("");
        this.txtDescripcion.setText("");
        this.txtPrecio.setText("");
        this.txtStock.setText("");
        this.txtIVA.setText("");
        this.txtPeso.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboMarca = new javax.swing.JComboBox<>();
        jComboPresentacion = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboProveedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboZona = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCrearP = new javax.swing.JButton();
        btnActualizarP = new javax.swing.JButton();
        btnEliminarP = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableProductos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("Producto");

        jLabel2.setText("Marca");

        jLabel3.setText("Presentación");

        jLabel4.setText("Proveedor");

        jLabel5.setText("Zona");

        jLabel6.setText("Codigo");

        jLabel7.setText("Descripcion");

        jLabel8.setText("Precio");

        jLabel9.setText("Stock");

        jLabel10.setText("IVA");

        jLabel11.setText("Peso");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCrearP.setText("Crear");
        btnCrearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPActionPerformed(evt);
            }
        });

        btnActualizarP.setText("Editar");
        btnActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPActionPerformed(evt);
            }
        });

        btnEliminarP.setText("Eliminar Producto");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jComboProveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboZona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboPresentacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(29, 29, 29)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel10)
                                                                .addComponent(jLabel9))))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(33, 33, 33)
                                                    .addComponent(jLabel11)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(128, 128, 128))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnCrear)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnActualizar)
                                            .addGap(321, 321, 321)))
                                    .addGap(61, 61, 61))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(btnCrearP)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnActualizarP)
                                    .addGap(49, 49, 49)
                                    .addComponent(btnEliminarP)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearP)
                    .addComponent(btnActualizarP)
                    .addComponent(btnEliminarP))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(jComboZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(btnActualizar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if(this.txtCodigo.getText().equals("") || this.txtDescripcion.getText().equals("") ||  this.txtPrecio.getText().equals("") || this.txtStock.getText().equals("") || this.txtIVA.getText().equals("") || this.txtPeso.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Llenar todos los campos");
        } else {
            Marca marca = ModelMarca.verMarca(jComboMarca.getSelectedItem().toString());
            Presentacion presentacion = ModelPresentacion.verPresentacion(jComboPresentacion.getSelectedItem().toString());
            Proveedor proveedor = ModelProveedor.verProveedor(jComboProveedor.getSelectedItem().toString());
            Zona zona = ModelZona.verZona(jComboZona.getSelectedItem().toString());
        
            Producto producto = new Producto();
            producto.setMarca(marca);
            producto.setPresentacion(presentacion);
            producto.setProveedor(proveedor);
            producto.setZona(zona);
            producto.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
            producto.setDescripcion_producto(this.txtDescripcion.getText());
            producto.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
            producto.setStock(Integer.parseInt(this.txtStock.getText()));
            producto.setIva(Integer.parseInt(this.txtIVA.getText()));
            producto.setPeso(Double.parseDouble(this.txtPeso.getText()));

            ModelProducto.crearProducto(producto);
            this.llenarTabla();
            this.limpiar();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPActionPerformed
        this.limpiar();
        this.actualizar = false;
        this.ocultar();
    }//GEN-LAST:event_btnCrearPActionPerformed

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if(resp == 0) {
            try {
                int rowS = tableProductos.getSelectedRow();
                int cod = (int) tableProductos.getValueAt(rowS, 0);
                ModelProducto.eliminarProducto(cod);
                this.model.removeRow(rowS);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Seleccione Fila");
            }
        }
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void btnActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPActionPerformed
        try {
            int rowS = tableProductos.getSelectedRow();
            
            this.actualizar = true;
            this.ocultar();
            
            this.txtId.setText(tableProductos.getValueAt(rowS, 0).toString());
            this.txtCodigo.setText(tableProductos.getValueAt(rowS, 5).toString());
            this.txtDescripcion.setText(tableProductos.getValueAt(rowS, 6).toString());
            this.txtPrecio.setText(tableProductos.getValueAt(rowS, 7).toString());
            this.txtStock.setText(tableProductos.getValueAt(rowS, 8).toString());
            this.txtIVA.setText(tableProductos.getValueAt(rowS, 9).toString());
            this.txtPeso.setText(tableProductos.getValueAt(rowS, 10).toString());
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione Fila");
        }
    }//GEN-LAST:event_btnActualizarPActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(this.txtCodigo.getText().equals("") || this.txtDescripcion.getText().equals("") ||  this.txtPrecio.getText().equals("") || this.txtStock.getText().equals("") || this.txtIVA.getText().equals("") || this.txtPeso.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Llenar todos los campos");
        } else {
            Marca marca = ModelMarca.verMarca(jComboMarca.getSelectedItem().toString());
            Presentacion presentacion = ModelPresentacion.verPresentacion(jComboPresentacion.getSelectedItem().toString());
            Proveedor proveedor = ModelProveedor.verProveedor(jComboProveedor.getSelectedItem().toString());
            Zona zona = ModelZona.verZona(jComboZona.getSelectedItem().toString());
        
            Producto producto = new Producto();
            producto.setId_producto(Integer.parseInt(this.txtId.getText()));
            producto.setMarca(marca);
            producto.setPresentacion(presentacion);
            producto.setProveedor(proveedor);
            producto.setZona(zona);
            producto.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
            producto.setDescripcion_producto(this.txtDescripcion.getText());
            producto.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
            producto.setStock(Integer.parseInt(this.txtStock.getText()));
            producto.setIva(Integer.parseInt(this.txtIVA.getText()));
            producto.setPeso(Double.parseDouble(this.txtPeso.getText()));

            ModelProducto.actualizarProducto(producto);
            this.llenarTabla();
            this.limpiar();
            
            this.actualizar = false;
            this.ocultar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizarP;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnCrearP;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JComboBox<String> jComboMarca;
    private javax.swing.JComboBox<String> jComboPresentacion;
    private javax.swing.JComboBox<String> jComboProveedor;
    private javax.swing.JComboBox<String> jComboZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
