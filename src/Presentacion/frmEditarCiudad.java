/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCrearCiudad.java
 *
 * Created on 11-feb-2011, 18:24:30
 */

package Presentacion;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author edu
 */
public class frmEditarCiudad extends javax.swing.JFrame {


    /** Creates new form frmCrearCiudad */
    int NumCiudad;
    public frmEditarCiudad(int num) {
        initComponents();
        setTitle("ManchaViajes: Editar Ciudad");
        lblcperror.setVisible(false);
        NumCiudad=num;
        CargarDatos();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        lblcperror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Codigo Postal:");

        jLabel3.setText("País:");

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarFormulario(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        lblcperror.setBackground(new java.awt.Color(255, 0, 20));
        lblcperror.setFont(new java.awt.Font("Comic Sans MS", 0, 10));
        lblcperror.setForeground(new java.awt.Color(255, 0, 0));
        lblcperror.setText("Codigo postal incorrecto");
        lblcperror.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(lblcperror, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcperror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarFormulario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarFormulario
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CerrarFormulario

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        // TODO add your handling code here:
        String aux=new JTextField().getText();
        if(txtNombre.getText().equals(aux) || txtPais.getText().equals(aux) || txtCodigoPostal.getText().equals(aux) )
        {
            JOptionPane.showMessageDialog(null,"Todos los datos son necesarios", "Campos vacios",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try{
                lblcperror.setVisible(false);
                int cp=Integer.parseInt(txtCodigoPostal.getText());
                frmPrincipal.agencia.Ciudades.get(NumCiudad).setNombre(txtNombre.getText());
                frmPrincipal.agencia.Ciudades.get(NumCiudad).setCodigoPostal(cp);
                frmPrincipal.agencia.Ciudades.get(NumCiudad).setPais(txtPais.getText());

            //Se recarga la lista de ciudades
                frmCiudades.listCiudades.setListData(frmPrincipal.agencia.Ciudades.toArray());

                this.dispose();
        }catch(Exception e){lblcperror.setVisible(true);}
        }
        
    }//GEN-LAST:event_btnAceptarMouseClicked

    public final void CargarDatos()
    {
        txtNombre.setText(frmPrincipal.agencia.Ciudades.get(NumCiudad).Nombre);
        txtCodigoPostal.setText(String.valueOf(frmPrincipal.agencia.Ciudades.get(NumCiudad).CodigoPostal));
        txtPais.setText(frmPrincipal.agencia.Ciudades.get(NumCiudad).Pais);
    }
    /**
    * @param args the command line arguments
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblcperror;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables

}
