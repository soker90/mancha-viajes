/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmDevolucion.java
 *
 * Created on 03-mar-2011, 19:45:42
 */

package Presentacion;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;


/**
 *
 * @author moisescano
 */
public class frmDevolucion extends javax.swing.JFrame {
    Date finicio;
    Date f_fin;
    Date factual;
    Cliente ClienteActual;
    int posicion;
    JFrame parent;
    /** Creates new form frmDevolucion */
    public frmDevolucion(Cliente cli,int pos,JFrame padre) {
        parent=padre;
        ClienteActual=cli;
        posicion=pos;
        finicio = ClienteActual.getReservas().get(posicion).getFechaInicio();
        f_fin = ClienteActual.getReservas().get(posicion).getFechaFin();
        factual=new Date();
        factual= new GregorianCalendar().getTime();
        double Mstotal=f_fin.getTime()-finicio.getTime();
        int totaldias=(int)(((Mstotal/1000)/3600)/24)+1;
        double MsRealizados = factual.getTime()-finicio.getTime();
        int diasRealizados=(int)(((MsRealizados/1000)/3600)/24)+1;
        int PorcentDevol=(int)(100-((diasRealizados*100)/totaldias));
        double importeTotal=ClienteActual.getReservas().get(posicion).getImporteTotal();
        double importeDevol=importeTotal*((double)PorcentDevol/100);
        initComponents();
        txtDiasTranscurridos.setText(Integer.toString(diasRealizados));
        txtImporteDevol.setText(Double.toString(importeDevol-ClienteActual.getReservas().get(posicion).getImporteRestante()));
        txtPDiasRestantes.setText(Integer.toString(totaldias-diasRealizados));
        txtPorcentajeNoRealizado.setText(Integer.toString(PorcentDevol));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDiasTranscurridos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtImporteDevol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPDiasRestantes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPorcentajeNoRealizado = new javax.swing.JTextField();
        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dias transcurridos:");

        txtDiasTranscurridos.setEditable(false);
        txtDiasTranscurridos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setText("Importe Devolucion:");

        txtImporteDevol.setEditable(false);
        txtImporteDevol.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText("€");

        jLabel4.setText("Dias Restantes:");

        txtPDiasRestantes.setEditable(false);
        txtPDiasRestantes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("Procentaje del viaje no realizado:");

        txtPorcentajeNoRealizado.setEditable(false);
        txtPorcentajeNoRealizado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnImprimir.setText("Imprimir Factura");
        btnImprimir.setToolTipText("Imprimir Factura");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiasTranscurridos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPDiasRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPorcentajeNoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCancelar)
                                    .addComponent(txtImporteDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiasTranscurridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPDiasRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorcentajeNoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtImporteDevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
        // TODO add your handling code here:
        ClienteActual.getReservas().remove(posicion);
        dispose();
        parent.dispose();
    }//GEN-LAST:event_btnImprimirMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new frmDevolucion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDiasTranscurridos;
    private javax.swing.JTextField txtImporteDevol;
    private javax.swing.JTextField txtPDiasRestantes;
    private javax.swing.JTextField txtPorcentajeNoRealizado;
    // End of variables declaration//GEN-END:variables

}
