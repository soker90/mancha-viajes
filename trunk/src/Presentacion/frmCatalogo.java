
package Presentacion;

//@author pabloserna.

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;

 
public class frmCatalogo extends javax.swing.JFrame {

    /** Creates new form frmCatalogo */
    public frmCatalogo()
    {
        initComponents();
        listRecorridos.setListData(frmPrincipal.agencia.CatalogoInicial.Recorridos.toArray());
        this.setLocationRelativeTo(this);
        this.setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);
        this.setTitle("Ver Catálogo");
        btnNuevoRecorrido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnDetalles.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnBorrarRecorrido.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listRecorridos = new javax.swing.JList();
        btnNuevoRecorrido = new javax.swing.JButton();
        btnDetalles = new javax.swing.JButton();
        btnBorrarRecorrido = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnNuevoRecorrido1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listRecorridos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listRecorridos);

        btnNuevoRecorrido.setText("Nuevo");
        btnNuevoRecorrido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoRecorridoMouseClicked(evt);
            }
        });

        btnDetalles.setText("Ver");
        btnDetalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVer_click(evt);
            }
        });

        btnBorrarRecorrido.setText("Borrar");
        btnBorrarRecorrido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrar_click(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolver_click(evt);
            }
        });

        btnNuevoRecorrido1.setText("Nuevo (beta)");
        btnNuevoRecorrido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoRecorrido1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnNuevoRecorrido1)
                            .addGap(18, 18, 18)
                            .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnNuevoRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBorrarRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRecorrido)
                    .addComponent(btnDetalles)
                    .addComponent(btnBorrarRecorrido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRecorrido1)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoRecorridoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoRecorridoMouseClicked
        //Controlar cuando no hay datos que en vez de mostrarse
        //el formulario se muestre un joptionpane

        frmCrearRecorrido r= new frmCrearRecorrido(listRecorridos);
        r.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        r.setLocationRelativeTo(this);
        r.setVisible(true);
    }//GEN-LAST:event_btnNuevoRecorridoMouseClicked

    private void btnVolver_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver_click
        this.dispose();
    }//GEN-LAST:event_btnVolver_click

    private void btnBorrar_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrar_click
        try{

            frmPrincipal.agencia.CatalogoInicial.Recorridos.remove(listRecorridos.getSelectedIndex());
            listRecorridos.setListData(frmPrincipal.agencia.CatalogoInicial.Recorridos.toArray());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una opcion","Borrar Recorrido",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrar_click

    private void btnVer_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVer_click
       try
       {

       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Debe seleccionar una opcion","Detalles Recorrido",JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnVer_click

    private void btnNuevoRecorrido1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoRecorrido1MouseClicked
        frmCrearRecorridoAlternativo r = new frmCrearRecorridoAlternativo();
        r.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        r.setLocationRelativeTo(this);
        r.setVisible(true);
    }//GEN-LAST:event_btnNuevoRecorrido1MouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCatalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarRecorrido;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnNuevoRecorrido;
    private javax.swing.JButton btnNuevoRecorrido1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listRecorridos;
    // End of variables declaration//GEN-END:variables

}
