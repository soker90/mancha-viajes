
package Presentacion;

//@author pabloSerna.

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class frmCrearRecorrido extends javax.swing.JFrame {
//
    /** Creates new form frmCrearRecorrido */
    public frmCrearRecorrido() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);
        this.setTitle("Crear Recorrido");

        //Basura de las manos
        cmbCiudadDestino.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cmbCiudadOrigen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cmbHotel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cmbTransIda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cmbTransVuelta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        //Se Meten los valores en los ComBobox
        cmbCiudadOrigen.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.toArray()));
        cmbCiudadDestino.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.toArray()));

        try
        {
            cmbTransIda.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.get(0).Transportes.toArray()));
            cmbTransVuelta.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.get(0).Transportes.toArray()));
            cmbHotel.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.get(0).Hoteles.toArray()));
        }
        catch(Exception e){

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        cmbCiudadOrigen = new JComboBox();
        cmbCiudadDestino = new JComboBox();
        cmbHotel = new JComboBox();
        cmbTransIda = new JComboBox();
        cmbTransVuelta = new JComboBox();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Ciudad de Origen");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText(" Hotel de Alojamiento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("Transporte de Ida");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("Ciudad de Destino");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Transporte de Vuelta");

        cmbCiudadOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadOrigenItemStateChanged(evt);
            }
        });

        cmbCiudadDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadDestinoItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("Precio");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelar_click(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrear_click(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(cmbCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCiudadOrigen, 0, 212, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(cmbTransIda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTransVuelta, javax.swing.GroupLayout.Alignment.LEADING, 0, 196, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTransIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTransVuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btnCrear))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCiudadOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadOrigenItemStateChanged
            cmbTransIda.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.get(cmbCiudadOrigen.getSelectedIndex()).Transportes.toArray()));
    }//GEN-LAST:event_cmbCiudadOrigenItemStateChanged

    private void cmbCiudadDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadDestinoItemStateChanged
        cmbTransVuelta.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.get(cmbCiudadDestino.getSelectedIndex()).Transportes.toArray()));
        cmbHotel.setModel(new DefaultComboBoxModel(frmPrincipal.agencia.Ciudades.get(cmbCiudadDestino.getSelectedIndex()).Hoteles.toArray()));
    }//GEN-LAST:event_cmbCiudadDestinoItemStateChanged

    private void btnCrear_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrear_click
       try
       {
        Recorrido r=new Recorrido(frmPrincipal.agencia.Ciudades.get(cmbCiudadOrigen.getSelectedIndex()),frmPrincipal.agencia.Ciudades.get(cmbCiudadDestino.getSelectedIndex()),frmPrincipal.agencia.Ciudades.get(cmbCiudadDestino.getSelectedIndex()).Hoteles.get(cmbHotel.getSelectedIndex()),frmPrincipal.agencia.Ciudades.get(cmbCiudadOrigen.getSelectedIndex()).Transportes.get(cmbTransIda.getSelectedIndex()),frmPrincipal.agencia.Ciudades.get(cmbCiudadDestino.getSelectedIndex()).Transportes.get(cmbTransVuelta.getSelectedIndex()),Double.parseDouble(txtPrecio.getText()));
       frmPrincipal.agencia.CatalogoInicial.Recorridos.add(r);
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos","Crear Recorrido",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnCrear_click

    private void btnCancelar_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar_click
        this.dispose();
    }//GEN-LAST:event_btnCancelar_click

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JComboBox cmbCiudadDestino;
    private javax.swing.JComboBox cmbCiudadOrigen;
    private javax.swing.JComboBox cmbHotel;
    private javax.swing.JComboBox cmbTransIda;
    private javax.swing.JComboBox cmbTransVuelta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
