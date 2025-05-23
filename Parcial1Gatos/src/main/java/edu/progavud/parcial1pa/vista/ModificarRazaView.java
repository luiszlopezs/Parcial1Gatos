/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.progavud.parcial1pa.vista;

/**
 *
 * @author jjuan
 */
public class ModificarRazaView extends javax.swing.JFrame {

    /**
     * Creates new form ModificarRazaView
     */
    public ModificarRazaView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        separatorLinea = new javax.swing.JSeparator();
        lblModificarGato = new javax.swing.JLabel();
        separatorLinea1 = new javax.swing.JSeparator();
        lblMirarGato = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        buttonRestablecer = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        lblModificarNombre = new javax.swing.JLabel();
        lblModificarPatron = new javax.swing.JLabel();
        lblModificarColor = new javax.swing.JLabel();
        lblModificarColorOjos = new javax.swing.JLabel();
        lblModificarTipoCola = new javax.swing.JLabel();
        lblModificarCantidadBlanco = new javax.swing.JLabel();
        lblModificarDescripcion = new javax.swing.JLabel();
        txtModificarNombre = new javax.swing.JTextField();
        txtModificarDescripcion = new javax.swing.JTextField();
        comboModificarColor = new javax.swing.JComboBox<>();
        comboModificarPatron = new javax.swing.JComboBox<>();
        comboModificarColorOjos = new javax.swing.JComboBox<>();
        comboModificarTipoCola = new javax.swing.JComboBox<>();
        comboModificarCantidadBlanco = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ModificarGatoView");

        panelFondo.setBackground(new java.awt.Color(255, 229, 180));

        separatorLinea.setBackground(new java.awt.Color(0, 0, 0));
        separatorLinea.setForeground(new java.awt.Color(0, 0, 0));

        lblModificarGato.setFont(new java.awt.Font("Curlz MT", 1, 24)); // NOI18N
        lblModificarGato.setText("Modificar Gato");

        separatorLinea1.setBackground(new java.awt.Color(0, 0, 0));
        separatorLinea1.setForeground(new java.awt.Color(0, 0, 0));

        lblMirarGato.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblMirarGato.setText("Mirar los gatos actuales:");

