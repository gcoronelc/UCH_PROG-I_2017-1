package pe.egcc.eurekaapp.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pe.egcc.eurekaapp.controller.EmpleadoController;
import pe.egcc.eurekaapp.model.Empleado;
import pe.egcc.eurekaapp.util.Mensaje;

public class CrudEmpleadoView extends javax.swing.JInternalFrame {

  private List<Empleado> lista = null;
  
  public CrudEmpleadoView() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtPaterno = new javax.swing.JTextField();
    txtMaterno = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    btnBuscar = new javax.swing.JButton();
    btnNuevo = new javax.swing.JButton();
    btnEditar = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblRepo = new javax.swing.JTable();

    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("CRUD EMPLEADO");

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTROL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

    jLabel1.setText("Paterno:");

    jLabel2.setText("Materno:");

    jLabel3.setText("Nombre:");

    btnBuscar.setText("Buscar");
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarActionPerformed(evt);
      }
    });

    btnNuevo.setText("Nuevo");

    btnEditar.setText("Editar");

    btnEliminar.setText("Eliminar");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
          .addComponent(txtPaterno))
        .addGap(21, 21, 21)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
          .addComponent(txtMaterno))
        .addGap(21, 21, 21)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
          .addComponent(txtNombre))
        .addGap(26, 26, 26)
        .addComponent(btnBuscar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnNuevo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnEditar)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnEliminar)
        .addContainerGap(96, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );

    jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

    tblRepo.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null},
        {null, null, null, null, null, null}
      },
      new String [] {
        "CODIGO", "PATERNO", "MATERNO", "NOMBRE", "CIUDAD", "DIRECCIÓN"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblRepo);
    if (tblRepo.getColumnModel().getColumnCount() > 0) {
      tblRepo.getColumnModel().getColumn(0).setResizable(false);
      tblRepo.getColumnModel().getColumn(1).setResizable(false);
      tblRepo.getColumnModel().getColumn(2).setResizable(false);
      tblRepo.getColumnModel().getColumn(3).setResizable(false);
      tblRepo.getColumnModel().getColumn(4).setResizable(false);
      tblRepo.getColumnModel().getColumn(5).setResizable(false);
    }

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(jScrollPane1)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    try {
      // Datos
      String paterno = txtPaterno.getText();
      String materno = txtMaterno.getText();
      String nombre = txtNombre.getText();
      
      // Proceso
      EmpleadoController control = new EmpleadoController();
      lista = control.leer(paterno, materno, nombre);
      
      // Reporte
      mostrarLista();
    
    } catch (Exception e) {
      Mensaje.showError(rootPane, e.getMessage());
    }
  }//GEN-LAST:event_btnBuscarActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBuscar;
  private javax.swing.JButton btnEditar;
  private javax.swing.JButton btnEliminar;
  private javax.swing.JButton btnNuevo;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblRepo;
  private javax.swing.JTextField txtMaterno;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtPaterno;
  // End of variables declaration//GEN-END:variables

  private void mostrarLista() {
  
    // Accediendo a la tabla
    DefaultTableModel tabla;
    tabla = (DefaultTableModel) tblRepo.getModel();
    
    // Eliminar datos
    tabla.setRowCount(0);
    
    // Cargar datos
    for (Empleado e : lista) {
      Object[] rowData = {e.getCodigo(), e.getPaterno(),
        e.getMaterno(), e.getNombre(), e.getCiudad(), e.getDireccion()};
      tabla.addRow(rowData);
    }
    
  }
}
