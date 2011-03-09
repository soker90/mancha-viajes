
package Presentacion;

//@author pabloserna.

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevoRecorrido)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarRecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRecorrido)
                    .addComponent(btnBorrarRecorrido)
                    .addComponent(btnDetalles))
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoRecorridoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoRecorridoMouseClicked
        //Controlar cuando no hay datos que en vez de mostrarse
        //el formulario se muestre un joptionpane

        frmCrearRecorrido r= new frmCrearRecorrido();
        r.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        r.setVisible(true);
    }//GEN-LAST:event_btnNuevoRecorridoMouseClicked

    private void btnVolver_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver_click
        this.dispose();
    }//GEN-LAST:event_btnVolver_click

    private void btnBorrar_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrar_click
        try{
            frmPrincipal.agencia.Ciudades.remove(listRecorridos.getSelectedIndex());
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
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listRecorridos;
    // End of variables declaration//GEN-END:variables

}
