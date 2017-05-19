package pe.epdy.abstractfactoryexample.view;

import pe.epdy.abstractfactoryexample.factory.DesingFactory;
import pe.epdy.abstractfactoryexample.factory.ServicioInformatico;
import pe.epdy.abstractfactoryexample.factory.SoftwareFactory;
import pe.epdy.abstractfactoryexample.factory.WebSitesFactory;
import pe.epdy.abstractfactoryexample.model.ServicioPrincipalModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboServicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel1.setMaximumSize(new java.awt.Dimension(33066, 80));
        jPanel1.setMinimumSize(new java.awt.Dimension(349, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setText("         ");
        jPanel1.add(jLabel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Asignar a :     ");
        jPanel1.add(jLabel1);

        cboServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISEÑO GRAFICO", "INGENIERO SOFTWARE", "DISEÑO WEB" }));
        cboServicio.setSelectedIndex(-1);
        cboServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboServicioActionPerformed(evt);
            }
        });
        jPanel1.add(cboServicio);

        jLabel2.setText("         ");
        jPanel1.add(jLabel2);

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
    }// </editor-fold>//GEN-END:initComponents

    private void cboServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboServicioActionPerformed
        procesar();
    }//GEN-LAST:event_cboServicioActionPerformed

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
    private javax.swing.JComboBox<String> cboServicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables

    private void procesar() {
        
        ServicioInformatico h = elijeSeervicio(cboServicio.getSelectedIndex());
        txtSalida.setText(null);
        txtSalida.append(h.asignarTrabajo()+"\n");
        txtSalida.append(h.indicarFechaEntrega() + "\n");
        txtSalida.append(h.informarSobrePago());
        cboServicio.setSelectedIndex(-1);
        cboServicio.requestFocus();
        
    }
    
    public ServicioInformatico elijeSeervicio(int p) {
        ServicioInformatico nn;
        switch (p) {
            case 0:
                nn = new DesingFactory().crearServicio(); break;
            case 1:
                nn = new SoftwareFactory().crearServicio(); break;
            default:
                nn = new WebSitesFactory().crearServicio();
        }
        return nn;
    }
}
