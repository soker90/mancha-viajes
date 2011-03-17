/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmClientes.java
 *
 * Created on 18-feb-2011, 17:26:35
 */

package Presentacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author moisescano
 */
public class frmClientes extends javax.swing.JFrame {
    /** Creates new form frmClientes */
    @SuppressWarnings("static-access")
    public frmClientes() {
        this.setTitle("Clientes");
        initComponents();
        jlst_client.setListData(frmPrincipal.agencia.Clientes.toArray());
        jlst_client.setSelectedIndex(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlst_client = new javax.swing.JList();
        btn_aceptar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_recorridos = new javax.swing.JButton();
        btn_sit_client = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlst_client.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jlst_client);

        btn_aceptar.setText("Aceptar");
        btn_aceptar.setToolTipText("Aceptar");
        btn_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_aceptar_clic(evt);
            }
        });

        btn_nuevo.setText("Nuevo Cliente");
        btn_nuevo.setToolTipText("Nuevo Cliente");
        btn_nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nuevo_clic(evt);
            }
        });

        btn_recorridos.setText("Reservas");
        btn_recorridos.setToolTipText("Reservas de Cliente");
        btn_recorridos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_recorridos_clic(evt);
            }
        });

        btn_sit_client.setText("Situacion Cliente");
        btn_sit_client.setToolTipText("Ver Situacion del Cliente");
        btn_sit_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sit_client_clic(evt);
            }
        });

        btn_editar.setText("Editar Cliente");
        btn_editar.setToolTipText("Editar Cliente");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editar_clic(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nuevo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(btn_editar, 0, 0, Short.MAX_VALUE)
                    .addComponent(btn_recorridos, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(btn_sit_client, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_recorridos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_sit_client)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_aceptar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevo_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nuevo_clic
        // TODO add your handling code here:
        frmCrearCliente cc = new frmCrearCliente(jlst_client);
        cc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cc.setLocationRelativeTo(this);
        cc.setVisible(true);
    }//GEN-LAST:event_btn_nuevo_clic

    private void btn_sit_client_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sit_client_clic
        // TODO add your handling code here:
        ArrayList<Reserva> reservas =frmPrincipal.agencia.Clientes.get(jlst_client.getSelectedIndex()).getReservas();
        if(reservas.size()==0)
            JOptionPane.showMessageDialog(null, "El cliente no está realizando un viaje actualmente", "Informacion de cliente", 1);
        else
        {
            int posicion=-1;
            SimpleDateFormat f_format= new SimpleDateFormat("dd/MM/yyyy");
            Date factual = new GregorianCalendar().getTime();
            for (int i = 0; i <reservas.size() ; i++) {
                Date finicio=reservas.get(i).getFechaInicio();
                Date f_fin=reservas.get(i).getFechaFin();
                if(finicio.before(factual)&&f_fin.after(factual))
                    posicion=i;
            }
            if(posicion==-1)
                JOptionPane.showMessageDialog(null, "Ninguno de los viajes reservados esta en curso", "Informacion de cliente", 1);
            else
            {
                frmSituacionCliente andesta = new frmSituacionCliente(frmPrincipal.agencia.Clientes.get(jlst_client.getSelectedIndex()),posicion);
                andesta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                andesta.setLocationRelativeTo(this);
                andesta.setVisible(true);

            }
        }

    }//GEN-LAST:event_btn_sit_client_clic

    private void btn_recorridos_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_recorridos_clic
        // TODO add your handling code here:
        if(frmPrincipal.agencia.Clientes.size()==0)
        {
            JOptionPane.showMessageDialog(null, "Se debe dar de alta al menos un usuario", "Error", 0);
        }
        else
        {
            //frmReservas fr = new frmReservas(frmPrincipal.agencia.Clientes.get(jlst_client.getSelectedIndex()).getNombreCompleto(), frmPrincipal.agencia.Clientes.get(jlst_client.getSelectedIndex()).getReservas());
            frmReservas fr = new frmReservas(frmPrincipal.agencia.Clientes.get(jlst_client.getSelectedIndex()).getNombreCompleto(), frmPrincipal.agencia.Clientes.get(jlst_client.getSelectedIndex()));
            fr.setLocationRelativeTo(this);
            fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fr.setVisible(true);
        }
}//GEN-LAST:event_btn_recorridos_clic

    private void btn_aceptar_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptar_clic
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_aceptar_clic

    private void btn_editar_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editar_clic
        try{
            frmEditarCliente cl = new frmEditarCliente(jlst_client, jlst_client.getSelectedIndex());
            cl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            cl.setLocationRelativeTo(this);
            cl.setVisible(true);
        }catch(Exception e){}
    }//GEN-LAST:event_btn_editar_clic

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_recorridos;
    private javax.swing.JButton btn_sit_client;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList jlst_client;
    // End of variables declaration//GEN-END:variables

}
