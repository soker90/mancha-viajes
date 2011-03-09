/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCrearCliente.java
 *
 * Created on 18-feb-2011, 17:35:04
 */

package Presentacion;

import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author moisescano
 */
public class frmCrearCliente extends javax.swing.JFrame {
    JList lista_actual;
    /** Creates new form frmCrearCliente */
    public frmCrearCliente(JList lista) {
        lista_actual=lista;
        this.setTitle("Crear Cliente");
        initComponents();

        //Oculta los label de error
        lblcperror.setVisible(false);
        lblTelError.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nombre = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_poblacion = new javax.swing.JTextField();
        txt_cp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_tlfn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();
        lblcperror = new javax.swing.JLabel();
        lblTelError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dni");

        jLabel2.setText("Nombre");

        jLabel3.setText("Direccion");

        jLabel4.setText("Poblacion");

        jLabel5.setText("Codigo Postal");

        jLabel6.setText("Telefono");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelar_clic(evt);
            }
        });

        btn_crear.setText("Crear");
        btn_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crearMouseClicked(evt);
            }
        });

        lblcperror.setBackground(new java.awt.Color(255, 0, 20));
        lblcperror.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblcperror.setForeground(new java.awt.Color(255, 0, 0));
        lblcperror.setText("Codigo postal incorrecto");
        lblcperror.setAlignmentY(0.0F);
        lblcperror.setFocusable(false);

        lblTelError.setBackground(new java.awt.Color(255, 0, 20));
        lblTelError.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        lblTelError.setForeground(new java.awt.Color(255, 0, 0));
        lblTelError.setText("Teléfono erróneo");
        lblTelError.setAlignmentY(0.0F);
        lblTelError.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblcperror))
                            .addComponent(txt_dni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txt_poblacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txt_cp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txt_tlfn, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblTelError))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_crear)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addComponent(lblcperror)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tlfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_crear))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crearMouseClicked
        // TODO add your handling code here:
        boolean error=false;

        //Oculta el label de error por si ya se ha introducido el correcto
        lblcperror.setVisible(false);
        lblTelError.setVisible(false);

        //Comprueba que el CP intriducido es correcto
        try{
            Integer.parseInt(txt_cp.getText());
        }
        catch(Exception ex){
            //Indica que se ha producido un error
            error=true;
            lblcperror.setVisible(true);
        }

        //Comprueba que el telefono es numerico
        try{
            Integer.parseInt(txt_tlfn.getText());
        }
        catch(Exception ex){
            if(!error)
            {
                //Indica que se ha producido un error
                error=true;
                lblTelError.setVisible(true);
            }
        }
        String aux=new JTextField().getText();

        if(!error)
        {
            if(txt_direccion.getText().equals(aux) || txt_dni.getText().equals(aux) || txt_nombre.getText().equals(aux) || txt_poblacion.getText().equals(aux))
        {
            JOptionPane.showMessageDialog(null,"Todos los datos son necesarios", "Campos vacios",JOptionPane.ERROR_MESSAGE);
        }
 else
            {
                //No deberia ser necesario controlar excepciones aqui
            try{
            Cliente nuevo = new Cliente(txt_dni.getText(), new ArrayList<Reserva>(), txt_nombre.getText(), txt_direccion.getText(), txt_poblacion.getText(), Integer.parseInt(txt_cp.getText()), Integer.parseInt(txt_tlfn.getText()));
            frmPrincipal.agencia.Clientes.add(nuevo);
            lista_actual.setListData(frmPrincipal.agencia.Clientes.toArray());
            dispose();
            }
            catch (Exception e)
            {
            }
            }
        }

    }//GEN-LAST:event_btn_crearMouseClicked

    private void btn_cancelar_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelar_clic
        dispose();
    }//GEN-LAST:event_btn_cancelar_clic

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrearCliente(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTelError;
    private javax.swing.JLabel lblcperror;
    private javax.swing.JTextField txt_cp;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_poblacion;
    private javax.swing.JTextField txt_tlfn;
    // End of variables declaration//GEN-END:variables

}
