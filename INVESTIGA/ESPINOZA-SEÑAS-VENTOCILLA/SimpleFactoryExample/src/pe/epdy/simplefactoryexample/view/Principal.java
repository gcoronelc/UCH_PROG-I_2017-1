package pe.epdy.simplefactoryexample.view;

import pe.epdy.simplefactoryexample.model.CambioModel;
import pe.epdy.simplefactoryexample.service.CambioFactory;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboCambio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOFTWARE DE CAMBIO DE BILLETES");
        setMinimumSize(new java.awt.Dimension(526, 298));
        setPreferredSize(new java.awt.Dimension(526, 298));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setMaximumSize(new java.awt.Dimension(33066, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(349, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tipo de Cambio:     ");
        jPanel1.add(jLabel1);

        cboCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro", "Peso" }));
        cboCambio.setSelectedIndex(-1);
        cboCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCambioActionPerformed(evt);
            }
        });
        jPanel1.add(cboCambio);

        jLabel2.setText("         ");
        jPanel1.add(jLabel2);

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Cant. en Soles"), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5)));
        txtCantidad.setMaximumSize(new java.awt.Dimension(100, 2147483647));
        txtCantidad.setMinimumSize(new java.awt.Dimension(100, 39));
        txtCantidad.setPreferredSize(new java.awt.Dimension(100, 39));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad);

        jLabel3.setText("         ");
        jPanel1.add(jLabel3);

        jButton1.setText("PROCESAR");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(120, 60));
        jButton1.setMinimumSize(new java.awt.Dimension(120, 60));
        jButton1.setPreferredSize(new java.awt.Dimension(120, 60));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        txtSalida.setEditable(false);
        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        txtSalida.setRows(5);
        txtSalida.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 40, 1, 1));
        txtSalida.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtSalida.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtSalida, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(this.getSize());
        procesar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        procesar();
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void cboCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCambioActionPerformed
        txtCantidad.requestFocus();
    }//GEN-LAST:event_cboCambioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCambio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables

    private void procesar() {
        float soles = Float.parseFloat(txtCantidad.getText());
        String cambio=cboCambio.getSelectedItem().toString();
        CambioModel cm = CambioFactory.getCambio(soles, cambio);
        txtSalida.setText(null);
        txtSalida.append("Usted a cambiado soles a " +cm.getTipoCambio()+"\n");
        txtSalida.append("Valor en soles : "+cm.getSoles()+"\n");
        txtSalida.append("Usted tiene "+cm.getCambio()+" "+cm.getTipoCambio());
        
        txtCantidad.setText(null);
        cboCambio.setSelectedIndex(-1);
        cboCambio.requestFocus();
    }
}
