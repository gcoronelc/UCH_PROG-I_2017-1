package pe.egcc.eurekaapp.view;

import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import pe.egcc.eurekaapp.controller.CuentaController;
import pe.egcc.eurekaapp.util.Mensaje;

public class CuentasPorSucursalView extends javax.swing.JInternalFrame {

    private CuentaController control;

    public CuentasPorSucursalView() {
        initComponents();
        control = new CuentaController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRepo = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CUENTAS POR SUCURSAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("CODIGO SUCURSAL:");
        jPanel1.add(jLabel1);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(txtCodigo);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 20, 20));
        jPanel2.setLayout(new java.awt.BorderLayout());

        tblRepo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta Codigo", "Codigo Moneda", "Codigo sucursal", "Empl. crea", "Codigo cliente", "Saldo", "Fecha creacion", "Estado", "Movimiento", "Cuenta clave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRepo.setRowHeight(30);
        jScrollPane1.setViewportView(tblRepo);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            // Dato
            String codigo = txtCodigo.getText();
            // Proceso
            List<Map<String, Object>> lista = control.getCuentasSucursal(codigo);
            // Reporte
            DefaultTableModel tabla;
            tabla = (DefaultTableModel) tblRepo.getModel();
            tabla.setRowCount(0); // Elimina todas las filas
            for (Map<String, Object> row : lista) {
                Object[] rowData = {
                    row.get("chr_cuencodigo"),
                    row.get("chr_monecodigo"),
                    row.get("chr_sucucodigo"),
                    row.get("chr_emplcreacuenta"),
                    row.get("chr_cliecodigo"),
                    row.get("dec_cuensaldo"),
                    row.get("dtt_cuenfechacreacion"),
                    row.get("vch_cuenestado"),
                    row.get("int_cuencontmov"),
                    row.get("chr_cuenclave")
                };
                tabla.addRow(rowData);
            }
        } catch (Exception e) {
            
            Mensaje.showError(rootPane, e.getMessage());
            
        }
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRepo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}