        txtBuscar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        buttonBuscar.setBackground(new java.awt.Color(179, 217, 255));
        buttonBuscar.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        buttonBuscar.setForeground(new java.awt.Color(0, 51, 102));
        buttonBuscar.setText("Buscar");
        buttonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102), 2));

        buttonRestablecer.setBackground(new java.awt.Color(255, 255, 204));
        buttonRestablecer.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        buttonRestablecer.setForeground(new java.awt.Color(204, 204, 0));
        buttonRestablecer.setText("Restablecer");
        buttonRestablecer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 2));
        buttonRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestablecerActionPerformed(evt);
            }
        });

        buttonVolver.setBackground(new java.awt.Color(255, 204, 204));
        buttonVolver.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        buttonVolver.setForeground(new java.awt.Color(204, 0, 0));
        buttonVolver.setText("Volver");
        buttonVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        buttonGuardar.setBackground(new java.awt.Color(204, 255, 229));
        buttonGuardar.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        buttonGuardar.setForeground(new java.awt.Color(0, 153, 102));
        buttonGuardar.setText("Guardar");
        buttonGuardar.setToolTipText("");
        buttonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        lblModificarNombre.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblModificarNombre.setText("Nombre:");
        lblModificarNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblModificarPatron.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblModificarPatron.setText("Patron:");
        lblModificarPatron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblModificarColor.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblModificarColor.setText("Color:");
        lblModificarColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblModificarColorOjos.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblModificarColorOjos.setText("Color de ojos:");
        lblModificarColorOjos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblModificarTipoCola.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblModificarTipoCola.setText("Tipo de cola:");
        lblModificarTipoCola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblModificarCantidadBlanco.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblModificarCantidadBlanco.setText("Cantidad de blanco en pelaje:");
        lblModificarCantidadBlanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblModificarDescripcion.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblModificarDescripcion.setText("Descripcion:");
        lblModificarDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtModificarNombre.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        txtModificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModificarNombreActionPerformed(evt);
            }
        });

        txtModificarDescripcion.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N

        comboModificarColor.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        comboModificarColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "n - Negro", "a - Azul", "b - Chocolate", "w - Blanco", "d - Rojo", "e - Crema" }));

        comboModificarPatron.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        comboModificarPatron.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "01 - Van", "03 - Bicolor", "09 - Con Blanco (Indefinido)", "23 - Tabby Caballa", "24 - Tabby Moteado", "25 - Ticked Tabby", " " }));

        comboModificarColorOjos.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        comboModificarColorOjos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "61 - Azul", "62 - Naranja/Cobre", "63 - Odd-eyed/Heterocromia", "64 - Verde", "65 - Amarillo/Dorado", "66 - Avellana/Ambar Claro" }));

        comboModificarTipoCola.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        comboModificarTipoCola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "51 - Sin Cola", "52 - Enroscada", "53 - Corta", "54 - Larga", "55 - Quebrada", "56 - Emplumada" }));

        comboModificarCantidadBlanco.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        comboModificarCantidadBlanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "71 - Rectas", "72 - Rizadas", "73 - Plegadas", "74 - Grandes", "75 - Pequeñas", "76 - En Punta" }));

        jComboBox1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "Nombre de la raza", "Codigo EMS" }));

        lblID.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblID.setText("ID de gato a modificar:");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorLinea)
            .addComponent(separatorLinea1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblModificarGato)
                .addGap(208, 208, 208))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModificarCantidadBlanco)
                                    .addComponent(lblModificarDescripcion)
                                    .addComponent(lblModificarColorOjos)
                                    .addComponent(lblModificarTipoCola)
                                    .addComponent(lblModificarNombre))
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(txtModificarNombre))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtModificarDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(comboModificarCantidadBlanco, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboModificarTipoCola, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboModificarColorOjos, 0, 311, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModificarColor)
                                    .addComponent(lblModificarPatron))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboModificarPatron, 0, 311, Short.MAX_VALUE)
                                    .addComponent(comboModificarColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(buttonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMirarGato)
                            .addComponent(lblID))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(txtBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblModificarGato)
                .addGap(18, 18, 18)
                .addComponent(separatorLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMirarGato)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addComponent(separatorLinea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModificarNombre)
                    .addComponent(txtModificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModificarColor)
                    .addComponent(comboModificarColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarPatron)
                            .addComponent(comboModificarPatron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarColorOjos)
                            .addComponent(comboModificarColorOjos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarTipoCola)
                            .addComponent(comboModificarTipoCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarCantidadBlanco)
                            .addComponent(comboModificarCantidadBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(lblModificarDescripcion))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(txtModificarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRestablecer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void buttonRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestablecerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRestablecerActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void txtModificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModificarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModificarNombreActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarRazaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonRestablecer;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> comboModificarCantidadBlanco;
    private javax.swing.JComboBox<String> comboModificarColor;
    private javax.swing.JComboBox<String> comboModificarColorOjos;
    private javax.swing.JComboBox<String> comboModificarPatron;
    private javax.swing.JComboBox<String> comboModificarTipoCola;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMirarGato;
    private javax.swing.JLabel lblModificarCantidadBlanco;
    private javax.swing.JLabel lblModificarColor;
    private javax.swing.JLabel lblModificarColorOjos;
    private javax.swing.JLabel lblModificarDescripcion;
    private javax.swing.JLabel lblModificarGato;
    private javax.swing.JLabel lblModificarNombre;
    private javax.swing.JLabel lblModificarPatron;
    private javax.swing.JLabel lblModificarTipoCola;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JSeparator separatorLinea;
    private javax.swing.JSeparator separatorLinea1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtModificarDescripcion;
    private javax.swing.JTextField txtModificarNombre;
    // End of variables declaration//GEN-END:variables
}
