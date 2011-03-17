
package Presentacion;

import javax.swing.JFrame;


/**
 *
 * @author edu
 */
public class frmCiudades extends javax.swing.JFrame {   
    Sistema s = new Sistema();
    /** Creates new form frmCiudades */

    public frmCiudades() {
        initComponents();
        setTitle("ManchaViajes: Ciudades");
        listCiudades.setListData(frmPrincipal.agencia.Ciudades.toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnHotelyTrans = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCiudades = new javax.swing.JList();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNuevo.setText("Nueva");
        btnNuevo.setToolTipText("Nueva Ciudad");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevaCiudad(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("Borrar Ciudad");
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
        });

        btnHotelyTrans.setText("Ver Hoteles \ny Transportes"); // NOI18N
        btnHotelyTrans.setToolTipText("Ver Hoteles  y Transportes de la Ciudad");
        btnHotelyTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHotelyTransMouseClicked(evt);
            }
        });

        btnAtras.setText("Volver");
        btnAtras.setToolTipText("Volver Atras");
        btnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasMouseClicked(evt);
            }
        });

        listCiudades.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listCiudades);

        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar Ciudad");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarNuevaCiudad(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnHotelyTrans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtras)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar)
                    .addComponent(btnAtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHotelyTrans)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaCiudad(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevaCiudad
        frmCrearCiudad c = new frmCrearCiudad();
        c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c.setLocationRelativeTo(this);
        c.setVisible(true);
    }//GEN-LAST:event_NuevaCiudad

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        try{
            frmPrincipal.agencia.Ciudades.remove(listCiudades.getSelectedIndex());
            frmCiudades.listCiudades.setListData(frmPrincipal.agencia.Ciudades.toArray());
        }catch(Exception ex){}
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasMouseClicked
        setVisible(false);
    }//GEN-LAST:event_btnAtrasMouseClicked

    private void btnHotelyTransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHotelyTransMouseClicked
        try{
            int indice=listCiudades.getSelectedIndex();
            frmTransyHotel ht = new frmTransyHotel(indice);
            ht.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            ht.setLocationRelativeTo(this);
            ht.setVisible(true);
        }catch(Exception ex){}
    }//GEN-LAST:event_btnHotelyTransMouseClicked

    private void btnEditarNuevaCiudad(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarNuevaCiudad
        try{
            frmEditarCiudad ed = new frmEditarCiudad(listCiudades.getSelectedIndex());
            ed.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ed.setLocationRelativeTo(this);
            ed.setVisible(true);
        }catch(Exception e){}
    }//GEN-LAST:event_btnEditarNuevaCiudad

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHotelyTrans;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList listCiudades;
    // End of variables declaration//GEN-END:variables

}
