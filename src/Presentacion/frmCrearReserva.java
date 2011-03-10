/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmCrearReserva.java
 *
 * Created on 02-mar-2011, 17:30:10
 */

package Presentacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author moisescano
 */
public class frmCrearReserva extends javax.swing.JFrame {
    ArrayList<Recorrido> recorridos;
    ArrayList<Reserva> ReservasCliente;
    JList listado_actual;
    SimpleDateFormat f_format;
    /** Creates new form frmCrearReserva */
    public frmCrearReserva(JList listado,ArrayList<Reserva> R) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Configurar Recorrido");
        listado_actual=listado;
        ReservasCliente=R;
        recorridos=frmPrincipal.agencia.CatalogoInicial.Recorridos;
        initComponents();
        jcbRecorridosCatalogo.setModel(new DefaultComboBoxModel(recorridos.toArray()));

        //Esto es para evitar que salte una excepcion cuando no hay datos de reservas
        try{
            jcbRecorridosCatalogo.setSelectedIndex(0);
        }catch(Exception ex){}
        
        f_format= new SimpleDateFormat("dd/MM/yyyy");
        txtFechaFin.setText(f_format.format(new GregorianCalendar().getTime()));
        jSpinnPersonas.setValue(1);
        jSpinnPersonas.addChangeListener(numPersonasAccion);

        //Esto es para que no de fallo al iniciar
        try{
            txtPrecio.setText(Double.toString(recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).getPrecio()));
            txtTotal.setText(Double.toString(recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).getPrecio()*(Integer)jSpinnPersonas.getValue()));
        }catch(Exception e){
            txtPrecio.setText("0");
            txtTotal.setText("0");
        }
        
        jcbRecorridosCatalogo.addActionListener(jcbrecorridos_change);
        txtFechaFin.addKeyListener(txt_check);
        txtFechaInicio.addKeyListener(txt_check);
    }

    ChangeListener numPersonasAccion = new ChangeListener() {

        public void stateChanged(ChangeEvent e) {
            txtTotal.setText(Double.toString(recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).getPrecio()*(Integer)jSpinnPersonas.getValue()));
        }
    };

    ActionListener jcbrecorridos_change = new ActionListener() {

        public void actionPerformed(ActionEvent e) {
            txtPrecio.setText(Double.toString(recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).getPrecio()));
            txtTotal.setText(Double.toString(recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).getPrecio()*(Integer)jSpinnPersonas.getValue()));
        }
    };
    public void ActualizarDias()
    {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date finicio = formato.parse(txtFechaInicio.getText());
            Date f_fin = formato.parse(txtFechaFin.getText());
            double Mstotal = f_fin.getTime() - finicio.getTime();
            int totaldias = (int) (((Mstotal/1000)/3600)/24) + 1;
            txtdias.setText(Integer.toString(totaldias));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    KeyListener txt_check = new KeyListener() {

        public void keyTyped(KeyEvent e) {
            ActualizarDias();
        }

        public void keyPressed(KeyEvent e) {
            ActualizarDias();
        }

        public void keyReleased(KeyEvent e) {
            ActualizarDias();
        }
    };
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbRecorridosCatalogo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSpinnPersonas = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtdias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccionar Oferta");

        jLabel2.setText("Fecha Inicio");

        txtFechaInicio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText("Fecha Fin");

        txtFechaFin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setText("Precio Recorrido Ofertado");

        txtPrecio.setEditable(false);
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setText("Precio Total");

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        jLabel6.setText("Numero de personas");

        txtdias.setEditable(false);
        txtdias.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("Numero de días");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbRecorridosCatalogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnConfirmar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCancelar))
                                    .addComponent(txtFechaFin, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(jSpinnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(140, 140, 140)
                        .addComponent(txtdias, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbRecorridosCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnConfirmar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        if(txtFechaInicio.getText().isEmpty() || txtFechaFin.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar rellenos");
        }
        else
        {
            Recorrido nuevo=frmPrincipal.agencia.CatalogoInicial.Recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).Clonar();
            try{
                Reserva nuevaR = new Reserva((Integer)jSpinnPersonas.getValue(), nuevo);
                nuevaR.setFechaInicio(f_format.parse(txtFechaInicio.getText()));
                nuevaR.setFechaFin(f_format.parse(txtFechaFin.getText()));
                nuevaR.setImporteRestante(recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).getPrecio()*(Integer)jSpinnPersonas.getValue());
                nuevaR.setImporteTotal(recorridos.get(jcbRecorridosCatalogo.getSelectedIndex()).getPrecio()*(Integer)jSpinnPersonas.getValue());
                ReservasCliente.add(nuevaR);
                listado_actual.setListData(ReservasCliente.toArray());
                listado_actual.setSelectedIndex(ReservasCliente.size()-1);
                dispose();
            }catch(ParseException pae){
                JOptionPane.showMessageDialog(null, "Comprueba el formato de las fechas introducidas", "Error", 0);
            }
            catch(Exception e){
                System.out.println(e.toString());
            }

    }//GEN-LAST:event_btnConfirmarMouseClicked
}                                        
        private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
            dispose();
        }//GEN-LAST:event_btnCancelarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSpinnPersonas;
    private javax.swing.JComboBox jcbRecorridosCatalogo;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtdias;
    // End of variables declaration//GEN-END:variables

}