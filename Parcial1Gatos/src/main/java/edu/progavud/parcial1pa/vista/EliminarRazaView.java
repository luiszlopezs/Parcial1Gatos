/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.progavud.parcial1pa.vista;

/**
 *
 * @author jjuan
 */
public class EliminarRazaView extends javax.swing.JFrame {

    /**
     * Creates new form EliminarRazaView
     */
    public EliminarRazaView() {
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
        lblEliminarGato = new javax.swing.JLabel();
        separatorLineaAbajo = new javax.swing.JSeparator();
        separatorLineaAbajo1 = new javax.swing.JSeparator();
        lblBuscarPor = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        comboMirarGatos = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        lblResultadoEliminarRaza = new javax.swing.JLabel();
        lblResultadoEliminarCodigo = new javax.swing.JLabel();
        lblResultadoEliminarDescripcion = new javax.swing.JLabel();
        txtResultadoEliminarRaza = new javax.swing.JTextField();
        txtResultadoEliminarCodigo = new javax.swing.JTextField();
        txtResultadoEliminarDescripcion = new javax.swing.JTextField();
        lblPreguntaEliminar = new javax.swing.JLabel();
        buttonEliminar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        lblResultadoEliminarNombre = new javax.swing.JLabel();
        txtResultadoEliminarNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EliminarGatoView");

        panelFondo.setBackground(new java.awt.Color(255, 229, 180));

        separatorLinea.setBackground(new java.awt.Color(0, 0, 0));
        separatorLinea.setForeground(new java.awt.Color(0, 0, 0));

        lblEliminarGato.setFont(new java.awt.Font("Curlz MT", 1, 24)); // NOI18N
        lblEliminarGato.setText("Eliminar Gato");

        separatorLineaAbajo.setBackground(new java.awt.Color(0, 0, 0));
        separatorLineaAbajo.setForeground(new java.awt.Color(0, 0, 0));

        separatorLineaAbajo1.setBackground(new java.awt.Color(0, 0, 0));
        separatorLineaAbajo1.setForeground(new java.awt.Color(0, 0, 0));

        lblBuscarPor.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblBuscarPor.setText("Mirar los gatos actuales:");
        lblBuscarPor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblValor.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("ID:");
        lblValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        comboMirarGatos.setFont(new java.awt.Font("Serif", 1, 17)); // NOI18N
        comboMirarGatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));

        txtValor.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        buttonBuscar.setBackground(new java.awt.Color(179, 217, 255));
        buttonBuscar.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        buttonBuscar.setForeground(new java.awt.Color(0, 51, 102));
        buttonBuscar.setText("Buscar");
        buttonBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102), 2));
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        lblResultadoEliminarRaza.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblResultadoEliminarRaza.setText("Raza:");
        lblResultadoEliminarRaza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblResultadoEliminarCodigo.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblResultadoEliminarCodigo.setText("Codigo EMS:");
        lblResultadoEliminarCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblResultadoEliminarDescripcion.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblResultadoEliminarDescripcion.setText("Descripcion:");
        lblResultadoEliminarDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtResultadoEliminarRaza.setEditable(false);
        txtResultadoEliminarRaza.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        txtResultadoEliminarCodigo.setEditable(false);
        txtResultadoEliminarCodigo.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txtResultadoEliminarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoEliminarCodigoActionPerformed(evt);
            }
        });

        txtResultadoEliminarDescripcion.setEditable(false);
        txtResultadoEliminarDescripcion.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        lblPreguntaEliminar.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblPreguntaEliminar.setText("¿Deseas Eliminar Esta Raza?");

        buttonEliminar.setBackground(new java.awt.Color(255, 204, 204));
        buttonEliminar.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        buttonEliminar.setForeground(new java.awt.Color(204, 0, 0));
        buttonEliminar.setText("Eliminar");
        buttonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        buttonCancelar.setBackground(new java.awt.Color(255, 255, 204));
        buttonCancelar.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(204, 204, 0));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 2));

        lblResultadoEliminarNombre.setFont(new java.awt.Font("Curlz MT", 1, 18)); // NOI18N
        lblResultadoEliminarNombre.setText("Nombre:");
        lblResultadoEliminarNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtResultadoEliminarNombre.setEditable(false);
        txtResultadoEliminarNombre.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorLinea)
            .addComponent(separatorLineaAbajo)
            .addComponent(separatorLineaAbajo1)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(buttonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonCancelar)
                .addGap(45, 45, 45))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscarPor)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(txtValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboMirarGatos, 0, 264, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblEliminarGato))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lblPreguntaEliminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultadoEliminarCodigo)
                            .addComponent(lblResultadoEliminarDescripcion))
                        .addGap(112, 112, 112)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoEliminarCodigo)
                            .addComponent(txtResultadoEliminarDescripcion)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultadoEliminarRaza)
                            .addComponent(lblResultadoEliminarNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtResultadoEliminarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(txtResultadoEliminarRaza))))
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblEliminarGato)
                .addGap(18, 18, 18)
                .addComponent(separatorLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarPor)
                    .addComponent(comboMirarGatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor)
                    .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonBuscar)))
                .addGap(18, 18, 18)
                .addComponent(separatorLineaAbajo1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoEliminarNombre)
                    .addComponent(txtResultadoEliminarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoEliminarRaza)
                    .addComponent(txtResultadoEliminarRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoEliminarCodigo)
                    .addComponent(txtResultadoEliminarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultadoEliminarDescripcion)
                    .addComponent(txtResultadoEliminarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separatorLineaAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPreguntaEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEliminar)
                    .addComponent(buttonCancelar))
                .addGap(19, 19, 19))
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

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void txtResultadoEliminarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoEliminarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoEliminarCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarRazaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarRazaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JComboBox<String> comboMirarGatos;
    private javax.swing.JLabel lblBuscarPor;
    private javax.swing.JLabel lblEliminarGato;
    private javax.swing.JLabel lblPreguntaEliminar;
    private javax.swing.JLabel lblResultadoEliminarCodigo;
    private javax.swing.JLabel lblResultadoEliminarDescripcion;
    private javax.swing.JLabel lblResultadoEliminarNombre;
    private javax.swing.JLabel lblResultadoEliminarRaza;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JSeparator separatorLinea;
    private javax.swing.JSeparator separatorLineaAbajo;
    private javax.swing.JSeparator separatorLineaAbajo1;
    private javax.swing.JTextField txtResultadoEliminarCodigo;
    private javax.swing.JTextField txtResultadoEliminarDescripcion;
    private javax.swing.JTextField txtResultadoEliminarNombre;
    private javax.swing.JTextField txtResultadoEliminarRaza;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
