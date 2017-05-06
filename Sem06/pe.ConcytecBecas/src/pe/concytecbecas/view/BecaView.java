
package pe.concytecbecas.view;

import javax.swing.JOptionPane;
import pe.concytecbecas.controller.BecaController;
import pe.concytecbecas.model.BecaModel;

public class BecaView extends javax.swing.JFrame {

  private BecaController control;
  
  /**
   * Creates new form BecaView
   */
  public BecaView() {
    initComponents();
    control = new BecaController();
    llenarCategoria();
    llenarProductos();
  }
  
  private void llenarCategoria(){
    // Obtener datos
    String[] categorias = control.getCategorias();
    // LLenar combo
    cboCategoria.removeAllItems();;
    for (String categoria : categorias) {
      cboCategoria.addItem(categoria);
    }
    cboCategoria.setSelectedIndex(-1);
  }
  
  private void llenarProductos(){
    // Obtener datos
    String[] productos = control.getProductos();
    // LLenar combo
    cboProducto.removeAllItems();;
    for (String prodducto : productos) {
      cboProducto.addItem(prodducto);
    }
    cboProducto.setSelectedIndex(-1);
  }
  
  private void cargarImporte(){
    txtImporte.setText("0.0");
    int index1 = cboCategoria.getSelectedIndex();
    int index2 = cboProducto.getSelectedIndex();
    if( index1 == -1 || index2 == -1 ){
      return;
    }
    String categoria = cboCategoria.getSelectedItem().toString();
    String producto = cboProducto.getSelectedItem().toString();
    double importe = control.getImporte(categoria,producto);
    txtImporte.setText("" + importe);
  }
  
  
  

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    cboCategoria = new javax.swing.JComboBox<>();
    jLabel2 = new javax.swing.JLabel();
    cboProducto = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    cboMes = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    txtImporte = new javax.swing.JTextField();
    btnProcesar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("BECA DE ESTUDIO");

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Categoría:");

    cboCategoria.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboCategoria.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboCategoriaActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("Producto:");

    cboProducto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    cboProducto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cboProductoActionPerformed(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("Importe:");

    cboMes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    cboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06", "12", "18" }));

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("Meses:");

    txtImporte.setEditable(false);
    txtImporte.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

    btnProcesar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    btnProcesar.setText("Procesar");
    btnProcesar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnProcesarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(57, 57, 57)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(txtImporte))
            .addGroup(layout.createSequentialGroup()
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(68, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
          .addComponent(txtImporte))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(34, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
    cargarImporte();
  }//GEN-LAST:event_cboCategoriaActionPerformed

  private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
    cargarImporte();
  }//GEN-LAST:event_cboProductoActionPerformed

  private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
    // Datos
    BecaModel model = new BecaModel();
    model.setCategoria(cboCategoria.getSelectedItem().toString());
    model.setProducto(cboProducto.getSelectedItem().toString());
    model.setMeses(Integer.parseInt(cboMes.getSelectedItem().toString()));
    // Proceso
    model = control.procesarBeca(model);
    // Reporte
    String repo = "";
    repo += "Factor: " + model.getFactor() + "\n";
    repo += "porcentaje: " + model.getPorcentaje() + "\n";
    repo += "Capital: " + model.getImporte() + "\n";
    repo += "Valor de cuota: " + model.getCuota() + "\n";
    repo += "Meses: " + model.getMeses()+ "\n";
    JOptionPane.showMessageDialog(rootPane, repo);
  }//GEN-LAST:event_btnProcesarActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(BecaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BecaView().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnProcesar;
  private javax.swing.JComboBox<String> cboCategoria;
  private javax.swing.JComboBox<String> cboMes;
  private javax.swing.JComboBox<String> cboProducto;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField txtImporte;
  // End of variables declaration//GEN-END:variables
}
