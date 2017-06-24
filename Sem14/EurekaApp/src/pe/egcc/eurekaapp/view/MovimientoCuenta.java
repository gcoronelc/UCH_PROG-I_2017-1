package pe.egcc.eurekaapp.view;

import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.egcc.eurekaapp.controller.CuentaController;

public class MovimientoCuenta extends javax.swing.JFrame {

    private CuentaController control;

    public MovimientoCuenta() {
        initComponents();
        control = new CuentaController();
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtCodigo = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblDatos = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(911, 477));
    setPreferredSize(new java.awt.Dimension(911, 477));

    jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
    jPanel1.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
    jLabel1.setText("N° CUENTA:");
    jPanel1.add(jLabel1);

    txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jPanel1.add(txtCodigo);

    jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jButton1.setText("CONSULTAR");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton1);

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

    jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20));
    jPanel2.setLayout(new java.awt.BorderLayout());

    tblDatos.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
    tblDatos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Cuenta codigo", "Numero", "Fecha", "Codigo empleado", "Tipo codigo", "Importe", "Referencia"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblDatos.setRowHeight(30);
    jScrollPane1.setViewportView(tblDatos);

    jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Dato
            String codigo = txtCodigo.getText();
            // Proceso
            List<Map<String, Object>> lista = control.getMoveCuenta(codigo);
            // Reporte
            DefaultTableModel tabla;
            tabla = (DefaultTableModel) tblDatos.getModel();
            tabla.setRowCount(0); // Elimina todas las filas
            for (Map<String, Object> row : lista) {
                Object[] rowData = {
                    row.get("codigo") + "",
                    row.get("movnro") + "",
                    row.get("fecha"),
                    row.get("empleado") + "",
                    row.get("tipo") + "",
                    row.get("importe") + "",
                    row.get("referencia" + "")
                };
                tabla.addRow(rowData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MovimientoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimientoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimientoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimientoCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimientoCuenta().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblDatos;
  private javax.swing.JTextField txtCodigo;
  // End of variables declaration//GEN-END:variables
}
