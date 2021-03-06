/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmReservas.java
 *
 * Created on 19-feb-2011, 19:11:41
 */

package Presentacion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author moises
 */
public class frmReservas extends javax.swing.JFrame {
    Cliente ClienteActual;
    /** Creates new form frmReservas */
    public frmReservas(){
        initComponents();
    }
    public frmReservas(String titulo,Cliente c) {

        this.setTitle(titulo);
        this.ClienteActual=c;
        initComponents();
        this.refrescarjlist();
    }

    public final void refrescarjlist()
    {
        jlst_recorridos.setListData(ClienteActual.getReservas().toArray());
        try{
            jlst_recorridos.setSelectedIndex(0);
        }catch(Exception ex){}
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_nuevo = new javax.swing.JButton();
        btn_anular = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlst_recorridos = new javax.swing.JList();
        btn_pagos = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_nuevo.setText("Nuevo");
        btn_nuevo.setToolTipText("Nueva Reserva");
        btn_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevo_clic(evt);
            }
        });

        btn_anular.setText("Anular");
        btn_anular.setToolTipText("Anular Reserva");
        btn_anular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_anularMouseClicked(evt);
            }
        });

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setToolTipText("Aceptar");
        btn_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseClicked(evt);
            }
        });

        jlst_recorridos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jlst_recorridos);

        btn_pagos.setText("Pagos");
        btn_pagos.setToolTipText("Pagos de la Reserva");
        btn_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pagosMouseClicked(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar Reserva");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_anular, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_anular)
                            .addComponent(btn_nuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_aceptar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(btn_pagos, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_aceptarMouseClicked

    private void btn_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pagosMouseClicked
        // TODO add your handling code here:
        if(ClienteActual.getReservas().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El cliente no tiene reservas", "Error", 0);
        }
        else if(ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()).getImporteRestante()==0)
        {
            JOptionPane.showMessageDialog(null, "La reserva ya está pagada", "Infromación de reserva", 1);
        }
        else
        {
            frmPagoReserva frmp = new frmPagoReserva(ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()),this);
            frmp.setLocationRelativeTo(this);
            frmp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frmp.setAlwaysOnTop(true);
            frmp.setVisible(true);
        }
    }//GEN-LAST:event_btn_pagosMouseClicked

    private void btn_nuevo_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevo_clic
        frmCrearReserva NuevaReserva = new frmCrearReserva(jlst_recorridos,ClienteActual.getReservas());
        NuevaReserva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        NuevaReserva.setLocationRelativeTo(this);
        NuevaReserva.setVisible(true);
    }//GEN-LAST:event_btn_nuevo_clic

    private void btn_anularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_anularMouseClicked
        // TODO add your handling code here:
        if(ClienteActual.getReservas().isEmpty())
            JOptionPane.showMessageDialog(null, "No hay recorridos", "Error", 0);
        else
        {
            if(JOptionPane.showConfirmDialog(null, "¿Estas seguro?")==JOptionPane.YES_OPTION)
            {
                Date finicio=ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()).getFechaInicio();
                Date f_fin=ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()).getFechaFin();
                if(finicio.before(new GregorianCalendar().getTime())&&f_fin.after(new GregorianCalendar().getTime()))
                {
                    frmDevolucion formudev = new frmDevolucion(ClienteActual, jlst_recorridos.getSelectedIndex(), this);
                    formudev.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    formudev.setLocationRelativeTo(this);
                    formudev.setVisible(true);
                }
                else
                {
                    double devolucion = ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()).getImporteTotal()-ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()).getImporteRestante();
                    JOptionPane.showMessageDialog(null, "La reserva ha sido eliminada, el importe a devolver es de "+devolucion+"€", "Reserva Borrada", 1);
                    ClienteActual.Reservas.remove(jlst_recorridos.getSelectedIndex());
                    refrescarjlist();
                }
            }
        }
    }//GEN-LAST:event_btn_anularMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
        if(ClienteActual.getReservas().isEmpty())
            JOptionPane.showMessageDialog(null, "No hay recorridos", "Error", 0);
        else
        {
            int posicion=-1;
            SimpleDateFormat f_format= new SimpleDateFormat("dd/MM/yyyy");
            Date factual = new GregorianCalendar().getTime();
            Date finicio=ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()).getFechaInicio();
            Date f_fin=ClienteActual.getReservas().get(jlst_recorridos.getSelectedIndex()).getFechaFin();
            if(finicio.before(factual)&&f_fin.after(factual) || f_fin.before(factual))
                JOptionPane.showMessageDialog(null, "No se puede editar una reserva que ha sido iniciada o ya finalizada");
            else
            {
                frmEditarReserva formuEdit = new frmEditarReserva(jlst_recorridos, ClienteActual.getReservas(),jlst_recorridos.getSelectedIndex());
                formuEdit.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formuEdit.setLocationRelativeTo(this);
                formuEdit.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_anular;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_pagos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlst_recorridos;
    // End of variables declaration//GEN-END:variables

}
