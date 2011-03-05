
package Presentacion;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//@author Pablete Serna Perea.
public class frmPrincipal extends JFrameImage {
    public static Sistema agencia;
    /** Creates new form frmPrincipal */
    public frmPrincipal() throws ClassNotFoundException, IOException {
        agencia= new Sistema();
        CargarDatos();
        //agencia.crear_clientes();
        //agencia.crear_recorridos();
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(700,600);
        this.setLocationRelativeTo(this);
        this.setBackground(Color.LIGHT_GRAY);
        this.setResizable(false);
        this.setTitle("Mancha Viajes");
        this.addWindowListener(frmppalAccionCerrar);
        btn_Ciudades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLimpiarRecorridos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_Clientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_VerCatalogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Icon ImagenBoton=new ImageIcon(getClass().getResource("/Recursos/IconSalir.png"));
        jButton6.setIcon(ImagenBoton);
        setImage("/Recursos/Portada.png");
        jButton6.setText("Salir");
        jButton6.setActionCommand("Salir");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Ciudades = new javax.swing.JButton();
        btnLimpiarRecorridos = new javax.swing.JButton();
        btn_Clientes = new javax.swing.JButton();
        btn_VerCatalogo = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Ciudades.setBackground(new java.awt.Color(60, 150, 97));
        btn_Ciudades.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        btn_Ciudades.setForeground(new java.awt.Color(255, 255, 255));
        btn_Ciudades.setText("Ciudades");
        btn_Ciudades.setName("btnCiudades"); // NOI18N
        btn_Ciudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CiudadesMouseClicked(evt);
            }
        });

        btnLimpiarRecorridos.setBackground(new java.awt.Color(60, 150, 97));
        btnLimpiarRecorridos.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        btnLimpiarRecorridos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarRecorridos.setText("Limpiar Recorridos Finalizados");
        btnLimpiarRecorridos.setName("btnNuevoHotel"); // NOI18N
        btnLimpiarRecorridos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarRecorridosMouseClicked(evt);
            }
        });

        btn_Clientes.setBackground(new java.awt.Color(60, 150, 97));
        btn_Clientes.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        btn_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Clientes.setText("Clientes");
        btn_Clientes.setName("btnClientes"); // NOI18N
        btn_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientes_clic(evt);
            }
        });

        btn_VerCatalogo.setBackground(new java.awt.Color(60, 150, 97));
        btn_VerCatalogo.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        btn_VerCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        btn_VerCatalogo.setText("Ver Catálogo");
        btn_VerCatalogo.setName("btnVerCatalago"); // NOI18N
        btn_VerCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VerCatalogoMouseClicked(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.setName("btnSalir"); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickSalir(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(btn_VerCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(btn_Ciudades, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(btnLimpiarRecorridos, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addGap(252, 252, 252)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_VerCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiarRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void GuardarDatos()
    {
        try {
            FileOutputStream fo= new FileOutputStream("datos.dat");
            ObjectOutputStream objout = new ObjectOutputStream(fo);
            objout.writeObject(agencia);
            objout.close();
        } catch (IOException ex) {}
    }

    private void CargarDatos() throws ClassNotFoundException, IOException
    {
        try
        {
            //CREAMOS EL FICHERO DE ENTRADA
            FileInputStream f = new FileInputStream("datos.dat");
            ObjectInputStream objin= new ObjectInputStream(f);
            agencia=(Sistema)objin.readObject();
            //CERRAMOS EL FICHERO DE ENTRADA
            objin.close();
        }
        catch(EOFException eof){}
        catch(InvalidClassException ice){}
        catch(FileNotFoundException fne)
        {
            //SI EL FICHERO NO EXISTE LO CREAMOS
//            ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream("datos.dat"));
//            objout.close();
        }
    }

    WindowListener frmppalAccionCerrar = new WindowListener() {

        public void windowOpened(WindowEvent e) {
            
        }

        public void windowClosing(WindowEvent e) {
            GuardarDatos();
            System.exit(0);
        }

        public void windowClosed(WindowEvent e) {
            
        }

        public void windowIconified(WindowEvent e) {
            
        }

        public void windowDeiconified(WindowEvent e) {
            
        }

        public void windowActivated(WindowEvent e) {
           
        }

        public void windowDeactivated(WindowEvent e) {
            
        }
    };

    private void ClickSalir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickSalir
        GuardarDatos();
        System.exit(0);
    }//GEN-LAST:event_ClickSalir

    private void btn_clientes_clic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientes_clic
        // TODO add your handling code here:
        frmClientes frmc1 = new frmClientes();
        frmc1.setLocationRelativeTo(this);
        frmc1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmc1.setVisible(true);
    }//GEN-LAST:event_btn_clientes_clic

    private void btnLimpiarRecorridosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarRecorridosMouseClicked
        Date g = new GregorianCalendar().getTime();
        boolean borrados=false;
        int cont=0;
        for (int i= 0; i < frmPrincipal.agencia.Clientes.size(); i++) {
            for (int j= 0; j < frmPrincipal.agencia.Clientes.get(i).Reservas.size(); j++) {
                if(frmPrincipal.agencia.Clientes.get(i).Reservas.get(j).recorrido.FechaFin.before(g))
                {
                   frmPrincipal.agencia.Clientes.get(i).Reservas.remove(j);
                   borrados=true;
                   cont++;
                }
            }
        }
        if(borrados)
        {
            JOptionPane.showMessageDialog(null, "Se han borrado "+cont+" recorridos finalizados", "Recorridos limpiados",JOptionPane.INFORMATION_MESSAGE );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se han encontrado recorridos para borrar", "No se han eliminado recorridos",JOptionPane.INFORMATION_MESSAGE );
        }
    }//GEN-LAST:event_btnLimpiarRecorridosMouseClicked

    private void btn_VerCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VerCatalogoMouseClicked
        frmCatalogo c = new frmCatalogo();
        c.setVisible(true);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_VerCatalogoMouseClicked

    private void btn_CiudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CiudadesMouseClicked
        frmCiudades c = new frmCiudades();
        c.setVisible(true);
        c.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btn_CiudadesMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmPrincipal().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarRecorridos;
    private javax.swing.JButton btn_Ciudades;
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_VerCatalogo;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables

}
