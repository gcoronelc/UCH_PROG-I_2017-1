
package pe.egcc.ventaapp.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pe.egcc.ventaapp.model.ResumenModel;
import pe.egcc.ventaapp.service.impl.VentaService;


public class ResumenView extends javax.swing.JInternalFrame {


  public ResumenView() {
    initComponents();
  }
  


  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnConsultar = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    tblRepo = new javax.swing.JTable();

    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("REPORTE DE VENTAS");

    btnConsultar.setText("Consultar");
    btnConsultar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnConsultarActionPerformed(evt);
      }
    });

    tblRepo.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "CATEGORIA", "CANTIDAD", "SUBTOTAL", "IMPUESTO", "TOTAL"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane2.setViewportView(tblRepo);
    if (tblRepo.getColumnModel().getColumnCount() > 0) {
      tblRepo.getColumnModel().getColumn(0).setResizable(false);
      tblRepo.getColumnModel().getColumn(1).setResizable(false);
      tblRepo.getColumnModel().getColumn(2).setResizable(false);
      tblRepo.getColumnModel().getColumn(3).setResizable(false);
      tblRepo.getColumnModel().getColumn(4).setResizable(false);
    }

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    // Proceso
    VentaService service = new VentaService();
    List<ResumenModel> lista = service.obtenerResumen();
    // Reporte
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblRepo.getModel();
    tabla.setRowCount(0);
    for (ResumenModel model : lista) {
      Object[] rowData = {
        model.getCategoria(),
        model.getCantidad(),
        model.getImporte(),
        model.getImpuesto(),
        model.getTotal()
      };
      tabla.addRow(rowData);
    }
  }//GEN-LAST:event_btnConsultarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnConsultar;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTable tblRepo;
  // End of variables declaration//GEN-END:variables
}
